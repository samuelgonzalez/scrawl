package com.example.nuevaaplicacion;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
//import android.util.Log;
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
		Button boton = (Button) findViewById(R.id.activar);
		boton.setOnClickListener(this);
		
		
	}
		
			public void onClick(View arg0) {
				if(arg0.getId()==findViewById(R.id.activar).getId()){
				TextView texto1=(TextView)findViewById(R.id.textView1);
				
		Data tr = new Data();
		ArrayList<Scrawl> td = tr.getScrawlList();
		
		
			for (Scrawl one:td){
			texto1.setText(one.s+": "+one.i);
			}
			
					
		}
		
	}
		
			@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}


	
	}
