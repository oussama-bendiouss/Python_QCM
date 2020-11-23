package com.example.python_qcm.Controller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;

import com.example.python_qcm.Model.User;
import com.example.python_qcm.R;
import com.google.android.material.textfield.TextInputEditText;

public class mainactivity3 extends AppCompatActivity {
    private TextInputEditText E31;
    private Button B31;
    private Button B32;
    private User uti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        uti=new User();
        E31 = findViewById(R.id.e31);
        B31=findViewById(R.id.b31);
        B32= findViewById(R.id.b32);
        B31.setEnabled(false);
        B32.setEnabled(false);
        E31.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                B31.setEnabled(s.toString().length()!=0);
                B32.setEnabled(s.toString().length()!=0);

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        B31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String finame=E31.getText().toString();
                uti.setPrenom(finame);
                Intent qst=new Intent(mainactivity3.this,MainActivity2.class);
                startActivity(qst);
                finish();
            }
        });
        B32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }
}