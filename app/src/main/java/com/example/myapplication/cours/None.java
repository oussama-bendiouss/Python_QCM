package com.example.myapplication.cours;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.myapplication.R;

import org.w3c.dom.Text;

public class None extends AppCompatActivity {
    private TextView Tnone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_none);
        Tnone = findViewById(R.id.no);
        Tnone.setText("Le None mot-clé est utilisé pour définir une valeur nulle, ou aucune valeur .\n" +
                "\n" +
                "None n'est identique à 0, False ou une chaîne vide. None est un type de données qui lui est propre (NoneType) et seul None peut être None.\n" +
                "\n");
    }
}