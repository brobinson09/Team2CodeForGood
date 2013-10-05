package com.example.handsonandroid;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;



public class FeedActivity extends Activity {

	ArrayList<Events> events;
	User user;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_feed);
		
		ListView lv = (ListView) findViewById(R.id.event_feed);
		
		String[] lv_array = (String[]) Events.getList().toArray();
		lv.setAdapter(new ArrayAdapter<String>(FeedActivity.this, android.R.layout.simple_list_item_1,
		lv_array));
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	@Override
	public void onStart(){
		super.onStart();
	}
	
	@Override
	public void onPause(){
		super.onPause();
	}
	
	@Override
	public void onStop(){
		super.onStop();
	}

}
