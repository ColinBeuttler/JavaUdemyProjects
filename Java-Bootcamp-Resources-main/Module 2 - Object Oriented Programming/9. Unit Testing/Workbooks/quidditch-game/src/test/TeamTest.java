package src.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

import src.main.models.Game;
import src.main.models.Team;

public class TeamTest {

    Team team;
    Game game;
   
    @Before
    public void setUp() {

        game = new Game(
        new Team("SLYTHERIN", "Vincent", "Draco", 
        new String[] { "Bridget", "Harper", "Malcolm" }),

        new Team("GRYFFINDOR", "Oliver", "Harry", 
        new String[] { "Angelina", "Ginny", "Katie" })
              );
        
    }  

 
    // @Test
    // public void hasNullTest() {
    //     assertTrue(team.hasNull(team.getChasers()));
    // }

    
    // @Test
    // public void hasBlankTest(){
    //     assertTrue(team.hasBlank(team.getChasers()));
    // }

@Test
public void getPlaceholderTest() {
    assertEquals("chaser", game.getPlaceholder("<chaser> gets the next pass"));

}

@Test
public void replacePlaceHolderTest() {
    assertEquals("Katie gets the next pass", game.replacePlaceHolder("<chaser> gets the next pass", "chaser", "Katie"));
}

@Test
public void quaffleScoreTest() {
    game.quaffleScore(game.getTeam("GRYFFINDOR"));
    game.quaffleScore(game.getTeam("GRYFFINDOR"));
    assertEquals(20, game.getScore(game.getTeam("GRYFFINDOR")));
}

@Test
public void catchSnitchTest() {
    game.catchSnitch(game.getTeam("SLYTHERIN"));
    assertEquals(150, game.catchSnitch(game.getTeam("SLYTHERIN")));
}
}
