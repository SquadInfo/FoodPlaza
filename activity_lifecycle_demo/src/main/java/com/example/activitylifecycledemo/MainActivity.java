package com.example.activitylifecycledemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    public static final String TAG=MainActivity.class.getName();

    TextView sampleTextView;

    /**
     * use this method to initialize UI component and
     * variables
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sampleTextView=findViewById(R.id.sampleTextView);

        Log.d(TAG, "onCreate: ");
    }

    /**
     * prepare data for UI
     * set Data to the UI
     */
    @Override
    protected void onStart()
    {
        super.onStart();
        Log.d(TAG, "onStart: ");

        sampleTextView.setText("Welcome");
    }

    /**
     * validate data or user permissions
     * show alert to user
     */
    @Override
    protected void onResume()
    {
        super.onResume();
        Log.d(TAG, "onResume: ");

    }

    /**
     * handle the continuety of data flow
     * stop streaming for videos
     *
     */
    @Override
    protected void onPause()
    {
        super.onPause();
        Log.d(TAG, "onPause: ");
        //
    }

    /**
     * release resources
     */
    @Override
    protected void onStop()
    {
        super.onStop();
        Log.d(TAG, "onStop: ");
    }

    /**
     * check and reassign data
     * manage resources
     */
    @Override
    protected void onRestart()
    {
        super.onRestart();
        Log.d(TAG, "onRestart: ");
    }

    /**
     * release everything
     */
    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }
}
