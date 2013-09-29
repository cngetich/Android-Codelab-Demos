package com.example.hellogdg;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	EditText amount1;
	EditText amount2;
	TextView sumResult;

	Button calculate;

	double x = 0;
	double y = 0;
	double z = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		addTheNumbers();
	}

	private void addTheNumbers() {
		// TODO Auto-generated method stub
		amount1 = (EditText) findViewById(R.id.amount1);
		amount2 = (EditText) findViewById(R.id.amount2);
		calculate = (Button) findViewById(R.id.addBtn);
		sumResult = (TextView) findViewById(R.id.sumResult);

		calculate.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				System.out.println("Inside onClick");
				addition();
			}

			private void addition() {
				// TODO Auto-generated method stub
				System.out.println("Inside Addition:" + x + "and" + y);
				x = Double.parseDouble(amount1.getText().toString());
				y = Double.parseDouble(amount2.getText().toString());
				z = x + y;
				System.out.println("Result:" + z);
				sumResult.setText(Double.toString(z));
			}
		});

	}

}







