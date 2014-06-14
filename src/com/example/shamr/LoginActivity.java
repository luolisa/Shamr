package com.example.shamr;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);

		SharedPreferences prefs = this.getSharedPreferences(
			      "com.example.shamr", Context.MODE_PRIVATE);
		String insideKey = "com.example.app.inside";

		if (prefs.contains(insideKey)) {
			Intent intent = new Intent(this, GraphActivity.class);
			startActivity(intent);
		}
	}
	
	public void onLoginTapped(View v) {
		Intent intent = new Intent(this, SuccessActivity.class);
		startActivity(intent);
	}

}
