package com.lb.richardk.lbfour;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class AccountActivity extends AppCompatActivity {

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);


        Button privacybutton = (Button)findViewById(R.id.Privacybutton);
        privacybutton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), PrivacyActivity.class);
                startActivity(startIntent);
            }
        });

        Button addvehiclebutton2 = (Button)findViewById(R.id.AddVehiclebutton2);
        addvehiclebutton2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), AddVehicleActivity.class);
                startActivity(startIntent);
            }
        });

        Button updatedetailsbutton4 = (Button)findViewById(R.id.UpdateDetailsbutton4);
        updatedetailsbutton4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), UpdateDetailsActivity.class);
                startActivity(startIntent);
            }
        });

        Button sentreceivedalertsbutton5 = (Button)findViewById(R.id.SentReceivedAlertsbutton5);
        sentreceivedalertsbutton5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), SentReceivedActivity.class);
                startActivity(startIntent);
            }
        });

        Button changepasswordbutton3 = (Button)findViewById(R.id.ChangePasswordbutton3);
        changepasswordbutton3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), ChangePasswordActivity.class);
                startActivity(startIntent);
            }
        });

    }
}
