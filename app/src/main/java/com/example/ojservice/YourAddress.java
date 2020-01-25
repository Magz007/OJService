package com.example.ojservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;


public class YourAddress extends AppCompatActivity
{

    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your_address);

        mButton= findViewById(R.id.submitSchbtn);
        mButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openfindschool();
            }
        });

    }
    public void openfindschool()
    {
        Intent intent= new Intent(this,findschool.class);
        startActivity(intent);

    }
}
