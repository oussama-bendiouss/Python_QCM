package com.example.myapplication.cours;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.myapplication.R;

public class FonctionLambda extends AppCompatActivity {
    private TextView L1;
    private TextView L2;
    private TextView L3;
    private TextView L4;
    private TextView L5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fonction_lambda);
        L1= findViewById(R.id.lambda0);
        L2=findViewById(R.id.titros1);
        L3 = findViewById(R.id.lambda1);
        L4 = findViewById(R.id.lambda3);
        L1.setText("Une fonction lambda est une petite fonction anonyme." +
                "\n" +
                "Elle peut prendre n'importe quel nombre d'arguments, mais ne peut avoir qu'une seule expression."

                );
        L3.setText("\"lambda arguments : expression\"");
        L4.setText("La puissance de lambda est mieux montrée lorsque vous les utilisez comme fonction anonyme dans une autre fonction.\n" +
                "\n" +
                "Supposons que vous ayez une définition de fonction qui prend un argument, et cet argument sera multiplié par un nombre inconnu:\n" +
                "\n" +
                "def myfunc(n):\n" +
                "  return lambda a : a * n\n" +
                "Utilisez cette définition de fonction pour créer une fonction qui double toujours le nombre que vous envoyez");

    }
}