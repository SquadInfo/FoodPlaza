package com.example.passdata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.passdata.constant.APP_CONSTANT;

public class HomeActivity extends AppCompatActivity
{
    TextView sampleDataTextView;
    String sampleData="";
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        sampleData=getIntent().getStringExtra(APP_CONSTANT.KEY_SAMPLE_DATA);

        sampleDataTextView=findViewById(R.id.sampleDataTextView);

        sampleDataTextView.setText(sampleData);
    }
}
