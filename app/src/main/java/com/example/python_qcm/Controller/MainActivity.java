package com.example.python_qcm.Controller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;

import com.example.python_qcm.R;
import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
       TextInputEditText E1;
       Button B1;
       Button B2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        B1 = findViewById(R.id.b1);
        B2= findViewById(R.id.b2);
        E1 = findViewById(R.id.e1);
        B1.setEnabled(false);
        B2.setEnabled(false);
         E1.addTextChangedListener(new TextWatcher() {
             @Override
             public void beforeTextChanged(CharSequence s, int start, int count, int after) {

             }

             @Override
             public void onTextChanged(CharSequence s, int start, int before, int count) {
                 B1.setEnabled(s.toString().length()!=0);
                 B2.setEnabled(s.toString().length()!=0);

             }

             @Override
             public void afterTextChanged(Editable s) {

             }
         });
         B1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent question_intent= new Intent(MainActivity.this, MainActivity2.class);
                 startActivity(question_intent);
             }
         });
         B2.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 finish();

             }
         });
    }
}