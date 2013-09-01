package com.jonahwitcig.team;

import android.widget.*;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.Random;
public class basketballActivity extends Activity {
    /** Called when the activity is first created. */
    
	TextView team1, team2, tvWhosBall;
	TextView display1, display2, display3, display4, display5, display6, display7, display8;
	TextView sklDisplay1, sklDisplay2, sklDisplay3, sklDisplay4, sklDisplay5, sklDisplay6, sklDisplay7, sklDisplay8;
	Boolean randomType;
	String strBig1, strBig2, strBig3, strBig4, strBig5, strBig6, strBig7, strBig8;
	int p1Skl, p2Skl, p3Skl, p4Skl, p5Skl, p6Skl, p7Skl, p8Skl;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.basketball);
        setRequestedOrientation(1);
        
        Bundle p = getIntent().getExtras(); 
        
        team1 = (TextView) this.findViewById(R.id.TextView01);
        team2 = (TextView) this.findViewById(R.id.TextView02);
        tvWhosBall = (TextView) findViewById(R.id.whosBall);
        
        display1 = (TextView) this.findViewById(R.id.display1);
        display2 = (TextView) this.findViewById(R.id.display2);
        display3 = (TextView) this.findViewById(R.id.display3);
        display4 = (TextView) this.findViewById(R.id.display4);
        display5 = (TextView) this.findViewById(R.id.display5);
        display6 = (TextView) this.findViewById(R.id.display6);
        display7 = (TextView) this.findViewById(R.id.display7);
        display8 = (TextView) this.findViewById(R.id.display8);
        sklDisplay1 = (TextView) this.findViewById(R.id.display1Skill);
        sklDisplay2 = (TextView) this.findViewById(R.id.display2Skill);
        sklDisplay3 = (TextView) this.findViewById(R.id.display3Skill);
        sklDisplay4 = (TextView) this.findViewById(R.id.display4Skill);
        sklDisplay5 = (TextView) this.findViewById(R.id.display5Skill);
        sklDisplay6 = (TextView) this.findViewById(R.id.display6Skill);
        sklDisplay7 = (TextView) this.findViewById(R.id.display7Skill);
        sklDisplay8 = (TextView) this.findViewById(R.id.display8Skill);
        
        display1.setText("");
        display2.setText("");
        display3.setText("");
        display4.setText("");
        display5.setText("");
        display6.setText("");
        display7.setText("");
        display8.setText("");
        sklDisplay1.setText("");
        sklDisplay2.setText("");
        sklDisplay3.setText("");
        sklDisplay4.setText("");
        sklDisplay5.setText("");
        sklDisplay6.setText("");
        sklDisplay7.setText("");
        sklDisplay8.setText("");
        
        SharedPreferences settings = getSharedPreferences("MyPreferences", MODE_PRIVATE);
        final SharedPreferences.Editor prefEditor = settings.edit();
        
        int players1 = settings.getInt("players", 0);
        randomType = settings.getBoolean("randomType", true);

        String firstInput = settings.getString("firstInput", "");
        String secondInput = settings.getString("secondInput", "");
        String thirdInput = settings.getString("thirdInput", "");
        String fourthInput = settings.getString("fourthInput", "");
        String fifthInput = settings.getString("fifthInput", "");
        String sixthInput = settings.getString("sixthInput", "");
        String seventhInput = settings.getString("seventhInput", "");
        String eighthInput = settings.getString("eighthInput", "");
        
        p1Skl = settings.getInt("p1Skl", 0);
        p2Skl = settings.getInt("p2Skl", 0);
        p3Skl = settings.getInt("p3Skl", 0);
        p4Skl = settings.getInt("p4Skl", 0);
        p5Skl = settings.getInt("p5Skl", 0);
        p6Skl = settings.getInt("p6Skl", 0);
        p7Skl = settings.getInt("p7Skl", 0);
        p8Skl = settings.getInt("p8Skl", 0);
        
   		if (randomType == true)
   		{
   	        
        Random myRandom = new Random();
        
        int random1 = 0;
        int random2 = 0;
        int random3 = 0;
        int random4 = 0;
        int random5 = 0;
        int random6 = 0;
        int random7 = 0;
        int random8 = 0;
        
        if (players1 == 4)
        {
        	random1 = myRandom.nextInt(players1);
        	random2 = myRandom.nextInt(players1);
        		while (random2 == random1)
        			random2 = myRandom.nextInt(players1);
        	random3 = myRandom.nextInt(players1);
        		while (random3 == random2 | random3 == random1)
        			random3 = myRandom.nextInt(players1);
        	random4 = myRandom.nextInt(players1);
        		while (random4 == random3 | random4 == random2 | random4 == random1)
        			random4 = myRandom.nextInt(players1);
        	random1 ++;
        	random2 ++;
        	random3 ++;
        	random4 ++;
        	
        }
        
        else if (players1 == 5)
        {
        	random1 = myRandom.nextInt(players1);
        	random2 = myRandom.nextInt(players1);
        		while (random2 == random1)
        			random2 = myRandom.nextInt(players1);
        	random3 = myRandom.nextInt(players1);
        		while (random3 == random2 | random3 == random1)
        			random3 = myRandom.nextInt(players1);
        	random4 = myRandom.nextInt(players1);
        		while (random4 == random3 | random4 == random2 | random4 == random1)
        			random4 = myRandom.nextInt(players1);
        	random5 = myRandom.nextInt(players1);
        		while (random5 == random4 | random5 == random3 | random5 == random2 | random5 == random1)
        			random5 = myRandom.nextInt(players1);
        	random1 ++;
        	random2 ++;
        	random3 ++;
        	random4 ++;
        	random5 ++;
        }
        
        else if (players1 == 6)
        {
        	random1 = myRandom.nextInt(players1);
        	random2 = myRandom.nextInt(players1);
        		while (random2 == random1)
        			random2 = myRandom.nextInt(players1);
        	random3 = myRandom.nextInt(players1);
        		while (random3 == random2 | random3 == random1)
        			random3 = myRandom.nextInt(players1);
        	random4 = myRandom.nextInt(players1);
        		while (random4 == random3 | random4 == random2 | random4 == random1)
        			random4 = myRandom.nextInt(players1);
        	random5 = myRandom.nextInt(players1);
        		while (random5 == random4 | random5 == random3 | random5 == random2 | random5 == random1)
        			random5 = myRandom.nextInt(players1);
        	random6 = myRandom.nextInt(players1);
        		while (random6 == random5 | random6 == random4 | random6 == random3 | random6 == random2 | random6 == random1)
        			random6 = myRandom.nextInt(players1);
        	random1 ++;
        	random2 ++;
        	random3 ++;
        	random4 ++;
        	random5 ++;
        	random6 ++;
        }
        
        else if (players1 == 7)
        {
        	random1 = myRandom.nextInt(players1);
        	random2 = myRandom.nextInt(players1);
        		while (random2 == random1)
        			random2 = myRandom.nextInt(players1);
        	random3 = myRandom.nextInt(players1);
        		while (random3 == random2 | random3 == random1)
        			random3 = myRandom.nextInt(players1);
        	random4 = myRandom.nextInt(players1);
        		while (random4 == random3 | random4 == random2 | random4 == random1)
        			random4 = myRandom.nextInt(players1);
        	random5 = myRandom.nextInt(players1);
        		while (random5 == random4 | random5 == random3 | random5 == random2 | random5 == random1)
        			random5 = myRandom.nextInt(players1);
        	random6 = myRandom.nextInt(players1);
        		while (random6 == random5 | random6== random4 | random6 == random3 | random6 == random2 | random6 == random1)
        			random6 = myRandom.nextInt(players1);
        	random7 = myRandom.nextInt(players1);
        		while (random7 == random6 | random7 == random5 | random7 == random4 | random7 == random3 | random7 == random2 | random7 == random1)
        			random7 = myRandom.nextInt(players1);
        	random1 ++;
        	random2 ++;
        	random3 ++;
        	random4 ++;
        	random5 ++;
        	random6 ++;
        	random7 ++;
        }
       
        else if (players1 == 8)
        {
        	random1 = myRandom.nextInt(players1);
        	random2 = myRandom.nextInt(players1);
        		while (random2 == random1)
        			random2 = myRandom.nextInt(players1);
        	random3 = myRandom.nextInt(players1);
        		while (random3 == random2 | random3 == random1)
        			random3 = myRandom.nextInt(players1);
        	random4 = myRandom.nextInt(players1);
        		while (random4 == random3 | random4 == random2 | random4 == random1)
        			random4 = myRandom.nextInt(players1);
        	random5 = myRandom.nextInt(players1);
        		while (random5 == random4 | random5 == random3 | random5 == random2 | random5 == random1)
        			random5 = myRandom.nextInt(players1);
        	random6 = myRandom.nextInt(players1);
        		while (random6 == random5 | random6== random4 | random6 == random3 | random6 == random2 | random6 == random1)
        			random6 = myRandom.nextInt(players1);
        	random7 = myRandom.nextInt(players1);
        		while (random7 == random6 | random7 == random5 | random7 == random4 | random7 == random3 | random7 == random2 | random7 == random1)
        			random7 = myRandom.nextInt(players1);
        	random8 = myRandom.nextInt(players1);
        		while (random8 == random7 | random8 == random6 | random8 == random5 | random8 == random4 | random8 == random3 | random8 == random2 | random8 == random1)
        			random8 = myRandom.nextInt(players1);
        	random1 ++;
        	random2 ++;
        	random3 ++;
        	random4 ++;
        	random5 ++;
        	random6 ++;
        	random7 ++;
        	random8 ++;
        }
        
        
        String first = "";
        String second = "";
        String third = "";
        String fourth = "";
        String fifth = "";
        String sixth = "";
        String seventh = "";
        String eighth = "";
        
        if (players1 == 4)
        {
            if (random1 == 1)
                first = firstInput;
            else if (random1 == 2)
                first = secondInput;
            else if (random1 == 3)
                first = thirdInput;
            else if (random1 == 4)
                first = fourthInput;
        //
            if (random2 == 1)
                second = firstInput;
            else if (random2 == 2)
                second = secondInput;
            else if (random2 == 3)
                second = thirdInput;
            else if (random2 == 4)
                second = fourthInput;
        //
            if (random3 == 1)
                third = firstInput;
            else if (random3 == 2)
                third = secondInput;
            else if (random3 == 3)
                third = thirdInput;
            else if (random3 == 4)
                third = fourthInput;
        //
            if (random4 == 1)
                fourth = firstInput;
            else if (random4 == 2)
                fourth = secondInput;
            else if (random4 == 3)
                fourth = thirdInput;
            else if (random4 == 4)
                fourth = fourthInput;


            team1.setText("Team 1:");
            team2.setText("Team 2:");
            display1.setText(first);
            display2.setText(second);
            display5.setText(third);
            display6.setText(fourth);

        }
        
        if (players1 == 5)
        {
        	if (random1 == 1)
        		first = firstInput;
        	else if (random1 == 2)
        		first = secondInput;
        	else if (random1 == 3)
        		first = thirdInput;
        	else if (random1 == 4)
        		first = fourthInput;
        	else if (random1 == 5)
        		first = fifthInput;
            //
            	if (random2 == 1)
            		second = firstInput;
            	else if (random2 == 2)
            		second = secondInput;
            	else if (random2 == 3)
            		second = thirdInput;
            	else if (random2 == 4)
            		second = fourthInput;
            	else if (random2 == 5)
            		second = fifthInput;
            //
            	if (random3 == 1)
            		third = firstInput;
            	else if (random3 == 2)
            		third = secondInput;
            	else if (random3 == 3)
            		third = thirdInput;
            	else if (random3 == 4)
            		third = fourthInput;
            	else if (random3 == 5)
            		third = fifthInput;
            //
            	if (random4 == 1)
            		fourth = firstInput;
            	else if (random4 == 2)
            		fourth = secondInput;
            	else if (random4 == 3)
            		fourth = thirdInput;
            	else if (random4 == 4)
            		fourth = fourthInput;
            	else if (random4 == 5)
            		fourth = fifthInput;
            //
            	if (random5 == 1)
            		fifth = firstInput;
            	else if (random5 == 2)
            		fifth = secondInput;
            	else if (random5 == 3)
            		fifth = thirdInput;
            	else if (random5 == 4)
            		fifth = fourthInput;
            	else if (random5 == 5)
            		fifth = fifthInput;
            
            	team1.setText("Team 1:");
                team2.setText("Team 2:");
                display1.setText(first);
                display2.setText(second);
                display5.setText(third);
                display6.setText(fourth);
                display7.setText(fifth);
        	
        }
        
        if (players1 == 6)
        {
        	if (random1 == 1)
        		first = firstInput;
        	else if (random1 == 2)
        		first = secondInput;
        	else if (random1 == 3)
        		first = thirdInput;
        	else if (random1 == 4)
        		first = fourthInput;
        	else if (random1 == 5)
        		first = fifthInput;
        	else if (random1 == 6)
        		first = sixthInput;
            //
            	if (random2 == 1)
            		second = firstInput;
            	else if (random2 == 2)
            		second = secondInput;
            	else if (random2 == 3)
            		second = thirdInput;
            	else if (random2 == 4)
            		second = fourthInput;
            	else if (random2 == 5)
            		second = fifthInput;
            	else if (random2 == 6)
            		second = sixthInput;
            //
            	if (random3 == 1)
            		third = firstInput;
            	else if (random3 == 2)
            		third = secondInput;
            	else if (random3 == 3)
            		third = thirdInput;
            	else if (random3 == 4)
            		third = fourthInput;
            	else if (random3 == 5)
            		third = fifthInput;
            	else if (random3 == 6)
            		third = sixthInput;
            //
            	if (random4 == 1)
            		fourth = firstInput;
            	else if (random4 == 2)
            		fourth = secondInput;
            	else if (random4 == 3)
            		fourth = thirdInput;
            	else if (random4 == 4)
            		fourth = fourthInput;
            	else if (random4 == 5)
            		fourth = fifthInput;
            	else if (random4 == 6)
            		fourth = sixthInput;
            //
            	if (random5 == 1)
            		fifth = firstInput;
            	else if (random5 == 2)
            		fifth = secondInput;
            	else if (random5 == 3)
            		fifth = thirdInput;
            	else if (random5 == 4)
            		fifth = fourthInput;
            	else if (random5 == 5)
            		fifth = fifthInput;
            	else if (random5 == 6)
            		fifth = sixthInput;
            //
            	if (random6 == 1)
            		sixth = firstInput;
            	else if (random6 == 2)
            		sixth = secondInput;
            	else if (random6 == 3)
            		sixth = thirdInput;
            	else if (random6 == 4)
            		sixth = fourthInput;
            	else if (random6 == 5)
            		sixth = fifthInput;
            	else if (random6 == 6)
            		sixth = sixthInput;
            
            
            	team1.setText("Team 1:");
                team2.setText("Team 2:");
                display1.setText(first);
                display2.setText(second);
                display3.setText(third);
                display5.setText(fourth);
                display6.setText(fifth);
                display7.setText(sixth);
        	
        }
        
        if (players1 == 7)
        {
            	if (random1 == 1)
        		first = firstInput;
        	else if (random1 == 2)
        		first = secondInput;
        	else if (random1 == 3)
        		first = thirdInput;
        	else if (random1 == 4)
        		first = fourthInput;
        	else if (random1 == 5)
        		first = fifthInput;
        	else if (random1 == 6)
        		first = sixthInput;
        	else if (random1 == 7)
        		first = seventhInput;
        	
            //
            	if (random2 == 1)
            		second = firstInput;
            	else if (random2 == 2)
            		second = secondInput;
            	else if (random2 == 3)
            		second = thirdInput;
            	else if (random2 == 4)
            		second = fourthInput;
            	else if (random2 == 5)
            		second = fifthInput;
            	else if (random2 == 6)
            		second = sixthInput;
            	else if (random2 == 7)
            		second = seventhInput;
            	
            //
            	if (random3 == 1)
            		third = firstInput;
            	else if (random3 == 2)
            		third = secondInput;
            	else if (random3 == 3)
            		third = thirdInput;
            	else if (random3 == 4)
            		third = fourthInput;
            	else if (random3 == 5)
            		third = fifthInput;
            	else if (random3 == 6)
            		third = sixthInput;
            	else if (random3 == 7)
            		third = seventhInput;
            	
            //
            	if (random4 == 1)
            		fourth = firstInput;
            	else if (random4 == 2)
            		fourth = secondInput;
            	else if (random4 == 3)
            		fourth = thirdInput;
            	else if (random4 == 4)
            		fourth = fourthInput;
            	else if (random4 == 5)
            		fourth = fifthInput;
            	else if (random4 == 6)
            		fourth = sixthInput;
            	else if (random4 == 7)
            		fourth = seventhInput;

            //
            	if (random5 == 1)
            		fifth = firstInput;
            	else if (random5 == 2)
            		fifth = secondInput;
            	else if (random5 == 3)
            		fifth = thirdInput;
            	else if (random5 == 4)
            		fifth = fourthInput;
            	else if (random5 == 5)
            		fifth = fifthInput;
            	else if (random5 == 6)
            		fifth = sixthInput;
            	else if (random5 == 7)
            		fifth = seventhInput;

            //
            	if (random6 == 1)
            		sixth = firstInput;
            	else if (random6 == 2)
            		sixth = secondInput;
            	else if (random6 == 3)
            		sixth = thirdInput;
            	else if (random6 == 4)
            		sixth = fourthInput;
            	else if (random6 == 5)
            		sixth = fifthInput;
            	else if (random6 == 6)
            		sixth = sixthInput;
            	else if (random6 == 7)
            		sixth = seventhInput;
            	
            //
            	if (random7 == 1)
            		seventh = firstInput;
            	else if (random7 == 2)
            		seventh = secondInput;
            	else if (random7 == 3)
            		seventh = thirdInput;
            	else if (random7 == 4)
            		seventh = fourthInput;
            	else if (random7 == 5)
            		seventh = fifthInput;
            	else if (random7 == 6)
            		seventh = sixthInput;
            	else if (random7 == 7)
            		seventh = seventhInput;
            	
            
            	team1.setText("Team 1:");
                team2.setText("Team 2:");
                display1.setText(first);
                display2.setText(second);
                display3.setText(third);
                display5.setText(fourth);
                display6.setText(fifth);
                display7.setText(sixth);
                display8.setText(seventh);
        	
        }
        
        if (players1 == 8)
        {
        	if (random1 == 1)
        		first = firstInput;
        	else if (random1 == 2)
        		first = secondInput;
        	else if (random1 == 3)
        		first = thirdInput;
        	else if (random1 == 4)
        		first = fourthInput;
        	else if (random1 == 5)
        		first = fifthInput;
        	else if (random1 == 6)
        		first = sixthInput;
        	else if (random1 == 7)
        		first = seventhInput;
        	else if (random1 == 8)
        		first = eighthInput;
            //
        	if (random2 == 1)
        		second = firstInput;
        	else if (random2 == 2)
        		second = secondInput;
        	else if (random2 == 3)
        		second = thirdInput;
        	else if (random2 == 4)
        		second = fourthInput;
        	else if (random2 == 5)
        		second = fifthInput;
        	else if (random2 == 6)
        		second = sixthInput;
        	else if (random2 == 7)
        		second = seventhInput;
        	else if (random2 == 8)
        		second = eighthInput;
            //
        	if (random3 == 1)
        		third = firstInput;
        	else if (random3 == 2)
        		third = secondInput;
        	else if (random3 == 3)
        		third = thirdInput;
        	else if (random3 == 4)
        		third = fourthInput;
        	else if (random3 == 5)
        		third = fifthInput;
        	else if (random3 == 6)
        		third = sixthInput;
        	else if (random3 == 7)
        		third = seventhInput;
        	else if (random3 == 8)
        		third = eighthInput;
            //
        	if (random4 == 1)
        		fourth = firstInput;
        	else if (random4 == 2)
        		fourth = secondInput;
        	else if (random4 == 3)
        		fourth = thirdInput;
        	else if (random4 == 4)
        		fourth = fourthInput;
        	else if (random4 == 5)
        		fourth = fifthInput;
        	else if (random4 == 6)
        		fourth = sixthInput;
        	else if (random4 == 7)
        		fourth = seventhInput;
        	else if (random4 == 8)
        		fourth = eighthInput;
            //
        	if (random5 == 1)
        		fifth = firstInput;
        	else if (random5 == 2)
        		fifth = secondInput;
        	else if (random5 == 3)
        		fifth = thirdInput;
        	else if (random5 == 4)
        		fifth = fourthInput;
        	else if (random5 == 5)
        		fifth = fifthInput;
        	else if (random5 == 6)
        		fifth = sixthInput;
        	else if (random5 == 7)
        		fifth = seventhInput;
        	else if (random5 == 8)
        		fifth = eighthInput;
            //
        	if (random6 == 1)
        		sixth = firstInput;
        	else if (random6 == 2)
        		sixth = secondInput;
        	else if (random6 == 3)
        		sixth = thirdInput;
        	else if (random6 == 4)
        		sixth = fourthInput;
        	else if (random6 == 5)
        		sixth = fifthInput;
        	else if (random6 == 6)
        		sixth = sixthInput;
        	else if (random6 == 7)
        		sixth = seventhInput;
        	else if (random6 == 8)
        		sixth = eighthInput;
            //
        	if (random7 == 1)
        		seventh = firstInput;
        	else if (random7 == 2)
        		seventh = secondInput;
        	else if (random7 == 3)
        		seventh = thirdInput;
        	else if (random7 == 4)
        		seventh = fourthInput;
        	else if (random7 == 5)
        		seventh = fifthInput;
        	else if (random7 == 6)
        		seventh = sixthInput;
        	else if (random7 == 7)
        		seventh = seventhInput;
        	else if (random7 == 8)
        		seventh = eighthInput;
            //
            	if (random8 == 1)
            		eighth = firstInput;
            	else if (random8 == 2)
            		eighth = secondInput;
            	else if (random8 == 3)
            		eighth = thirdInput;
            	else if (random8 == 4)
            		eighth = fourthInput;
            	else if (random8 == 5)
            		eighth = fifthInput;
            	else if (random8 == 6)
            		eighth = sixthInput;
            	else if (random8 == 7)
            		eighth = seventhInput;
            	else if (random8 == 8)
            		eighth = eighthInput;
            
            
            	team1.setText("Team 1:");
                team2.setText("Team 2:");
                display1.setText(first);
                display2.setText(second);
                display3.setText(third);
                display4.setText(fourth);
                display5.setText(fifth);
                display6.setText(sixth);
                display7.setText(seventh);
                display8.setText(eighth);
        
        }
        int whosBall = myRandom.nextInt(2);
        if (whosBall == 1)
        	tvWhosBall.setText("Team 1 starts with ball");
        else
        	tvWhosBall.setText("Team 2 starts with ball");
        
   		}
	
	
   		if (randomType == false)
   	    {

   	          if (players1 == 4)
   	          {
   	              int counter = 0;
   	              int order[] = new int[4];
   	              String strOrder[]  = new String[4];
   	              int big1, big2, big3, big4;
   	              String strBig1, strBig2, strBig3, strBig4;

   	              for (counter = 0; counter < 4; counter ++)
   	              {
   	                  if (counter == 0)
   	                      order[counter] = p1Skl;
   	                  else if (counter == 1)
   	                      order[counter] = p2Skl;
   	                  else if (counter == 2)
   	                      order[counter] = p3Skl;
   	                  else if (counter == 3)
   	                      order[counter] = p4Skl;

   	                  if (counter == 0)
   	                      strOrder[counter] = firstInput;
   	                  else if (counter == 1)
   	                      strOrder[counter] = secondInput;
   	                  else if (counter == 2)
   	                      strOrder[counter] = thirdInput;
   	                  else if (counter == 3)
   	                      strOrder[counter] = fourthInput;

   	              }
   	              counter = 0;
   	              big1 = order[counter];
   	              strBig1 = strOrder[counter];
   	              counter ++;
   	// arranging in decending order
   	          // ranks second person's skill level
   	              if (order[counter] > big1)
   	              {
   	                  big2 = big1;
   	                  big1 = order[counter];

   	                  strBig2 = strBig1;
   	                  strBig1 = strOrder[counter];
   	              }
   	              else
   	              {
   	                  big2 = order[counter];
   	                  strBig2 = strOrder[counter];

   	              }

   	              counter ++;
   	          // ranks third person's skill level
   	              if (order[counter] > big1)
   	              {
   	                  big3 = big2;
   	                  big2 = big1;
   	                  big1 = order[counter];

   	                  strBig3 = strBig2;
   	                  strBig2 = strBig1;
   	                  strBig1 = strOrder[counter];
   	              }
   	              else if (order[counter] < big1 && order[counter] > big2)
   	              {
   	                  big3 = big2;
   	                  big2 = order[counter];

   	                  strBig3 = strBig2;
   	                  strBig2 = strOrder[counter];
   	              }
   	              else
   	              {
   	                  big3 = order[counter];

   	                  strBig3 = strOrder[counter];
   	              }

   	              counter ++;
   	          // ranks fourth person's skill level    
   	              if (order[counter] > big1)
   	              {
   	                  big4 = big3;
   	                  big3 = big2;
   	                  big2 = big1;
   	                  big1 = order[counter];

   	                  strBig4 = strBig3;
   	                  strBig3 = strBig2;
   	                  strBig2 = strBig1;
   	                  strBig1 = strOrder[counter];
   	              }
   	              else if (order[counter] < big1 && order[counter] > big2)
   	              {
   	                  big4 = big3;
   	                  big3 = big2;
   	                  big2 = order[counter];

   	                  strBig4 = strBig3;
   	                  strBig3 = strBig2;
   	                  strBig2 = strOrder[counter];
   	              }
   	              else if (order[counter] < big2 && order[counter] > big3)
   	              {
   	                  big4 = big3;
   	                  big3 = order[counter];

   	                  strBig4 = strBig3;
   	                  strBig3 = strOrder[counter];
   	              }
   	              else
   	              {
   	                  big4 = order[counter];

   	                  strBig4 = strOrder[counter];
   	              }
   	              this.calcTeams4(big1, big2, big3, big4, strBig1,strBig2, strBig3, strBig4);
   	              
   	          }
   			if (players1 == 5)
   	          {
   	              int counter = 0;
   	              int order[] = new int[5];
   	              String strOrder[]  = new String[5];
   	              int big1, big2, big3, big4, big5;
   	              String strBig1, strBig2, strBig3, strBig4, strBig5;

   	              for (counter = 0; counter < 5; counter ++)
   	              {
   	                  if (counter == 0)
   	                      order[counter] = p1Skl;
   	                  else if (counter == 1)
   	                      order[counter] = p2Skl;
   	                  else if (counter == 2)
   	                      order[counter] = p3Skl;
   	                  else if (counter == 3)
   	                      order[counter] = p4Skl;
   	                  else if (counter == 4)
   	                	  order[counter] = p5Skl;                 

   	                  if (counter == 0)
   	                      strOrder[counter] = firstInput;
   	                  else if (counter == 1)
   	                      strOrder[counter] = secondInput;
   	                  else if (counter == 2)
   	                      strOrder[counter] = thirdInput;
   	                  else if (counter == 3)
   	                      strOrder[counter] = fourthInput;
   	                  else if (counter == 4)
   	                	  strOrder[counter] = fifthInput;
   	              }
   	              counter = 0;
   	              big1 = order[counter];
   	              strBig1 = strOrder[counter];
   	              counter ++;
   	          // ranks second person's skill level
   	              if (order[counter] > big1)
   	              {
   	                  big2 = big1;
   	                  big1 = order[counter];

   	                  strBig2 = strBig1;
   	                  strBig1 = strOrder[counter];
   	              }
   	              else
   	              {
   	                  big2 = order[counter];
   	                  strBig2 = strOrder[counter];

   	              }

   	              counter ++;
   	          // ranks third person's skill level
   	              if (order[counter] > big1)
   	              {
   	                  big3 = big2;
   	                  big2 = big1;
   	                  big1 = order[counter];

   	                  strBig3 = strBig2;
   	                  strBig2 = strBig1;
   	                  strBig1 = strOrder[counter];
   	              }
   	              else if (order[counter] < big1 && order[counter] > big2 | order[counter] == big1 | order[counter] == big2)
   	              {
   	                  big3 = big2;
   	                  big2 = order[counter];

   	                  strBig3 = strBig2;
   	                  strBig2 = strOrder[counter];
   	              }
   	              else
   	              {
   	                  big3 = order[counter];

   	                  strBig3 = strOrder[counter];
   	              }

   	              counter ++;
   	          // ranks fourth person's skill level    
   	              if (order[counter] > big1)
   	              {
   	                  big4 = big3;
   	                  big3 = big2;
   	                  big2 = big1;
   	                  big1 = order[counter];

   	                  strBig4 = strBig3;
   	                  strBig3 = strBig2;
   	                  strBig2 = strBig1;
   	                  strBig1 = strOrder[counter];
   	              }
   	              else if ((order[counter] < big1 && order[counter] > big2) | order[counter] == big1)
   	              {
   	                  big4 = big3;
   	                  big3 = big2;
   	                  big2 = order[counter];

   	                  strBig4 = strBig3;
   	                  strBig3 = strBig2;
   	                  strBig2 = strOrder[counter];
   	              }
   	              else if ((order[counter] < big2 && order[counter] > big3) | order[counter] == big2)
   	              {
   	                  big4 = big3;
   	                  big3 = order[counter];

   	                  strBig4 = strBig3;
   	                  strBig3 = strOrder[counter];
   	              }
   	              else
   	              {
   	                  big4 = order[counter];

   	                  strBig4 = strOrder[counter];
   	              }
   	              counter ++;
   		// ranks fifth person's skill level    
   	              if (order[counter] > big1)
   	              {
   	            	  big5 = big4;
   	                  big4 = big3;
   	                  big3 = big2;
   	                  big2 = big1;
   	                  big1 = order[counter];

   	                  strBig5 = strBig4;
   	                  strBig4 = strBig3;
   	                  strBig3 = strBig2;
   	                  strBig2 = strBig1;
   	                  strBig1 = strOrder[counter];
   	              }
   	              else if (order[counter] < big1 && order[counter] > big2 | order[counter] == big1 | order[counter] == big2)
   	              {
   	            	  big5 = big4;
   	                  big4 = big3;
   	                  big3 = big2;
   	                  big2 = order[counter];

   	                  strBig5 = strBig4;
   	                  strBig4 = strBig3;
   	                  strBig3 = strBig2;
   	                  strBig2 = strOrder[counter];
   	              }
   	              else if (order[counter] < big2 && order[counter] > big3 | order[counter] == big2 | order[counter] == big3)
   	              {
   	                  big5 = big4;
   	                  big4 = big3;
   	                  big3 = order[counter];

   	                  strBig5 = strBig4;
   	                  strBig4 = strBig3;
   	                  strBig3 = strOrder[counter];
   	              }
   	              else if (order[counter] < big3 && order[counter] > big4 | order[counter] == big3 | order[counter] == big4)
   	              {
   	                  big5 = big4;
   	                  big4 = order[counter];

   	                  strBig5 = strBig4;
   	                  strBig4 = strOrder[counter];
   	              }
   	              else
   	              {
   	            	  big5 = order[counter];

   	            	  strBig5 = strOrder[counter];
   	              }

   			      this.calcTeams5(big1, big2, big3, big4, big5, strBig1, strBig2, strBig3, strBig4, strBig5);

   	          }
   			
   			if (players1 == 6)
   	        {
   	            int counter = 0;
   	            int order[] = new int[6];
   	            String strOrder[]  = new String[6];
   	            int big1, big2, big3, big4, big5,  big6;
   	            String strBig1, strBig2, strBig3, strBig4, strBig5, strBig6;

   	            for (counter = 0; counter < 6; counter ++)
   	            {
   	                if (counter == 0)
   	                    order[counter] = p1Skl;
   	                else if (counter == 1)
   	                    order[counter] = p2Skl;
   	                else if (counter == 2)
   	                    order[counter] = p3Skl;
   	                else if (counter == 3)
   	                    order[counter] = p4Skl;
   	                else if (counter == 4)
   	              	  	order[counter] = p5Skl;   
   	                else if (counter == 5)
   	                	order[counter] = p6Skl;

   	                if (counter == 0)
   	                    strOrder[counter] = firstInput;
   	                else if (counter == 1)
   	                    strOrder[counter] = secondInput;
   	                else if (counter == 2)
   	                    strOrder[counter] = thirdInput;
   	                else if (counter == 3)
   	                    strOrder[counter] = fourthInput;
   	                else if (counter == 4)
   	              	  	strOrder[counter] = fifthInput;
   	                else if (counter == 5)
   	                	strOrder[counter] = sixthInput;
   	            }
   	            counter = 0;
   	            big1 = order[counter];
   	            strBig1 = strOrder[counter];
   	            counter ++;
   	        // ranks second person's skill level
   	            if (order[counter] > big1)
   	            {
   	                big2 = big1;
   	                big1 = order[counter];

   	                strBig2 = strBig1;
   	                strBig1 = strOrder[counter];
   	            }
   	            else
   	            {
   	                big2 = order[counter];
   	                strBig2 = strOrder[counter];

   	            }

   	            counter ++;
   	        // ranks third person's skill level
   	            if (order[counter] > big1)
   	            {
   	                big3 = big2;
   	                big2 = big1;
   	                big1 = order[counter];

   	                strBig3 = strBig2;
   	                strBig2 = strBig1;
   	                strBig1 = strOrder[counter];
   	            }
   	            else if (order[counter] < big1 && order[counter] > big2 | order[counter] == big1 | order[counter] == big2)
   	            {
   	                big3 = big2;
   	                big2 = order[counter];

   	                strBig3 = strBig2;
   	                strBig2 = strOrder[counter];
   	            }
   	            else
   	            {
   	                big3 = order[counter];

   	                strBig3 = strOrder[counter];
   	            }

   	            counter ++;
   	        // ranks fourth person's skill level    
   	            if (order[counter] > big1)
   	            {
   	                big4 = big3;
   	                big3 = big2;
   	                big2 = big1;
   	                big1 = order[counter];

   	                strBig4 = strBig3;
   	                strBig3 = strBig2;
   	                strBig2 = strBig1;
   	                strBig1 = strOrder[counter];
   	            }
   	            else if ((order[counter] < big1 && order[counter] > big2) | order[counter] == big1)
   	            {
   	                big4 = big3;
   	                big3 = big2;
   	                big2 = order[counter];

   	                strBig4 = strBig3;
   	                strBig3 = strBig2;
   	                strBig2 = strOrder[counter];
   	            }
   	            else if ((order[counter] < big2 && order[counter] > big3) | order[counter] == big2)
   	            {
   	                big4 = big3;
   	                big3 = order[counter];

   	                strBig4 = strBig3;
   	                strBig3 = strOrder[counter];
   	            }
   	            else
   	            {
   	                big4 = order[counter];

   	                strBig4 = strOrder[counter];
   	            }
   	            counter ++;
   		// ranks fifth person's skill level    
   	            if (order[counter] > big1)
   	            {
   	          	  	big5 = big4;
   	                big4 = big3;
   	                big3 = big2;
   	                big2 = big1;
   	                big1 = order[counter];

   	                strBig5 = strBig4;
   	                strBig4 = strBig3;
   	                strBig3 = strBig2;
   	                strBig2 = strBig1;
   	                strBig1 = strOrder[counter];
   	            }
   	            else if (order[counter] < big1 && order[counter] > big2 | order[counter] == big1 | order[counter] == big2)
   	            {
   	          	  big5 = big4;
   	                big4 = big3;
   	                big3 = big2;
   	                big2 = order[counter];

   	                strBig5 = strBig4;
   	                strBig4 = strBig3;
   	                strBig3 = strBig2;
   	                strBig2 = strOrder[counter];
   	            }
   	            else if (order[counter] < big2 && order[counter] > big3 | order[counter] == big2 | order[counter] == big3)
   	            {
   	                big5 = big4;
   	                big4 = big3;
   	                big3 = order[counter];

   	                strBig5 = strBig4;
   	                strBig4 = strBig3;
   	                strBig3 = strOrder[counter];
   	            }
   	            else if (order[counter] < big3 && order[counter] > big4 | order[counter] == big3 | order[counter] == big4)
   	            {
   	                big5 = big4;
   	                big4 = order[counter];

   	                strBig5 = strBig4;
   	                strBig4 = strOrder[counter];
   	            }
   	            else
   	            {
   	          	  big5 = order[counter];

   	          	  strBig5 = strOrder[counter];
   	            }
   	            counter ++;
   	         // ranks sixth person's skill level    
   	            if (order[counter] > big1)
   	            {
   	          	  	big6 = big5;
   	            	big5 = big4;
   	                big4 = big3;
   	                big3 = big2;
   	                big2 = big1;
   	                big1 = order[counter];

   	                strBig6 = strBig5;
   	                strBig5 = strBig4;
   	                strBig4 = strBig3;
   	                strBig3 = strBig2;
   	                strBig2 = strBig1;
   	                strBig1 = strOrder[counter];
   	            }
   	            else if (order[counter] < big1 && order[counter] > big2 | order[counter] == big1 | order[counter] == big2)
   	            {
   	          	  	big6 = big5;
   	            	big5 = big4;
   	                big4 = big3;
   	                big3 = big2;
   	                big2 = order[counter];

   	                strBig6 = strBig5;
   	                strBig5 = strBig4;
   	                strBig4 = strBig3;
   	                strBig3 = strBig2;
   	                strBig2 = strOrder[counter];
   	            }
   	            else if (order[counter] < big2 && order[counter] > big3 | order[counter] == big2 | order[counter] == big3)
   	            {
   	                big6 = big5;
   	            	big5 = big4;
   	                big4 = big3;
   	                big3 = order[counter];
   	                
   	                strBig6 = strBig5;
   	                strBig5 = strBig4;
   	                strBig4 = strBig3;
   	                strBig3 = strOrder[counter];
   	            }
   	            else if (order[counter] < big3 && order[counter] > big4 | order[counter] == big3 | order[counter] == big4)
   	            {
   	                big6 = big5;
   	            	big5 = big4;
   	                big4 = order[counter];

   	                strBig6 = strBig5;
   	                strBig5 = strBig4;
   	                strBig4 = strOrder[counter];
   	            }
   	            else if (order[counter] < big4 && order[counter] > big5 | order[counter] == big4 | order[counter] == big5)
   	            {
   	          	  	big6 = big5;
   	            	big5 = order[counter];

   	          	  	strBig6 = strBig5;
   	            	strBig5 = strOrder[counter];
   	            }
   	            else
   	            {
   	            	big6 = order[counter];
   	            	
   	            	strBig6 = strOrder[counter];
   	            }

   			      this.calcTeams6(big1, big2, big3, big4, big5, big6, strBig1, strBig2, strBig3, strBig4, strBig5, strBig6);

   	        }
   			if (players1 == 7)
   	        {
   	            int counter = 0;
   	            int order[] = new int[7];
   	            String strOrder[]  = new String[7];
   	            int big1, big2, big3, big4, big5,  big6, big7;
   	            String strBig1, strBig2, strBig3, strBig4, strBig5, strBig6, strBig7;

   	            for (counter = 0; counter < 7; counter ++)
   	            {
   	                if (counter == 0)
   	                    order[counter] = p1Skl;
   	                else if (counter == 1)
   	                    order[counter] = p2Skl;
   	                else if (counter == 2)
   	                    order[counter] = p3Skl;
   	                else if (counter == 3)
   	                    order[counter] = p4Skl;
   	                else if (counter == 4)
   	              	  	order[counter] = p5Skl;   
   	                else if (counter == 5)
   	                	order[counter] = p6Skl;
   	                else if (counter == 6)
   	                	order[counter] = p7Skl;

   	                if (counter == 0)
   	                    strOrder[counter] = firstInput;
   	                else if (counter == 1)
   	                    strOrder[counter] = secondInput;
   	                else if (counter == 2)
   	                    strOrder[counter] = thirdInput;
   	                else if (counter == 3)
   	                    strOrder[counter] = fourthInput;
   	                else if (counter == 4)
   	              	  	strOrder[counter] = fifthInput;
   	                else if (counter == 5)
   	                	strOrder[counter] = sixthInput;
   	                else if (counter == 6)
   	                	strOrder[counter] = seventhInput;
   	            }
   	            counter = 0;
   	            big1 = order[counter];
   	            strBig1 = strOrder[counter];
   	            counter ++;
   	        // ranks second person's skill level
   	            if (order[counter] > big1)
   	            {
   	                big2 = big1;
   	                big1 = order[counter];

   	                strBig2 = strBig1;
   	                strBig1 = strOrder[counter];
   	            }
   	            else
   	            {
   	                big2 = order[counter];
   	                strBig2 = strOrder[counter];

   	            }

   	            counter ++;
   	        // ranks third person's skill level
   	            if (order[counter] > big1)
   	            {
   	                big3 = big2;
   	                big2 = big1;
   	                big1 = order[counter];

   	                strBig3 = strBig2;
   	                strBig2 = strBig1;
   	                strBig1 = strOrder[counter];
   	            }
   	            else if (order[counter] < big1 && order[counter] > big2 | order[counter] == big1 | order[counter] == big2)
   	            {
   	                big3 = big2;
   	                big2 = order[counter];

   	                strBig3 = strBig2;
   	                strBig2 = strOrder[counter];
   	            }
   	            else
   	            {
   	                big3 = order[counter];

   	                strBig3 = strOrder[counter];
   	            }

   	            counter ++;
   	        // ranks fourth person's skill level    
   	            if (order[counter] > big1)
   	            {
   	                big4 = big3;
   	                big3 = big2;
   	                big2 = big1;
   	                big1 = order[counter];

   	                strBig4 = strBig3;
   	                strBig3 = strBig2;
   	                strBig2 = strBig1;
   	                strBig1 = strOrder[counter];
   	            }
   	            else if ((order[counter] < big1 && order[counter] > big2) | order[counter] == big1)
   	            {
   	                big4 = big3;
   	                big3 = big2;
   	                big2 = order[counter];

   	                strBig4 = strBig3;
   	                strBig3 = strBig2;
   	                strBig2 = strOrder[counter];
   	            }
   	            else if ((order[counter] < big2 && order[counter] > big3) | order[counter] == big2)
   	            {
   	                big4 = big3;
   	                big3 = order[counter];

   	                strBig4 = strBig3;
   	                strBig3 = strOrder[counter];
   	            }
   	            else
   	            {
   	                big4 = order[counter];

   	                strBig4 = strOrder[counter];
   	            }
   	            counter ++;
   		// ranks fifth person's skill level    
   	            if (order[counter] > big1)
   	            {
   	          	  	big5 = big4;
   	                big4 = big3;
   	                big3 = big2;
   	                big2 = big1;
   	                big1 = order[counter];

   	                strBig5 = strBig4;
   	                strBig4 = strBig3;
   	                strBig3 = strBig2;
   	                strBig2 = strBig1;
   	                strBig1 = strOrder[counter];
   	            }
   	            else if (order[counter] < big1 && order[counter] > big2 | order[counter] == big1 | order[counter] == big2)
   	            {
   	          	  big5 = big4;
   	                big4 = big3;
   	                big3 = big2;
   	                big2 = order[counter];

   	                strBig5 = strBig4;
   	                strBig4 = strBig3;
   	                strBig3 = strBig2;
   	                strBig2 = strOrder[counter];
   	            }
   	            else if (order[counter] < big2 && order[counter] > big3 | order[counter] == big2 | order[counter] == big3)
   	            {
   	                big5 = big4;
   	                big4 = big3;
   	                big3 = order[counter];

   	                strBig5 = strBig4;
   	                strBig4 = strBig3;
   	                strBig3 = strOrder[counter];
   	            }
   	            else if (order[counter] < big3 && order[counter] > big4 | order[counter] == big3 | order[counter] == big4)
   	            {
   	                big5 = big4;
   	                big4 = order[counter];

   	                strBig5 = strBig4;
   	                strBig4 = strOrder[counter];
   	            }
   	            else
   	            {
   	          	  big5 = order[counter];

   	          	  strBig5 = strOrder[counter];
   	            }
   	            counter ++;
   	         // ranks sixth person's skill level    
   	            if (order[counter] > big1)
   	            {
   	          	  	big6 = big5;
   	            	big5 = big4;
   	                big4 = big3;
   	                big3 = big2;
   	                big2 = big1;
   	                big1 = order[counter];

   	                strBig6 = strBig5;
   	                strBig5 = strBig4;
   	                strBig4 = strBig3;
   	                strBig3 = strBig2;
   	                strBig2 = strBig1;
   	                strBig1 = strOrder[counter];
   	            }
   	            else if (order[counter] < big1 && order[counter] > big2 | order[counter] == big1 | order[counter] == big2)
   	            {
   	          	  	big6 = big5;
   	            	big5 = big4;
   	                big4 = big3;
   	                big3 = big2;
   	                big2 = order[counter];

   	                strBig6 = strBig5;
   	                strBig5 = strBig4;
   	                strBig4 = strBig3;
   	                strBig3 = strBig2;
   	                strBig2 = strOrder[counter];
   	            }
   	            else if (order[counter] < big2 && order[counter] > big3 | order[counter] == big2 | order[counter] == big3)
   	            {
   	                big6 = big5;
   	            	big5 = big4;
   	                big4 = big3;
   	                big3 = order[counter];
   	                
   	                strBig6 = strBig5;
   	                strBig5 = strBig4;
   	                strBig4 = strBig3;
   	                strBig3 = strOrder[counter];
   	            }
   	            else if (order[counter] < big3 && order[counter] > big4 | order[counter] == big3 | order[counter] == big4)
   	            {
   	                big6 = big5;
   	            	big5 = big4;
   	                big4 = order[counter];

   	                strBig6 = strBig5;
   	                strBig5 = strBig4;
   	                strBig4 = strOrder[counter];
   	            }
   	            else if (order[counter] < big4 && order[counter] > big5 | order[counter] == big4 | order[counter] == big5)
   	            {
   	          	  	big6 = big5;
   	            	big5 = order[counter];

   	          	  	strBig6 = strBig5;
   	            	strBig5 = strOrder[counter];
   	            }
   	            else
   	            {
   	            	big6 = order[counter];
   	            	
   	            	strBig6 = strOrder[counter];
   	            }
   	            counter ++;
   	         // ranks seventh person's skill level    
   	            if (order[counter] > big1)
   	            {
   	          	  	big7 = big6;
   	            	big6 = big5;
   	            	big5 = big4;
   	                big4 = big3;
   	                big3 = big2;
   	                big2 = big1;
   	                big1 = order[counter];

   	                strBig7 = strBig6;
   	                strBig6 = strBig5;
   	                strBig5 = strBig4;
   	                strBig4 = strBig3;
   	                strBig3 = strBig2;
   	                strBig2 = strBig1;
   	                strBig1 = strOrder[counter];
   	            }
   	            else if (order[counter] < big1 && order[counter] > big2 | order[counter] == big1 | order[counter] == big2)
   	            {
   	            	big7 = big6;
   	          	  	big6 = big5;
   	            	big5 = big4;
   	                big4 = big3;
   	                big3 = big2;
   	                big2 = order[counter];

   	                strBig7 = strBig6;
   	                strBig6 = strBig5;
   	                strBig5 = strBig4;
   	                strBig4 = strBig3;
   	                strBig3 = strBig2;
   	                strBig2 = strOrder[counter];
   	            }
   	            else if (order[counter] < big2 && order[counter] > big3 | order[counter] == big2 | order[counter] == big3)
   	            {
   	                big7 = big6;
   	            	big6 = big5;
   	            	big5 = big4;
   	                big4 = big3;
   	                big3 = order[counter];
   	                
   	                strBig7 = strBig6;
   	                strBig6 = strBig5;
   	                strBig5 = strBig4;
   	                strBig4 = strBig3;
   	                strBig3 = strOrder[counter];
   	            }
   	            else if (order[counter] < big3 && order[counter] > big4 | order[counter] == big3 | order[counter] == big4)
   	            {
   	                big7 = big6;
   	            	big6 = big5;
   	            	big5 = big4;
   	                big4 = order[counter];

   	                strBig7 = strBig6;
   	                strBig6 = strBig5;
   	                strBig5 = strBig4;
   	                strBig4 = strOrder[counter];
   	            }
   	            else if (order[counter] < big4 && order[counter] > big5 | order[counter] == big4 | order[counter] == big5)
   	            {
   	          	  	big7 = big6;
   	            	big6 = big5;
   	            	big5 = order[counter];

   	            	strBig7 = strBig6;
   	          	  	strBig6 = strBig5;
   	            	strBig5 = strOrder[counter];
   	            }
   	            else if (order[counter] < big5 && order[counter] > big6 | order[counter] == big5 | order[counter] == big6)
   	            {
   	            	big7 = big6;
   	            	big6 = order[counter];
   	            	
   	            	strBig7 = strBig6;
   	            	strBig6 = strOrder[counter];
   	            }
   	            else
   	            {
   	            	big7 = order[counter];
   	            	
   	            	strBig7 = strOrder[counter];
   	            }
   			      this.calcTeams7(big1, big2, big3, big4, big5, big6, big7, strBig1, strBig2, strBig3, strBig4, strBig5, strBig6, strBig7);

   	        }
   			if (players1 == 8)
   	        {
   	            int counter = 0;
   	            int order[] = new int[8];
   	            String strOrder[]  = new String[8];
   	            int big1, big2, big3, big4, big5,  big6, big7, big8;
   	            String strBig1, strBig2, strBig3, strBig4, strBig5, strBig6, strBig7, strBig8;

   	            for (counter = 0; counter < 8; counter ++)
   	            {
   	                if (counter == 0)
   	                    order[counter] = p1Skl;
   	                else if (counter == 1)
   	                    order[counter] = p2Skl;
   	                else if (counter == 2)
   	                    order[counter] = p3Skl;
   	                else if (counter == 3)
   	                    order[counter] = p4Skl;
   	                else if (counter == 4)
   	              	  	order[counter] = p5Skl;   
   	                else if (counter == 5)
   	                	order[counter] = p6Skl;
   	                else if (counter == 6)
   	                	order[counter] = p7Skl;
   	                else if (counter == 7)
   	                	order[counter] = p8Skl;

   	                if (counter == 0)
   	                    strOrder[counter] = firstInput;
   	                else if (counter == 1)
   	                    strOrder[counter] = secondInput;
   	                else if (counter == 2)
   	                    strOrder[counter] = thirdInput;
   	                else if (counter == 3)
   	                    strOrder[counter] = fourthInput;
   	                else if (counter == 4)
   	              	  	strOrder[counter] = fifthInput;
   	                else if (counter == 5)
   	                	strOrder[counter] = sixthInput;
   	                else if (counter == 6)
   	                	strOrder[counter] = seventhInput;
   	                else if (counter == 7)
   	                	strOrder[counter] = eighthInput;
   	            }
   	            counter = 0;
   	            big1 = order[counter];
   	            strBig1 = strOrder[counter];
   	            counter ++;
   	        // ranks second person's skill level
   	            if (order[counter] > big1)
   	            {
   	                big2 = big1;
   	                big1 = order[counter];

   	                strBig2 = strBig1;
   	                strBig1 = strOrder[counter];
   	            }
   	            else
   	            {
   	                big2 = order[counter];
   	                strBig2 = strOrder[counter];

   	            }

   	            counter ++;
   	        // ranks third person's skill level
   	            if (order[counter] > big1)
   	            {
   	                big3 = big2;
   	                big2 = big1;
   	                big1 = order[counter];

   	                strBig3 = strBig2;
   	                strBig2 = strBig1;
   	                strBig1 = strOrder[counter];
   	            }
   	            else if (order[counter] < big1 && order[counter] > big2 | order[counter] == big1 | order[counter] == big2)
   	            {
   	                big3 = big2;
   	                big2 = order[counter];

   	                strBig3 = strBig2;
   	                strBig2 = strOrder[counter];
   	            }
   	            else
   	            {
   	                big3 = order[counter];

   	                strBig3 = strOrder[counter];
   	            }

   	            counter ++;
   	        // ranks fourth person's skill level    
   	            if (order[counter] > big1)
   	            {
   	                big4 = big3;
   	                big3 = big2;
   	                big2 = big1;
   	                big1 = order[counter];

   	                strBig4 = strBig3;
   	                strBig3 = strBig2;
   	                strBig2 = strBig1;
   	                strBig1 = strOrder[counter];
   	            }
   	            else if ((order[counter] < big1 && order[counter] > big2) | order[counter] == big1)
   	            {
   	                big4 = big3;
   	                big3 = big2;
   	                big2 = order[counter];

   	                strBig4 = strBig3;
   	                strBig3 = strBig2;
   	                strBig2 = strOrder[counter];
   	            }
   	            else if ((order[counter] < big2 && order[counter] > big3) | order[counter] == big2)
   	            {
   	                big4 = big3;
   	                big3 = order[counter];

   	                strBig4 = strBig3;
   	                strBig3 = strOrder[counter];
   	            }
   	            else
   	            {
   	                big4 = order[counter];

   	                strBig4 = strOrder[counter];
   	            }
   	            counter ++;
   		// ranks fifth person's skill level    
   	            if (order[counter] > big1)
   	            {
   	          	  	big5 = big4;
   	                big4 = big3;
   	                big3 = big2;
   	                big2 = big1;
   	                big1 = order[counter];

   	                strBig5 = strBig4;
   	                strBig4 = strBig3;
   	                strBig3 = strBig2;
   	                strBig2 = strBig1;
   	                strBig1 = strOrder[counter];
   	            }
   	            else if (order[counter] < big1 && order[counter] > big2 | order[counter] == big1 | order[counter] == big2)
   	            {
   	          	  big5 = big4;
   	                big4 = big3;
   	                big3 = big2;
   	                big2 = order[counter];

   	                strBig5 = strBig4;
   	                strBig4 = strBig3;
   	                strBig3 = strBig2;
   	                strBig2 = strOrder[counter];
   	            }
   	            else if (order[counter] < big2 && order[counter] > big3 | order[counter] == big2 | order[counter] == big3)
   	            {
   	                big5 = big4;
   	                big4 = big3;
   	                big3 = order[counter];

   	                strBig5 = strBig4;
   	                strBig4 = strBig3;
   	                strBig3 = strOrder[counter];
   	            }
   	            else if (order[counter] < big3 && order[counter] > big4 | order[counter] == big3 | order[counter] == big4)
   	            {
   	                big5 = big4;
   	                big4 = order[counter];

   	                strBig5 = strBig4;
   	                strBig4 = strOrder[counter];
   	            }
   	            else
   	            {
   	          	  big5 = order[counter];

   	          	  strBig5 = strOrder[counter];
   	            }
   	            counter ++;
   	         // ranks sixth person's skill level    
   	            if (order[counter] > big1)
   	            {
   	          	  	big6 = big5;
   	            	big5 = big4;
   	                big4 = big3;
   	                big3 = big2;
   	                big2 = big1;
   	                big1 = order[counter];

   	                strBig6 = strBig5;
   	                strBig5 = strBig4;
   	                strBig4 = strBig3;
   	                strBig3 = strBig2;
   	                strBig2 = strBig1;
   	                strBig1 = strOrder[counter];
   	            }
   	            else if (order[counter] < big1 && order[counter] > big2 | order[counter] == big1 | order[counter] == big2)
   	            {
   	          	  	big6 = big5;
   	            	big5 = big4;
   	                big4 = big3;
   	                big3 = big2;
   	                big2 = order[counter];

   	                strBig6 = strBig5;
   	                strBig5 = strBig4;
   	                strBig4 = strBig3;
   	                strBig3 = strBig2;
   	                strBig2 = strOrder[counter];
   	            }
   	            else if (order[counter] < big2 && order[counter] > big3 | order[counter] == big2 | order[counter] == big3)
   	            {
   	                big6 = big5;
   	            	big5 = big4;
   	                big4 = big3;
   	                big3 = order[counter];
   	                
   	                strBig6 = strBig5;
   	                strBig5 = strBig4;
   	                strBig4 = strBig3;
   	                strBig3 = strOrder[counter];
   	            }
   	            else if (order[counter] < big3 && order[counter] > big4 | order[counter] == big3 | order[counter] == big4)
   	            {
   	                big6 = big5;
   	            	big5 = big4;
   	                big4 = order[counter];

   	                strBig6 = strBig5;
   	                strBig5 = strBig4;
   	                strBig4 = strOrder[counter];
   	            }
   	            else if (order[counter] < big4 && order[counter] > big5 | order[counter] == big4 | order[counter] == big5)
   	            {
   	          	  	big6 = big5;
   	            	big5 = order[counter];

   	          	  	strBig6 = strBig5;
   	            	strBig5 = strOrder[counter];
   	            }
   	            else
   	            {
   	            	big6 = order[counter];
   	            	
   	            	strBig6 = strOrder[counter];
   	            }
   	            counter ++;
   	         // ranks seventh person's skill level    
   	            if (order[counter] > big1)
   	            {
   	          	  	big7 = big6;
   	            	big6 = big5;
   	            	big5 = big4;
   	                big4 = big3;
   	                big3 = big2;
   	                big2 = big1;
   	                big1 = order[counter];

   	                strBig7 = strBig6;
   	                strBig6 = strBig5;
   	                strBig5 = strBig4;
   	                strBig4 = strBig3;
   	                strBig3 = strBig2;
   	                strBig2 = strBig1;
   	                strBig1 = strOrder[counter];
   	            }
   	            else if (order[counter] < big1 && order[counter] > big2 | order[counter] == big1 | order[counter] == big2)
   	            {
   	            	big7 = big6;
   	          	  	big6 = big5;
   	            	big5 = big4;
   	                big4 = big3;
   	                big3 = big2;
   	                big2 = order[counter];

   	                strBig7 = strBig6;
   	                strBig6 = strBig5;
   	                strBig5 = strBig4;
   	                strBig4 = strBig3;
   	                strBig3 = strBig2;
   	                strBig2 = strOrder[counter];
   	            }
   	            else if (order[counter] < big2 && order[counter] > big3 | order[counter] == big2 | order[counter] == big3)
   	            {
   	                big7 = big6;
   	            	big6 = big5;
   	            	big5 = big4;
   	                big4 = big3;
   	                big3 = order[counter];
   	                
   	                strBig7 = strBig6;
   	                strBig6 = strBig5;
   	                strBig5 = strBig4;
   	                strBig4 = strBig3;
   	                strBig3 = strOrder[counter];
   	            }
   	            else if (order[counter] < big3 && order[counter] > big4 | order[counter] == big3 | order[counter] == big4)
   	            {
   	                big7 = big6;
   	            	big6 = big5;
   	            	big5 = big4;
   	                big4 = order[counter];

   	                strBig7 = strBig6;
   	                strBig6 = strBig5;
   	                strBig5 = strBig4;
   	                strBig4 = strOrder[counter];
   	            }
   	            else if (order[counter] < big4 && order[counter] > big5 | order[counter] == big4 | order[counter] == big5)
   	            {
   	          	  	big7 = big6;
   	            	big6 = big5;
   	            	big5 = order[counter];

   	            	strBig7 = strBig6;
   	          	  	strBig6 = strBig5;
   	            	strBig5 = strOrder[counter];
   	            }
   	            else if (order[counter] < big5 && order[counter] > big6 | order[counter] == big5 | order[counter] == big6)
   	            {
   	            	big7 = big6;
   	            	big6 = order[counter];
   	            	
   	            	strBig7 = strBig6;
   	            	strBig6 = strOrder[counter];
   	            }
   	            else
   	            {
   	            	big7 = order[counter];
   	            	
   	            	strBig7 = strOrder[counter];
   	            }
   	            counter ++;
   	            // ranks eighth person's skill level    
   	               if (order[counter] > big1)
   	               {
   	             	   big8 = big7;
   	            	   big7 = big6;
   	             	   big6 = big5;
   	             	   big5 = big4;
   	                   big4 = big3;
   	                   big3 = big2;
   	                   big2 = big1;
   	                   big1 = order[counter];

   	                   strBig8 = strBig7;
   	                   strBig7 = strBig6;
   	                   strBig6 = strBig5;
   	                   strBig5 = strBig4;
   	                   strBig4 = strBig3;
   	                   strBig3 = strBig2;
   	                   strBig2 = strBig1;
   	                   strBig1 = strOrder[counter];
   	               }
   	               else if (order[counter] < big1 && order[counter] > big2 | order[counter] == big1 | order[counter] == big2)
   	               {
   	               	   big8 = big7;
   	            	   big7 = big6;
   	             	   big6 = big5;
   	             	   big5 = big4;
   	                   big4 = big3;
   	                   big3 = big2;
   	                   big2 = order[counter];

   	                   strBig8 = strBig7;
   	                   strBig7 = strBig6;
   	                   strBig6 = strBig5;
   	                   strBig5 = strBig4;
   	                   strBig4 = strBig3;
   	                   strBig3 = strBig2;
   	                   strBig2 = strOrder[counter];
   	               }
   	               else if (order[counter] < big2 && order[counter] > big3 | order[counter] == big2 | order[counter] == big3)
   	               {
   	                   big8 = big7;
   	            	   big7 = big6;
   	               	   big6 = big5;
   	               	   big5 = big4;
   	                   big4 = big3;
   	                   big3 = order[counter];
   	                   
   	                   strBig8 = strBig7;
   	                   strBig7 = strBig6;
   	                   strBig6 = strBig5;
   	                   strBig5 = strBig4;
   	                   strBig4 = strBig3;
   	                   strBig3 = strOrder[counter];
   	               }
   	               else if (order[counter] < big3 && order[counter] > big4 | order[counter] == big3 | order[counter] == big4)
   	               {
   	                   big8 = big7;
   	            	   big7 = big6;
   	               	   big6 = big5;
   	               	   big5 = big4;
   	                   big4 = order[counter];

   	                   strBig8 = strBig7;
   	                   strBig7 = strBig6;
   	                   strBig6 = strBig5;
   	                   strBig5 = strBig4;
   	                   strBig4 = strOrder[counter];
   	               }
   	               else if (order[counter] < big4 && order[counter] > big5 | order[counter] == big4 | order[counter] == big5)
   	               {
   	             	  	big8 = big7;
   	            	   	big7 = big6;
   	             	  	big6 = big5;
   	             	  	big5 = order[counter];

   	             	  	strBig8 = strBig7;
   	             	  	strBig7 = strBig6;
   	             	  	strBig6 = strBig5;
   	             	  	strBig5 = strOrder[counter];
   	               }
   	               else if (order[counter] < big5 && order[counter] > big6 | order[counter] == big5 | order[counter] == big6)
   	               {
   	               		big8 = big7;
   	               		big7 = big6;
   	               		big6 = order[counter];
   	               	
   	               		strBig8 = strBig7;
   	               		strBig7 = strBig6;
   	               		strBig6 = strOrder[counter];
   	               }
   	               else if (order[counter] < big6 && order[counter] > big7 | order[counter] == big6 | order[counter] == big7)
   	               {
   	               		big8 = big7;
   	               		big7 = order[counter];
   	               	
   	               		strBig8 = strBig7;
   	               		strBig7 = strOrder[counter];
   	               }
   	               else
   	               {
   	            	   big8 = order[counter];
   	            	   
   	            	   strBig8 = strOrder[counter];
   	               }
   			      
   	               this.calcTeams8(big1, big2, big3, big4, big5, big6, big7, big8, strBig1, strBig2, strBig3, strBig4, strBig5, strBig6, strBig7, strBig8);
   	        }
   	      }
   	      
   	  }
   	  
	
	public void calcTeams4(int big1, int big2, int big3, int big4, String strBig1, String strBig2, String strBig3, String strBig4)
	  {
		  display1.setText(strBig1);
		  display2.setText(strBig4);
		  display5.setText(strBig2);
		  display6.setText(strBig3);
		  
		  sklDisplay1.setText(Integer.toString(big1));
		  sklDisplay2.setText(Integer.toString(big4));
		  sklDisplay5.setText(Integer.toString(big2));
		  sklDisplay6.setText(Integer.toString(big3));
		  
		  team1.setText("Team 1: " + (big1 + big4));
		  team2.setText("Team 2: " + (big2 + big3));
		  
		  Random myRandom = new Random();
	  		
		  int whosBall = myRandom.nextInt(2);
	        if (whosBall == 1)
	        	tvWhosBall.setText("Team 1 starts with ball");
	        else
	        	tvWhosBall.setText("Team 2 starts with ball");
	  }
	  
	  public void calcTeams5(int big1, int big2, int big3, int big4, int big5, String strBig1, String strBig2, String strBig3, String strBig4, String strBig5)
	  {
		  int best = Math.abs((big1 + big2) - (big3 + big4 + big5));
		  display1.setText(strBig1);
		  display2.setText(strBig2);
		  display5.setText(strBig3);
		  display6.setText(strBig4);
		  display7.setText(strBig5);
		  
		  sklDisplay1.setText(Integer.toString(big1));
		  sklDisplay2.setText(Integer.toString(big2));
		  sklDisplay5.setText(Integer.toString(big3));
		  sklDisplay6.setText(Integer.toString(big4));
		  sklDisplay7.setText(Integer.toString(big5));
		  
		  team1.setText("Team 1: " + (big1 + big2));
		  team2.setText("Team 2: " + (big3 + big4 + big5));
		  
		  if (Math.abs((big1 + big3) - (big2 + big4 + big5)) < best)
		  {
			  best = Math.abs((big1 + big3) - (big2 + big4 + big5));
			  
			  display1.setText(strBig1);
			  display2.setText(strBig3);
			  display5.setText(strBig2);
			  display6.setText(strBig4);
			  display7.setText(strBig5);
			  
			  sklDisplay1.setText(Integer.toString(big1));
			  sklDisplay2.setText(Integer.toString(big3));
			  sklDisplay5.setText(Integer.toString(big2));
			  sklDisplay6.setText(Integer.toString(big4));
			  sklDisplay7.setText(Integer.toString(big5));
			  
			  team1.setText("Team 1: " + (big1 + big3));
			  team2.setText("Team 2: " + (big2 + big4 + big5));
		  }
		  if (Math.abs((big1 + big4) - (big2 + big3 + big5)) < best)
		  {
			  best = Math.abs((big1 + big4) - (big2 + big3 + big5));
			  
			  display1.setText(strBig1);
			  display2.setText(strBig4);
			  display5.setText(strBig2);
			  display6.setText(strBig3);
			  display7.setText(strBig5);
			  
			  sklDisplay1.setText(Integer.toString(big1));
			  sklDisplay2.setText(Integer.toString(big4));
			  sklDisplay5.setText(Integer.toString(big2));
			  sklDisplay6.setText(Integer.toString(big3));
			  sklDisplay7.setText(Integer.toString(big5));
			  
			  team1.setText("Team 1: " + (big1 + big4));
			  team2.setText("Team 2: " + (big2 + big3 + big5));
		  }
		  if (Math.abs((big1 + big5) - (big2 + big3 + big4)) < best)
		  {
			  best = Math.abs((big1 + big5) - (big2 + big3 + big4));
			  
			  display1.setText(strBig1);
			  display2.setText(strBig5);
			  display5.setText(strBig2);
			  display6.setText(strBig3);
			  display7.setText(strBig4);
			  
			  sklDisplay1.setText(Integer.toString(big1));
			  sklDisplay2.setText(Integer.toString(big5));
			  sklDisplay5.setText(Integer.toString(big2));
			  sklDisplay6.setText(Integer.toString(big3));
			  sklDisplay7.setText(Integer.toString(big4));
			  
			  team1.setText("Team 1: " + (big1 + big5));
			  team2.setText("Team 2: " + (big2 + big3 + big4));
		  }
		  if(Math.abs((big2 + big3) - (big1 + big4 + big5)) < best)
		  {
			  best = Math.abs((big2 + big3) - (big1 + big4 + big5));
			  
			  display1.setText(strBig2);
			  display2.setText(strBig3);
			  display5.setText(strBig1);
			  display6.setText(strBig4);
			  display7.setText(strBig5);
			  
			  sklDisplay1.setText(Integer.toString(big2));
			  sklDisplay2.setText(Integer.toString(big3));
			  sklDisplay5.setText(Integer.toString(big1));
			  sklDisplay6.setText(Integer.toString(big4));
			  sklDisplay7.setText(Integer.toString(big5));
			  
			  team1.setText("Team 1: " + (big2 + big3));
			  team2.setText("Team 2: " + (big1 + big4 + big5));
		  }
		  if (Math.abs((big2 + big4) - (big1 + big3 + big5)) < best)
		  {
			  best = Math.abs((big2 + big4) - (big1 + big3 + big5));
		  
			  display1.setText(strBig2);
			  display2.setText(strBig4);
			  display5.setText(strBig1);
			  display6.setText(strBig3);
			  display7.setText(strBig5);
		  
			  sklDisplay1.setText(Integer.toString(big2));
			  sklDisplay2.setText(Integer.toString(big4));
			  sklDisplay5.setText(Integer.toString(big1));
			  sklDisplay6.setText(Integer.toString(big3));
			  sklDisplay7.setText(Integer.toString(big5));
		  		
			  team1.setText("Team 1: " + (big2 + big4));
			  team2.setText("Team 2: " + (big1 + big3 + big5));
		  }
		  if (Math.abs((big2 + big5) - (big1 + big3 + big4)) < best)
		  {
			  best = Math.abs((big2 + big5) - (big1 + big3 + big4));
		  
			  display1.setText(strBig2);
			  display2.setText(strBig5);
			  display5.setText(strBig1);
			  display6.setText(strBig3);
			  display7.setText(strBig4);
		  
			  sklDisplay1.setText(Integer.toString(big2));
			  sklDisplay2.setText(Integer.toString(big5));
			  sklDisplay5.setText(Integer.toString(big1));
			  sklDisplay6.setText(Integer.toString(big3));
			  sklDisplay7.setText(Integer.toString(big4));
		  		
			  team1.setText("Team 1: " + (big2 + big5));
			  team2.setText("Team 2: " + (big1 + big3 + big4));
		  }
		  if (Math.abs((big3 + big4) - (big1 + big2 + big5)) < best)
		  {
			  best = Math.abs((big3 + big4) - (big1 + big2 + big5));
		  
			  display1.setText(strBig3);
			  display2.setText(strBig4);
			  display5.setText(strBig1);
			  display6.setText(strBig2);
			  display7.setText(strBig5);
		  
			  sklDisplay1.setText(Integer.toString(big3));
			  sklDisplay2.setText(Integer.toString(big4));
			  sklDisplay5.setText(Integer.toString(big1));
			  sklDisplay6.setText(Integer.toString(big2));
			  sklDisplay7.setText(Integer.toString(big5));
		  		
			  team1.setText("Team 1: " + (big3 + big4));
			  team2.setText("Team 2: " + (big1 + big2 + big5));
		  }
		  if (Math.abs((big3 + big5) - (big1 + big2 + big4)) < best)
		  {
			  best = Math.abs((big3 + big5) - (big1 + big2 + big4));
		  
			  display1.setText(strBig3);
			  display2.setText(strBig5);
			  display5.setText(strBig1);
			  display6.setText(strBig2);
			  display7.setText(strBig4);
		  
			  sklDisplay1.setText(Integer.toString(big3));
			  sklDisplay2.setText(Integer.toString(big5));
			  sklDisplay5.setText(Integer.toString(big1));
			  sklDisplay6.setText(Integer.toString(big2));
			  sklDisplay7.setText(Integer.toString(big4));
		  		
			  team1.setText("Team 1: " + (big3 + big5));
			  team2.setText("Team 2: " + (big1 + big2 + big4));
		  }
		  if (Math.abs((big4 + big5) - (big1 + big2 + big3)) < best)
		  {
			  best = Math.abs((big4 + big5) - (big1 + big2 + big3));
		  
			  display1.setText(strBig4);
			  display2.setText(strBig5);
			  display5.setText(strBig1);
			  display6.setText(strBig2);
			  display7.setText(strBig3);
		  
			  sklDisplay1.setText(Integer.toString(big4));
			  sklDisplay2.setText(Integer.toString(big5));
			  sklDisplay5.setText(Integer.toString(big1));
			  sklDisplay6.setText(Integer.toString(big2));
			  sklDisplay7.setText(Integer.toString(big3));
		  		
			  team1.setText("Team 1: " + (big4 + big5));
			  team2.setText("Team 2: " + (big1 + big2 + big3));
		  }
		  Random myRandom = new Random();
	  		
		  int whosBall = myRandom.nextInt(2);
	        if (whosBall == 1)
	        	tvWhosBall.setText("Team 1 starts with ball");
	        else
	        	tvWhosBall.setText("Team 2 starts with ball");
	  }
	 
	  	public void calcTeams6(int big1, int big2, int big3, int big4, int big5, int big6, String strBig1, String strBig2, String strBig3, String strBig4, String strBig5, String strBig6)
	  	{
		  int best = Math.abs((big1 + big2 + big3) - (big4 + big5 + big6));
		  display1.setText(strBig1);
		  display2.setText(strBig2);
		  display3.setText(strBig3);
		  display5.setText(strBig4);
		  display6.setText(strBig5);
		  display7.setText(strBig6);
		  
		  sklDisplay1.setText(Integer.toString(big1));
		  sklDisplay2.setText(Integer.toString(big2));
		  sklDisplay3.setText(Integer.toString(big3));
		  sklDisplay5.setText(Integer.toString(big4));
		  sklDisplay6.setText(Integer.toString(big5));
		  sklDisplay7.setText(Integer.toString(big6));
		  
		  team1.setText("Team 1: " + (big1 + big2 + big3));
		  team2.setText("Team 2: " + (big4 + big5 + big6));
		  
		  if (Math.abs((big1 + big2 + big4) - (big3 + big5 + big6)) < best)
		  {
			  best = Math.abs((big1 + big2 + big4) - (big3 + big5 + big6));
			  
			  display1.setText(strBig1);
			  display2.setText(strBig2);
			  display3.setText(strBig4);
			  display5.setText(strBig3);
			  display6.setText(strBig5);
			  display7.setText(strBig6);
			  
			  sklDisplay1.setText(Integer.toString(big1));
			  sklDisplay2.setText(Integer.toString(big3));
			  sklDisplay3.setText(Integer.toString(big4));
			  sklDisplay5.setText(Integer.toString(big3));
			  sklDisplay6.setText(Integer.toString(big5));
			  sklDisplay7.setText(Integer.toString(big6));
			  team1.setText("Team 1: " + (big1 + big2 + big4));
			  team2.setText("Team 2: " + (big3 + big5 + big6));
		  }
		  if (Math.abs((big1 + big2 + big5) - (big3 + big4 + big6)) < best)
		  {
			  best = Math.abs((big1 + big2 + big5) - (big3 + big4 + big6));
			  
			  display1.setText(strBig1);
			  display2.setText(strBig2);
			  display3.setText(strBig5);
			  display5.setText(strBig3);
			  display6.setText(strBig4);
			  display7.setText(strBig6);
			  
			  sklDisplay1.setText(Integer.toString(big1));
			  sklDisplay2.setText(Integer.toString(big2));
			  sklDisplay3.setText(Integer.toString(big5));
			  sklDisplay5.setText(Integer.toString(big3));
			  sklDisplay6.setText(Integer.toString(big4));
			  sklDisplay7.setText(Integer.toString(big6));
			  
			  team1.setText("Team 1: " + (big1 + big2 + big5));
			  team2.setText("Team 2: " + (big3 + big4 + big6));
		  }
		  if (Math.abs((big1 + big2 + big6) - (big3 + big4 + big5)) < best)
		  {
			  best = Math.abs((big1 + big2 + big6) - (big3 + big4 + big5));
			  
			  display1.setText(strBig1);
			  display2.setText(strBig2);
			  display3.setText(strBig6);
			  display5.setText(strBig3);
			  display6.setText(strBig4);
			  display7.setText(strBig5);
			  
			  sklDisplay1.setText(Integer.toString(big1));
			  sklDisplay2.setText(Integer.toString(big2));
			  sklDisplay3.setText((Integer.toString(big6)));
			  sklDisplay5.setText(Integer.toString(big3));
			  sklDisplay6.setText(Integer.toString(big4));
			  sklDisplay7.setText(Integer.toString(big5));
			  
			  team1.setText("Team 1: " + (big1 + big2 + big6));
			  team2.setText("Team 2: " + (big3 + big4 + big5));
		  }
		  if (Math.abs((big1 + big3 + big4) - (big2 + big5 + big6)) < best)
		  {
			  best = Math.abs((big1 + big3 + big4) - (big2 + big5 + big6));
			  
			  display1.setText(strBig1);
			  display2.setText(strBig3);
			  display3.setText(strBig4);
			  display5.setText(strBig2);
			  display6.setText(strBig5);
			  display7.setText(strBig6);
			  
			  sklDisplay1.setText(Integer.toString(big1));
			  sklDisplay2.setText(Integer.toString(big3));
			  sklDisplay3.setText(Integer.toString(big4));
			  sklDisplay5.setText(Integer.toString(big2));
			  sklDisplay6.setText(Integer.toString(big5));
			  sklDisplay7.setText(Integer.toString(big6));
			  
			  team1.setText("Team 1: " + (big1 + big3 + big4));
			  team2.setText("Team 2: " + (big2 + big5 + big6));
		  }
		  if (Math.abs((big1 + big3 + big5) - (big2 + big4 + big6)) < best)
		  {
			  best = Math.abs((big1 + big3 + big5) - (big2 + big4 + big6));
			  
			  display1.setText(strBig1);
			  display2.setText(strBig3);
			  display3.setText(strBig5);
			  display5.setText(strBig2);
			  display6.setText(strBig4);
			  display7.setText(strBig6);
			  
			  sklDisplay1.setText(Integer.toString(big1));
			  sklDisplay2.setText(Integer.toString(big3));
			  sklDisplay3.setText(Integer.toString(big5));
			  sklDisplay5.setText(Integer.toString(big2));
			  sklDisplay6.setText(Integer.toString(big4));
			  sklDisplay7.setText(Integer.toString(big6));
			  
			  team1.setText("Team 1: " + (big1 + big3 + big5));
			  team2.setText("Team 2: " + (big2 + big4 + big6));
		  }
		  if (Math.abs((big1 + big3 + big6) - (big2 + big4 + big5)) < best)
		  {
			  best = Math.abs((big1 + big3 + big6) - (big2 + big4 + big5));
			  
			  display1.setText(strBig1);
			  display2.setText(strBig3);
			  display3.setText(strBig6);
			  display5.setText(strBig2);
			  display6.setText(strBig4);
			  display7.setText(strBig5);
			  
			  sklDisplay1.setText(Integer.toString(big1));
			  sklDisplay2.setText(Integer.toString(big3));
			  sklDisplay3.setText(Integer.toString(big6));
			  sklDisplay5.setText(Integer.toString(big2));
			  sklDisplay6.setText(Integer.toString(big4));
			  sklDisplay7.setText(Integer.toString(big5));
			  
			  team1.setText("Team 1: " + (big1 + big3 + big6));
			  team2.setText("Team 2: " + (big2 + big4 + big5));
		  }
		  if (Math.abs((big1 + big4 + big5) - (big2 + big3 + big6)) < best)
		  {
			  best = Math.abs((big1 + big4 + big5) - (big2 + big3 + big6));
			  
			  display1.setText(strBig1);
			  display2.setText(strBig4);
			  display3.setText(strBig5);
			  display5.setText(strBig2);
			  display6.setText(strBig3);
			  display7.setText(strBig6);
			  
			  sklDisplay1.setText(Integer.toString(big1));
			  sklDisplay2.setText(Integer.toString(big4));
			  sklDisplay3.setText(Integer.toString(big5));
			  sklDisplay5.setText(Integer.toString(big2));
			  sklDisplay6.setText(Integer.toString(big3));
			  sklDisplay7.setText(Integer.toString(big6));
			  
			  team1.setText("Team 1: " + (big1 + big4 + big5));
			  team2.setText("Team 2: " + (big2 + big3 + big6));
		  }
		  if (Math.abs((big1 + big4 + big6) - (big2 + big3 + big5)) < best)
		  {
			  best = Math.abs((big1 + big4 + big6) - (big2 + big3 + big5));
			  
			  display1.setText(strBig1);
			  display2.setText(strBig4);
			  display3.setText(strBig6);
			  display5.setText(strBig2);
			  display6.setText(strBig3);
			  display7.setText(strBig5);
			  
			  sklDisplay1.setText(Integer.toString(big1));
			  sklDisplay2.setText(Integer.toString(big4));
			  sklDisplay3.setText(Integer.toString(big6));
			  sklDisplay5.setText(Integer.toString(big2));
			  sklDisplay6.setText(Integer.toString(big3));
			  sklDisplay7.setText(Integer.toString(big5));
			  
			  team1.setText("Team 1: " + (big1 + big4 + big6));
			  team2.setText("Team 2: " + (big2 + big3 + big5));
		  }
		  if (Math.abs((big1 + big5 + big6) - (big2 + big3 + big4)) < best)
		  {
			  best = Math.abs((big1 + big5 + big6) - (big2 + big3 + big4));
			  
			  display1.setText(strBig1);
			  display2.setText(strBig4);
			  display3.setText(strBig6);
			  display5.setText(strBig2);
			  display6.setText(strBig3);
			  display7.setText(strBig5);
			  
			  sklDisplay1.setText(Integer.toString(big1));
			  sklDisplay2.setText(Integer.toString(big4));
			  sklDisplay3.setText(Integer.toString(big6));
			  sklDisplay5.setText(Integer.toString(big2));
			  sklDisplay6.setText(Integer.toString(big3));
			  sklDisplay7.setText(Integer.toString(big5));
			  
			  team1.setText("Team 1: " + (big1 + big5 + big6));
			  team2.setText("Team 2: " + (big2 + big3 + big4));
		  }
		  if (Math.abs((big1 + big5 + big6) - (big2 + big3 + big4)) < best)
		  {
			  best = Math.abs((big1 + big5 + big6) - (big2 + big3 + big4));
			  
			  display1.setText(strBig1);
			  display2.setText(strBig4);
			  display3.setText(strBig6);
			  display5.setText(strBig2);
			  display6.setText(strBig3);
			  display7.setText(strBig5);
			  
			  sklDisplay1.setText(Integer.toString(big1));
			  sklDisplay2.setText(Integer.toString(big4));
			  sklDisplay3.setText(Integer.toString(big6));
			  sklDisplay5.setText(Integer.toString(big2));
			  sklDisplay6.setText(Integer.toString(big3));
			  sklDisplay7.setText(Integer.toString(big5));
			  
			  team1.setText("Team 1: " + (big1 + big5 + big6));
			  team2.setText("Team 2: " + (big2 + big3 + big4));
		  }
		  Random myRandom = new Random();
	  		
		  int whosBall = myRandom.nextInt(2);
	        if (whosBall == 1)
	        	tvWhosBall.setText("Team 1 starts with ball");
	        else
	        	tvWhosBall.setText("Team 2 starts with ball");
	  	}
	  	public void calcTeams7(int big1, int big2, int big3, int big4, int big5, int big6, int big7, String strBig1, String strBig2, String strBig3, String strBig4, String strBig5, String strBig6, String strBig7)
	  	{
		  int best = Math.abs((big1 + big2 + big3) - (big4 + big5 + big6 + big7));
		  display1.setText(strBig1);
		  display2.setText(strBig2);
		  display3.setText(strBig3);
		  display5.setText(strBig4);
		  display6.setText(strBig5);
		  display7.setText(strBig6);
		  display8.setText(strBig7);
		  
		  sklDisplay1.setText(Integer.toString(big1));
		  sklDisplay2.setText(Integer.toString(big2));
		  sklDisplay3.setText(Integer.toString(big3));
		  sklDisplay5.setText(Integer.toString(big4));
		  sklDisplay6.setText(Integer.toString(big5));
		  sklDisplay7.setText(Integer.toString(big6));
		  sklDisplay8.setText(Integer.toString(big7));
		  
		  team1.setText("Team 1: " + (big1 + big2 + big3));
		  team2.setText("Team 2: " + (big4 + big5 + big6 + big7));
		  
		  if (Math.abs((big1 + big2 + big4) - (big3 + big5 + big6 + big7)) < best)
		  {
			  best = Math.abs((big1 + big2 + big4) - (big3 + big5 + big6 + big7));
			  
			  display1.setText(strBig1);
			  display2.setText(strBig2);
			  display3.setText(strBig4);
			  display5.setText(strBig3);
			  display6.setText(strBig5);
			  display7.setText(strBig6);
			  display8.setText(strBig7);
			  
			  sklDisplay1.setText(Integer.toString(big1));
			  sklDisplay2.setText(Integer.toString(big3));
			  sklDisplay3.setText(Integer.toString(big4));
			  sklDisplay5.setText(Integer.toString(big3));
			  sklDisplay6.setText(Integer.toString(big5));
			  sklDisplay7.setText(Integer.toString(big6));
			  sklDisplay8.setText(Integer.toString(big7));
			  
			  team1.setText("Team 1: " + (big1 + big2 + big4));
			  team2.setText("Team 2: " + (big3 + big5 + big6 + big7));
		  }
		  if (Math.abs((big1 + big2 + big5) - (big3 + big4 + big6 + big7)) < best)
		  {
			  best = Math.abs((big1 + big2 + big5) - (big3 + big4 + big6 + big7));
			  
			  display1.setText(strBig1);
			  display2.setText(strBig2);
			  display3.setText(strBig5);
			  display5.setText(strBig3);
			  display6.setText(strBig4);
			  display7.setText(strBig6);
			  display8.setText(strBig7);
			  
			  sklDisplay1.setText(Integer.toString(big1));
			  sklDisplay2.setText(Integer.toString(big2));
			  sklDisplay3.setText(Integer.toString(big5));
			  sklDisplay5.setText(Integer.toString(big3));
			  sklDisplay6.setText(Integer.toString(big4));
			  sklDisplay7.setText(Integer.toString(big6));
			  
			  team1.setText("Team 1: " + (big1 + big2 + big5));
			  team2.setText("Team 2: " + (big3 + big4 + big6 + big7));
		  }
		  if (Math.abs((big1 + big2 + big6) - (big3 + big4 + big5 + big7)) < best)
		  {
			  best = Math.abs((big1 + big2 + big6) - (big3 + big4 + big5 + big7));
			  
			  display1.setText(strBig1);
			  display2.setText(strBig2);
			  display3.setText(strBig6);
			  display5.setText(strBig3);
			  display6.setText(strBig4);
			  display7.setText(strBig5);
			  display8.setText(strBig7);
			  
			  sklDisplay1.setText(Integer.toString(big1));
			  sklDisplay2.setText(Integer.toString(big2));
			  sklDisplay3.setText(Integer.toString(big6));
			  sklDisplay5.setText(Integer.toString(big3));
			  sklDisplay6.setText(Integer.toString(big4));
			  sklDisplay7.setText(Integer.toString(big5));
			  sklDisplay8.setText(Integer.toString(big7));
			  
			  team1.setText("Team 1: " + (big1 + big2 + big6));
			  team2.setText("Team 2: " + (big3 + big4 + big5 + big7));
		  }
		  if (Math.abs((big1 + big2 + big7) - (big3 + big4 + big5 + big6)) < best)
		  {
			  best = Math.abs((big1 + big2 + big7) - (big3 + big4 + big5 + big6));
			  
			  display1.setText(strBig1);
			  display2.setText(strBig2);
			  display3.setText(strBig7);
			  display5.setText(strBig3);
			  display6.setText(strBig4);
			  display7.setText(strBig5);
			  display8.setText(strBig6);
			  
			  sklDisplay1.setText(Integer.toString(big1));
			  sklDisplay2.setText(Integer.toString(big2));
			  sklDisplay3.setText(Integer.toString(big7));
			  sklDisplay5.setText(Integer.toString(big3));
			  sklDisplay6.setText(Integer.toString(big4));
			  sklDisplay7.setText(Integer.toString(big5));
			  sklDisplay8.setText(Integer.toString(big6));
			  
			  team1.setText("Team 1: " + (big1 + big2 + big7));
			  team2.setText("Team 2: " + (big3 + big4 + big5 + big6));
		  }
		  if (Math.abs((big1 + big3 + big4) - (big2 + big5 + big6 + big7)) < best)
		  {
			  best = Math.abs((big1 + big3 + big4) - (big2 + big5 + big6 + big7));
			  
			  display1.setText(strBig1);
			  display2.setText(strBig3);
			  display3.setText(strBig4);
			  display5.setText(strBig2);
			  display6.setText(strBig5);
			  display7.setText(strBig6);
			  display8.setText(strBig7);
			  
			  sklDisplay1.setText(Integer.toString(big1));
			  sklDisplay2.setText(Integer.toString(big3));
			  sklDisplay3.setText(Integer.toString(big4));
			  sklDisplay5.setText(Integer.toString(big2));
			  sklDisplay6.setText(Integer.toString(big5));
			  sklDisplay7.setText(Integer.toString(big6));
			  sklDisplay8.setText(Integer.toString(big7));
			  
			  team1.setText("Team 1: " + (big1 + big3 + big4));
			  team2.setText("Team 2: " + (big2 + big5 + big6 + big7));
			  
		  }
		  if (Math.abs((big1 + big3 + big5) - (big2 + big4 + big6 + big7)) < best)
		  {
			  best = Math.abs((big1 + big3 + big5) - (big2 + big4 + big6 + big7));
			  
			  display1.setText(strBig1);
			  display2.setText(strBig3);
			  display3.setText(strBig5);
			  display5.setText(strBig2);
			  display6.setText(strBig4);
			  display7.setText(strBig6);
			  display8.setText(strBig7);
			  
			  sklDisplay1.setText(Integer.toString(big1));
			  sklDisplay2.setText(Integer.toString(big3));
			  sklDisplay3.setText(Integer.toString(big5));
			  sklDisplay5.setText(Integer.toString(big2));
			  sklDisplay6.setText(Integer.toString(big4));
			  sklDisplay7.setText(Integer.toString(big6));
			  sklDisplay8.setText(Integer.toString(big7));
			  
			  team1.setText("Team 1: " + (big1 + big3 + big5));
			  team2.setText("Team 2: " + (big2 + big4 + big6 + big7));
			  
		  }
		  if (Math.abs((big1 + big3 + big6) - (big2 + big4 + big5 + big7)) < best)
		  {
			  best = Math.abs((big1 + big3 + big6) - (big2 + big4 + big5 + big7));
			  
			  display1.setText(strBig1);
			  display2.setText(strBig3);
			  display3.setText(strBig6);
			  display5.setText(strBig2);
			  display6.setText(strBig4);
			  display7.setText(strBig5);
			  display8.setText(strBig7);
			  
			  sklDisplay1.setText(Integer.toString(big1));
			  sklDisplay2.setText(Integer.toString(big3));
			  sklDisplay3.setText(Integer.toString(big6));
			  sklDisplay5.setText(Integer.toString(big2));
			  sklDisplay6.setText(Integer.toString(big4));
			  sklDisplay7.setText(Integer.toString(big5));
			  sklDisplay8.setText(Integer.toString(big7));
			  
			  team1.setText("Team 1: " + (big1 + big3 + big6));
			  team2.setText("Team 2: " + (big2 + big4 + big5 + big7));
			  
		  }
		  if (Math.abs((big1 + big4 + big5) - (big2 + big3 + big6 + big7)) < best)
		  {
			  best = Math.abs((big1 + big4 + big5) - (big2 + big3 + big6 + big7));
			  
			  display1.setText(strBig1);
			  display2.setText(strBig4);
			  display3.setText(strBig5);
			  display5.setText(strBig2);
			  display6.setText(strBig3);
			  display7.setText(strBig6);
			  display8.setText(strBig7);
			  
			  sklDisplay1.setText(Integer.toString(big1));
			  sklDisplay2.setText(Integer.toString(big4));
			  sklDisplay3.setText(Integer.toString(big5));
			  sklDisplay5.setText(Integer.toString(big2));
			  sklDisplay6.setText(Integer.toString(big3));
			  sklDisplay7.setText(Integer.toString(big6));
			  sklDisplay8.setText(Integer.toString(big7));
			  
			  team1.setText("Team 1: " + (big1 + big4 + big5));
			  team2.setText("Team 2: " + (big2 + big3 + big6 + big7));
			  
		  }
		  if (Math.abs((big1 + big4 + big6) - (big2 + big3 + big5 + big7)) < best)
		  {
			  best = Math.abs((big1 + big4 + big6) - (big2 + big3 + big5 + big7));
			  
			  display1.setText(strBig1);
			  display2.setText(strBig4);
			  display3.setText(strBig6);
			  display5.setText(strBig2);
			  display6.setText(strBig3);
			  display7.setText(strBig5);
			  display8.setText(strBig7);
			  
			  sklDisplay1.setText(Integer.toString(big1));
			  sklDisplay2.setText(Integer.toString(big4));
			  sklDisplay3.setText(Integer.toString(big6));
			  sklDisplay5.setText(Integer.toString(big2));
			  sklDisplay6.setText(Integer.toString(big3));
			  sklDisplay7.setText(Integer.toString(big5));
			  sklDisplay8.setText(Integer.toString(big7));
			  
			  team1.setText("Team 1: " + (big1 + big4 + big6));
			  team2.setText("Team 2: " + (big2 + big3 + big5 + big7));
			  
		  }
		  if (Math.abs((big1 + big4 + big7) - (big2 + big3 + big5 + big6)) < best)
		  {
			  best = Math.abs((big1 + big4 + big7) - (big2 + big3 + big5 + big6));
			  
			  display1.setText(strBig1);
			  display2.setText(strBig4);
			  display3.setText(strBig7);
			  display5.setText(strBig2);
			  display6.setText(strBig3);
			  display7.setText(strBig5);
			  display8.setText(strBig6);
			  
			  sklDisplay1.setText(Integer.toString(big1));
			  sklDisplay2.setText(Integer.toString(big4));
			  sklDisplay3.setText(Integer.toString(big7));
			  sklDisplay5.setText(Integer.toString(big2));
			  sklDisplay6.setText(Integer.toString(big3));
			  sklDisplay7.setText(Integer.toString(big5));
			  sklDisplay8.setText(Integer.toString(big6));
			  
			  team1.setText("Team 1: " + (big1 + big4 + big7));
			  team2.setText("Team 2: " + (big2 + big3 + big5 + big6));
			  
		  }
		  if (Math.abs((big1 + big5 + big6) - (big2 + big3 + big4 + big7)) < best)
		  {
			  best = Math.abs((big1 + big5 + big6) - (big2 + big3 + big4 + big7));
			  
			  display1.setText(strBig1);
			  display2.setText(strBig5);
			  display3.setText(strBig6);
			  display5.setText(strBig2);
			  display6.setText(strBig3);
			  display7.setText(strBig4);
			  display8.setText(strBig7);
			  
			  sklDisplay1.setText(Integer.toString(big1));
			  sklDisplay2.setText(Integer.toString(big5));
			  sklDisplay3.setText(Integer.toString(big6));
			  sklDisplay5.setText(Integer.toString(big2));
			  sklDisplay6.setText(Integer.toString(big3));
			  sklDisplay7.setText(Integer.toString(big4));
			  sklDisplay8.setText(Integer.toString(big7));
			  
			  team1.setText("Team 1: " + (big1 + big5 + big6));
			  team2.setText("Team 2: " + (big2 + big3 + big4 + big7));
			  
		  }
		  if (Math.abs((big1 + big5 + big7) - (big2 + big3 + big4 + big6)) < best)
		  {
			  best = Math.abs((big1 + big5 + big7) - (big2 + big3 + big4 + big6));
			  
			  display1.setText(strBig1);
			  display2.setText(strBig5);
			  display3.setText(strBig7);
			  display5.setText(strBig2);
			  display6.setText(strBig3);
			  display7.setText(strBig4);
			  display8.setText(strBig6);
			  
			  sklDisplay1.setText(Integer.toString(big1));
			  sklDisplay2.setText(Integer.toString(big5));
			  sklDisplay3.setText(Integer.toString(big7));
			  sklDisplay5.setText(Integer.toString(big2));
			  sklDisplay6.setText(Integer.toString(big3));
			  sklDisplay7.setText(Integer.toString(big4));
			  sklDisplay8.setText(Integer.toString(big6));
			  
			  team1.setText("Team 1: " + (big1 + big5 + big7));
			  team2.setText("Team 2: " + (big2 + big3 + big4 + big6));
			  
		  }
		  if (Math.abs((big1 + big6 + big7) - (big2 + big3 + big4 + big5)) < best)
		  {
			  best = Math.abs((big1 + big6 + big7) - (big2 + big3 + big4 + big5));
			  
			  display1.setText(strBig1);
			  display2.setText(strBig6);
			  display3.setText(strBig7);
			  display5.setText(strBig2);
			  display6.setText(strBig3);
			  display7.setText(strBig4);
			  display8.setText(strBig5);
			  
			  sklDisplay1.setText(Integer.toString(big1));
			  sklDisplay2.setText(Integer.toString(big6));
			  sklDisplay3.setText(Integer.toString(big7));
			  sklDisplay5.setText(Integer.toString(big2));
			  sklDisplay6.setText(Integer.toString(big3));
			  sklDisplay7.setText(Integer.toString(big4));
			  sklDisplay8.setText(Integer.toString(big5));
			  
			  team1.setText("Team 1: " + (big1 + big6 + big7));
			  team2.setText("Team 2: " + (big2 + big3 + big4 + big5));
			  
		  }
		  if (Math.abs((big2 + big3 + big4) - (big1 + big5 + big6 + big7)) < best)
		  {
			  best = Math.abs((big2 + big3 + big4) - (big1 + big5 + big6 + big7));
			  
			  display1.setText(strBig2);
			  display2.setText(strBig3);
			  display3.setText(strBig4);
			  display5.setText(strBig1);
			  display6.setText(strBig5);
			  display7.setText(strBig6);
			  display8.setText(strBig7);
			  
			  sklDisplay1.setText(Integer.toString(big2));
			  sklDisplay2.setText(Integer.toString(big3));
			  sklDisplay3.setText(Integer.toString(big4));
			  sklDisplay5.setText(Integer.toString(big1));
			  sklDisplay6.setText(Integer.toString(big5));
			  sklDisplay7.setText(Integer.toString(big6));
			  sklDisplay8.setText(Integer.toString(big7));
			  
			  team1.setText("Team 1: " + (big2 + big3 + big4));
			  team2.setText("Team 2: " + (big1 + big5 + big6 + big7));
			  
		  }
		  if (Math.abs((big2 + big3 + big5) - (big1 + big4 + big6 + big7)) < best)
		  {
			  best = Math.abs((big2 + big3 + big5) - (big1 + big4 + big6 + big7));
			  
			  display1.setText(strBig2);
			  display2.setText(strBig3);
			  display3.setText(strBig5);
			  display5.setText(strBig1);
			  display6.setText(strBig4);
			  display7.setText(strBig6);
			  display8.setText(strBig7);
			  
			  sklDisplay1.setText(Integer.toString(big2));
			  sklDisplay2.setText(Integer.toString(big3));
			  sklDisplay3.setText(Integer.toString(big5));
			  sklDisplay5.setText(Integer.toString(big1));
			  sklDisplay6.setText(Integer.toString(big4));
			  sklDisplay7.setText(Integer.toString(big6));
			  sklDisplay8.setText(Integer.toString(big7));
			  
			  team1.setText("Team 1: " + (big2 + big3 + big5));
			  team2.setText("Team 2: " + (big1 + big4 + big6 + big7));
			  
		  }
		  if (Math.abs((big2 + big3 + big6) - (big1 + big4 + big5 + big7)) < best)
		  {
			  best = Math.abs((big2 + big3 + big6) - (big1 + big4 + big5 + big7));
			  
			  display1.setText(strBig2);
			  display2.setText(strBig3);
			  display3.setText(strBig6);
			  display5.setText(strBig1);
			  display6.setText(strBig4);
			  display7.setText(strBig5);
			  display8.setText(strBig7);
			  
			  sklDisplay1.setText(Integer.toString(big2));
			  sklDisplay2.setText(Integer.toString(big3));
			  sklDisplay3.setText(Integer.toString(big6));
			  sklDisplay5.setText(Integer.toString(big1));
			  sklDisplay6.setText(Integer.toString(big4));
			  sklDisplay7.setText(Integer.toString(big5));
			  sklDisplay8.setText(Integer.toString(big7));
			  
			  team1.setText("Team 1: " + (big2 + big3 + big6));
			  team2.setText("Team 2: " + (big1 + big4 + big5 + big7));
			  
		  }
		  if (Math.abs((big2 + big3 + big7) - (big1 + big4 + big5 + big6)) < best)
		  {
			  best = Math.abs((big2 + big3 + big7) - (big1 + big4 + big5 + big6));
			  
			  display1.setText(strBig2);
			  display2.setText(strBig3);
			  display3.setText(strBig7);
			  display5.setText(strBig1);
			  display6.setText(strBig4);
			  display7.setText(strBig5);
			  display8.setText(strBig6);
			  
			  sklDisplay1.setText(Integer.toString(big2));
			  sklDisplay2.setText(Integer.toString(big3));
			  sklDisplay3.setText(Integer.toString(big7));
			  sklDisplay5.setText(Integer.toString(big1));
			  sklDisplay6.setText(Integer.toString(big4));
			  sklDisplay7.setText(Integer.toString(big5));
			  sklDisplay8.setText(Integer.toString(big6));
			  
			  team1.setText("Team 1: " + (big2 + big3 + big7));
			  team2.setText("Team 2: " + (big1 + big4 + big5 + big6));
			  
		  }
		  if (Math.abs((big2 + big4 + big5) - (big1 + big3 + big6 + big7)) < best)
		  {
			  best = Math.abs((big2 + big4 + big5) - (big1 + big3 + big6 + big7));
			  
			  display1.setText(strBig2);
			  display2.setText(strBig4);
			  display3.setText(strBig5);
			  display5.setText(strBig1);
			  display6.setText(strBig3);
			  display7.setText(strBig6);
			  display8.setText(strBig7);
			  
			  sklDisplay1.setText(Integer.toString(big2));
			  sklDisplay2.setText(Integer.toString(big4));
			  sklDisplay3.setText(Integer.toString(big5));
			  sklDisplay5.setText(Integer.toString(big1));
			  sklDisplay6.setText(Integer.toString(big3));
			  sklDisplay7.setText(Integer.toString(big6));
			  sklDisplay8.setText(Integer.toString(big7));
			  
			  team1.setText("Team 1: " + (big2 + big4 + big5));
			  team2.setText("Team 2: " + (big1 + big3 + big6 + big7));
			  
		  }
		  if (Math.abs((big2 + big4 + big6) - (big1 + big3 + big5 + big7)) < best)
		  {
			  best = Math.abs((big2 + big4 + big6) - (big1 + big3 + big5 + big7));
			  
			  display1.setText(strBig2);
			  display2.setText(strBig4);
			  display3.setText(strBig6);
			  display5.setText(strBig1);
			  display6.setText(strBig3);
			  display7.setText(strBig5);
			  display8.setText(strBig7);
			  
			  sklDisplay1.setText(Integer.toString(big2));
			  sklDisplay2.setText(Integer.toString(big4));
			  sklDisplay3.setText(Integer.toString(big6));
			  sklDisplay5.setText(Integer.toString(big1));
			  sklDisplay6.setText(Integer.toString(big3));
			  sklDisplay7.setText(Integer.toString(big5));
			  sklDisplay8.setText(Integer.toString(big7));
			  
			  team1.setText("Team 1: " + (big2 + big4 + big6));
			  team2.setText("Team 2: " + (big1 + big3 + big5 + big7));
			  
		  }
		  if (Math.abs((big2 + big4 + big7) - (big1 + big3 + big5 + big6)) < best)
		  {
			  best = Math.abs((big2 + big4 + big7) - (big1 + big3 + big5 + big6));
			  
			  display1.setText(strBig2);
			  display2.setText(strBig4);
			  display3.setText(strBig7);
			  display5.setText(strBig1);
			  display6.setText(strBig3);
			  display7.setText(strBig5);
			  display8.setText(strBig6);
			  
			  sklDisplay1.setText(Integer.toString(big2));
			  sklDisplay2.setText(Integer.toString(big4));
			  sklDisplay3.setText(Integer.toString(big7));
			  sklDisplay5.setText(Integer.toString(big1));
			  sklDisplay6.setText(Integer.toString(big3));
			  sklDisplay7.setText(Integer.toString(big5));
			  sklDisplay8.setText(Integer.toString(big6));
			  
			  team1.setText("Team 1: " + (big2 + big4 + big7));
			  team2.setText("Team 2: " + (big1 + big3 + big5 + big6));
			  
		  }
		  if (Math.abs((big2 + big5 + big6) - (big1 + big3 + big4 + big7)) < best)
		  {
			  best = Math.abs((big2 + big5 + big6) - (big1 + big3 + big4 + big7));
			  
			  display1.setText(strBig2);
			  display2.setText(strBig5);
			  display3.setText(strBig6);
			  display5.setText(strBig1);
			  display6.setText(strBig3);
			  display7.setText(strBig4);
			  display8.setText(strBig7);
			  
			  sklDisplay1.setText(Integer.toString(big2));
			  sklDisplay2.setText(Integer.toString(big5));
			  sklDisplay3.setText(Integer.toString(big6));
			  sklDisplay5.setText(Integer.toString(big1));
			  sklDisplay6.setText(Integer.toString(big3));
			  sklDisplay7.setText(Integer.toString(big4));
			  sklDisplay8.setText(Integer.toString(big7));
			  
			  team1.setText("Team 1: " + (big2 + big5 + big6));
			  team2.setText("Team 2: " + (big1 + big3 + big4 + big7));
			  
		  }
		  if (Math.abs((big2 + big5 + big7) - (big1 + big3 + big4 + big6)) < best)
		  {
			  best = Math.abs((big2 + big5 + big7) - (big1 + big3 + big4 + big6));
			  
			  display1.setText(strBig2);
			  display2.setText(strBig5);
			  display3.setText(strBig7);
			  display5.setText(strBig1);
			  display6.setText(strBig3);
			  display7.setText(strBig4);
			  display8.setText(strBig6);
			  
			  sklDisplay1.setText(Integer.toString(big2));
			  sklDisplay2.setText(Integer.toString(big5));
			  sklDisplay3.setText(Integer.toString(big7));
			  sklDisplay5.setText(Integer.toString(big1));
			  sklDisplay6.setText(Integer.toString(big3));
			  sklDisplay7.setText(Integer.toString(big4));
			  sklDisplay8.setText(Integer.toString(big6));
			  
			  team1.setText("Team 1: " + (big2 + big5 + big7));
			  team2.setText("Team 2: " + (big1 + big3 + big4 + big6));
			  
		  }
		  if (Math.abs((big2 + big6 + big7) - (big1 + big3 + big4 + big5)) < best)
		  {
			  best = Math.abs((big2 + big6 + big7) - (big1 + big3 + big4 + big5));
			  
			  display1.setText(strBig2);
			  display2.setText(strBig6);
			  display3.setText(strBig7);
			  display5.setText(strBig1);
			  display6.setText(strBig3);
			  display7.setText(strBig4);
			  display8.setText(strBig5);
			  
			  sklDisplay1.setText(Integer.toString(big2));
			  sklDisplay2.setText(Integer.toString(big6));
			  sklDisplay3.setText(Integer.toString(big7));
			  sklDisplay5.setText(Integer.toString(big1));
			  sklDisplay6.setText(Integer.toString(big3));
			  sklDisplay7.setText(Integer.toString(big4));
			  sklDisplay8.setText(Integer.toString(big5));
			  
			  team1.setText("Team 1: " + (big2 + big6 + big7));
			  team2.setText("Team 2: " + (big1 + big3 + big4 + big5));
			  
		  }
		  if (Math.abs((big3 + big4 + big5) - (big1 + big2 + big6 + big7)) < best)
		  {
			  best = Math.abs((big3 + big4 + big5) - (big1 + big2 + big6 + big7));
			  
			  display1.setText(strBig3);
			  display2.setText(strBig4);
			  display3.setText(strBig5);
			  display5.setText(strBig1);
			  display6.setText(strBig2);
			  display7.setText(strBig6);
			  display8.setText(strBig7);
			  
			  sklDisplay1.setText(Integer.toString(big3));
			  sklDisplay2.setText(Integer.toString(big4));
			  sklDisplay3.setText(Integer.toString(big5));
			  sklDisplay5.setText(Integer.toString(big1));
			  sklDisplay6.setText(Integer.toString(big2));
			  sklDisplay7.setText(Integer.toString(big6));
			  sklDisplay8.setText(Integer.toString(big7));
			  
			  team1.setText("Team 1: " + (big3 + big4 + big5));
			  team2.setText("Team 2: " + (big1 + big2 + big6 + big7));
			  
		  }
		  if (Math.abs((big3 + big4 + big6) - (big1 + big2 + big5 + big7)) < best)
		  {
			  best = Math.abs((big3 + big4 + big6) - (big1 + big2 + big5 + big7));
			  
			  display1.setText(strBig3);
			  display2.setText(strBig4);
			  display3.setText(strBig6);
			  display5.setText(strBig1);
			  display6.setText(strBig2);
			  display7.setText(strBig5);
			  display8.setText(strBig7);
			  
			  sklDisplay1.setText(Integer.toString(big3));
			  sklDisplay2.setText(Integer.toString(big4));
			  sklDisplay3.setText(Integer.toString(big6));
			  sklDisplay5.setText(Integer.toString(big1));
			  sklDisplay6.setText(Integer.toString(big2));
			  sklDisplay7.setText(Integer.toString(big5));
			  sklDisplay8.setText(Integer.toString(big7));
			  
			  team1.setText("Team 1: " + (big3 + big4 + big6));
			  team2.setText("Team 2: " + (big1 + big2 + big5 + big7));
			  
		  }
		  if (Math.abs((big3 + big4 + big7) - (big1 + big2 + big5 + big6)) < best)
		  {
			  best = Math.abs((big3 + big4 + big7) - (big1 + big2 + big5 + big6));
			  
			  display1.setText(strBig3);
			  display2.setText(strBig4);
			  display3.setText(strBig7);
			  display5.setText(strBig1);
			  display6.setText(strBig2);
			  display7.setText(strBig5);
			  display8.setText(strBig6);
			  
			  sklDisplay1.setText(Integer.toString(big3));
			  sklDisplay2.setText(Integer.toString(big4));
			  sklDisplay3.setText(Integer.toString(big7));
			  sklDisplay5.setText(Integer.toString(big1));
			  sklDisplay6.setText(Integer.toString(big2));
			  sklDisplay7.setText(Integer.toString(big5));
			  sklDisplay8.setText(Integer.toString(big6));
			  
			  team1.setText("Team 1: " + (big3 + big4 + big7));
			  team2.setText("Team 2: " + (big1 + big2 + big5 + big6));
			  
		  }
		  if (Math.abs((big3 + big5 + big6) - (big1 + big2 + big4 + big7)) < best)
		  {
			  best = Math.abs((big3 + big5 + big6) - (big1 + big2 + big4 + big7));
			  
			  display1.setText(strBig3);
			  display2.setText(strBig5);
			  display3.setText(strBig6);
			  display5.setText(strBig1);
			  display6.setText(strBig2);
			  display7.setText(strBig4);
			  display8.setText(strBig7);
			  
			  sklDisplay1.setText(Integer.toString(big3));
			  sklDisplay2.setText(Integer.toString(big5));
			  sklDisplay3.setText(Integer.toString(big6));
			  sklDisplay5.setText(Integer.toString(big1));
			  sklDisplay6.setText(Integer.toString(big2));
			  sklDisplay7.setText(Integer.toString(big4));
			  sklDisplay8.setText(Integer.toString(big7));
			  
			  team1.setText("Team 1: " + (big3 + big5 + big6));
			  team2.setText("Team 2: " + (big1 + big2 + big4 + big7));
			  
		  }
		  if (Math.abs((big3 + big5 + big7) - (big1 + big2 + big4 + big6)) < best)
		  {
			  best = Math.abs((big3 + big5 + big7) - (big1 + big2 + big4 + big6));
			  
			  display1.setText(strBig3);
			  display2.setText(strBig5);
			  display3.setText(strBig7);
			  display5.setText(strBig1);
			  display6.setText(strBig2);
			  display7.setText(strBig4);
			  display8.setText(strBig6);
			  
			  sklDisplay1.setText(Integer.toString(big3));
			  sklDisplay2.setText(Integer.toString(big5));
			  sklDisplay3.setText(Integer.toString(big7));
			  sklDisplay5.setText(Integer.toString(big1));
			  sklDisplay6.setText(Integer.toString(big2));
			  sklDisplay7.setText(Integer.toString(big4));
			  sklDisplay8.setText(Integer.toString(big6));
			  
			  team1.setText("Team 1: " + (big3 + big5 + big7));
			  team2.setText("Team 2: " + (big1 + big2 + big4 + big6));
			  
		  }
		  if (Math.abs((big3 + big6 + big7) - (big1 + big2 + big4 + big5)) < best)
		  {
			  best = Math.abs((big3 + big6 + big7) - (big1 + big2 + big4 + big5));
			  
			  display1.setText(strBig3);
			  display2.setText(strBig6);
			  display3.setText(strBig7);
			  display5.setText(strBig1);
			  display6.setText(strBig2);
			  display7.setText(strBig4);
			  display8.setText(strBig5);
			  
			  sklDisplay1.setText(Integer.toString(big3));
			  sklDisplay2.setText(Integer.toString(big6));
			  sklDisplay3.setText(Integer.toString(big7));
			  sklDisplay5.setText(Integer.toString(big1));
			  sklDisplay6.setText(Integer.toString(big2));
			  sklDisplay7.setText(Integer.toString(big4));
			  sklDisplay8.setText(Integer.toString(big5));
			  
			  team1.setText("Team 1: " + (big3 + big6 + big7));
			  team2.setText("Team 2: " + (big1 + big2 + big4 + big5));
			  
		  }
		  if (Math.abs((big4 + big5 + big6) - (big1 + big2 + big3 + big7)) < best)
		  {
			  best = Math.abs((big4 + big5 + big6) - (big1 + big2 + big3 + big7));
			  
			  display1.setText(strBig4);
			  display2.setText(strBig5);
			  display3.setText(strBig6);
			  display5.setText(strBig1);
			  display6.setText(strBig2);
			  display7.setText(strBig3);
			  display8.setText(strBig7);
			  
			  sklDisplay1.setText(Integer.toString(big4));
			  sklDisplay2.setText(Integer.toString(big5));
			  sklDisplay3.setText(Integer.toString(big6));
			  sklDisplay5.setText(Integer.toString(big1));
			  sklDisplay6.setText(Integer.toString(big2));
			  sklDisplay7.setText(Integer.toString(big3));
			  sklDisplay8.setText(Integer.toString(big7));
			  
			  team1.setText("Team 1: " + (big4 + big5 + big6));
			  team2.setText("Team 2: " + (big1 + big2 + big3 + big7));
			  
		  }
		  if (Math.abs((big4 + big5 + big7) - (big1 + big2 + big3 + big6)) < best)
		  {
			  best = Math.abs((big4 + big5 + big7) - (big1 + big2 + big3 + big6));
			  
			  display1.setText(strBig4);
			  display2.setText(strBig5);
			  display3.setText(strBig7);
			  display5.setText(strBig1);
			  display6.setText(strBig2);
			  display7.setText(strBig3);
			  display8.setText(strBig6);
			  
			  sklDisplay1.setText(Integer.toString(big4));
			  sklDisplay2.setText(Integer.toString(big5));
			  sklDisplay3.setText(Integer.toString(big7));
			  sklDisplay5.setText(Integer.toString(big1));
			  sklDisplay6.setText(Integer.toString(big2));
			  sklDisplay7.setText(Integer.toString(big3));
			  sklDisplay8.setText(Integer.toString(big6));
			  
			  team1.setText("Team 1: " + (big4 + big5 + big7));
			  team2.setText("Team 2: " + (big1 + big2 + big3 + big6));
			  
		  }
		  if (Math.abs((big4 + big6 + big7) - (big1 + big2 + big3 + big5)) < best)
		  {
			  best = Math.abs((big4 + big6 + big7) - (big1 + big2 + big3 + big5));
			  
			  display1.setText(strBig4);
			  display2.setText(strBig6);
			  display3.setText(strBig7);
			  display5.setText(strBig1);
			  display6.setText(strBig2);
			  display7.setText(strBig3);
			  display8.setText(strBig5);
			  
			  sklDisplay1.setText(Integer.toString(big4));
			  sklDisplay2.setText(Integer.toString(big6));
			  sklDisplay3.setText(Integer.toString(big7));
			  sklDisplay5.setText(Integer.toString(big1));
			  sklDisplay6.setText(Integer.toString(big2));
			  sklDisplay7.setText(Integer.toString(big3));
			  sklDisplay8.setText(Integer.toString(big5));
			  
			  team1.setText("Team 1: " + (big4 + big6 + big7));
			  team2.setText("Team 2: " + (big1 + big2 + big3 + big5));
			  
		  }
		  if (Math.abs((big5 + big6 + big7) - (big1 + big2 + big3 + big4)) < best)
		  {
			  best = Math.abs((big5 + big6 + big7) - (big1 + big2 + big3 + big4));
			  
			  display1.setText(strBig5);
			  display2.setText(strBig6);
			  display3.setText(strBig7);
			  display5.setText(strBig1);
			  display6.setText(strBig2);
			  display7.setText(strBig3);
			  display8.setText(strBig4);
			  
			  sklDisplay1.setText(Integer.toString(big5));
			  sklDisplay2.setText(Integer.toString(big6));
			  sklDisplay3.setText(Integer.toString(big7));
			  sklDisplay5.setText(Integer.toString(big1));
			  sklDisplay6.setText(Integer.toString(big2));
			  sklDisplay7.setText(Integer.toString(big3));
			  sklDisplay8.setText(Integer.toString(big4));
			  
			  team1.setText("Team 1: " + (big5 + big6 + big7));
			  team2.setText("Team 2: " + (big1 + big2 + big3 + big4));
			  
		  }
		  Random myRandom = new Random();
	  		
		  int whosBall = myRandom.nextInt(2);
	        if (whosBall == 1)
	        	tvWhosBall.setText("Team 1 starts with ball");
	        else
	        	tvWhosBall.setText("Team 2 starts with ball");
	  	}
	  	public void calcTeams8(int big1, int big2, int big3, int big4, int big5, int big6, int big7, int big8, String strBig1, String strBig2, String strBig3, String strBig4, String strBig5, String strBig6, String strBig7, String strBig8)
	  	{
	  		int best = Math.abs((big1 + big2 + big3 + big4) - (big5 + big6 + big7 + big8));
	  		display1.setText(strBig1);
	  		display2.setText(strBig2);
	  		display3.setText(strBig3);
	  		display4.setText(strBig4);
	  		display5.setText(strBig5);
	  		display6.setText(strBig6);
	  		display7.setText(strBig7);
	  		display8.setText(strBig8);
	  	  
	  		sklDisplay1.setText(Integer.toString(big1));
	  		sklDisplay2.setText(Integer.toString(big2));
	  		sklDisplay3.setText(Integer.toString(big3));
	  		sklDisplay4.setText(Integer.toString(big4));
	  		sklDisplay5.setText(Integer.toString(big5));
	  		sklDisplay6.setText(Integer.toString(big6));
	  		sklDisplay7.setText(Integer.toString(big7));
	  		sklDisplay8.setText(Integer.toString(big8));
	  	  
	  		team1.setText("Team 1: " + (big1 + big2 + big3 + big4));
	  		team2.setText("Team 2: " + (big5 + big6 + big7 + big8));
	  	  
	  		if (Math.abs((big1 + big2 + big3 + big5) - (big4 + big6 + big7 + big8)) < best)
	  		{
	  			best = Math.abs((big1 + big2 + big3 + big5) - (big4 + big6 + big7 + big8));
	  			
	  			display1.setText(strBig1);
	  	  		display2.setText(strBig2);
	  	  		display3.setText(strBig3);
	  	  		display4.setText(strBig5);
	  	  		display5.setText(strBig4);
	  	  		display6.setText(strBig6);
	  	  		display7.setText(strBig7);
	  	  		display8.setText(strBig8);
	  	  	  
	  	  		sklDisplay1.setText(Integer.toString(big1));
	  	  		sklDisplay2.setText(Integer.toString(big2));
	  	  		sklDisplay3.setText(Integer.toString(big3));
	  	  		sklDisplay4.setText(Integer.toString(big5));
	  	  		sklDisplay5.setText(Integer.toString(big4));
	  	  		sklDisplay6.setText(Integer.toString(big6));
	  	  		sklDisplay7.setText(Integer.toString(big7));
	  	  		sklDisplay8.setText(Integer.toString(big8));
	  			
	  	  		team1.setText("Team 1: " + (big1 + big2 + big3 + big5));
	  	  		team2.setText("Team 2: " + (big4 + big6 + big7 + big8));
	  		}
	  		if (Math.abs((big1 + big2 + big3 + big6) - (big4 + big5 + big7 + big8)) < best)
	  		{
	  			best = Math.abs((big1 + big2 + big3 + big6) - (big4 + big5 + big7 + big8));
	  			
	  			display1.setText(strBig1);
	  	  		display2.setText(strBig2);
	  	  		display3.setText(strBig3);
	  	  		display4.setText(strBig6);
	  	  		display5.setText(strBig4);
	  	  		display6.setText(strBig5);
	  	  		display7.setText(strBig7);
	  	  		display8.setText(strBig8);
	  	  	  
	  	  		sklDisplay1.setText(Integer.toString(big1));
	  	  		sklDisplay2.setText(Integer.toString(big2));
	  	  		sklDisplay3.setText(Integer.toString(big3));
	  	  		sklDisplay4.setText(Integer.toString(big6));
	  	  		sklDisplay5.setText(Integer.toString(big4));
	  	  		sklDisplay6.setText(Integer.toString(big5));
	  	  		sklDisplay7.setText(Integer.toString(big7));
	  	  		sklDisplay8.setText(Integer.toString(big8));
	  			
	  	  		team1.setText("Team 1: " + (big1 + big2 + big3 + big6));
	  	  		team2.setText("Team 2: " + (big4 + big5 + big7 + big8));
	  		}
	  		if (Math.abs((big1 + big2 + big3 + big7) - (big4 + big5 + big6 + big8)) < best)
	  		{
	  			best = Math.abs((big1 + big2 + big3 + big7) - (big4 + big5 + big6 + big8));
	  			
	  			display1.setText(strBig1);
	  	  		display2.setText(strBig2);
	  	  		display3.setText(strBig3);
	  	  		display4.setText(strBig7);
	  	  		display5.setText(strBig4);
	  	  		display6.setText(strBig5);
	  	  		display7.setText(strBig6);
	  	  		display8.setText(strBig8);
	  	  	  
	  	  		sklDisplay1.setText(Integer.toString(big1));
	  	  		sklDisplay2.setText(Integer.toString(big2));
	  	  		sklDisplay3.setText(Integer.toString(big3));
	  	  		sklDisplay4.setText(Integer.toString(big7));
	  	  		sklDisplay5.setText(Integer.toString(big4));
	  	  		sklDisplay6.setText(Integer.toString(big5));
	  	  		sklDisplay7.setText(Integer.toString(big6));
	  	  		sklDisplay8.setText(Integer.toString(big8));
	  			
	  	  		team1.setText("Team 1: " + (big1 + big2 + big3 + big7));
	  	  		team2.setText("Team 2: " + (big4 + big5 + big6 + big8));
	  		}
	  		if (Math.abs((big1 + big2 + big3 + big8) - (big4 + big5 + big6 + big7)) < best)
	  		{
	  			best = Math.abs((big1 + big2 + big3 + big8) - (big4 + big5 + big6 + big7));
	  			
	  			display1.setText(strBig1);
	  	  		display2.setText(strBig2);
	  	  		display3.setText(strBig3);
	  	  		display4.setText(strBig8);
	  	  		display5.setText(strBig4);
	  	  		display6.setText(strBig5);
	  	  		display7.setText(strBig6);
	  	  		display8.setText(strBig7);
	  	  	  
	  	  		sklDisplay1.setText(Integer.toString(big1));
	  	  		sklDisplay2.setText(Integer.toString(big2));
	  	  		sklDisplay3.setText(Integer.toString(big3));
	  	  		sklDisplay4.setText(Integer.toString(big8));
	  	  		sklDisplay5.setText(Integer.toString(big4));
	  	  		sklDisplay6.setText(Integer.toString(big5));
	  	  		sklDisplay7.setText(Integer.toString(big6));
	  	  		sklDisplay8.setText(Integer.toString(big7));
	  			
	  	  		team1.setText("Team 1: " + (big1 + big2 + big3 + big8));
	  	  		team2.setText("Team 2: " + (big4 + big5 + big6 + big7));
	  		}
	  		if (Math.abs((big1 + big2 + big4 + big5) - (big3 + big6 + big7 + big8)) < best)
	  		{
	  			best = Math.abs((big1 + big2 + big4 + big5) - (big3 + big6 + big7 + big8));
	  			
	  			display1.setText(strBig1);
	  	  		display2.setText(strBig2);
	  	  		display3.setText(strBig4);
	  	  		display4.setText(strBig5);
	  	  		display5.setText(strBig3);
	  	  		display6.setText(strBig6);
	  	  		display7.setText(strBig7);
	  	  		display8.setText(strBig8);
	  	  	  
	  	  		sklDisplay1.setText(Integer.toString(big1));
	  	  		sklDisplay2.setText(Integer.toString(big2));
	  	  		sklDisplay3.setText(Integer.toString(big4));
	  	  		sklDisplay4.setText(Integer.toString(big5));
	  	  		sklDisplay5.setText(Integer.toString(big3));
	  	  		sklDisplay6.setText(Integer.toString(big6));
	  	  		sklDisplay7.setText(Integer.toString(big7));
	  	  		sklDisplay8.setText(Integer.toString(big8));
	  			
	  	  		team1.setText("Team 1: " + (big1 + big2 + big4 + big5));
	  	  		team2.setText("Team 2: " + (big3 + big6 + big7 + big8));
	  		}
	  		if (Math.abs((big1 + big2 + big4 + big6) - (big3 + big5 + big7 + big8)) < best)
	  		{
	  			best = Math.abs((big1 + big2 + big4 + big6) - (big3 + big5 + big7 + big8));
	  			
	  			display1.setText(strBig1);
	  	  		display2.setText(strBig2);
	  	  		display3.setText(strBig4);
	  	  		display4.setText(strBig6);
	  	  		display5.setText(strBig3);
	  	  		display6.setText(strBig5);
	  	  		display7.setText(strBig7);
	  	  		display8.setText(strBig8);
	  	  	  
	  	  		sklDisplay1.setText(Integer.toString(big1));
	  	  		sklDisplay2.setText(Integer.toString(big2));
	  	  		sklDisplay3.setText(Integer.toString(big4));
	  	  		sklDisplay4.setText(Integer.toString(big6));
	  	  		sklDisplay5.setText(Integer.toString(big3));
	  	  		sklDisplay6.setText(Integer.toString(big5));
	  	  		sklDisplay7.setText(Integer.toString(big7));
	  	  		sklDisplay8.setText(Integer.toString(big8));
	  			
	  	  		team1.setText("Team 1: " + (big1 + big2 + big4 + big6));
	  	  		team2.setText("Team 2: " + (big3 + big5 + big7 + big8));
	  		}
	  		if (Math.abs((big1 + big2 + big4 + big7) - (big3 + big5 + big6 + big8)) < best)
	  		{
	  			best = Math.abs((big1 + big2 + big4 + big7) - (big3 + big5 + big6 + big8));
	  			
	  			display1.setText(strBig1);
	  	  		display2.setText(strBig2);
	  	  		display3.setText(strBig4);
	  	  		display4.setText(strBig7);
	  	  		display5.setText(strBig3);
	  	  		display6.setText(strBig5);
	  	  		display7.setText(strBig6);
	  	  		display8.setText(strBig8);
	  	  	  
	  	  		sklDisplay1.setText(Integer.toString(big1));
	  	  		sklDisplay2.setText(Integer.toString(big2));
	  	  		sklDisplay3.setText(Integer.toString(big4));
	  	  		sklDisplay4.setText(Integer.toString(big7));
	  	  		sklDisplay5.setText(Integer.toString(big3));
	  	  		sklDisplay6.setText(Integer.toString(big5));
	  	  		sklDisplay7.setText(Integer.toString(big6));
	  	  		sklDisplay8.setText(Integer.toString(big8));
	  			
	  	  		team1.setText("Team 1: " + (big1 + big2 + big4 + big7));
	  	  		team2.setText("Team 2: " + (big3 + big5 + big6 + big8));
	  		}
	  		if (Math.abs((big1 + big2 + big4 + big8) - (big3 + big5 + big6 + big7)) < best)
	  		{
	  			best = Math.abs((big1 + big2 + big4 + big8) - (big3 + big5 + big6 + big7));
	  			
	  			display1.setText(strBig1);
	  	  		display2.setText(strBig2);
	  	  		display3.setText(strBig4);
	  	  		display4.setText(strBig8);
	  	  		display5.setText(strBig3);
	  	  		display6.setText(strBig5);
	  	  		display7.setText(strBig6);
	  	  		display8.setText(strBig7);
	  	  	  
	  	  		sklDisplay1.setText(Integer.toString(big1));
	  	  		sklDisplay2.setText(Integer.toString(big2));
	  	  		sklDisplay3.setText(Integer.toString(big4));
	  	  		sklDisplay4.setText(Integer.toString(big8));
	  	  		sklDisplay5.setText(Integer.toString(big3));
	  	  		sklDisplay6.setText(Integer.toString(big5));
	  	  		sklDisplay7.setText(Integer.toString(big6));
	  	  		sklDisplay8.setText(Integer.toString(big7));
	  			
	  	  		team1.setText("Team 1: " + (big1 + big2 + big4 + big8));
	  	  		team2.setText("Team 2: " + (big3 + big5 + big6 + big7));
	  		}
	  		if (Math.abs((big1 + big2 + big5 + big6) - (big3 + big4 + big7 + big8)) < best)
	  		{
	  			best = Math.abs((big1 + big2 + big5 + big6) - (big3 + big4 + big7 + big8));
	  			
	  			display1.setText(strBig1);
	  	  		display2.setText(strBig2);
	  	  		display3.setText(strBig5);
	  	  		display4.setText(strBig6);
	  	  		display5.setText(strBig3);
	  	  		display6.setText(strBig4);
	  	  		display7.setText(strBig7);
	  	  		display8.setText(strBig8);
	  	  	  
	  	  		sklDisplay1.setText(Integer.toString(big1));
	  	  		sklDisplay2.setText(Integer.toString(big2));
	  	  		sklDisplay3.setText(Integer.toString(big5));
	  	  		sklDisplay4.setText(Integer.toString(big6));
	  	  		sklDisplay5.setText(Integer.toString(big3));
	  	  		sklDisplay6.setText(Integer.toString(big4));
	  	  		sklDisplay7.setText(Integer.toString(big7));
	  	  		sklDisplay8.setText(Integer.toString(big8));
	  			
	  	  		team1.setText("Team 1: " + (big1 + big2 + big5 + big6));
	  	  		team2.setText("Team 2: " + (big3 + big4 + big7 + big8));
	  		}
	  		if (Math.abs((big1 + big2 + big5 + big7) - (big3 + big4 + big6 + big8)) < best)
	  		{
	  			best = Math.abs((big1 + big2 + big5 + big7) - (big3 + big4 + big6 + big8));
	  			
	  			display1.setText(strBig1);
	  	  		display2.setText(strBig2);
	  	  		display3.setText(strBig5);
	  	  		display4.setText(strBig7);
	  	  		display5.setText(strBig3);
	  	  		display6.setText(strBig4);
	  	  		display7.setText(strBig6);
	  	  		display8.setText(strBig8);
	  	  	  
	  	  		sklDisplay1.setText(Integer.toString(big1));
	  	  		sklDisplay2.setText(Integer.toString(big2));
	  	  		sklDisplay3.setText(Integer.toString(big5));
	  	  		sklDisplay4.setText(Integer.toString(big7));
	  	  		sklDisplay5.setText(Integer.toString(big3));
	  	  		sklDisplay6.setText(Integer.toString(big4));
	  	  		sklDisplay7.setText(Integer.toString(big6));
	  	  		sklDisplay8.setText(Integer.toString(big8));
	  			
	  	  		team1.setText("Team 1: " + (big1 + big2 + big5 + big7));
	  	  		team2.setText("Team 2: " + (big3 + big4 + big6 + big8));
	  		}
	  		if (Math.abs((big1 + big2 + big5 + big8) - (big3 + big4 + big6 + big7)) < best)
	  		{
	  			best = Math.abs((big1 + big2 + big5 + big8) - (big3 + big4 + big6 + big7));
	  			
	  			display1.setText(strBig1);
	  	  		display2.setText(strBig2);
	  	  		display3.setText(strBig5);
	  	  		display4.setText(strBig8);
	  	  		display5.setText(strBig3);
	  	  		display6.setText(strBig4);
	  	  		display7.setText(strBig6);
	  	  		display8.setText(strBig7);
	  	  	  
	  	  		sklDisplay1.setText(Integer.toString(big1));
	  	  		sklDisplay2.setText(Integer.toString(big2));
	  	  		sklDisplay3.setText(Integer.toString(big5));
	  	  		sklDisplay4.setText(Integer.toString(big8));
	  	  		sklDisplay5.setText(Integer.toString(big3));
	  	  		sklDisplay6.setText(Integer.toString(big4));
	  	  		sklDisplay7.setText(Integer.toString(big6));
	  	  		sklDisplay8.setText(Integer.toString(big7));
	  			
	  	  		team1.setText("Team 1: " + (big1 + big2 + big5 + big8));
	  	  		team2.setText("Team 2: " + (big3 + big4 + big6 + big7));
	  		}
	  		if (Math.abs((big1 + big2 + big6 + big7) - (big3 + big4 + big5 + big8)) < best)
	  		{
	  			best = Math.abs((big1 + big2 + big6 + big7) - (big3 + big4 + big5 + big8));
	  			
	  			display1.setText(strBig1);
	  	  		display2.setText(strBig2);
	  	  		display3.setText(strBig6);
	  	  		display4.setText(strBig7);
	  	  		display5.setText(strBig3);
	  	  		display6.setText(strBig4);
	  	  		display7.setText(strBig5);
	  	  		display8.setText(strBig8);
	  	  	  
	  	  		sklDisplay1.setText(Integer.toString(big1));
	  	  		sklDisplay2.setText(Integer.toString(big2));
	  	  		sklDisplay3.setText(Integer.toString(big6));
	  	  		sklDisplay4.setText(Integer.toString(big7));
	  	  		sklDisplay5.setText(Integer.toString(big3));
	  	  		sklDisplay6.setText(Integer.toString(big4));
	  	  		sklDisplay7.setText(Integer.toString(big5));
	  	  		sklDisplay8.setText(Integer.toString(big8));
	  			
	  	  		team1.setText("Team 1: " + (big1 + big2 + big6 + big7));
	  	  		team2.setText("Team 2: " + (big3 + big4 + big5 + big8));
	  		}
	  		if (Math.abs((big1 + big2 + big6 + big8) - (big3 + big4 + big5 + big7)) < best)
	  		{
	  			best = Math.abs((big1 + big2 + big6 + big8) - (big3 + big4 + big5 + big7));
	  			
	  			display1.setText(strBig1);
	  	  		display2.setText(strBig2);
	  	  		display3.setText(strBig6);
	  	  		display4.setText(strBig8);
	  	  		display5.setText(strBig3);
	  	  		display6.setText(strBig4);
	  	  		display7.setText(strBig5);
	  	  		display8.setText(strBig7);
	  	  	  
	  	  		sklDisplay1.setText(Integer.toString(big1));
	  	  		sklDisplay2.setText(Integer.toString(big2));
	  	  		sklDisplay3.setText(Integer.toString(big6));
	  	  		sklDisplay4.setText(Integer.toString(big8));
	  	  		sklDisplay5.setText(Integer.toString(big3));
	  	  		sklDisplay6.setText(Integer.toString(big4));
	  	  		sklDisplay7.setText(Integer.toString(big5));
	  	  		sklDisplay8.setText(Integer.toString(big7));
	  			
	  	  		team1.setText("Team 1: " + (big1 + big2 + big6 + big8));
	  	  		team2.setText("Team 2: " + (big3 + big4 + big5 + big7));
	  		}
	  		if (Math.abs((big1 + big2 + big7 + big8) - (big3 + big4 + big5 + big6)) < best)
	  		{
	  			best = Math.abs((big1 + big2 + big7 + big8) - (big3 + big4 + big5 + big6));
	  			
	  			display1.setText(strBig1);
	  	  		display2.setText(strBig2);
	  	  		display3.setText(strBig7);
	  	  		display4.setText(strBig8);
	  	  		display5.setText(strBig3);
	  	  		display6.setText(strBig4);
	  	  		display7.setText(strBig5);
	  	  		display8.setText(strBig6);
	  	  	  
	  	  		sklDisplay1.setText(Integer.toString(big1));
	  	  		sklDisplay2.setText(Integer.toString(big2));
	  	  		sklDisplay3.setText(Integer.toString(big7));
	  	  		sklDisplay4.setText(Integer.toString(big8));
	  	  		sklDisplay5.setText(Integer.toString(big3));
	  	  		sklDisplay6.setText(Integer.toString(big4));
	  	  		sklDisplay7.setText(Integer.toString(big5));
	  	  		sklDisplay8.setText(Integer.toString(big6));
	  			
	  	  		team1.setText("Team 1: " + (big1 + big2 + big7 + big8));
	  	  		team2.setText("Team 2: " + (big3 + big4 + big5 + big6));
	  		}
	  		if (Math.abs((big1 + big3 + big4 + big5) - (big2 + big6 + big7 + big8)) < best)
	  		{
	  			best = Math.abs((big1 + big3 + big4 + big5) - (big2 + big6 + big7 + big8));
	  			
	  			display1.setText(strBig1);
	  	  		display2.setText(strBig3);
	  	  		display3.setText(strBig4);
	  	  		display4.setText(strBig5);
	  	  		display5.setText(strBig2);
	  	  		display6.setText(strBig6);
	  	  		display7.setText(strBig7);
	  	  		display8.setText(strBig8);
	  	  	  
	  	  		sklDisplay1.setText(Integer.toString(big1));
	  	  		sklDisplay2.setText(Integer.toString(big3));
	  	  		sklDisplay3.setText(Integer.toString(big4));
	  	  		sklDisplay4.setText(Integer.toString(big5));
	  	  		sklDisplay5.setText(Integer.toString(big2));
	  	  		sklDisplay6.setText(Integer.toString(big6));
	  	  		sklDisplay7.setText(Integer.toString(big7));
	  	  		sklDisplay8.setText(Integer.toString(big8));
	  			
	  	  		team1.setText("Team 1: " + (big1 + big3 + big4 + big5));
	  	  		team2.setText("Team 2: " + (big2 + big6 + big7 + big8));
	  		}
	  		if (Math.abs((big1 + big3 + big4 + big6) - (big2 + big5 + big7 + big8)) < best)
	  		{
	  			best = Math.abs((big1 + big3 + big4 + big6) - (big2 + big5 + big7 + big8));
	  			
	  			display1.setText(strBig1);
	  	  		display2.setText(strBig3);
	  	  		display3.setText(strBig4);
	  	  		display4.setText(strBig6);
	  	  		display5.setText(strBig2);
	  	  		display6.setText(strBig5);
	  	  		display7.setText(strBig7);
	  	  		display8.setText(strBig8);
	  	  	  
	  	  		sklDisplay1.setText(Integer.toString(big1));
	  	  		sklDisplay2.setText(Integer.toString(big3));
	  	  		sklDisplay3.setText(Integer.toString(big4));
	  	  		sklDisplay4.setText(Integer.toString(big6));
	  	  		sklDisplay5.setText(Integer.toString(big2));
	  	  		sklDisplay6.setText(Integer.toString(big5));
	  	  		sklDisplay7.setText(Integer.toString(big7));
	  	  		sklDisplay8.setText(Integer.toString(big8));
	  			
	  	  		team1.setText("Team 1: " + (big1 + big3 + big4 + big6));
	  	  		team2.setText("Team 2: " + (big2 + big5 + big7 + big8));
	  		}
	  		if (Math.abs((big1 + big3 + big4 + big7) - (big2 + big5 + big6 + big8)) < best)
	  		{
	  			best = Math.abs((big1 + big3 + big4 + big7) - (big2 + big5 + big6 + big8));
	  			
	  			display1.setText(strBig1);
	  	  		display2.setText(strBig3);
	  	  		display3.setText(strBig4);
	  	  		display4.setText(strBig7);
	  	  		display5.setText(strBig2);
	  	  		display6.setText(strBig5);
	  	  		display7.setText(strBig6);
	  	  		display8.setText(strBig8);
	  	  	  
	  	  		sklDisplay1.setText(Integer.toString(big1));
	  	  		sklDisplay2.setText(Integer.toString(big3));
	  	  		sklDisplay3.setText(Integer.toString(big4));
	  	  		sklDisplay4.setText(Integer.toString(big7));
	  	  		sklDisplay5.setText(Integer.toString(big2));
	  	  		sklDisplay6.setText(Integer.toString(big5));
	  	  		sklDisplay7.setText(Integer.toString(big6));
	  	  		sklDisplay8.setText(Integer.toString(big8));
	  			
	  	  		team1.setText("Team 1: " + (big1 + big3 + big4 + big7));
	  	  		team2.setText("Team 2: " + (big2 + big5 + big6 + big8));
	  		}
	  		if (Math.abs((big1 + big3 + big4 + big8) - (big2 + big5 + big6 + big7)) < best)
	  		{
	  			best = Math.abs((big1 + big3 + big4 + big8) - (big2 + big5 + big6 + big7));
	  			
	  			display1.setText(strBig1);
	  	  		display2.setText(strBig3);
	  	  		display3.setText(strBig4);
	  	  		display4.setText(strBig8);
	  	  		display5.setText(strBig2);
	  	  		display6.setText(strBig5);
	  	  		display7.setText(strBig6);
	  	  		display8.setText(strBig7);
	  	  	  
	  	  		sklDisplay1.setText(Integer.toString(big1));
	  	  		sklDisplay2.setText(Integer.toString(big3));
	  	  		sklDisplay3.setText(Integer.toString(big4));
	  	  		sklDisplay4.setText(Integer.toString(big8));
	  	  		sklDisplay5.setText(Integer.toString(big2));
	  	  		sklDisplay6.setText(Integer.toString(big5));
	  	  		sklDisplay7.setText(Integer.toString(big6));
	  	  		sklDisplay8.setText(Integer.toString(big7));
	  			
	  	  		team1.setText("Team 1: " + (big1 + big3 + big4 + big8));
	  	  		team2.setText("Team 2: " + (big2 + big5 + big6 + big7));
	  		}
	  		if (Math.abs((big1 + big3 + big5 + big6) - (big2 + big4 + big7 + big8)) < best)
	  		{
	  			best = Math.abs((big1 + big3 + big5 + big6) - (big2 + big4 + big7 + big8));
	  			
	  			display1.setText(strBig1);
	  	  		display2.setText(strBig3);
	  	  		display3.setText(strBig5);
	  	  		display4.setText(strBig6);
	  	  		display5.setText(strBig2);
	  	  		display6.setText(strBig4);
	  	  		display7.setText(strBig7);
	  	  		display8.setText(strBig8);
	  	  	  
	  	  		sklDisplay1.setText(Integer.toString(big1));
	  	  		sklDisplay2.setText(Integer.toString(big3));
	  	  		sklDisplay3.setText(Integer.toString(big5));
	  	  		sklDisplay4.setText(Integer.toString(big6));
	  	  		sklDisplay5.setText(Integer.toString(big2));
	  	  		sklDisplay6.setText(Integer.toString(big4));
	  	  		sklDisplay7.setText(Integer.toString(big7));
	  	  		sklDisplay8.setText(Integer.toString(big8));
	  			
	  	  		team1.setText("Team 1: " + (big1 + big3 + big5 + big6));
	  	  		team2.setText("Team 2: " + (big2 + big4 + big7 + big8));
	  		}
	  		if (Math.abs((big1 + big3 + big5 + big7) - (big2 + big4 + big6 + big8)) < best)
	  		{
	  			best = Math.abs((big1 + big3 + big5 + big7) - (big2 + big4 + big6 + big8));
	  			
	  			display1.setText(strBig1);
	  	  		display2.setText(strBig3);
	  	  		display3.setText(strBig5);
	  	  		display4.setText(strBig7);
	  	  		display5.setText(strBig2);
	  	  		display6.setText(strBig4);
	  	  		display7.setText(strBig6);
	  	  		display8.setText(strBig8);
	  	  	  
	  	  		sklDisplay1.setText(Integer.toString(big1));
	  	  		sklDisplay2.setText(Integer.toString(big3));
	  	  		sklDisplay3.setText(Integer.toString(big5));
	  	  		sklDisplay4.setText(Integer.toString(big7));
	  	  		sklDisplay5.setText(Integer.toString(big2));
	  	  		sklDisplay6.setText(Integer.toString(big4));
	  	  		sklDisplay7.setText(Integer.toString(big6));
	  	  		sklDisplay8.setText(Integer.toString(big8));
	  			
	  	  		team1.setText("Team 1: " + (big1 + big3 + big5 + big7));
	  	  		team2.setText("Team 2: " + (big2 + big4 + big6 + big8));
	  		}
	  		if (Math.abs((big1 + big3 + big5 + big8) - (big2 + big4 + big6 + big7)) < best)
	  		{
	  			best = Math.abs((big1 + big3 + big5 + big8) - (big2 + big4 + big6 + big7));
	  			
	  			display1.setText(strBig1);
	  	  		display2.setText(strBig3);
	  	  		display3.setText(strBig5);
	  	  		display4.setText(strBig8);
	  	  		display5.setText(strBig2);
	  	  		display6.setText(strBig4);
	  	  		display7.setText(strBig6);
	  	  		display8.setText(strBig7);
	  	  	  
	  	  		sklDisplay1.setText(Integer.toString(big1));
	  	  		sklDisplay2.setText(Integer.toString(big3));
	  	  		sklDisplay3.setText(Integer.toString(big5));
	  	  		sklDisplay4.setText(Integer.toString(big8));
	  	  		sklDisplay5.setText(Integer.toString(big2));
	  	  		sklDisplay6.setText(Integer.toString(big4));
	  	  		sklDisplay7.setText(Integer.toString(big6));
	  	  		sklDisplay8.setText(Integer.toString(big7));
	  			
	  	  		team1.setText("Team 1: " + (big1 + big3 + big5 + big8));
	  	  		team2.setText("Team 2: " + (big2 + big4 + big6 + big7));
	  		}
	  		if (Math.abs((big1 + big3 + big6 + big7) - (big2 + big4 + big5 + big8)) < best)
	  		{
	  			best = Math.abs((big1 + big3 + big6 + big7) - (big2 + big4 + big5 + big8));
	  			
	  			display1.setText(strBig1);
	  	  		display2.setText(strBig3);
	  	  		display3.setText(strBig6);
	  	  		display4.setText(strBig7);
	  	  		display5.setText(strBig2);
	  	  		display6.setText(strBig4);
	  	  		display7.setText(strBig5);
	  	  		display8.setText(strBig8);
	  	  	  
	  	  		sklDisplay1.setText(Integer.toString(big1));
	  	  		sklDisplay2.setText(Integer.toString(big3));
	  	  		sklDisplay3.setText(Integer.toString(big6));
	  	  		sklDisplay4.setText(Integer.toString(big7));
	  	  		sklDisplay5.setText(Integer.toString(big2));
	  	  		sklDisplay6.setText(Integer.toString(big4));
	  	  		sklDisplay7.setText(Integer.toString(big5));
	  	  		sklDisplay8.setText(Integer.toString(big8));
	  			
	  	  		team1.setText("Team 1: " + (big1 + big3 + big6 + big7));
	  	  		team2.setText("Team 2: " + (big2 + big4 + big5 + big8));
	  		}
	  		if (Math.abs((big1 + big3 + big6 + big8) - (big2 + big4 + big5 + big7)) < best)
	  		{
	  			best = Math.abs((big1 + big3 + big6 + big8) - (big2 + big4 + big5 + big7));
	  			
	  			display1.setText(strBig1);
	  	  		display2.setText(strBig3);
	  	  		display3.setText(strBig6);
	  	  		display4.setText(strBig8);
	  	  		display5.setText(strBig2);
	  	  		display6.setText(strBig4);
	  	  		display7.setText(strBig5);
	  	  		display8.setText(strBig7);
	  	  	  
	  	  		sklDisplay1.setText(Integer.toString(big1));
	  	  		sklDisplay2.setText(Integer.toString(big3));
	  	  		sklDisplay3.setText(Integer.toString(big6));
	  	  		sklDisplay4.setText(Integer.toString(big8));
	  	  		sklDisplay5.setText(Integer.toString(big2));
	  	  		sklDisplay6.setText(Integer.toString(big4));
	  	  		sklDisplay7.setText(Integer.toString(big5));
	  	  		sklDisplay8.setText(Integer.toString(big7));
	  			
	  	  		team1.setText("Team 1: " + (big1 + big3 + big6 + big8));
	  	  		team2.setText("Team 2: " + (big2 + big4 + big5 + big7));
	  		}
	  		if (Math.abs((big1 + big4 + big5 + big6) - (big2 + big3 + big7 + big8)) < best)
	  		{
	  			best = Math.abs((big1 + big4 + big5 + big6) - (big2 + big3 + big7 + big8));
	  			
	  			display1.setText(strBig1);
	  	  		display2.setText(strBig4);
	  	  		display3.setText(strBig5);
	  	  		display4.setText(strBig6);
	  	  		display5.setText(strBig2);
	  	  		display6.setText(strBig3);
	  	  		display7.setText(strBig7);
	  	  		display8.setText(strBig8);
	  	  	  
	  	  		sklDisplay1.setText(Integer.toString(big1));
	  	  		sklDisplay2.setText(Integer.toString(big4));
	  	  		sklDisplay3.setText(Integer.toString(big5));
	  	  		sklDisplay4.setText(Integer.toString(big6));
	  	  		sklDisplay5.setText(Integer.toString(big2));
	  	  		sklDisplay6.setText(Integer.toString(big3));
	  	  		sklDisplay7.setText(Integer.toString(big7));
	  	  		sklDisplay8.setText(Integer.toString(big8));
	  			
	  	  		team1.setText("Team 1: " + (big1 + big4 + big5 + big6));
	  	  		team2.setText("Team 2: " + (big2 + big3 + big7 + big8));
	  		}
	  		if (Math.abs((big1 + big4 + big5 + big7) - (big2 + big3 + big6 + big8)) < best)
	  		{
	  			best = Math.abs((big1 + big4 + big5 + big7) - (big2 + big3 + big6 + big8));
	  			
	  			display1.setText(strBig1);
	  	  		display2.setText(strBig4);
	  	  		display3.setText(strBig5);
	  	  		display4.setText(strBig7);
	  	  		display5.setText(strBig2);
	  	  		display6.setText(strBig3);
	  	  		display7.setText(strBig6);
	  	  		display8.setText(strBig8);
	  	  	  
	  	  		sklDisplay1.setText(Integer.toString(big1));
	  	  		sklDisplay2.setText(Integer.toString(big4));
	  	  		sklDisplay3.setText(Integer.toString(big5));
	  	  		sklDisplay4.setText(Integer.toString(big7));
	  	  		sklDisplay5.setText(Integer.toString(big2));
	  	  		sklDisplay6.setText(Integer.toString(big3));
	  	  		sklDisplay7.setText(Integer.toString(big6));
	  	  		sklDisplay8.setText(Integer.toString(big8));
	  			
	  	  		team1.setText("Team 1: " + (big1 + big4 + big5 + big7));
	  	  		team2.setText("Team 2: " + (big2 + big3 + big6 + big8));
	  		}
	  		if (Math.abs((big1 + big4 + big5 + big8) - (big2 + big3 + big6 + big7)) < best)
	  		{
	  			best = Math.abs((big1 + big4 + big5 + big8) - (big2 + big3 + big6 + big7));
	  			
	  			display1.setText(strBig1);
	  	  		display2.setText(strBig4);
	  	  		display3.setText(strBig5);
	  	  		display4.setText(strBig8);
	  	  		display5.setText(strBig2);
	  	  		display6.setText(strBig3);
	  	  		display7.setText(strBig6);
	  	  		display8.setText(strBig7);
	  	  	  
	  	  		sklDisplay1.setText(Integer.toString(big1));
	  	  		sklDisplay2.setText(Integer.toString(big4));
	  	  		sklDisplay3.setText(Integer.toString(big5));
	  	  		sklDisplay4.setText(Integer.toString(big8));
	  	  		sklDisplay5.setText(Integer.toString(big2));
	  	  		sklDisplay6.setText(Integer.toString(big3));
	  	  		sklDisplay7.setText(Integer.toString(big6));
	  	  		sklDisplay8.setText(Integer.toString(big7));
	  			
	  	  		team1.setText("Team 1: " + (big1 + big4 + big5 + big8));
	  	  		team2.setText("Team 2: " + (big2 + big3 + big6 + big7));
	  		}
	  		if (Math.abs((big1 + big4 + big6 + big7) - (big2 + big3 + big5 + big8)) < best)
	  		{
	  			best = Math.abs((big1 + big4 + big6 + big7) - (big2 + big3 + big5 + big8));
	  			
	  			display1.setText(strBig1);
	  	  		display2.setText(strBig4);
	  	  		display3.setText(strBig6);
	  	  		display4.setText(strBig7);
	  	  		display5.setText(strBig2);
	  	  		display6.setText(strBig3);
	  	  		display7.setText(strBig6);
	  	  		display8.setText(strBig8);
	  	  	  
	  	  		sklDisplay1.setText(Integer.toString(big1));
	  	  		sklDisplay2.setText(Integer.toString(big4));
	  	  		sklDisplay3.setText(Integer.toString(big6));
	  	  		sklDisplay4.setText(Integer.toString(big7));
	  	  		sklDisplay5.setText(Integer.toString(big2));
	  	  		sklDisplay6.setText(Integer.toString(big3));
	  	  		sklDisplay7.setText(Integer.toString(big5));
	  	  		sklDisplay8.setText(Integer.toString(big8));
	  			
	  	  		team1.setText("Team 1: " + (big1 + big4 + big6 + big7));
	  	  		team2.setText("Team 2: " + (big2 + big3 + big5 + big8));
	  		}
	  		if (Math.abs((big1 + big4 + big6 + big8) - (big2 + big3 + big5 + big7)) < best)
	  		{
	  			best = Math.abs((big1 + big4 + big6 + big8) - (big2 + big3 + big5 + big7));
	  			
	  			display1.setText(strBig1);
	  	  		display2.setText(strBig4);
	  	  		display3.setText(strBig6);
	  	  		display4.setText(strBig8);
	  	  		display5.setText(strBig2);
	  	  		display6.setText(strBig3);
	  	  		display7.setText(strBig5);
	  	  		display8.setText(strBig7);
	  	  	  
	  	  		sklDisplay1.setText(Integer.toString(big1));
	  	  		sklDisplay2.setText(Integer.toString(big4));
	  	  		sklDisplay3.setText(Integer.toString(big6));
	  	  		sklDisplay4.setText(Integer.toString(big8));
	  	  		sklDisplay5.setText(Integer.toString(big2));
	  	  		sklDisplay6.setText(Integer.toString(big3));
	  	  		sklDisplay7.setText(Integer.toString(big5));
	  	  		sklDisplay8.setText(Integer.toString(big7));
	  			
	  	  		team1.setText("Team 1: " + (big1 + big4 + big6 + big8));
	  	  		team2.setText("Team 2: " + (big2 + big3 + big5 + big7));
	  		}
	  		if (Math.abs((big1 + big4 + big7 + big8) - (big2 + big3 + big5 + big6)) < best)
	  		{
	  			best = Math.abs((big1 + big4 + big7 + big8) - (big2 + big3 + big5 + big6));
	  			
	  			display1.setText(strBig1);
	  	  		display2.setText(strBig4);
	  	  		display3.setText(strBig7);
	  	  		display4.setText(strBig8);
	  	  		display5.setText(strBig2);
	  	  		display6.setText(strBig3);
	  	  		display7.setText(strBig5);
	  	  		display8.setText(strBig6);
	  	  	  
	  	  		sklDisplay1.setText(Integer.toString(big1));
	  	  		sklDisplay2.setText(Integer.toString(big4));
	  	  		sklDisplay3.setText(Integer.toString(big7));
	  	  		sklDisplay4.setText(Integer.toString(big8));
	  	  		sklDisplay5.setText(Integer.toString(big2));
	  	  		sklDisplay6.setText(Integer.toString(big3));
	  	  		sklDisplay7.setText(Integer.toString(big5));
	  	  		sklDisplay8.setText(Integer.toString(big6));
	  			
	  	  		team1.setText("Team 1: " + (big1 + big4 + big7 + big8));
	  	  		team2.setText("Team 2: " + (big2 + big3 + big5 + big6));
	  		}
	  		if (Math.abs((big1 + big5 + big6 + big7) - (big2 + big3 + big4 + big8)) < best)
	  		{
	  			best = Math.abs((big1 + big5 + big6 + big7) - (big2 + big3 + big4 + big8));
	  			
	  			display1.setText(strBig1);
	  	  		display2.setText(strBig5);
	  	  		display3.setText(strBig6);
	  	  		display4.setText(strBig7);
	  	  		display5.setText(strBig2);
	  	  		display6.setText(strBig3);
	  	  		display7.setText(strBig4);
	  	  		display8.setText(strBig8);
	  	  	  
	  	  		sklDisplay1.setText(Integer.toString(big1));
	  	  		sklDisplay2.setText(Integer.toString(big5));
	  	  		sklDisplay3.setText(Integer.toString(big6));
	  	  		sklDisplay4.setText(Integer.toString(big7));
	  	  		sklDisplay5.setText(Integer.toString(big2));
	  	  		sklDisplay6.setText(Integer.toString(big3));
	  	  		sklDisplay7.setText(Integer.toString(big4));
	  	  		sklDisplay8.setText(Integer.toString(big8));
	  			
	  	  		team1.setText("Team 1: " + (big1 + big5 + big6 + big7));
	  	  		team2.setText("Team 2: " + (big2 + big3 + big4 + big8));
	  		}
	  		if (Math.abs((big1 + big5 + big6 + big8) - (big2 + big3 + big4 + big7)) < best)
	  		{
	  			best = Math.abs((big1 + big5 + big6 + big8) - (big2 + big3 + big4 + big7));
	  			
	  			display1.setText(strBig1);
	  	  		display2.setText(strBig5);
	  	  		display3.setText(strBig6);
	  	  		display4.setText(strBig8);
	  	  		display5.setText(strBig2);
	  	  		display6.setText(strBig3);
	  	  		display7.setText(strBig4);
	  	  		display8.setText(strBig7);
	  	  	  
	  	  		sklDisplay1.setText(Integer.toString(big1));
	  	  		sklDisplay2.setText(Integer.toString(big5));
	  	  		sklDisplay3.setText(Integer.toString(big6));
	  	  		sklDisplay4.setText(Integer.toString(big8));
	  	  		sklDisplay5.setText(Integer.toString(big2));
	  	  		sklDisplay6.setText(Integer.toString(big3));
	  	  		sklDisplay7.setText(Integer.toString(big4));
	  	  		sklDisplay8.setText(Integer.toString(big7));
	  			
	  	  		team1.setText("Team 1: " + (big1 + big5 + big6 + big8));
	  	  		team2.setText("Team 2: " + (big2 + big3 + big4 + big7));
	  		}
	  		if (Math.abs((big1 + big5 + big7 + big8) - (big2 + big3 + big4 + big6)) < best)
	  		{
	  			best = Math.abs((big1 + big5 + big7 + big8) - (big2 + big3 + big4 + big6));
	  			
	  			display1.setText(strBig1);
	  	  		display2.setText(strBig5);
	  	  		display3.setText(strBig7);
	  	  		display4.setText(strBig8);
	  	  		display5.setText(strBig2);
	  	  		display6.setText(strBig3);
	  	  		display7.setText(strBig4);
	  	  		display8.setText(strBig6);
	  	  	  
	  	  		sklDisplay1.setText(Integer.toString(big1));
	  	  		sklDisplay2.setText(Integer.toString(big5));
	  	  		sklDisplay3.setText(Integer.toString(big7));
	  	  		sklDisplay4.setText(Integer.toString(big8));
	  	  		sklDisplay5.setText(Integer.toString(big2));
	  	  		sklDisplay6.setText(Integer.toString(big3));
	  	  		sklDisplay7.setText(Integer.toString(big4));
	  	  		sklDisplay8.setText(Integer.toString(big6));
	  			
	  	  		team1.setText("Team 1: " + (big1 + big5 + big7 + big8));
	  	  		team2.setText("Team 2: " + (big2 + big3 + big4 + big6));
	  		}
	  		if (Math.abs((big1 + big6 + big7 + big8) - (big2 + big3 + big4 + big5)) < best)
	  		{
	  			best = Math.abs((big1 + big6 + big7 + big8) - (big2 + big3 + big4 + big5));
	  			
	  			display1.setText(strBig1);
	  	  		display2.setText(strBig6);
	  	  		display3.setText(strBig7);
	  	  		display4.setText(strBig8);
	  	  		display5.setText(strBig2);
	  	  		display6.setText(strBig3);
	  	  		display7.setText(strBig4);
	  	  		display8.setText(strBig5);
	  	  	  
	  	  		sklDisplay1.setText(Integer.toString(big1));
	  	  		sklDisplay2.setText(Integer.toString(big6));
	  	  		sklDisplay3.setText(Integer.toString(big7));
	  	  		sklDisplay4.setText(Integer.toString(big8));
	  	  		sklDisplay5.setText(Integer.toString(big2));
	  	  		sklDisplay6.setText(Integer.toString(big3));
	  	  		sklDisplay7.setText(Integer.toString(big4));
	  	  		sklDisplay8.setText(Integer.toString(big5));
	  			
	  	  		team1.setText("Team 1: " + (big1 + big6 + big7 + big8));
	  	  		team2.setText("Team 2: " + (big2 + big3 + big4 + big5));
	  		}
	  		Random myRandom = new Random();
	  		
	  		int whosBall = myRandom.nextInt(2);
	        if (whosBall == 1)
	        	tvWhosBall.setText("Team 1 starts with ball");
	        else
	        	tvWhosBall.setText("Team 2 starts with ball");
	  		
	  	}
	  	
}
	
    
        