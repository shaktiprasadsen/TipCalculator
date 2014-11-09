package com.shaktiprasadsen.TipCalculator;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.commons.io.FileUtils;

import com.shaktiprasadsen.TipCalculator.R;

import android.R.anim;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

public class TipCalculator extends Activity {
	
    ArrayList<String> items;
    ArrayAdapter<String> itemsAdapter;
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
    	setContentView(R.layout.activity_tip_calculator);

    }
    
    public void btn10pClick(View view) {
    	EditText enteredAmount = (EditText) findViewById(R.id.etEnteredAmount);
    	TextView tipAmount = (TextView) findViewById(R.id.tvTipText);
    	
       	String str = enteredAmount.getText().toString();
       	if(str.length() > 0) {
       		String calcTip = calculateTip(str, 10);
       		tipAmount.setText(calcTip);
       	}
       	else
       		tipAmount.setText("0.00");
    	
    }

    public void btn15pClick(View view) {
    	EditText enteredAmount = (EditText) findViewById(R.id.etEnteredAmount);
    	TextView tipAmount = (TextView) findViewById(R.id.tvTipText);
    	
       	String str = enteredAmount.getText().toString();
       	if(str.length() > 0) {
       		String calcTip = calculateTip(str, 15);
       		tipAmount.setText(calcTip);
       	}
       	else
       		tipAmount.setText("0.00");
    	
    }
    
    public void btn20pClick(View view) {
    	EditText enteredAmount = (EditText) findViewById(R.id.etEnteredAmount);
    	TextView tipAmount = (TextView) findViewById(R.id.tvTipText);
    	
       	String str = enteredAmount.getText().toString();
       	if(str.length() > 0) {
       		String calcTip = calculateTip(str, 20);
       		tipAmount.setText(calcTip);
       	}
       	else
       		tipAmount.setText("0.00");
    }
	private String calculateTip(String str, int percentage) {
		double tipAmount = Double.parseDouble(str) * percentage / 100;
		return "" + tipAmount;
	}
	
	
}
