package com.example.subirnota;

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
		Button boton = (Button) findViewById(R.id.boton);
		boton.setOnClickListener(this);
	}
		
	Data data = new Data();
	ArrayList<Scrawl> dto = data.getScrawlList();
	public void onClick(View arg0) {
			if(arg0.getId()==findViewById(R.id.boton).getId()){
				TextView tex=(TextView)findViewById(R.id.listt);
		for (Scrawl elemento1:dto){
			tex.setText(elemento1.s+": "+elemento1.i+"" );
			
			for (Scrawl elemento2:dto){
				tex.setText(elemento2.s+": "+elemento2.i+"" );
				
				for (Scrawl elemento3:dto){
					tex.setText(elemento3.s+": "+elemento3.i+"" );
			}
			}
		}
			
		}	
	}
	
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}	
	
	}