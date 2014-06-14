package com.example.shamr;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

public class ConfirmationActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_confirmation);
	}

	public void onConfirmClicked(View v) {
		Intent i = new Intent(this, DoneActivity.class);
		startActivity(i);
		finish();
	}
	

}
