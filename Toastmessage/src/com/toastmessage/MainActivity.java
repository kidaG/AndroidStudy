package com.toastmessage;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import com.toastmessage.R;
import android.view.View;
import android.view.View.*;
import android.widget.Button;
import android.widget.*;


public class MainActivity extends Activity {

	private Button button;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		button = (Button) findViewById(R.id.buttonToast11);
		 
		button.setOnClickListener(new OnClickListener() {
 
			  @Override
			  public void onClick(View arg0) {
 
			     Toast.makeText(getApplicationContext(), 
                               "Text is clicked and ", Toast.LENGTH_LONG).show();
 
			  }
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
