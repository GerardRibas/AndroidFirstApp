package com.gerardribas;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class FirstAppAndroid extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        final Button showMe = (Button) findViewById(R.id.btnShowMe);
        final TextView nameSurname = (TextView) findViewById(R.id.nameSurname);
        final TextView description = (TextView) findViewById(R.id.description);
        final ImageView myPicture  = (ImageView) findViewById(R.id.myPicture);
        
        showMe.setOnClickListener( new View.OnClickListener() {
			
			public void onClick(View v) {
		        
		        if(nameSurname.isShown()){
			        nameSurname.setVisibility(View.INVISIBLE);
			        description.setVisibility(View.INVISIBLE);
			        myPicture.setVisibility(View.INVISIBLE);
			        showMe.setText(R.string.hideTxtButton);
			    } else {
			        nameSurname.setVisibility(View.VISIBLE);
			        description.setVisibility(View.VISIBLE);
			        myPicture.setVisibility(View.VISIBLE);
			        showMe.setText(R.string.showMeTxtButton);
			    	
			    	

		        }        
			}
		});
    }    
}