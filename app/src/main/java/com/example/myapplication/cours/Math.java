package com.example.myapplication.cours;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.myapplication.R;

public class Math extends AppCompatActivity {
    private TextView MATH;
    private TextView EXMA;
    private TextView IMP;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math);
        MATH = findViewById(R.id.math);
        EXMA = findViewById(R.id.exmath);
        IMP = findViewById(R.id.importe);
        MATH.setText("D’abord, qu’est-ce qu’un module ? Il s’agit d’une sorte de bibliothèque (un regroupement de fonctions prédéfinies) qui une fois importée permet d’accéder à de nouvelles fonctions. Il en existe beaucoup. On peut citer :" +
                "\n" +
                "-le module turtle qui permet de réaliser des dessins géométriques,\n" +
                "-le module numpy qui permet de faire du calcul scientifique,\n" +
                "-le module sympy qui permet de faire du calcul formel,\n" +
                "-le module matplotlib qui permet de faire des graphiques en tout genre.\n" +
                "Vous direr maintenant pourquoi tout ces explications 😒 , tout simplement car \"math\" de quoi en parle est un module.\nC’est un module qui permet d’avoir accès aux fonctions mathématiques comme le cosinus (cos), le sinus (sin), la racine carrée (sqrt), le nombre \\pi (pi) et bien d’autres...Voici un example: ");
        EXMA.setText(">>> from math import *  # importation du module\n" +
                ">>> cos(pi)             # cosinus d'un angle en radian\n" +
                "-1.0\n" +
                ">>> sqrt(25)            # racine carrée\n" +
                "5.0");
      IMP.setText("J'ai oublié un truc, la première phrase dans l'example est pour importer le module math, pourtant on peut importer une fonction de ce module,ou bien on peut l'importer avec d'autre manière[import math as mp...]");
    }
};