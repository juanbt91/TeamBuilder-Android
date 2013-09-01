package com.jonahwitcig.team;

import java.util.Random;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;

public class RandomGenerations {
		
		Random myRandom = new Random();
	
	public String[] teamGeneration(int players, String[] playerNames) {
	      
		int random1, random2, random3, random4, random5, random6, random7, random8;
		random1 = random2 = random3 = random4 = random5 = random6 = random7 = random8 = 0;
		
		String firstInput = playerNames[0];
		String secondInput = playerNames[1];
		String thirdInput = playerNames[2];
		String fourthInput = playerNames[3];
		String fifthInput = playerNames[4];
		String sixthInput = playerNames[5];
		String seventhInput = playerNames[6];
		String eighthInput = playerNames[7];
		
	    	random1 = myRandom.nextInt(players);
	        random2 = myRandom.nextInt(players);
	        	while (random2 == random1)
	        		random2 = myRandom.nextInt(players);
	        random3 = myRandom.nextInt(players);
	            while (random3 == random2 | random3 == random1)
	                random3 = myRandom.nextInt(players);
	        random4 = myRandom.nextInt(players);
	            while (random4 == random3 | random4 == random2 | random4 == random1)
	                random4 = myRandom.nextInt(players);
	    if (players > 4) {
	        random5 = myRandom.nextInt(players);
	            while (random5 == random4 | random5 == random3 | random5 == random2 | random5 == random1)
	                random5 = myRandom.nextInt(players);
	    }
	    if (players > 5) {
	        random6 = myRandom.nextInt(players);
	            while (random6 == random5 | random6== random4 | random6 == random3 | random6 == random2 | random6 == random1)
	                random6 = myRandom.nextInt(players);
	    }
	    if (players > 6) {
	        random7 = myRandom.nextInt(players);
	            while (random7 == random6 | random7 == random5 | random7 == random4 | random7 == random3 | random7 == random2 | random7 == random1)
	                random7 = myRandom.nextInt(players);
	    }
	    if (players > 7) {
	        random8 = myRandom.nextInt(players);
	            while (random8 == random7 | random8 == random6 | random8 == random5 | random8 == random4 | random8 == random3 | random8 == random2 | random8 == random1)
	                random8 = myRandom.nextInt(players);
		}
	    
		playerNames[random1] = firstInput;
		playerNames[random2] = secondInput;
		playerNames[random3] = thirdInput;
		playerNames[random4] = fourthInput;
		playerNames[random5] = fifthInput;
		playerNames[random6] = sixthInput;
		playerNames[random7] = seventhInput;
		playerNames[random8] = eighthInput;
		
		return playerNames;
	}
}



//takes in a String array with all players names in the order they were entered.
//returns the same array with the names in a random order.




