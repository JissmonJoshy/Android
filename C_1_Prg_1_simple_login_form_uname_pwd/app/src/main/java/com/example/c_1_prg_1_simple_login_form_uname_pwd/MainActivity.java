package com.example.c_1_prg_1_simple_login_form_uname_pwd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String username="jissmon";
    String pwd="1234";
    EditText uname,pass;
    Button logBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        logBtn=findViewById(R.id.login);
        uname=findViewById(R.id.username);
        pass=findViewById(R.id.pwd);
        logBtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                String Unames=uname.getText().toString();
                String Passw=pass.getText().toString();
                if(Unames.equals(username)&& Passw.equals(pwd)){
                    Toast.makeText(MainActivity.this,"Login succesfull",
                            Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this,"Invalid creditails",
                            Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}