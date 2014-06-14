package com.example.shamr;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;

public class DoneActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_done);

	}
	
	public void onConfirmClicked(View v){
		SharedPreferences prefs = getApplicationContext().getSharedPreferences(
			      "com.example.shamr", Context.MODE_PRIVATE);
		String insideKey = "com.example.app.inside";

		prefs.edit().putBoolean(insideKey, true).commit();
		finish();
	}


}
