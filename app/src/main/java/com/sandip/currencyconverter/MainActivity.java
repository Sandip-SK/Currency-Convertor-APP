package com.sandip.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static java.lang.Double.parseDouble;

public class MainActivity extends AppCompatActivity {

    public void convertCurrency(View view){
        Log.i("info","Button Pressed");
        EditText dollar = (EditText) findViewById(R.id.editText);
        Log.i("Dollar",dollar.getText().toString());
        Double dol = parseDouble(dollar.getText().toString());
        Double rup = dol*74.44;
        String rupee= String.format("%.2f",rup);
        Log.i("Rupees",rup.toString());
        Toast.makeText(this, "$"+dollar.getText().toString()+" is INR "+rupee, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}