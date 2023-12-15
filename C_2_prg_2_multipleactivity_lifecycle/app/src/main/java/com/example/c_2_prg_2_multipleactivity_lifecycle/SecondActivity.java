package com.example.c_2_prg_2_multipleactivity_lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d("SecondActivity", "onCreate");
    }


    @Override
    protected void onStart(){
        super.onStart();
        Log.d("SecondActivity","onStart");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.d("SecondActivity","onResume");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.d("SecondActivity","onPause");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.d("SecondActivity","onStop");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("SecondActivity","onDestroy");
    }
    }
