package com.jonahwitcig.team;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.*;

public class CustomSportActivity extends Activity{
	
	String customSportName1;
	Button help, save;
	Button clear1, clear2, clear3, clear4, clear5;
	EditText EDITTEXTCustomSportName1, EDITTEXTCustomSportName2, EDITTEXTCustomSportName3, EDITTEXTCustomSportName4, EDITTEXTCustomSportName5;
	EditText EDITTEXTRAV1, EDITTEXTRAV2, EDITTEXTRAV3, EDITTEXTRAV4, EDITTEXTRAV5;
	
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
        setContentView(R.layout.customsports);
        
        help = (Button) findViewById(R.id.help);
        save = (Button) findViewById(R.id.save);
        EDITTEXTCustomSportName1 = (EditText) findViewById(R.id.EDITTEXTCustomSportName1);
        EDITTEXTCustomSportName2 = (EditText) findViewById(R.id.EDITTEXTCustomSportName2);
        EDITTEXTCustomSportName3 = (EditText) findViewById(R.id.EDITTEXTCustomSportName3);
        EDITTEXTCustomSportName4 = (EditText) findViewById(R.id.EDITTEXTCustomSportName4);
        EDITTEXTCustomSportName5 = (EditText) findViewById(R.id.EDITTEXTCustomSportName5);
        EDITTEXTRAV1 = (EditText) findViewById(R.id.EDITTEXTRandomlyAssignedValue1);
        EDITTEXTRAV2 = (EditText) findViewById(R.id.EDITTEXTRandomlyAssignedValue2);
        EDITTEXTRAV3 = (EditText) findViewById(R.id.EDITTEXTRandomlyAssignedValue3);
        EDITTEXTRAV4 = (EditText) findViewById(R.id.EDITTEXTRandomlyAssignedValue4);
        EDITTEXTRAV5 = (EditText) findViewById(R.id.EDITTEXTRandomlyAssignedValue5);
        clear1 = (Button) findViewById(R.id.clearCustomSport1);
        clear2 = (Button) findViewById(R.id.clearCustomSport2);
        clear3 = (Button) findViewById(R.id.clearCustomSport3);
        clear4 = (Button) findViewById(R.id.clearCustomSport4);
        clear5 = (Button) findViewById(R.id.clearCustomSport5);
        clear1.setOnClickListener(onClickListener);
        clear2.setOnClickListener(onClickListener);
        clear3.setOnClickListener(onClickListener);
        clear4.setOnClickListener(onClickListener);
        clear5.setOnClickListener(onClickListener);
        
        final SharedPreferences settings = getSharedPreferences("MyPreferences", MODE_PRIVATE);  
        final SharedPreferences.Editor prefEditor = settings.edit();  
        final AlertDialog alertDialog = new AlertDialog.Builder(CustomSportActivity.this).create();
        
        EDITTEXTCustomSportName1.setText(settings.getString("customSport1", ""));
        EDITTEXTCustomSportName2.setText(settings.getString("customSport2", ""));
        EDITTEXTCustomSportName3.setText(settings.getString("customSport3", ""));
        EDITTEXTCustomSportName4.setText(settings.getString("customSport4", ""));
        EDITTEXTCustomSportName5.setText(settings.getString("customSport5", ""));
        
        EDITTEXTRAV1.setText(settings.getString("customRAV1", ""));
        EDITTEXTRAV2.setText(settings.getString("customRAV2", ""));
        EDITTEXTRAV3.setText(settings.getString("customRAV3", ""));
        EDITTEXTRAV4.setText(settings.getString("customRAV4", ""));
        EDITTEXTRAV5.setText(settings.getString("customRAV5", ""));
        
        help.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				alertDialog.setTitle("Help");
				alertDialog.setMessage("The 'Randomly Assigned Value' text field is used to generate a value specific to your sport." +
						"(ex. When you pick 'Football', the Randomly Assigned Value is 'kicks off'). To clear a sport and RAV, just" +
						"leave the 'Sport Name' field blank.");
				alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
			           public void onClick(DialogInterface dialog, int id) {
			                alertDialog.cancel();
			           }
			       });
				alertDialog.show();
			}
		});
        
        save.setOnClickListener(new View.OnClickListener() {
			Intent saveIntent = new Intent(CustomSportActivity.this, SportActivity.class);
			public void onClick(View v) {
				String customSportName1 = EDITTEXTCustomSportName1.getText().toString();
				String customSportName2 = EDITTEXTCustomSportName2.getText().toString();
				String customSportName3 = EDITTEXTCustomSportName3.getText().toString();
				String customSportName4 = EDITTEXTCustomSportName4.getText().toString();
				String customSportName5 = EDITTEXTCustomSportName5.getText().toString();
				
				String customRAV1 = EDITTEXTRAV1.getText().toString();
				String customRAV2 = EDITTEXTRAV2.getText().toString();
				String customRAV3 = EDITTEXTRAV3.getText().toString();
				String customRAV4 = EDITTEXTRAV4.getText().toString();
				String customRAV5 = EDITTEXTRAV5.getText().toString();
				
				if (customSportName1.equals("") | customSportName1.equals(" ") | customSportName1.equals("  "))
				{
					customSportName1 = customSportName2;
					customSportName2 = customSportName3;
					customSportName3 = customSportName4;
					customSportName4 = customSportName5;
					customSportName5 = "";

					customRAV1 = customRAV2;
					customRAV2 = customRAV3;
					customRAV3 = customRAV4;
					customRAV4 = customRAV5;
					customRAV5 = "";
				}
				
				if (customSportName2.equals("") | customSportName2.equals(" ") | customSportName2.equals("  "))
				{
					customSportName2 = customSportName3;
					customSportName3 = customSportName4;
					customSportName4 = customSportName5;
					customSportName5 = "";
					
					customRAV2 = customRAV3;
					customRAV3 = customRAV4;
					customRAV4 = customRAV5;
					customRAV5 = "";
				}
				
				if (customSportName3.equals("") | customSportName3.equals(" ") | customSportName3.equals("  "))
				{
					customSportName3 = customSportName4;
					customSportName4 = customSportName5;
					customSportName5 = "";
					
					customRAV3 = customRAV4;
					customRAV4 = customRAV5;
					customRAV5 = "";
				}
				
				if (customSportName4.equals("") | customSportName4.equals(" ") | customSportName4.equals("  "))
				{
					customSportName4 = customSportName5;
					customSportName5 = "";
					
					customRAV4 = customRAV5;
					customRAV5 = "";
					
				}
					
				prefEditor.putString("customSport1", customSportName1);
				prefEditor.putString("customSport2", customSportName2);
				prefEditor.putString("customSport3", customSportName3);
				prefEditor.putString("customSport4", customSportName4);
				prefEditor.putString("customSport5", customSportName5);
				
				prefEditor.putString("customRAV1", customRAV1);
				prefEditor.putString("customRAV2", customRAV2);
				prefEditor.putString("customRAV3", customRAV3);
				prefEditor.putString("customRAV4", customRAV4);
				prefEditor.putString("customRAV5", customRAV5);
				
				prefEditor.commit();
				
				Toast.makeText(getApplicationContext(), 
                        "Save Successful", Toast.LENGTH_SHORT).show();
				
				startActivity(saveIntent);
			}
		});
	}
	
	private OnClickListener onClickListener = new OnClickListener() {
  	     public void onClick(final View v) {
  	         switch(v.getId()){
  	             case R.id.clearCustomSport1:
  	            	 EDITTEXTCustomSportName1.setText("");
  	            	 EDITTEXTRAV1.setText("");
  	             break;
  	             case R.id.clearCustomSport2:
  	            	EDITTEXTCustomSportName2.setText("");
 	            	 EDITTEXTRAV2.setText("");
  	            	 
  	             break;
  	             case R.id.clearCustomSport3:
  	            	EDITTEXTCustomSportName3.setText("");
 	            	 EDITTEXTRAV3.setText("");
  	            	 
  	             break;
  	             case R.id.clearCustomSport4:
  	            	EDITTEXTCustomSportName4.setText("");
 	            	 EDITTEXTRAV4.setText("");
  	            	 
  	            	 break;
  	             case R.id.clearCustomSport5:
  	            	EDITTEXTCustomSportName5.setText("");
 	            	 EDITTEXTRAV5.setText("");
  	            	
  	            	 break;
  	         }
  	   }
  	};
	
}
