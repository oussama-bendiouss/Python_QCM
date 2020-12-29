package com.example.myapplication.cours;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.myapplication.R;

public class Tuple extends AppCompatActivity {
    private TextView TUPLE;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuple);
    TUPLE = findViewById(R.id.tuple);
    TUPLE.setText("A partir des types de base (int, float, etc.), il est possible d’en élaborer de nouveaux. On les appelle des types construits.\n" +
            "\n" +
            "Un exemple de type construit est le tuple. Il permet de créer une collection ordonnée de plusieurs éléments. En mathématiques, on parle de p-uplet. Par exemple, un quadruplet est constitué de 4 éléments.\n" +
            "\n" +
            "Les tuples ressemblent aux listes, mais on ne peut pas les modifier une fois qu’ils ont été créés.\n" +
            "\n" +
            "On dit qu’un tuple n’est pas mutable.\n" +
            "\n" +
            "On le définit avec des parenthèses.\n\n\n tuple = ()");
    TUPLE.setTextSize(15);
    }
}