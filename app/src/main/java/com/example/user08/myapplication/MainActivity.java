package com.example.user08.myapplication;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Stage", "onCreate");
        if (getSupportFragmentManager().findFragmentByTag("Tag") == null) {
            getSupportFragmentManager().beginTransaction().add(R.id.container, new TestFragment(), "Tag").commit();
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Stage", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Stage", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Stage", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Stage", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Stage", "onDestroy");
    }
}
