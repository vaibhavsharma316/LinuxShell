package com.example.linuxshell;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
TextView result;
Button go;
EditText commands;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	commands=(EditText)findViewById(R.id.commands);
	go=(Button)findViewById(R.id.click);
	result=(TextView)findViewById(R.id.res);
	
	
	go.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			ShellExecuter exe=new ShellExecuter();
			
			
			
			result.setText(exe.response(commands.getText().toString()));
			
			
			
		}
	});
	
	
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
