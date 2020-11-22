package com.example.python_qcm.Controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.python_qcm.R;
import com.google.android.material.textfield.TextInputEditText;

public class MainActivity2 extends AppCompatActivity {
        TextView E21;
        Button B21;
        Button B22;
        Button B23;
        Button B24;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        B21=findViewById(R.id.b21);
        B22=findViewById(R.id.b22);
        B23=findViewById(R.id.b23);
        B24= findViewById(R.id.b24);
        E21 = findViewById(R.id.t21);


    }
}