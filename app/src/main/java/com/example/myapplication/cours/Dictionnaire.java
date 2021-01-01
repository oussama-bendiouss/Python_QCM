package com.example.myapplication.cours;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.myapplication.R;

public class Dictionnaire extends AppCompatActivity {
    private TextView DIC;
    private TextView EX1;
    private TextView DIC2;
    private TextView DIC3;
    private TextView DIC4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dictionnaire);
        EX1 = findViewById(R.id.ex1);
        DIC = findViewById(R.id.dictio);
        DIC2  =findViewById(R.id.dic2);
        DIC3 = findViewById(R.id.newdic);
        DIC4 = findViewById(R.id.dic4);
        DIC.setText("Avant d'oublier, le dictionnaire est exempel de type construit .\nBon,les éléments d’une liste ou d’un tuple sont ordonnés et on accéde à un élément grâce à sa position en utilisant un numéro qu’on appelle l’indice de l’élément.\n" +
                "\n" +
                "Un dictionnaire en Python va aussi permettre de rassembler des éléments mais ceux-ci seront identifiés par une clé. On peut faire l’analogie avec un dictionnaire de français où on accède à une définition avec un mot.\n" +
                "\n" +
                "Contrairement aux listes qui sont délimitées par des crochets, on utilise des accolades pour les dictionnaires.Voici un exempel : ");
    EX1.setText("mon_dictionnaire = {\"voiture\": \"véhicule à quatre roues\", \"vélo\": \"véhicule à deux roues\"}");
    DIC2.setText("Il est très facile d’ajouter un élément à un dictionnaire. Il suffit d’affecter une valeur pour la nouvelle clé.\n\n\tmon_dictionnaire[\"tricycle\"] = \"véhicule à trois roues\"\n\nIl est possible de créer un dictionnaire avec des accolades qui entourent les éléments. Une autre approche possible consiste à créer un dictionnaire vide et à ajouter les éléments au fur et à mesure.\n\nnombre_de_pneus = {}\n" +
            "nombre_de_pneus[\"voiture\"] = 4\n" +
            "nombre_de_pneus[\"vélo\"] = 2\n\n");
    DIC3.setText("\nnombre_de_roues = {\"voiture\": 4, \"vélo\": 2, \"tricycle\": 3}\n " +

            "for i in nombre_de_roues.items():\n" +
            "    print(i)\n");
    DIC4.setText("\n('voiture', 4)\n" +
            "('vélo', 2)" +"\n" +
            "('tricycle', 3) ");
    }
}