package src.main.models;

import java.util.Arrays;
import java.util.Objects;

public class Team {

    private String house;
    private String keeper;
    private String seeker;
    private String[] chasers;

    private static final String POSITION_CHASER = "chaser";
    private static final String POSITION_SEEKER = "seeker";
    private static final String POSITION_KEEPER = "keeper";

    /*
     * FREQUENTLY ASKED QUESTIONS:
     * 
     * Question: the constants are final, so why can't we make them public? It's not
     * possible for the caller to update them.
     * Answer: Even if the constant is final, I prefer to expose a method instead of
     * the variable. But if you want to expose the variable, that's also correct.
     * 
     */

    public Team(String house, String keeper, String seeker, String[] chasers) {

        checkParamter(house);
        checkParamter(keeper);
        checkParamter(seeker);

        if (hasNull(chasers) || chasers.length < 3 || hasBlank(chasers)) {
            throw new IllegalArgumentException("chasers must be 3 or more");
        }
        this.house = house;
        this.keeper = keeper;
        this.seeker = seeker;
        this.chasers = Arrays.copyOf(chasers, chasers.length);

    }

    public Team(Team source) {
        this.house = source.house;
        this.keeper = source.keeper;
        this.seeker = source.seeker;
        this.chasers = Arrays.copyOf(source.chasers, source.chasers.length);
    }

    public String getHouse() {
        return house;
    }

    public String getSeeker() {
        return seeker;
    }

    public String getKeeper() {
        return keeper;
    }

    public String[] getChasers() {
        return Arrays.copyOf(chasers, chasers.length);
    }

    public static String getPositionChaser() {
        return POSITION_CHASER;
    }

    public static String getPositionSeeker() {
        return POSITION_SEEKER;
    }

    public static String getPositionKeeper() {
        return POSITION_KEEPER;
    }

    public void setHouse(String house) {
        checkParamter(house);
        this.house = house;
    }

    public void setKeeper(String keeper) {
        checkParamter(keeper);
        this.keeper = keeper;
    }

    public void setChasers(String[] chasers) {
        if (hasNull(chasers) || chasers.length < 3 || hasBlank(chasers)) {
            throw new IllegalArgumentException("chasers must be 3 or more");
        }
        this.chasers = Arrays.copyOf(chasers, chasers.length);
    }

    public void setSeeker(String seeker) {
        checkParamter(seeker);
        this.seeker = seeker;
    }

    public static boolean hasNull(String[] array) {
        return Arrays.stream(array)
                .anyMatch((s) -> s == null);
    }

    public static boolean hasBlank(String[] array) {
        return Arrays.stream(array)
                .anyMatch((s) -> s.isBlank());
    }

    public void checkParamter(String field) {
        if (field == null || field.isBlank()) {
            throw new IllegalArgumentException("Field cannot be null or blank");
        }
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Team)) {
            return false;
        }
        Team team = (Team) obj;
        return this.house.equals(team.house) &&
                this.keeper.equals(team.keeper) &&
                this.seeker.equals(team.seeker) &&
                Arrays.toString(this.chasers).equals(Arrays.toString(team.chasers));
    }

    public String toString() {
        return "House: " + this.house + "\n" +
                "Keeper: " + this.keeper + "\n" +
                "Seeker: " + this.seeker + "\n" +
                "Chasers: " + Arrays.toString(this.chasers) + "\n";
    }

    public int hashCode() {
        return Objects.hash(house, keeper, seeker, Arrays.toString(chasers));
    }
}
