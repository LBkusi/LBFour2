package com.lb.richardk.lbfour;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity implements View.OnClickListener {

    private EditText EmaileditText;
    private EditText PasswordeditText;
    private Button Loginbtn;
    private Button Registernowbutton;
    private TextView ForgotPassword;
    private TextView HomeTV;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final TextView ForgotPassword = (TextView) findViewById(R.id.ForgotPdtextView);
        ForgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), ForgotPasswordActivity.class);
                startActivity(startIntent);
            }
        });

        final TextView hometv = (TextView) findViewById(R.id.HometextView);
        hometv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), HomeActivity.class);
                startActivity(startIntent);
            }
        });

        Button registernow = (Button)findViewById(R.id.RegisterNowbtn);
        registernow.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), RegisterActivity.class);
                startActivity(startIntent);
            }
        });

        EmaileditText = (EditText) findViewById(R.id.EmaileditText);
        PasswordeditText = (EditText) findViewById(R.id.PasswordeditText);

        Loginbtn = (Button) findViewById(R.id.Loginbtn);

        Loginbtn.setOnClickListener(this);


    }
    @Override
    public void onClick(View v) {


    }
}



