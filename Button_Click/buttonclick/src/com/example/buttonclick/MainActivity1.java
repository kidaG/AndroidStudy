package com.example.buttonclick;

import android.app.Activity;
//import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import com.example.buttonclick.R;
import android.view.View.OnClickListener;

public class MainActivity1 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activity1);
		
        addListenerOnButton();

	}

	public void addListenerOnButton() {
        Button button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new OnClickListener() {

        	@Override
        	            public void onClick(View view) {     	 
        	              Intent openBrowser =  new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.co.in"));
        
        	              startActivity(openBrowser);
        	
        	            }
        	
        	 
        	
        	        });
        	
        	 
        	
        	    }

  
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_activity1, menu);
		return true;
	}

	
}
