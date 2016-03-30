/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtuesimerkki;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author kkirjala
 */
public class StatisticsTest {

    private Statistics stats;

    public StatisticsTest() {
    }

    @BeforeClass
    public static void setUpClass() {

    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {

        Reader readerStub = new Reader() {

            public List<Player> getPlayers() {
                ArrayList<Player> players = new ArrayList<Player>();

                players.add(new Player("Semenko", "EDM", 4, 12));                
                players.add(new Player("Kurri", "EDM", 37, 53));
                players.add(new Player("Yzerman", "DET", 42, 56));
                players.add(new Player("Lemieux", "PIT", 45, 54));
                players.add(new Player("Gretzky", "EDM", 35, 89));

                return players;
            }
        };

        this.stats = new Statistics(readerStub);

    }

    @After
    public void tearDown() {
    }

    
    @Test
    public void testSearch() {

        Player foundPlayer = this.stats.search("Kurri");

        // this should return a player
        assertEquals(foundPlayer, this.stats.search("Kurri"));

        // these should return null
        assertEquals(null, this.stats.search("djdj"));

    }

    
    @Test
    public void testTeam() {
        
        assertEquals(3, this.stats.team("EDM").size());
        assertEquals(0, this.stats.team("").size());
        assertEquals(1, this.stats.team("PIT").size());
        
    }
    
    
    @Test
    public void testTopScorers() {
        
        // first one
        assertEquals("Gretzky", this.stats.topScorers(1).get(0).getName());
        
        // last one
        assertEquals("Semenko", this.stats.topScorers(4).get(4).getName());
        
        // no results at all
        assertEquals(0, this.stats.topScorers(-1).size());
        
                
    }


}