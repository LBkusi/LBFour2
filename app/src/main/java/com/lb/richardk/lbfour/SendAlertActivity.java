package com.lb.richardk.lbfour;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class SendAlertActivity extends AppCompatActivity {

    TextView textView;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_alert);

        textView = (TextView) findViewById(R.id.CharacterstextView3);
        editText = (EditText) findViewById(R.id.ObservededitText);


        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String text = editText.getText().toString();
                text = text.replace("\n", " ");
                String[] textArray = text.split(" ");
                textView.setText("Words: " + textArray.length);


            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        Spinner mySpinner = (Spinner) findViewById(R.id.Subjectspinner2);

        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(SendAlertActivity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.Subject));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);

    }
}

