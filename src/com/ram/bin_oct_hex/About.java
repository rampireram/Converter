package com.ram.bin_oct_hex;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class About extends Activity{
	
	TextView tv1;
	 protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.about);
	        tv1=(TextView)findViewById(R.id.textView1);
	        }
}
