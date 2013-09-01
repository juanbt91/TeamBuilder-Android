package com.jonahwitcig.team;

import android.widget.*;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.Random;
public class baseballActivity extends Activity {
  /** Called when the activity is first created. */

  TextView display1, display2, display3, display4, display5, display6, display7, display8, home, away;
  TextView sklDisplay1, sklDisplay2, sklDisplay3, sklDisplay4, sklDisplay5, sklDisplay6, sklDisplay7, sklDisplay8;
  Boolean randomType;
  int p1Skl, p2Skl, p3Skl, p4Skl, p5Skl, p6Skl, p7Skl, p8Skl;
  String strBig1, strBig2, strBig3, strBig4, strBig5, strBig6, strBig7, strBig8;
  String[] playerNames;
  
  @Override
  public void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.baseball);
      setRequestedOrientation(1);

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
      home = (TextView) this.findViewById(R.id.textView1);
      away = (TextView) this.findViewById(R.id.TextView01);
      
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
      
      Random myRandom = new Random();

      Bundle p = getIntent().getExtras(); 

      SharedPreferences settings = getSharedPreferences("MyPreferences", MODE_PRIVATE);
      final SharedPreferences.Editor prefEditor = settings.edit();
      
      int players1 = settings.getInt("players", 4);
      randomType = settings.getBoolean("randomType", true);

      String firstInput = settings.getString("firstInput", "");
      String secondInput = settings.getString("secondInput", "");
      String thirdInput = settings.getString("thirdInput", "");
      String fourthInput = settings.getString("fourthInput", "");
      String fifthInput = settings.getString("fifthInput", "");
      String sixthInput = settings.getString("sixthInput", "");
      String seventhInput = settings.getString("seventhInput", "");
      String eighthInput = settings.getString("eighthInput", "");
      
      playerNames[0] = firstInput;
      playerNames[1] = secondInput;
      playerNames[2] = thirdInput;
      playerNames[3] = fourthInput;
      playerNames[4] = fifthInput;
      playerNames[5] = sixthInput;
      playerNames[6] = seventhInput;
      playerNames[7] = eighthInput;
      
      p1Skl = settings.getInt("p1Skl", 0);
      p2Skl = settings.getInt("p2Skl", 0);
      p3Skl = settings.getInt("p3Skl", 0);
      p4Skl = settings.getInt("p4Skl", 0);
      p5Skl = settings.getInt("p5Skl", 0);
      p6Skl = settings.getInt("p6Skl", 0);
      p7Skl = settings.getInt("p7Skl", 0);
      p8Skl = settings.getInt("p8Skl", 0);
      
      if (randomType == true) {
    	  String strTeam1 = "Team 1: ";
    	  String strTeam2 = "Team 2: ";

    	  String first = "";
    	  String second = "";
    	  String third = "";
    	  String fourth = "";
    	  String fifth = "";
    	  String sixth = "";
    	  String seventh = "";
    	  String eighth = "";
    	  
    	  RandomGenerations rdmGens = new RandomGenerations();
    	  playerNames = rdmGens.teamGeneration(players1, playerNames);
    	  System.out.println("Start");
    	  System.out.println(playerNames[0]);
    	  System.out.println(playerNames[1]);
    	  System.out.println(playerNames[2]);
    	  System.out.println(playerNames[3]);
    	  System.out.println("Finish");
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
	  
	  home.setText("Home Team: " + (big1 + big4));
	  away.setText("Away Team: " + (big2 + big3));
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
	  
	  home.setText("Home Team: " + (big1 + big2));
	  away.setText("Away Team: " + (big3 + big4 + big5));
	  
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
		  
		  home.setText("Home Team: " + (big1 + big3));
		  away.setText("Away Team: " + (big2 + big4 + big5));
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
		  
		  home.setText("Home Team: " + (big1 + big4));
		  away.setText("Away Team: " + (big2 + big3 + big5));
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
		  
		  home.setText("Home Team: " + (big1 + big5));
		  away.setText("Away Team: " + (big2 + big3 + big4));
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
		  
		  home.setText("Home Team: " + (big2 + big3));
		  away.setText("Away Team: " + (big1 + big4 + big5));
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
	  		
		  home.setText("Home Team: " + (big2 + big4));
		  away.setText("Away Team: " + (big1 + big3 + big5));
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
	  		
		  home.setText("Home Team: " + (big2 + big5));
		  away.setText("Away Team: " + (big1 + big3 + big4));
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
	  		
		  home.setText("Home Team: " + (big3 + big4));
		  away.setText("Away Team: " + (big1 + big2 + big5));
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
	  		
		  home.setText("Home Team: " + (big3 + big5));
		  away.setText("Away Team: " + (big1 + big2 + big4));
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
	  		
		  home.setText("Home Team: " + (big4 + big5));
		  away.setText("Away Team: " + (big1 + big2 + big3));
	  }
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
	  
	  home.setText("Home Team: " + (big1 + big2 + big3));
	  away.setText("Away Team: " + (big4 + big5 + big6));
	  
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
		  home.setText("Home Team: " + (big1 + big2 + big4));
		  away.setText("Away Team: " + (big3 + big5 + big6));
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
		  
		  home.setText("Home Team: " + (big1 + big2 + big5));
		  away.setText("Away Team: " + (big3 + big4 + big6));
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
		  
		  home.setText("Home Team: " + (big1 + big2 + big6));
		  away.setText("Away Team: " + (big3 + big4 + big5));
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
		  
		  home.setText("Home Team: " + (big1 + big3 + big4));
		  away.setText("Away Team: " + (big2 + big5 + big6));
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
		  
		  home.setText("Home Team: " + (big1 + big3 + big5));
		  away.setText("Away Team: " + (big2 + big4 + big6));
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
		  
		  home.setText("Home Team: " + (big1 + big3 + big6));
		  away.setText("Away Team: " + (big2 + big4 + big5));
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
		  
		  home.setText("Home Team: " + (big1 + big4 + big5));
		  away.setText("Away Team: " + (big2 + big3 + big6));
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
		  
		  home.setText("Home Team: " + (big1 + big4 + big6));
		  away.setText("Away Team: " + (big2 + big3 + big5));
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
		  
		  home.setText("Home Team: " + (big1 + big5 + big6));
		  away.setText("Away Team: " + (big2 + big3 + big4));
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
		  
		  home.setText("Home Team: " + (big1 + big5 + big6));
		  away.setText("Away Team: " + (big2 + big3 + big4));
	  }
	  
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
	  
	  home.setText("Home Team: " + (big1 + big2 + big3));
	  away.setText("Away Team: " + (big4 + big5 + big6 + big7));
	  
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
		  
		  home.setText("Home Team: " + (big1 + big2 + big4));
		  away.setText("Away Team: " + (big3 + big5 + big6 + big7));
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
		  
		  home.setText("Home Team: " + (big1 + big2 + big5));
		  away.setText("Away Team: " + (big3 + big4 + big6 + big7));
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
		  
		  home.setText("Home Team: " + (big1 + big2 + big6));
		  away.setText("Away Team: " + (big3 + big4 + big5 + big7));
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
		  
		  home.setText("Home Team: " + (big1 + big2 + big7));
		  away.setText("Away Team: " + (big3 + big4 + big5 + big6));
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
		  
		  home.setText("Home Team: " + (big1 + big3 + big4));
		  away.setText("Away Team: " + (big2 + big5 + big6 + big7));
		  
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
		  
		  home.setText("Home Team: " + (big1 + big3 + big5));
		  away.setText("Away Team: " + (big2 + big4 + big6 + big7));
		  
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
		  
		  home.setText("Home Team: " + (big1 + big3 + big6));
		  away.setText("Away Team: " + (big2 + big4 + big5 + big7));
		  
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
		  
		  home.setText("Home Team: " + (big1 + big4 + big5));
		  away.setText("Away Team: " + (big2 + big3 + big6 + big7));
		  
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
		  
		  home.setText("Home Team: " + (big1 + big4 + big6));
		  away.setText("Away Team: " + (big2 + big3 + big5 + big7));
		  
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
		  
		  home.setText("Home Team: " + (big1 + big4 + big7));
		  away.setText("Away Team: " + (big2 + big3 + big5 + big6));
		  
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
		  
		  home.setText("Home Team: " + (big1 + big5 + big6));
		  away.setText("Away Team: " + (big2 + big3 + big4 + big7));
		  
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
		  
		  home.setText("Home Team: " + (big1 + big5 + big7));
		  away.setText("Away Team: " + (big2 + big3 + big4 + big6));
		  
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
		  
		  home.setText("Home Team: " + (big1 + big6 + big7));
		  away.setText("Away Team: " + (big2 + big3 + big4 + big5));
		  
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
		  
		  home.setText("Home Team: " + (big2 + big3 + big4));
		  away.setText("Away Team: " + (big1 + big5 + big6 + big7));
		  
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
		  
		  home.setText("Home Team: " + (big2 + big3 + big5));
		  away.setText("Away Team: " + (big1 + big4 + big6 + big7));
		  
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
		  
		  home.setText("Home Team: " + (big2 + big3 + big6));
		  away.setText("Away Team: " + (big1 + big4 + big5 + big7));
		  
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
		  
		  home.setText("Home Team: " + (big2 + big3 + big7));
		  away.setText("Away Team: " + (big1 + big4 + big5 + big6));
		  
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
		  
		  home.setText("Home Team: " + (big2 + big4 + big5));
		  away.setText("Away Team: " + (big1 + big3 + big6 + big7));
		  
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
		  
		  home.setText("Home Team: " + (big2 + big4 + big6));
		  away.setText("Away Team: " + (big1 + big3 + big5 + big7));
		  
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
		  
		  home.setText("Home Team: " + (big2 + big4 + big7));
		  away.setText("Away Team: " + (big1 + big3 + big5 + big6));
		  
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
		  
		  home.setText("Home Team: " + (big2 + big5 + big6));
		  away.setText("Away Team: " + (big1 + big3 + big4 + big7));
		  
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
		  
		  home.setText("Home Team: " + (big2 + big5 + big7));
		  away.setText("Away Team: " + (big1 + big3 + big4 + big6));
		  
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
		  
		  home.setText("Home Team: " + (big2 + big6 + big7));
		  away.setText("Away Team: " + (big1 + big3 + big4 + big5));
		  
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
		  
		  home.setText("Home Team: " + (big3 + big4 + big5));
		  away.setText("Away Team: " + (big1 + big2 + big6 + big7));
		  
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
		  
		  home.setText("Home Team: " + (big3 + big4 + big6));
		  away.setText("Away Team: " + (big1 + big2 + big5 + big7));
		  
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
		  
		  home.setText("Home Team: " + (big3 + big4 + big7));
		  away.setText("Away Team: " + (big1 + big2 + big5 + big6));
		  
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
		  
		  home.setText("Home Team: " + (big3 + big5 + big6));
		  away.setText("Away Team: " + (big1 + big2 + big4 + big7));
		  
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
		  
		  home.setText("Home Team: " + (big3 + big5 + big7));
		  away.setText("Away Team: " + (big1 + big2 + big4 + big6));
		  
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
		  
		  home.setText("Home Team: " + (big3 + big6 + big7));
		  away.setText("Away Team: " + (big1 + big2 + big4 + big5));
		  
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
		  
		  home.setText("Home Team: " + (big4 + big5 + big6));
		  away.setText("Away Team: " + (big1 + big2 + big3 + big7));
		  
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
		  
		  home.setText("Home Team: " + (big4 + big5 + big7));
		  away.setText("Away Team: " + (big1 + big2 + big3 + big6));
		  
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
		  
		  home.setText("Home Team: " + (big4 + big6 + big7));
		  away.setText("Away Team: " + (big1 + big2 + big3 + big5));
		  
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
		  
		  home.setText("Home Team: " + (big5 + big6 + big7));
		  away.setText("Away Team: " + (big1 + big2 + big3 + big4));
		  
	  }
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
  	  
  		home.setText("Home Team: " + (big1 + big2 + big3 + big4));
  		away.setText("Away Team: " + (big5 + big6 + big7 + big8));
  	  
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
  			
  	  		home.setText("Home Team: " + (big1 + big2 + big3 + big5));
  	  		away.setText("Away Team: " + (big4 + big6 + big7 + big8));
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
  			
  	  		home.setText("Home Team: " + (big1 + big2 + big3 + big6));
  	  		away.setText("Away Team: " + (big4 + big5 + big7 + big8));
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
  			
  	  		home.setText("Home Team: " + (big1 + big2 + big3 + big7));
  	  		away.setText("Away Team: " + (big4 + big5 + big6 + big8));
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
  			
  	  		home.setText("Home Team: " + (big1 + big2 + big3 + big8));
  	  		away.setText("Away Team: " + (big4 + big5 + big6 + big7));
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
  			
  	  		home.setText("Home Team: " + (big1 + big2 + big4 + big5));
  	  		away.setText("Away Team: " + (big3 + big6 + big7 + big8));
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
  			
  	  		home.setText("Home Team: " + (big1 + big2 + big4 + big6));
  	  		away.setText("Away Team: " + (big3 + big5 + big7 + big8));
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
  			
  	  		home.setText("Home Team: " + (big1 + big2 + big4 + big7));
  	  		away.setText("Away Team: " + (big3 + big5 + big6 + big8));
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
  			
  	  		home.setText("Home Team: " + (big1 + big2 + big4 + big8));
  	  		away.setText("Away Team: " + (big3 + big5 + big6 + big7));
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
  			
  	  		home.setText("Home Team: " + (big1 + big2 + big5 + big6));
  	  		away.setText("Away Team: " + (big3 + big4 + big7 + big8));
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
  			
  	  		home.setText("Home Team: " + (big1 + big2 + big5 + big7));
  	  		away.setText("Away Team: " + (big3 + big4 + big6 + big8));
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
  			
  	  		home.setText("Home Team: " + (big1 + big2 + big5 + big8));
  	  		away.setText("Away Team: " + (big3 + big4 + big6 + big7));
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
  			
  	  		home.setText("Home Team: " + (big1 + big2 + big6 + big7));
  	  		away.setText("Away Team: " + (big3 + big4 + big5 + big8));
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
  			
  	  		home.setText("Home Team: " + (big1 + big2 + big6 + big8));
  	  		away.setText("Away Team: " + (big3 + big4 + big5 + big7));
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
  			
  	  		home.setText("Home Team: " + (big1 + big2 + big7 + big8));
  	  		away.setText("Away Team: " + (big3 + big4 + big5 + big6));
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
  			
  	  		home.setText("Home Team: " + (big1 + big3 + big4 + big5));
  	  		away.setText("Away Team: " + (big2 + big6 + big7 + big8));
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
  			
  	  		home.setText("Home Team: " + (big1 + big3 + big4 + big6));
  	  		away.setText("Away Team: " + (big2 + big5 + big7 + big8));
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
  			
  	  		home.setText("Home Team: " + (big1 + big3 + big4 + big7));
  	  		away.setText("Away Team: " + (big2 + big5 + big6 + big8));
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
  			
  	  		home.setText("Home Team: " + (big1 + big3 + big4 + big8));
  	  		away.setText("Away Team: " + (big2 + big5 + big6 + big7));
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
  			
  	  		home.setText("Home Team: " + (big1 + big3 + big5 + big6));
  	  		away.setText("Away Team: " + (big2 + big4 + big7 + big8));
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
  			
  	  		home.setText("Home Team: " + (big1 + big3 + big5 + big7));
  	  		away.setText("Away Team: " + (big2 + big4 + big6 + big8));
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
  			
  	  		home.setText("Home Team: " + (big1 + big3 + big5 + big8));
  	  		away.setText("Away Team: " + (big2 + big4 + big6 + big7));
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
  			
  	  		home.setText("Home Team: " + (big1 + big3 + big6 + big7));
  	  		away.setText("Away Team: " + (big2 + big4 + big5 + big8));
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
  			
  	  		home.setText("Home Team: " + (big1 + big3 + big6 + big8));
  	  		away.setText("Away Team: " + (big2 + big4 + big5 + big7));
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
  			
  	  		home.setText("Home Team: " + (big1 + big4 + big5 + big6));
  	  		away.setText("Away Team: " + (big2 + big3 + big7 + big8));
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
  			
  	  		home.setText("Home Team: " + (big1 + big4 + big5 + big7));
  	  		away.setText("Away Team: " + (big2 + big3 + big6 + big8));
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
  			
  	  		home.setText("Home Team: " + (big1 + big4 + big5 + big8));
  	  		away.setText("Away Team: " + (big2 + big3 + big6 + big7));
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
  			
  	  		home.setText("Home Team: " + (big1 + big4 + big6 + big7));
  	  		away.setText("Away Team: " + (big2 + big3 + big5 + big8));
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
  			
  	  		home.setText("Home Team: " + (big1 + big4 + big6 + big8));
  	  		away.setText("Away Team: " + (big2 + big3 + big5 + big7));
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
  			
  	  		home.setText("Home Team: " + (big1 + big4 + big7 + big8));
  	  		away.setText("Away Team: " + (big2 + big3 + big5 + big6));
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
  			
  	  		home.setText("Home Team: " + (big1 + big5 + big6 + big7));
  	  		away.setText("Away Team: " + (big2 + big3 + big4 + big8));
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
  			
  	  		home.setText("Home Team: " + (big1 + big5 + big6 + big8));
  	  		away.setText("Away Team: " + (big2 + big3 + big4 + big7));
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
  			
  	  		home.setText("Home Team: " + (big1 + big5 + big7 + big8));
  	  		away.setText("Away Team: " + (big2 + big3 + big4 + big6));
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
  			
  	  		home.setText("Home Team: " + (big1 + big6 + big7 + big8));
  	  		away.setText("Away Team: " + (big2 + big3 + big4 + big5));
  		}
  		
  	}
}






