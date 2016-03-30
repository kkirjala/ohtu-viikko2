/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtuesimerkki;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kkirjala
 */
public class PlayerTest {

    Player player;

    public PlayerTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {

        this.player = new Player("playerName", "playerTeam", 5, 8);

    }

    @After
    public void tearDown() {
    }

    @Test
    public void testGetAssists() {
        assertEquals(8, this.player.getAssists());
    }

    @Test
    public void testSetAssists() {
        this.player.setAssists(2);
        assertEquals(2, this.player.getAssists());
    }

    @Test
    public void testGetGoals() {
        assertEquals(5, this.player.getGoals());
    }

    @Test
    public void testSetGoals() {
        this.player.setAssists(42);
        assertEquals(42, this.player.getAssists());
    }

    @Test
    public void testGetName() {
        assertEquals("playerName", this.player.getName());
    }

    @Test
    public void testSetName() {
        this.player.setName("newName");
        assertEquals("newName", this.player.getName());
    }

    @Test
    public void testGetTeam() {
        assertEquals("playerTeam", this.player.getTeam());
    }

    @Test
    public void testSetTeam() {
        this.player.setTeam("newTeam");
        assertEquals("newTeam", this.player.getTeam());
    }

    @Test
    public void testGetPoints() {

        this.player.setAssists(3);
        this.player.setGoals(6);

        // 3 + 6 = 9
        assertEquals(9, this.player.getPoints());

    }

    @Test
    public void testToString() {

        Player testPlayer = new Player("playerName", "playerTeam", 5, 8);

        assertEquals(true, testPlayer.toString().contains("playerName"));
        assertEquals(true, testPlayer.toString().contains("playerTeam"));
        assertEquals(true, testPlayer.toString().contains("5"));
        assertEquals(true, testPlayer.toString().contains("8"));
        assertEquals(true, testPlayer.toString().contains("13"));
       
    }

    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Player t = null;
        Player instance = null;
        int expResult = 0;
        int result = instance.compareTo(t);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
