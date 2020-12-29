package com.example.myapplication.cours;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.myapplication.R;

import org.w3c.dom.Text;

public class Test extends AppCompatActivity {
    private TextView TEST;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        TEST = findViewById(R.id.test);
        TEST.setText("Les tests sont un élément essentiel dans tout langage informatique si on veut s'assurer des performances de notre codes.Le point faible du test c'est qu'il ne traite pas tout les cas possibles.\nIl existe plusieurs méthode pour faire un test : Unittest , Doctest,py.test.....\nDans ce cours on va parler de \"Docstring\".En gros, en prévoie quelque résultat attendu de nore fonction et on les compare avec se qu'on a obtenue.\nVoici un exemeple :\n\n\n\ndef fact(n):\n" +
                "    \"\"\"\n" +
                "        paramètre n : (int) un entier\n" +
                "        valeur renvoyée : (int) la factorielle de n.\n" +

                "    Exemples :\n" +
                "\n" +
                "    >>> fact(3)\n" +
                "    6\n" +
                "    >>> fact(5)\n" +
                "    120\n" +
                "    \"\"\"\n" +
                "    res = 1\n" +
                "    for i in range(2, n + 1):\n" +
                "       res = res * i\n" +
                "    return res "+"\n\n\nDonc la fonction sera exécuter en comparant les résultats de fact(3) et fact(5)avec les valeurs donnés dans le docstring .");
   TEST.setTextSize(15);
    }
}