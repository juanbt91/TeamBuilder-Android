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


public class PlayersRandom extends Activity {
    /** Called when the activity is first created. */
    
    EditText player1, player2, player3, player4, player5, player6, player7, player8;
    Button next, add1, sub1;
    SeekBar seekPlayers;
    Toast toaster;
    Boolean randomType = true;
    String p1Name, p2Name, p3Name, p4Name,p5Name, p6Name, p7Name, p8Name;
    TextView tv1;
    int players;
    SharedPreferences settings;
    
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.playersrandom);
        setRequestedOrientation(1);
        
        settings = getSharedPreferences("MyPreferences", MODE_PRIVATE);
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
        add1 = (Button) findViewById(R.id.addPlayer);
        sub1 = (Button) findViewById(R.id.subPlayer);
        
        sub1.setEnabled(false);
        
        add1.setOnClickListener(new View.OnClickListener() {
        	
			public void onClick(View v) {
				
				if (!player5.isShown())
				{
					player5.setVisibility(View.VISIBLE);
				}
				else if (!player6.isShown())
				{
					player6.setVisibility(View.VISIBLE);
				}
				else if (!player7.isShown())
				{
					player7.setVisibility(View.VISIBLE);
				}
				else if (!player8.isShown())
				{
					player8.setVisibility(View.VISIBLE);
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
        			player8.setVisibility(View.GONE);
        		}
        		else if (player7.isShown())
        		{
        			player7.setVisibility(View.GONE);
        		}
        		else if (player6.isShown())
        		{
        			player6.setVisibility(View.GONE);
        		}
        		else if (player5.isShown())
        		{
        			player5.setVisibility(View.GONE);
        		}
        		
        		if (!player5.isShown())
        			sub1.setEnabled(false);
        		if (!player8.isShown())
					add1.setEnabled(true);
        	}
        });
        
					next.setOnClickListener(new View.OnClickListener() {
						Intent nextIntent = new Intent(PlayersRandom.this, SportActivity.class);
						public void onClick(View view)
						{
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
							
							Boolean pass = true;
							
							
							if (players == 8)
							{
								p1Name = player1.getText().toString();
								p2Name = player2.getText().toString();
								p3Name = player3.getText().toString();
								p4Name = player4.getText().toString();
								p5Name = player5.getText().toString();
								p6Name = player6.getText().toString();
								p7Name = player7.getText().toString();
								p8Name = player8.getText().toString();
								
								if (p1Name.length() <= 0 | p2Name.length() <= 0 | p3Name.length() <= 0 | p4Name.length() <= 0 | p5Name.length() <= 0 | p6Name.length() <= 0 | p7Name.length() <= 0 | p8Name.length() <= 0)
									pass = false;
							}
							else if (players == 7)
							{
								p1Name = player1.getText().toString();
								p2Name = player2.getText().toString();
								p3Name = player3.getText().toString();
								p4Name = player4.getText().toString();
								p5Name = player5.getText().toString();
								p6Name = player6.getText().toString();
								p7Name = player7.getText().toString();
								
								if (p1Name.length() <= 0 | p2Name.length() <= 0 | p3Name.length() <= 0 | p4Name.length() <= 0 | p5Name.length() <= 0 | p6Name.length() <= 0 | p7Name.length() <= 0)
									pass = false;
							}
							else if (players == 6)
							{
								p1Name = player1.getText().toString();
								p2Name = player2.getText().toString();
								p3Name = player3.getText().toString();
								p4Name = player4.getText().toString();
								p5Name = player5.getText().toString();
								p6Name = player6.getText().toString();
								
								if (p1Name.length() <= 0 | p2Name.length() <= 0 | p3Name.length() <= 0 | p4Name.length() <= 0 | p5Name.length() <= 0 | p6Name.length() <= 0)
									pass = false;
							}
							else if (players == 5)
							{
								p1Name = player1.getText().toString();
								p2Name = player2.getText().toString();
								p3Name = player3.getText().toString();
								p4Name = player4.getText().toString();
								p5Name = player5.getText().toString();
								
								if (p1Name.length() <= 0 | p2Name.length() <= 0 | p3Name.length() <= 0 | p4Name.length() <= 0 | p5Name.length() <= 0)
									pass = false;
							}
							else if (players == 4)
							{
								p1Name = player1.getText().toString();
								p2Name = player2.getText().toString();
								p3Name = player3.getText().toString();
								p4Name = player4.getText().toString();
								
								if (p1Name.length() <= 0 | p2Name.length() <= 0 | p3Name.length() <= 0 | p4Name.length() <= 0)
									pass = false;
							}
							
							prefEditor.putString("firstInput", p1Name);
							prefEditor.putString("secondInput", p2Name);
							prefEditor.putString("thirdInput", p3Name);
							prefEditor.putString("fourthInput", p4Name);
							prefEditor.putString("fifthInput", p5Name);
							prefEditor.putString("sixthInput", p6Name);
							prefEditor.putString("seventhInput", p7Name);
							prefEditor.putString("eighthInput", p8Name);
							
							prefEditor.putInt("players", players);
							prefEditor.putBoolean("randomType", randomType);
							prefEditor.commit();
							
							if (pass == true)
								startActivity(nextIntent);
							else
							{
								Toast.makeText(getApplicationContext(), 
			                               "* Please fill all fields *", Toast.LENGTH_SHORT).show();
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
			Intent optionsIntent = new Intent(PlayersRandom.this, Options.class);
			startActivity(optionsIntent);
		return true;
		default:
		return super.onOptionsItemSelected(item);
		}
    }
}
        
    		
        	
        
    