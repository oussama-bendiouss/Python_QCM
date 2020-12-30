package com.example.myapplication.cours;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.myapplication.R;

public class Package extends AppCompatActivity {
   private TextView PACK;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_package);
        PACK = findViewById(R.id.pack);
        PACK.setText("Quand on a un grand nombre de modules,il peut être intéressant de les organiser dans des dossiers.\nUn dossier qui rassemble des modules est appelé un package (paquetage en français).\nLe nom du package est le même que celui du dossier.Par exemple, on crée un dossier package1 dans lequel on place le fichier module1.py(par exemple).");
    }
}