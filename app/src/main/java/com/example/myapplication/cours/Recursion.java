package com.example.myapplication.cours;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.myapplication.R;

public class Recursion extends AppCompatActivity {
    private TextView REC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recursion);
        REC = findViewById(R.id.rec);
        REC.setText("Un algorithme est dit récursif si, à un moment, il s'appelle lui-même. Pour mieux comprendre, prenons le cas de la fonction récursive car c'est l'application de la récursivité la plus courante et que c'est celle que nous utiliserons par la suite. Par conséquent, une fonction récursive est une fonction qui s'auto-appelle. Voici un petit exemple :\n" +
                "\n" +
                "def f(x):\n" +
                "    x = 2 * x\n" +
                "    f(x)\n" +
                "    return x\n\n" +
                "Nous voyons bien que la fonction f s'appelle elle même à la ligne 3. En réalité, voilà comment l'ordinateur agit :\n" +
                "\n" +
                "def f(x):\n" +
                "    x = 2 * x\n" +
                "        x = 2 * x\n" +
                "            x = 2 * x\n" +
                "                x = 2 * x\n" +
                "                    x = 2 * x\n" +
                "                        ...\n" +
                "    return x"+"\n\n\n il est parfois indispensable , vous allez le rencontrer de plus dans les algorithmes de tri ");
    }
}