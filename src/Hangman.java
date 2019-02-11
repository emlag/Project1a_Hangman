/*
 * File: Hangman.java
 * ------------------
 * This program will eventually play the Hangman game from
 */

import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Hangman  {

    /***********************************************************
     *              CONSTANTS                                  *
     ***********************************************************/

    /* The number of guesses in one game of Hangman */
    private static final int N_GUESSES = 7;

    /***********************************************************
     *              Instance Variables                         *
     ***********************************************************/

    /* An object that can produce pseudo random numbers */
    private Random rng = new Random();

    /***********************************************************
     *                    Methods                              *
     ***********************************************************/

    /**
     * Method: Get Random Word
     * -------------------------
     * This method returns a word to use in the hangman game. It randomly
     * selects from among 10 choices.
     */
    private String getRandomWord() throws Exception{
        int index = rng.nextInt(10);
        if(index == 0) return "BUOY";
        if(index == 1) return "COMPUTER";
        if(index == 2) return "CONNOISSEUR";
        if(index == 3) return "DEHYDRATE";
        if(index == 4) return "FUZZY";
        if(index == 5) return "HUBBUB";
        if(index == 6) return "KEYHOLE";
        if(index == 7) return "QUAGMIRE";
        if(index == 8) return "SLITHER";
        if(index == 9) return "ZIRCON";
        throw new InvalidObjectException("word not found");
    }

    /**
     * Method: play
     * -------------------------
     * This method calls all of the necessary methods in order to play the game.
     * If multiple turns are used, the loop should be present here.
     */

    public void play()
    {

    }
}
