package com.example.myapplication.cours;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.myapplication.R;

import org.w3c.dom.Text;

public class BoucleWhile extends AppCompatActivity {
     private TextView BW;
     private TextView BWC;
     private TextView BWT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boucle_while);
        BW = findViewById(R.id.bw);
        BWC=findViewById(R.id.bwc);
        BWT=findViewById(R.id.bwt);

        BW.setText("La boucle while ,(tandis que) , comme son nom l'indique permet de répéter un bloc de code plusieur fois , il se diffère de la boucle for par le fait quel s'exécute jusqu'à atteindre une condition   .Il existe deux stucture qui utilise cette boucle .");
        BWC.setText("la première structure , est la plus simple en utilise :\n while (condition):\n\t\tbloc d'instruction à exécuter \n.Si vous utiliser un compteur comme condition n'oublier pas de le décrémenter sinon vous risquer d'avoir une boucle infini ");
        BWT.setText("Pour cette structure elle est caractérisé par le fait que le bloc d'instruction s'exécute au moins une seule fois, on utilise :\nwhile(True):\n\t\tbloc d'instuction \nMais cette fois-ci le bloc d'instruction contient aubligatoirement un 'break' , soit par un bloc qui contient 'if' pour assurer l'existance de la condition de sortie de la boucle .\n\n\nIl remplace en générale le bloc do-while dans d'autre language ");

    }
}