package com.example.handsonandroid;

import android.app.Activity;
import android.os.Bundle;

public class EventActivity extends Activity
{
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_event);
		Bundle extras = getIntent().getExtras();
		String value="";
		if (extras != null) {
		    value = extras.getString("new_variable_name");
		}
		
	}
	
}
