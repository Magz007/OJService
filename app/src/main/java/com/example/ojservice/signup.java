package com.example.ojservice;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.DocumentsContract;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class signup extends AppCompatActivity {
    private static final String TAG = "signup";

    private static final String KEY_FNAME = "fnametxt";
    private static final String KEY_SNAME = "snametxt";
    private static final String KEY_PHONE = "phonrtxt";
    private static final String KEY_EMAIL = "emailregisttxt";
    private static final String KEY_PASSWORD = "passregisttxt";

    private EditText mEditTextFname;
    private EditText mEditTextSname;
    private EditText mEditTextPhone;
    private EditText mEditTextEmail;
    private EditText mEditTextPassword;

    private FirebaseFirestore db = FirebaseFirestore.getInstance();

    private Button mButton;

    FirebaseAuth fAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        mEditTextFname = findViewById(R.id.fnametxt);
        mEditTextSname = findViewById(R.id.snametxt);
        mEditTextPhone = findViewById(R.id.phonrtxt);
        mEditTextEmail = findViewById(R.id.emailregisttxt);
        mEditTextPassword = findViewById(R.id.passregsitxt);
    }


    public void save(View v)
    {
        String fname = mEditTextFname.getText().toString();
        String Sname = mEditTextSname.getText().toString();
        String Phone = mEditTextPhone.getText().toString();
        String Eamil = mEditTextEmail.getText().toString();
        String Password = mEditTextPassword.getText().toString();

        Map<String, Object> note = new HashMap<>();
        note.put(KEY_FNAME, fname);
        note.put(KEY_SNAME, Sname);
        note.put(KEY_PHONE, Phone);
        note.put(KEY_EMAIL, Eamil);
        note.put(KEY_PASSWORD, Password);

        db.collection("User").document("New Users").set(note)

                .addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid)
                    {
                        Toast.makeText(signup.this, "Details Saved", Toast.LENGTH_LONG).show();

                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(signup.this, "Error! Details Not saved", Toast.LENGTH_LONG).show();

                        Log.d(TAG, e.toString());
                    }
                });


    }


}