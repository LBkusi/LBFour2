package com.lb.richardk.lbfour;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;

public class FeedbackActivity extends AppCompatActivity {

    Intent SubmitApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        SubmitApp = new Intent(Intent. ACTION_VIEW);
        final RatingBar ratingBar = findViewById(R.id.RatingratingBar);
        final EditText comment = findViewById(R.id.CommenteditText);

        if (comment.getText().toString().equals(""))
            comment.setError("Please complete");
        else
        {
        final Button submit = (Button) findViewById(R.id.Submitbtn);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String comS = comment.getText().toString();

                Intent i = new Intent(Intent.ACTION_SENDTO);
                i.setData(Uri.parse("mailto:"));
                i.putExtra(Intent.EXTRA_EMAIL, new String[]{"enquiries@localbuzzard.co.uk"});
                i.putExtra(Intent. EXTRA_SUBJECT, comment.getText().toString());

                Intent email = new Intent(Intent.ACTION_SEND);
                email.putExtra(Intent.EXTRA_TEXT, comS);

                email.setType("message/rfc822");
                startActivity(Intent.createChooser(email, "enquiries@localbuzzard.co.uk") );

                SubmitApp.setData(Uri.parse("enquiries@localbuzzard.co.uk"));
                startActivity(SubmitApp);
            }
        });


        final RatingBar Ratingratingbar = (RatingBar) findViewById(R.id.RatingratingBar);


    }

}
}