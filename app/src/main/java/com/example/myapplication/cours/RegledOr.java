package com.example.myapplication.cours;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.myapplication.R;

import org.w3c.dom.Text;

public class RegledOr extends AppCompatActivity {
    private TextView ROR;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regled_or);
        ROR = findViewById(R.id.regle);
        ROR.setText("Appelé aussi 'The Zne of Python' ce sont 19 régles ,écritent par Tim Peters en juin 1999, qui influencent le design du langage de programmation Python, et sont utiles pour comprendre et utiliser le langage.  \n\n\n\nLe beau est préférable au laid. - Beautiful is better than ugly.\n" +
                "\n" +
                "L'explicite est préférable à l'implicite. - Explicit is better than implicit.\n" +
                "\n" +
                "Le simple est préférable au complexe. - Simple is better than complex.\n" +
                "\n" +
                "Le complexe est préférable au compliqué. - Complex is better than complicated.\n" +
                "\n" +
                "L'horizontal est préférable à l'imbriqué. - Flat is better than nested.\n" +
                "\n" +
                "L'aéré est préférable au dense. - Sparse is better than dense.\n" +
                "\n" +
                "La lisibilité compte. - Readability counts.\n" +
                "\n" +
                "Les cas spéciaux ne le sont pas assez pour transgresser les règles. - Special cases aren't special enough to break the rules.\n" +
                "\n" +
                "Sauf si le cas pratique bat le cas théorique. - Although practicality beats purity.\n" +
                "\n" +
                "Les erreurs ne devraient jamais arriver silencieusement. - Errors should never pass silently.\n" +
                "\n" +
                "Sauf si on les a explicitement rendues silencieuses. - Unless explicitly silenced.\n" +
                "\n" +
                "En cas de doute, ne tentez pas de deviner. - In the face of ambiguity, refuse the temptation to guess.\n" +
                "\n" +
                "Il devrait y avoir une, et de préférence une seule, manière évidente de le faire. - There should be one - and preferably only one - obvious way to do it\n" +
                "\n" +
                "Même si cette manière peut ne pas sembler évidente au premier abord sauf si vous êtes nééerlandais. - Although that way may not be obvious at first unless you're Dutch.\n" +
                "\n" +
                "Ce qui est fait maintenant est préférable à ce qui ne sera jamais fait. - Now is better than never.\n" +
                "\n" +
                "Même si jamais est souvent mieux que tout de suite. - Although never is often better than right now.\n" +
                "\n" +
                "Si l'implémentation est difficile à expliquer, c'est que c'est une mauvaise idée. - If the implementation is hard to explain, it's a bad idea.\n" +
                "\n" +
                "Si l'implémentation est facile à expliquer, c'est que c'est peut-être une bonne idée. - If the implementation is easy to explain, it may be a good idea.\n" +
                "\n" +
                "Les espaces de noms sont une brillante idée, créons-en plus ! - Namespaces are one honking great idea, let's do more of those!");
    }
}