package com.jonahwitcig.team;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class SelectionType extends Activity {

	Boolean randomType;
	Button btnContinue;
	RadioButton random, skill;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.selectiontype);
		setRequestedOrientation(1);
		
		btnContinue = (Button) findViewById(R.id.btncontinue);
		random = (RadioButton) findViewById(R.id.randomBased);
		skill = (RadioButton) findViewById(R.id.skillBased);
		
		SharedPreferences settings = getSharedPreferences("MyPreferences", MODE_PRIVATE);
        final SharedPreferences.Editor prefEditor = settings.edit();
		
		btnContinue.setOnClickListener(new View.OnClickListener() {
			Intent continueRandomIntent = new Intent(SelectionType.this, PlayersRandom.class);
			Intent continueSkillIntent = new Intent(SelectionType.this, CorrectedActivity.class);
			public void onClick(View v) {
				
				if (random.isChecked())
				{
					prefEditor.putBoolean("randomType", true);
					prefEditor.commit();
					startActivity(continueRandomIntent);
				}
				else
				{
					prefEditor.putBoolean("randomType", false);
					prefEditor.commit();
					startActivity(continueSkillIntent);
				}
			}
		});
	}
}