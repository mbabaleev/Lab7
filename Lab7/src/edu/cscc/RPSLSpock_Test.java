package edu.cscc;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Mladen Babaleev
 * @version 1.0
 * Testing classes
 */

public class RPSLSpock_Test {
    private RPSLSpock fact;
    //Generate a test instance
    @Before
    public void presets() { fact = new RPSLSpock(); }
    //Test for validPick() method
    @Test
    public void isValidPick () {
        Assert.assertTrue(RPSLSpock.isValidPick(RPSLSpock.ROCK));
        Assert.assertTrue(RPSLSpock.isValidPick(RPSLSpock.PAPER));
        Assert.assertTrue(RPSLSpock.isValidPick(RPSLSpock.SCISSORS));
        Assert.assertTrue(RPSLSpock.isValidPick(RPSLSpock.LIZARD));
        Assert.assertTrue(RPSLSpock.isValidPick(RPSLSpock.SPOCK));
        Assert.assertFalse(RPSLSpock.isValidPick("invalid"));
    }
    // Tests for generatePick() method
    @Test
    public void generatePick () {
        for (int i=0; i<1000000; i++) {
            String pick = RPSLSpock.generatePick();
            Assert.assertTrue(pick != null);
            Assert.assertTrue(RPSLSpock.isValidPick(pick));
        }
    }
    // Tests for isComputerWin() method
    @Test
    public void isComputerWin () {
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.ROCK, RPSLSpock.SCISSORS));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.ROCK, RPSLSpock.LIZARD));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.PAPER, RPSLSpock.ROCK));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.PAPER, RPSLSpock.SPOCK));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.SCISSORS, RPSLSpock.PAPER));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.SCISSORS, RPSLSpock.LIZARD));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.LIZARD, RPSLSpock.PAPER));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.LIZARD, RPSLSpock.SPOCK));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.SPOCK, RPSLSpock.ROCK));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.SPOCK, RPSLSpock.SCISSORS));
        Assert.assertFalse(RPSLSpock.isComputerWin(RPSLSpock.SCISSORS, RPSLSpock.SCISSORS));

    }
}
