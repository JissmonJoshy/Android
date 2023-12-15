package com.example.c_2_prg_2_multipleactivity_lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity","onCreate");
        btn=findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);

            }
        });
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.d("MainActivity","onStart");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.d("MainActivity","onResume");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.d("MainActivity","onPause");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.d("MainActivity","onStop");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("MainActivity","onDestroy");
    }
}

