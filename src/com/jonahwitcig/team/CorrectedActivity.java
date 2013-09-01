package com.jonahwitcig.team;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.os.Bundle;
import android.text.Editable;
import android.view.Display;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.*;
import android.widget.SeekBar.OnSeekBarChangeListener;


public class CorrectedActivity extends Activity {
    /** Called when the activity is first created. */
    
    EditText player1, player2, player3, player4, player5, player6, player7, player8, p1Skill, p2Skill, p3Skill, p4Skill, p5Skill, p6Skill, p7Skill, p8Skill;
    Button next, add1, sub1;
    SeekBar seekPlayers;
    Toast toaster;
    int player1Skill, player2Skill, player3Skill, player4Skill, player5Skill, player6Skill, player7Skill, player8Skill, p1Skl, p2Skl, p3Skl, p4Skl, p5Skl, p6Skl, p7Skl, p8Skl;
    Boolean randomType;
    
    
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.playersskill);
        setRequestedOrientation(1);
        
        SharedPreferences settings = getSharedPreferences("MyPreferences", MODE_PRIVATE);
        final SharedPreferences.Editor prefEditor = settings.edit();
        
        Bundle p = getIntent().getExtras();
        
        next = (Button) findViewById(R.id.next);
        player1 = (EditText) findViewById(R.id.player1);
        player2 = (EditText) findViewById(R.id.player2);
        player3 = (EditText) findViewById(R.id.player3);
        player4 = (EditText) findViewById(R.id.player4);
        player5 = (EditText) findViewById(R.id.player5);
        player6 = (EditText) findViewById(R.id.player6);
        player7 = (EditText) findViewById(R.id.player7);
        player8 = (EditText) findViewById(R.id.player8);
        p1Skill = (EditText) findViewById(R.id.p1Skill);
        p2Skill = (EditText) findViewById(R.id.p2Skill);
        p3Skill = (EditText) findViewById(R.id.p3Skill);
        p4Skill = (EditText) findViewById(R.id.p4Skill);
        p5Skill = (EditText) findViewById(R.id.p5Skill);
        p6Skill = (EditText) findViewById(R.id.p6Skill);
        p7Skill = (EditText) findViewById(R.id.p7Skill);
        p8Skill = (EditText) findViewById(R.id.p8Skill);
        
        add1 = (Button) findViewById(R.id.addPlayer);
        sub1 = (Button) findViewById(R.id.subPlayer);
        
        sub1.setEnabled(false);
        
        add1.setOnClickListener(new View.OnClickListener() {
        	
			public void onClick(View v) {
				
				if (!player5.isShown())
				{
					player5.setVisibility(View.VISIBLE);
					p5Skill.setVisibility(View.VISIBLE);
				}
				else if (!player6.isShown())
				{
					player6.setVisibility(View.VISIBLE);
					p6Skill.setVisibility(View.VISIBLE);
				}
				else if (!player7.isShown())
				{
					player7.setVisibility(View.VISIBLE);
					p7Skill.setVisibility(View.VISIBLE);
				}
				else if (!player8.isShown())
				{
					player8.setVisibility(View.VISIBLE);
					p8Skill.setVisibility(View.VISIBLE);
				}
				if (player8.isShown())
					add1.setEnabled(false);
				if (player5.isShown())
        			sub1.setEnabled(true);
				
			}
		});
        
        sub1.setOnClickListener(new View.OnClickListener() {
        	public void onClick(View v) {
        		
        		if (player8.isShown())
        		{
        			player8.setVisibility(View.INVISIBLE);
        			p8Skill.setVisibility(View.INVISIBLE);
        		}
        		else if (player7.isShown())
        		{
        			player7.setVisibility(View.INVISIBLE);
        			p7Skill.setVisibility(View.INVISIBLE);
        		}
        		else if (player6.isShown())
        		{
        			player6.setVisibility(View.INVISIBLE);
        			p6Skill.setVisibility(View.INVISIBLE);
        		}
        		else if (player5.isShown())
        		{
        			player5.setVisibility(View.INVISIBLE);
        			p5Skill.setVisibility(View.INVISIBLE);
        		}
        		
        		if (!player5.isShown())
        			sub1.setEnabled(false);
        		if (!player8.isShown())
					add1.setEnabled(true);
        	}
        });
        
		next.setOnClickListener(new View.OnClickListener() {
			Intent nextIntent = new Intent(CorrectedActivity.this, SportActivity.class);
						
			public void onClick(View view)
			{
				boolean pass = true;
				boolean prevException = false;
							
				int players = 4;
							
				if (player8.isShown())
					players = 8;
				else if (player7.isShown())
					players = 7;
				else if (player6.isShown())
					players = 6;
				else if (player5.isShown())
					players = 5;
				else if (player4.isShown())
					players = 4;
							
							Bundle p = getIntent().getExtras();
						
							nextIntent.putExtra("players", players);
							
							String p1Name = player1.getText().toString();
							String p2Name = player2.getText().toString();
							String p3Name = player3.getText().toString();
							String p4Name = player4.getText().toString();
							String p5Name = player5.getText().toString();
							String p6Name = player6.getText().toString();
							String p7Name = player7.getText().toString();
							String p8Name = player8.getText().toString();
							
							if (players == 8)
							{
								try {
									String strP1Skl = p1Skill.getText().toString();
									String strP2Skl = p2Skill.getText().toString();
									String strP3Skl = p3Skill.getText().toString();
									String strP4Skl = p4Skill.getText().toString();
									String strP5Skl = p5Skill.getText().toString();
									String strP6Skl = p6Skill.getText().toString();
									String strP7Skl = p7Skill.getText().toString();
									String strP8Skl = p8Skill.getText().toString();
									
									p1Skl = Integer.parseInt(strP1Skl);
									p2Skl = Integer.parseInt(strP2Skl);
									p3Skl = Integer.parseInt(strP3Skl);
									p4Skl = Integer.parseInt(strP4Skl);
									p5Skl = Integer.parseInt(strP5Skl);
									p6Skl = Integer.parseInt(strP6Skl);
									p7Skl = Integer.parseInt(strP7Skl);
									p8Skl = Integer.parseInt(strP8Skl);
								}
								catch (NumberFormatException e)
								{
									Toast.makeText(getApplicationContext(), 
				                               "* Please fill all fields *", Toast.LENGTH_SHORT).show();
									prevException = true;
									pass = false;
								}
							}
							else if (players == 7)
							{
								try {
									p1Skl = Integer.parseInt(p1Skill.getText().toString());
									p2Skl = Integer.parseInt(p2Skill.getText().toString());
									p3Skl = Integer.parseInt(p3Skill.getText().toString());
									p4Skl = Integer.parseInt(p4Skill.getText().toString());
									p5Skl = Integer.parseInt(p5Skill.getText().toString());
									p6Skl = Integer.parseInt(p6Skill.getText().toString());
									p7Skl = Integer.parseInt(p7Skill.getText().toString());
								}
								catch (NumberFormatException e)
								{
									Toast.makeText(getApplicationContext(), 
				                               "* Please fill all fields *", Toast.LENGTH_SHORT).show();
									prevException = true;
									pass = false;
								}
							}
							else if (players == 6)
							{
								try {
									p1Skl = Integer.parseInt(p1Skill.getText().toString());
									p2Skl = Integer.parseInt(p2Skill.getText().toString());
									p3Skl = Integer.parseInt(p3Skill.getText().toString());
									p4Skl = Integer.parseInt(p4Skill.getText().toString());
									p5Skl = Integer.parseInt(p5Skill.getText().toString());
									p6Skl = Integer.parseInt(p6Skill.getText().toString());
								}
								catch (NumberFormatException e)
								{
									Toast.makeText(getApplicationContext(), 
				                               "* Please fill all fields *", Toast.LENGTH_SHORT).show();
									prevException = true;
									pass = false;
								}
							}
							else if (players == 5)
							{
								try {
									p1Skl = Integer.parseInt(p1Skill.getText().toString());
									p2Skl = Integer.parseInt(p2Skill.getText().toString());
									p3Skl = Integer.parseInt(p3Skill.getText().toString());
									p4Skl = Integer.parseInt(p4Skill.getText().toString());
									p5Skl = Integer.parseInt(p5Skill.getText().toString());
								}
								catch (NumberFormatException e)
								{
									Toast.makeText(getApplicationContext(), 
				                               "* Please fill all fields *", Toast.LENGTH_SHORT).show();
									prevException = true;
									pass = false;
								}
							}
							if (players == 4)
							{
								try {
									p1Skl = Integer.parseInt(p1Skill.getText().toString());
									p2Skl = Integer.parseInt(p2Skill.getText().toString());
									p3Skl = Integer.parseInt(p3Skill.getText().toString());
									p4Skl = Integer.parseInt(p4Skill.getText().toString());
								}
								catch (NumberFormatException e)
								{
									Toast.makeText(getApplicationContext(), 
				                               "* Please fill all fields *", Toast.LENGTH_SHORT).show();
									prevException = true;
									pass = false;
								}
							}
							
							nextIntent.putExtra("firstInput", p1Name);
							nextIntent.putExtra("secondInput", p2Name);
							nextIntent.putExtra("thirdInput", p3Name);
							nextIntent.putExtra("fourthInput", p4Name);
							nextIntent.putExtra("fifthInput", p5Name);
							nextIntent.putExtra("sixthInput", p6Name);
							nextIntent.putExtra("seventhInput", p7Name);
							nextIntent.putExtra("eighthInput", p8Name);
							
							nextIntent.putExtra("p1Skl", p1Skl);
							nextIntent.putExtra("p2Skl", p2Skl);
							nextIntent.putExtra("p3Skl", p3Skl);
							nextIntent.putExtra("p4Skl", p4Skl);
							nextIntent.putExtra("p5Skl", p5Skl);
							nextIntent.putExtra("p6Skl", p6Skl);
							nextIntent.putExtra("p7Skl", p7Skl);
							nextIntent.putExtra("p8Skl", p8Skl);
							
							if (players == 8)
							{
								if (p1Name.equals("") | p2Name.equals("") | p3Name.equals("") | p4Name.equals("") | p5Name.equals("") | p6Name.equals("") | p7Name.equals("") | p8Name.equals(""))
								{
									pass = false;
								}
							}
							else if (players == 7)
							{
								if (p1Name.equals("") | p2Name.equals("") | p3Name.equals("") | p4Name.equals("") | p5Name.equals("") | p6Name.equals("") | p7Name.equals(""))
								{
									pass = false;
								}
							}
							else if (players == 6)
							{
								if (p1Name.equals("") | p2Name.equals("") | p3Name.equals("") | p4Name.equals("") | p5Name.equals("") | p6Name.equals(""))
								{
									pass = false;
								}
							}
							else if (players == 5)
							{
								if (p1Name.equals("") | p2Name.equals("") | p3Name.equals("") | p4Name.equals("") | p5Name.equals(""))
								{
									pass = false;
								}
							}
							else if (players == 4)
							{
								if (p1Name.equals("") | p2Name.equals("") | p3Name.equals("") | p4Name.equals(""))
								{
									pass = false;
								}
							}
							
							prefEditor.putString("firstInput", p1Name);
							prefEditor.putString("secondInput", p2Name);
							prefEditor.putString("thirdInput", p3Name);
							prefEditor.putString("fourthInput", p4Name);
							prefEditor.putString("fifthInput", p5Name);
							prefEditor.putString("sixthInput", p6Name);
							prefEditor.putString("seventhInput", p7Name);
							prefEditor.putString("eighthInput", p8Name);
							
							prefEditor.putInt("p1Skl", p1Skl);
							prefEditor.putInt("p2Skl", p2Skl);
							prefEditor.putInt("p3Skl", p3Skl);
							prefEditor.putInt("p4Skl", p4Skl);
							prefEditor.putInt("p5Skl", p5Skl);
							prefEditor.putInt("p6Skl", p6Skl);
							prefEditor.putInt("p7Skl", p7Skl);
							prefEditor.putInt("p8Skl", p8Skl);
							
							prefEditor.putInt("players", players);
							//prefEditor.putBoolean("randomType", randomType);
							prefEditor.commit();
							
							if (pass == true)
								startActivity(nextIntent);
							else
							{
								if (prevException == false)
								{
									Toast.makeText(getApplicationContext(), 
			                               "* Please fill all fields *", Toast.LENGTH_SHORT).show();
								}
							}
						}
				});
    }
    
    public boolean onCreateOptionsMenu(Menu menu) {
    	 
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.options, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.options:
			Intent optionsIntent = new Intent(CorrectedActivity.this, Options.class);
			startActivity(optionsIntent);
		return true;
		default:
		return super.onOptionsItemSelected(item);
		}

    }
}
        
        
        	
        
    