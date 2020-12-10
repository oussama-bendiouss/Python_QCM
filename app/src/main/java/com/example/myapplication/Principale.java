package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.controller.MainActivity;

public class Principale extends AppCompatActivity {
    private Button Bp1;
    private Button Bp2;
    private Button Bp3;
    private Button Bp4;
    private Button Bp5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principale);
        Bp1 = findViewById(R.id.bp1);
        Bp2=findViewById(R.id.bp2);
        Bp3=findViewById(R.id.bp3);
        Bp4=findViewById(R.id.bp4);
        Bp5=findViewById(R.id.bp5);
        Bp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent();
                i1.setClass(Principale.this, MainActivity.class);
                startActivity(i1);
                finish();
            }
        });
        Bp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cours=new Intent();
                cours.setClass(Principale.this,Cours.class);
                startActivity(cours);

            }
        });
     Bp3.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent i2=new Intent();
             i2.setClass(Principale.this,Quisommenous.class);
             startActivity(i2);
             finish();

         }
     });
     Bp4.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent moi= new Intent();
             moi.setClass(Principale.this,ContatUs.class);
             startActivity(moi);
             finish();

         }
     });
     Bp5.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             finish();
         }
     });
    }
}