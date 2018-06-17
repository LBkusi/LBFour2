package com.lb.richardk.lbfour;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Spinner;

public class VehicleActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicle);

        Button registerbtn1 = (Button)findViewById(R.id.Registerbtn1);
        registerbtn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent startIntent= new Intent(getApplicationContext(), HomeActivity.class);
                startActivity(startIntent);
            }
        });

        AutoCompleteTextView autoCompleteTextView;
        String [] Enter_Borough;

        Spinner mySpinner = (Spinner) findViewById(R.id.MakeSpinner1);

        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(VehicleActivity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.names));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);

        autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.Borough);
        Enter_Borough = getResources().getStringArray(R.array.Enter_Borough);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,Enter_Borough);
        autoCompleteTextView.setAdapter(adapter);


    }

}
