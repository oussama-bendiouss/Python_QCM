package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Quisommenous extends AppCompatActivity {
    private Button BretourP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quisommenous);
        BretourP=findViewById(R.id.bretourpre);
        BretourP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pre=new Intent();
                pre.setClass(Quisommenous.this,Principale.class);
                startActivity(pre);
                finish();
            }
        });
    }
}