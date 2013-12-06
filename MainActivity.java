package com.example.scrawl;


import java.util.ArrayList;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener  {

	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button boton = (Button) findViewById(R.id.mostrarSgte);
		boton.setOnClickListener(this);
		
		
	}
		
		public void onClick(View arg0) {
			if(arg0.getId()==findViewById(R.id.mostrarSgte).getId()){
				TextView texto1=(TextView)findViewById(R.id.vertexto);
				
		Data dat = new Data();
		ArrayList<Scrawl> dt = dat.getScrawlList();
		
		
		for (Scrawl nota:dt){
			
			
			texto1.setText(nota.s+": "+nota.i);
			}
				
		
			}
		}
			
		
	
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	}
