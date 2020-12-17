package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.cours.BoucleWhile;
import com.example.myapplication.cours.Bouclefor;
import com.example.myapplication.cours.Dictionnaire;
import com.example.myapplication.cours.Documentation;
import com.example.myapplication.cours.FonctionLambda;
import com.example.myapplication.cours.Liste;
import com.example.myapplication.cours.Math;
import com.example.myapplication.cours.Matplotlib;
import com.example.myapplication.cours.None;
import com.example.myapplication.cours.Numpy;
import com.example.myapplication.cours.POO;
import com.example.myapplication.cours.Package;
import com.example.myapplication.cours.Recursion;
import com.example.myapplication.cours.RegledOr;
import com.example.myapplication.cours.String;
import com.example.myapplication.cours.StructureConditionel;
import com.example.myapplication.cours.Test;
import com.example.myapplication.cours.Tuple;

public class Cours extends AppCompatActivity {

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
        L2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent string = new Intent();
               string.setClass(Cours.this, String.class);
                startActivity(string);
            }
        });
        L3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dictio = new Intent();
                dictio.setClass(Cours.this, Dictionnaire.class);
                startActivity(dictio);
            }
        });
        L4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent numpy= new Intent();
                numpy.setClass(Cours.this, Numpy.class);
                startActivity(numpy);

            }
        });
        L5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent math = new Intent();
                math.setClass(Cours.this, Math.class);
                startActivity(math);
            }
        });
        L6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent matplotlib = new Intent();
                matplotlib.setClass(Cours.this, Matplotlib.class);
                startActivity(matplotlib);

            }
        });
        L7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent boucleFor = new Intent();
                boucleFor.setClass(Cours.this, Bouclefor.class);
                startActivity(boucleFor);

            }
        });
        L8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bouclewhile = new Intent();
                bouclewhile.setClass(Cours.this, BoucleWhile.class);
                startActivity(bouclewhile);
            }
        });
        L9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent stcondi= new Intent();
               stcondi.setClass(Cours.this, StructureConditionel.class);
               startActivity(stcondi);
            }
        });
        L10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fctlambda = new Intent();
                fctlambda.setClass(Cours.this, FonctionLambda.class);
                startActivity(fctlambda);

            }
        });
        L11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent poo= new Intent();
                poo.setClass(Cours.this, POO.class);
                startActivity(poo);


            }
        });
        L12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent documentation = new Intent();
                documentation.setClass(Cours.this, Documentation.class);
                startActivity(documentation);
            }
        });
        L13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tuple= new Intent();
                tuple.setClass(Cours.this, Tuple.class);
                startActivity(tuple);

            }
        });
        L14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rec = new Intent();
                rec.setClass(Cours.this, Recursion.class);
                startActivity(rec);

            }
        });
        L15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent test = new Intent();
                test.setClass(Cours.this, Test.class);
                startActivity(test);


            }
        });
        L16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent none = new Intent();
                none.setClass(Cours.this, None.class);
                startActivity(none);
            }
        });
        L17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pack = new Intent();
                pack.setClass(Cours.this, Package.class);
                startActivity(pack);
            }
        });
        L18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent regle_or = new Intent();
                regle_or.setClass(Cours.this, RegledOr.class);
                startActivity(regle_or);
            }
        });
        L19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               finish();
            }
        });
    }
}