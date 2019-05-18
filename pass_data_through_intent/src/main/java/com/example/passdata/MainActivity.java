package com.example.passdata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.passdata.constant.APP_CONSTANT;

public class MainActivity extends AppCompatActivity
{
    EditText sampleDataEditText;
    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sampleDataEditText =findViewById(R.id.sampleDataEditText);
        submitButton =findViewById(R.id.submitButton);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String textData=sampleDataEditText.getText().toString();

                Intent intent=new Intent(MainActivity.this,HomeActivity.class);
                intent.putExtra(APP_CONSTANT.KEY_SAMPLE_DATA,textData);
                //if you want to pass huge amount of data then,
                // you must use database, files
                // if you have camera image in first activity then pass
                //URI path to the next activity
                //If you don't want to pass anything but
                // want to access it from another activity
                // then go for sharedPreference
                startActivity(intent);
            }
        });


    }
}
