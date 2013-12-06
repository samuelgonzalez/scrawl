package com.example.subirnota;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener  {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button boton = (Button) findViewById(R.id.button1);
		boton.setOnClickListener(this);
		
		
	}
		
		public void onClick(View arg0) {
			if(arg0.getId()==findViewById(R.id.button1).getId()){
				TextView texto1=(TextView)findViewById(R.id.textView1);
				
		Data dat = new Data();
		ArrayList<Scrawl> dt = dat.getScrawlList();
		
		
		for (Scrawl repite1:dt){
			for (Scrawl repite2:dt){
				for (Scrawl repite3:dt){
			
			texto1.setText(repite1.s+": "+repite1.i+"\n"+repite2.s+": "+repite3.i+"\n"+repite3.s+": "+repite2.i);
			}
				
		
			}
		}
			
		}
		
	}
		
			
	
		

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

//	@Override
	//public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
	
	
	}

