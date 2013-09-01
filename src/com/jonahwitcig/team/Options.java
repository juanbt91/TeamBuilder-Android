package com.jonahwitcig.team;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class Options extends Activity{
	
	Button save;
	RadioButton skillBased, randomBased;
	boolean randomType;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.optionmenu);
		setRequestedOrientation(1);
		
		save = (Button) findViewById(R.id.save);
		skillBased = (RadioButton) findViewById(R.id.skillBased);
		randomBased = (RadioButton) findViewById(R.id.randomBased);
		
		save.setOnClickListener(new View.OnClickListener() {
			Intent saveSkillIntent = new Intent(Options.this, CorrectedActivity.class);
			Intent saveRandomIntent = new Intent(Options.this, PlayersRandom.class);
			public void onClick(View v)
			{
				if (randomBased.isChecked())
				{
					randomType = true;
					saveRandomIntent.putExtra("randomType", randomType);
					startActivity(saveRandomIntent);
				}
				else
				{
					randomType = false;
					saveSkillIntent.putExtra("randomType", randomType);
					startActivity(saveSkillIntent);
				}
				finish();
			}
		});
	}
}
