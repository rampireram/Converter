package com.ram.bin_oct_hex;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;



import android.view.View;
import android.view.View.OnClickListener;


import android.widget.*;

public class MainActivity extends Activity implements OnClickListener{
Button b1;
Button b2;
Button b3;
Button b4;
Button settings;
public int id;
EditText et1;
EditText et2;
EditText et3;
EditText et4;
TextView tv1;
TextView tv2;
TextView tv3;
TextView tv4;
ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.b4);
        iv=(ImageView)findViewById(R.id.imageView1);
        settings=(Button)findViewById(R.id.settings);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        settings.setOnClickListener(this);
        et1=(EditText)findViewById(R.id.editText1);
        et2=(EditText)findViewById(R.id.editText2);
        et3=(EditText)findViewById(R.id.editText3);
        et4=(EditText)findViewById(R.id.editText4);
        
        tv1=(TextView)findViewById(R.id.textView1);
        tv2=(TextView)findViewById(R.id.textView2);
        tv3=(TextView)findViewById(R.id.textView3);
        tv4=(TextView)findViewById(R.id.textView4);
        
        
    }


    
  

	@Override
	public void onClick(View v)throws NumberFormatException {
		// TODO Auto-generated method stub
		String c;
		int a;
		try{
		switch (v.getId()) {
	      case R.id.b1:
	    	 c=et1.getText().toString();
	    a = Integer.parseInt(c,2);
	      et4.setText(Integer.toHexString(a));
	      et3.setText(Integer.toOctalString(a));
	      et2.setText(Integer.toString(a));
	      break;
	case R.id.button2:
		c=et2.getText().toString();
   a = Integer.parseInt(c);
    et4.setText(Integer.toHexString(a));
    et3.setText(Integer.toOctalString(a));
    et1.setText(Integer.toBinaryString(a));
    break;
case R.id.button3:
	c=et3.getText().toString();
a = Integer.parseInt(c,8);
et1.setText(Integer.toBinaryString(a));
et4.setText(Integer.toHexString(a));
et2.setText(Integer.toString(a));
break;
case R.id.b4:
	c=et4.getText().toString();
a = Integer.parseInt(c,16);
et3.setText(Integer.toOctalString(a));
et1.setText(Integer.toBinaryString(a));
et2.setText(Integer.toString(a));
break;
case R.id.settings:
	Intent i = new Intent(this, About.class);
startActivity(i);
break;
}
		}
		
		catch( NumberFormatException ex ) {
			 Toast.makeText(this,"Oops ! There was an Exception..",Toast.LENGTH_LONG).show();
			 }
	 
	
	
	
	}


	


	
    
    
    
    
    
    
    
    
    
}
