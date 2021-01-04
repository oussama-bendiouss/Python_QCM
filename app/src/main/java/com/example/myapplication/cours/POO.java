package com.example.myapplication.cours;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.myapplication.R;

public class POO extends AppCompatActivity {
    private TextView POO1;
    private TextView POO2;
    private TextView POO3;
    private TextView POO4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p_o_o);
        POO2 = findViewById(R.id.poo2);
        POO1 = findViewById(R.id.poo1);
        POO3 = findViewById(R.id.poo3);
        POO4 = findViewById(R.id.poo4);
        POO1.setText("C'est le fait de  concevoir notre programme non pas comme un ensemble de fonctions mais en tant qu'ensemble d'objets qui interagissent les uns avec les autres. Chaque objet a un comportement bien à lui et des propriétés spécifiques.\nDans ce cas on parle de methode, attribut, objet.Un objet est une entité qui sert de conteneur à des données et qui contrôle également l'accès à ces dernières.  \n" +
                "\n" +
                "Chaque objet a un ensemble d'attributs (des variables spécifiques à l'objet) et de méthodes (des fonctions qui lui sont propres). Ces attributs et ces méthodes sont spécifiques à l'objet et ne fonctionneront pas s'ils sont appelés sur un autre objet.\nChaque classe commence par le mot \"classe\" suivit du nom de la classe.En plus dans chaque classe il y a une méthode spéciale appeler à chaque initiation d'objet,il s'appele \"un Constructeur\".Ce dernier en générale est soit nommé init soit new , et il est encadrer par double underscore à droite et à gauche ;\"__init__\" où \"__new__\".En plus on peut ajouter d'autre methode qui sont définie de la façon classique, mais on remarque toujours l'existance de l'attribut \"self\" qui fait référence à l'objet lui meme.Voici un exemple:  ");
        POO2.setText("D'abord, avant de rien commencer je propose d'effectuer un diagramme de classe et un diagramme de séquence, car ils sont indisponsable ");
    POO3.setText("En programmation orientée objet, “hériter” signifie “avoir également accès à”. Lorsqu’on dit qu’un objet “hérite” des méthodes de la classe qui l’a défini, cela signifie que l’objet peut utiliser ces méthodes; qu’il y a accès.\n" +
            "\n" +
            "La notion d’héritage va être particulièrement intéressante lorsqu’on va l’implémenter entre deux classes. En Python, nous allons en effet pouvoir créer des “sous-classes” ou des classes “enfants” à partir de classes de base ou classes “parentes”.\n" +
            "\n" +
            "La syntaxe pour définir une sous-classe à partir d’une classe de base est la suivante :");
    POO4.setText("Bon, pour que je sois claire, j'ai pas parler de tous les choses et les conceptes de la POO, car vraiment c'est beaucoup de chose,dans je vous recommande vivement de chercher plus sur ce type de programmation.\nPar exemple, on n'a pas parler des interfaces, encapsulations, (private,protected,public) méthode...et d'autre choses. ");
    }
}