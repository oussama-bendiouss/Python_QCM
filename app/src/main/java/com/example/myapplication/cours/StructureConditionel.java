package com.example.myapplication.cours;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.myapplication.R;

public class StructureConditionel extends AppCompatActivity {
    private TextView Condi;
    private TextView EXCO;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_structure_conditionel);
        Condi = findViewById(R.id.stcondi);
        EXCO= findViewById(R.id.excondi);
        Condi.setText("Une structure conditionnelle permet d’exécuter une séquence d’instructions seulement dans le cas où une condition est vraie. Si par exemple, une variable est positive, deux textes sont identiques, un booléen est faux,…\n\n" +
                "Vous direz maintenant, c'est quoi cette magique condition🤔, tout simplement, une condition (ou prédicat) est une expression logique : le résultat de son évaluation est un booléen True ou False ..\n" +
                "Il est possible de comparer des nombres ou des textes avec les opérateurs de comparaison : ==, != , <, >, <=, >= .En plus, on peut s'assurer de l'existence d'un élément dans une liste ou chaîne de caractère et la considérer comme une condition.\n" +
                "Bref, il y a 3 structures :\n" +
                "\n" +
                "if, if\\else, if\\elif\\else. Voici un exemple explicatif :");
        EXCO.setText("a = 5\n" +
                "if a > 0:     # Si a est supérieur à 0\n" +
                "   print(\"a est supérieur à 0\")\n" +
                "elif a < 0:   # Si a est inférieur à 0\n" +
                "   print(\"a est inférieur à 0\")\n" +
                "else:         # Sinon\n" +
                "   print(\"a est nul\")");
    }
}