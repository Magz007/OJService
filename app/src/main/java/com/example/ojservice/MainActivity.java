package com.example.ojservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{

    private Button mbutton;
    private  Button mbutton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mbutton = findViewById(R.id.registerbtn);
        mbutton1= findViewById(R.id.mainLogin);

        mbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensignup();
            }
        });
        mbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openlogin();
            }
        });
    }

    public void opensignup()
    {
        Intent intent = new Intent(this, signup.class);
        startActivity(intent);
    }
    public void openlogin()
    {
        Intent intent = new Intent(this, login.class);
        startActivity(intent);

    }
}

