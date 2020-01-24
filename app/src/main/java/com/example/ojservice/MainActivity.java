package com.example.ojservice;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.nsd.NsdManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity
{

 private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      mButton= findViewById(R.id.registerbtn);
      mButton.setOnClickListener(new View.OnClickListener()
      {
          @Override
          public void onClick(View v)
          {
              opensignup();
          }
      });

    }


    public void opensignup()
    {

       Intent intent= new Intent(this,signup.class);
       startActivity(intent);
    }
}


