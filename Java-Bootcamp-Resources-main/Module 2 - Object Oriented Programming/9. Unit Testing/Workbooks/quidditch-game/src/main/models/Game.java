package src.main.models;

import java.util.HashMap;
import java.util.Random;

public class Game {

    private HashMap<Team, Integer> scoreboard;
    private static int gameCount;
    private static final int QUAFFLE_POINTS = 10;
    private static final int SNITCH_POINTS = 150;

    public Game(Team home, Team away) {
        this.scoreboard = new HashMap<Team, Integer>();
        this.scoreboard.put(new Team(home), 0);
        this.scoreboard.put(new Team(away), 0);
        gameCount++;
    }

    public Integer getScore(Team team) {
        return this.scoreboard.get(team);
    }

    public static int getGameCount() {
        return gameCount;
    }

    public void setScore(Team team, Integer score) {
        if (team == null) {
            throw new IllegalArgumentException("cannot add null to the scoreboard.");
        }
        this.scoreboard.put(team, score);
    }

    public Team getTeam(String name) {
        return this.scoreboard.keySet().stream().filter((key) -> key.getHouse().equals(name))
                .findFirst()
                .orElse(null);
    }

    public String getPlaceholder(String event) {
        return event.substring(event.indexOf("<") + 1, event.indexOf(">"));
    }

    public String replacePlaceHolder(String play, String positon, String player) {
        return play.replace("<" + positon + ">", player);
    }

    public int quaffleScore(Team team) {
        return this.scoreboard.put(team, scoreboard.get(team) + QUAFFLE_POINTS);
    }

    public int catchSnitch(Team team) {
        return this.scoreboard.put(team, scoreboard.get(team) + SNITCH_POINTS);
    }

    public String simulate(String play) {
        Team team = getRanTeam();
        String position = getPlaceholder(play);
        String player = "";
        if (position.equals(Team.getPositionChaser())) {
            quaffleScore(team);
            player = team.getChasers()[random(team.getChasers().length)];

        } else if (position.equals(Team.getPositionSeeker())) {
            catchSnitch(team);
            player = team.getSeeker();
        } else if (position.equals(Team.getPositionKeeper())) {
            player = team.getKeeper();
        }
        return replacePlaceHolder(play, position, player);
    }

    public Team getRanTeam() {
        Object[] teamArr = this.scoreboard.keySet().toArray();
        return (Team) teamArr[random(teamArr.length)];
    }

    public int random(int range) {
        return new Random().nextInt(range);
    }

}
