package com.usf.strides;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SignInActivity extends Activity {	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.signin_page);
	}
	
	public void signInBtnClicked(View v) {
		Toast.makeText(getBaseContext(), "You have clicked Sign In", Toast.LENGTH_SHORT).show();
	}
	
	public void createBtnClicked(View v) {
		Toast.makeText(getBaseContext(), "You have clicked create", Toast.LENGTH_SHORT).show();
	}
}
