package com.example.practise;
import com.example.practise.R;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.*;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		 EditText medit = (EditText)findViewById(R.id.name);     
		 User user=new User();
		 user.getInformation(medit.getText().toString());
		 user.postInformation();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void setIncidentType(View v){
		
		Button button = (Button) v;
//		System.out.println(button.ge);
		
	}
	
	


}
