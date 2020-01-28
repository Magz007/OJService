package com.example.ojservice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import static com.example.ojservice.R.menu.user_menu;

public class user_profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);

        Toolbar toolbar =findViewById(R.id.maintoolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(user_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch (item.getItemId())
        {
            case R.id.myprofile:
                Toast.makeText(this, "My Profile ", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.myaccount:
                Toast.makeText(this, "My Account ", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.myaddress:
                Toast.makeText(this, "My Address ", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.myschool:
                Toast.makeText(this, "My School ", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.sign_out:
                Toast.makeText(this, "Sign-Out", Toast.LENGTH_SHORT).show();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
