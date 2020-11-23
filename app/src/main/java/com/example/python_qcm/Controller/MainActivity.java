package com.example.python_qcm.Controller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;

import com.example.python_qcm.Model.Question;
import com.example.python_qcm.Model.User;
import com.example.python_qcm.Model.questionbank;
import com.example.python_qcm.R;
import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
       private TextInputEditText E11;
       private Button B11;
       private Button B12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        B11 = findViewById(R.id.b11);
        B12= findViewById(R.id.b12);
        E11 = findViewById(R.id.e11);
        B11.setEnabled(false);
        B12.setEnabled(false);

         E11.addTextChangedListener(new TextWatcher() {
             @Override
             public void beforeTextChanged(CharSequence s, int start, int count, int after) {

             }

             @Override
             public void onTextChanged(CharSequence s, int start, int before, int count) {
                 B11.setEnabled(s.toString().length()!=0);
                 B12.setEnabled(s.toString().length()!=0);

             }

             @Override
             public void afterTextChanged(Editable s) {

             }
         });
         B11.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent question_intent= new Intent(MainActivity.this, mainactivity3.class);
                 startActivity(question_intent);
             }
         });
         B12.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 finish();

             }
         });
    }
}