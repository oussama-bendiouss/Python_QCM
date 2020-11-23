package com.example.python_qcm.Controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.python_qcm.Model.Question;
import com.example.python_qcm.Model.questionbank;
import com.example.python_qcm.R;
import com.google.android.material.textfield.TextInputEditText;

public class MainActivity2 extends AppCompatActivity {
       private   TextView E21;
       private  Button B21;
       private  Button B22;
       private Button B23;
       private Button B24;
       private questionbank bquestion;
       private Question questionrecent ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //bquestion= this.genequestion();
        B21=findViewById(R.id.b21);
        B22=findViewById(R.id.b22);
        B23=findViewById(R.id.b23);
        B24= findViewById(R.id.b24);
        E21 = findViewById(R.id.t21);
        B21.getTag(0);
        B22.getTag(1);
        B23.getTag(2);
        B24.getTag(4);
        questionrecent = bquestion.getquestion();
        //this.displayquestion(questionrecent);


    }
}