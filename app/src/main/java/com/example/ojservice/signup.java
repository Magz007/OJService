package com.example.ojservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class signup extends AppCompatActivity
{

    private Button mButton;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        mButton= findViewById(R.id.nextbtn);
        mButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openYourAddress();
            }
        });
    }

 public void    openYourAddress()
 {
     Intent intent= new Intent(this,YourAddress.class);
     startActivity(intent);
 }

}



