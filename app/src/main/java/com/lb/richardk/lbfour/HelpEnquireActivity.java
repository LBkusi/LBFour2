package com.lb.richardk.lbfour;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class HelpEnquireActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help_enquire);

    }
public void send_click(View v)
{
    EditText email = (EditText) findViewById(R.id.HelpEnquireemaileditText);
    EditText subject = (EditText) findViewById(R.id.ReportSubjecteditText);
    EditText message = (EditText) findViewById(R.id.HelpEnquireBoxeditText);

    if (email.getText().toString().equals(""))
        email.setError("Please complete");
    else if (subject.getText().toString().equals(""))
        subject.setError("Please complete");
    else if (message.getText().toString().equals(""))
        message.setError("Please complete");
    else
    {
        Intent i = new Intent(Intent.ACTION_SENDTO);
        i.setData(Uri.parse("mailto:"));
        i.putExtra(Intent.EXTRA_EMAIL, new String[]{"enquiries@localbuzzard.co.uk"});
        i.putExtra(Intent. EXTRA_SUBJECT, subject.getText().toString());
        i.putExtra(Intent.EXTRA_TEXT, "Dear Local Buzzard, \n"
        +message.getText().toString() + "\n Regards, "
        +email.getText().toString());

        try {
            startActivity(Intent.createChooser(i, "send email"));
        }catch (android.content.ActivityNotFoundException ex)
        {

            Toast.makeText(this, "no mail app found", Toast.LENGTH_SHORT). show();
        }catch (Exception ex)
        {
            Toast.makeText(this, "unexpected error", Toast.LENGTH_SHORT).show();
        }
    }
}
}
