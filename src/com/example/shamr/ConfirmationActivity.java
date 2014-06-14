package com.example.shamr;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

public class ConfirmationActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_confirmation);

	}
	
	public void onConfirmClicked(View v){
		SharedPreferences prefs = getApplicationContext().getSharedPreferences(
			      "com.example.shamr", Context.MODE_PRIVATE);
		String insideKey = "com.example.app.inside";

		prefs.edit().putBoolean(insideKey, true).commit();
		finish();
	}


}
