package com.example.test1;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends Activity {

	EditText et1;
	CheckBox chk1,chk2;
	RadioButton rb1,rb2;
	Button b1;
	String s;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		et1 = (EditText)findViewById(R.id.editText1);
		chk1 = (CheckBox)findViewById(R.id.checkBox1);
		chk2 = (CheckBox)findViewById(R.id.checkBox2);
		rb1 = (RadioButton)findViewById(R.id.radioButton1);
		rb2 = (RadioButton)findViewById(R.id.radioButton2);
		b1 = (Button)findViewById(R.id.button1);
		
		
	}
	
	public void eventHand(View v)
	{
b1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				s = "Welcome user : "+et1.getText().toString();
	
			if(chk1.isChecked() && chk2.isChecked())
			{
				s += " "+"Languages Known:" +chk1.getText().toString()+" and "+chk2.getText().toString();
			}
				
			else if(chk1.isChecked() && !(chk2.isChecked()))
			{
				s += " "+"Languages Known:" +chk1.getText().toString();

			}
			else if(chk2.isChecked() && !(chk1.isChecked()))
			{
				s += " "+"Languages Known:" +chk2.getText().toString();

			}
			else
			{
				s += " "+"Languages Known :"+"NIL" ;
			}
			
			if(rb1.isChecked() )
			{
				s += " "+"Gender :" +rb1.getText().toString();
			}
				
			
			else
			{
				s += " "+"Gender :" +rb2.getText().toString();
			}
			
			Toast.makeText(MainActivity.this,s,3000).show();
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
