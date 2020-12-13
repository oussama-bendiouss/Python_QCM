package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.cours.Liste;

public class Cours extends AppCompatActivity {
    public final static String MESSAGE_KEY = "ganeshannt.senddata.message_key";
    private Button L1;
    private Button L2;
    private Button L3;
    private Button L4;
    private Button L5;
    private Button L6;
    private Button L7;
    private Button L8;
    private Button L9;
    private Button L10;
    private Button L11;
    private Button L12;
    private Button L13;
    private Button L14;
    private Button L15;
    private Button L16;
    private Button L17;
    private Button L18;
    private Button L19;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cours);
        L1 = findViewById(R.id.bc1);
        L2 = findViewById(R.id.bc2);
        L3 = findViewById(R.id.bc3);
        L4 = findViewById(R.id.bc4);
        L5 = findViewById(R.id.bc5);
        L6 = findViewById(R.id.bc6);
        L7 = findViewById(R.id.bc7);
        L8 = findViewById(R.id.bc8);
        L9 = findViewById(R.id.bc9);
        L10 = findViewById(R.id.bc10);
        L11 = findViewById(R.id.bc11);
        L12 = findViewById(R.id.bc12);
        L13 = findViewById(R.id.bc13);
        L14 = findViewById(R.id.bc14);
        L15 = findViewById(R.id.bc15);
        L16 = findViewById(R.id.bc16);
        L17 = findViewById(R.id.bc17);
        L18 = findViewById(R.id.bc18);
        L19 = findViewById(R.id.bc19);
        L1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent liste = new Intent();
                liste.setClass(Cours.this, Liste.class);
                startActivity(liste);

            }
        });
    }
}