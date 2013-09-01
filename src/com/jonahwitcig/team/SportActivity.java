package com.jonahwitcig.team;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.*;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;

public class SportActivity extends Activity {
    /** Called when the activity is first created. */
	
	Button baseball, basketball, football, lacrosse, soccer, customSport1, customSport2, customSport3, customSport4, customSport5, customSport;
	Boolean randomType;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sports);
        setRequestedOrientation(1);
        
        baseball = (Button) findViewById(R.id.baseball);
        basketball = (Button) findViewById(R.id.basketball);
        football = (Button) findViewById(R.id.football);
        lacrosse = (Button) findViewById(R.id.lacrosse);
        soccer = (Button) findViewById(R.id.soccer);
        customSport1 = (Button) findViewById(R.id.customSport1);
        customSport2 = (Button) findViewById(R.id.customSport2);
        customSport3 = (Button) findViewById(R.id.customSport3);
        customSport4 = (Button) findViewById(R.id.customSport4);
        customSport5 = (Button) findViewById(R.id.customSport5);
        customSport = (Button) findViewById(R.id.customSport);
        
        customSport1.setOnClickListener(onClickListener);
        customSport2.setOnClickListener(onClickListener);
        customSport3.setOnClickListener(onClickListener);
        customSport4.setOnClickListener(onClickListener);
        customSport5.setOnClickListener(onClickListener);
        
        SharedPreferences settings = getSharedPreferences("MyPreferences", MODE_PRIVATE);
        SharedPreferences.Editor prefEditor = settings.edit();
        
        randomType = settings.getBoolean("randomType", true);
        
        String customSportName1 = settings.getString("customSport1", "");
        String customSportName2 = settings.getString("customSport2", "");
        String customSportName3 = settings.getString("customSport3", "");
        String customSportName4 = settings.getString("customSport4", "");
        String customSportName5 = settings.getString("customSport5", "");
        
        Bundle p = getIntent().getExtras();
        //players1 = p.getInt("players");
        
        if (customSportName1.equals(""))
        	customSport1.setVisibility(View.GONE);
        else
        	customSport1.setText(customSportName1);
     //////////
        if (customSportName2.equals(""))
        	customSport2.setVisibility(View.GONE);
        else
        	customSport2.setText(customSportName2);
     //////////
        if (customSportName3.equals(""))
        	customSport3.setVisibility(View.GONE);
        else
        	customSport3.setText(customSportName3);
     //////////
        if (customSportName4.equals(""))
        	customSport4.setVisibility(View.GONE);
        else
        	customSport4.setText(customSportName4);
     //////////
        if (customSportName5.equals(""))
        	customSport5.setVisibility(View.GONE);
        else
        	customSport5.setText(customSportName5);
        
    	baseball.setOnClickListener(new View.OnClickListener() {
    		Intent baseballIntent = new Intent(SportActivity.this, baseballActivity.class);
			public void onClick(View v) {
				startActivity(baseballIntent);
				}
		});
    	
    	basketball.setOnClickListener(new View.OnClickListener() {
    		Intent basketballIntent = new Intent(SportActivity.this, basketballActivity.class);
			public void onClick(View v) {
				startActivity(basketballIntent);
				}
		});
    	
    	football.setOnClickListener(new View.OnClickListener() {
    		Intent footballIntent = new Intent(SportActivity.this, footballActivity.class);
			public void onClick(View v) {
				startActivity(footballIntent);
				}
		});
    	
    	lacrosse.setOnClickListener(new View.OnClickListener() {
    		Intent lacrosseIntent = new Intent(SportActivity.this, lacrosseActivity.class);
			public void onClick(View v) {
				startActivity(lacrosseIntent);
				}
		});
    	
    	soccer.setOnClickListener(new View.OnClickListener() {
    		Intent soccerIntent = new Intent(SportActivity.this, SoccerActivity.class);
			public void onClick(View v) {
		        
				startActivity(soccerIntent);
				}
    });
    	
    	
    	
    	customSport.setOnClickListener(new View.OnClickListener() {
			Intent customSportIntent = new Intent(SportActivity.this, CustomSportActivity.class);
			public void onClick(View v) {
			
		        startActivity(customSportIntent);
			}
		});
    
    }
    
    private OnClickListener onClickListener = new OnClickListener() {
	     public void onClick(final View v) {
	    	 SharedPreferences settings = getSharedPreferences("MyPreferences", MODE_PRIVATE);
	         SharedPreferences.Editor prefEditor = settings.edit();
	    	 Intent customSportIntent = new Intent(SportActivity.this, SoccerActivity.class);
	         switch(v.getId()){
	             case R.id.customSport1:
	            	
	            	String customSportName = settings.getString("customSport1", "");
	 		        prefEditor.putString("customSportName", customSportName);
	 		        String customRAV = settings.getString("customRAV1", "");
	 		        prefEditor.putString("customRAV", customRAV);
	 		        prefEditor.commit();
	 				startActivity(customSportIntent);
	             break;
	             case R.id.customSport2:
	            	
	            	customSportName = settings.getString("customSport2", "");
		 		    prefEditor.putString("customSportName", customSportName);
	 		        customSportIntent.putExtra("customSportName", customSport2.getText().toString());
	 		        customRAV = settings.getString("customRAV2", "");
	 		        prefEditor.putString("customRAV", customRAV);
	 		        prefEditor.commit();
	 				startActivity(customSportIntent);
	             break;
	             case R.id.customSport3:
	            	 
	            	customSportName = settings.getString("customSport3", "");
		 		    prefEditor.putString("customSportName", customSportName);
	 		        customSportIntent.putExtra("customSportName", customSport3.getText().toString());
	 		        customRAV = settings.getString("customRAV3", "");
	 		        prefEditor.putString("customRAV", customRAV);
	 		       prefEditor.commit();
	 				startActivity(customSportIntent);
	             break;
	             case R.id.customSport4:
	            	 
	            	customSportName = settings.getString("customSport4", "");
		 		    prefEditor.putString("customSportName", customSportName);
	 		        customSportIntent.putExtra("customSportName", customSport4.getText().toString());
	 		        customRAV = settings.getString("customRAV4", "");
	 		        prefEditor.putString("customRAV", customRAV);
	 		        prefEditor.commit();
	 				startActivity(customSportIntent);
	            	 break;
	             case R.id.customSport5:
	            	 
	            	customSportName = settings.getString("customSport5", "");
		 		    prefEditor.putString("customSportName", customSportName);
	 		        customSportIntent.putExtra("customSportName", customSport5.getText().toString());
	 		        customRAV = settings.getString("customRAV5", "");
	 		        prefEditor.putString("customRAV", customRAV);
	 		        prefEditor.commit();
	 				startActivity(customSportIntent);
	            	 break;
	         }

	   }
	};
}