package com.example.myapplication.cours;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.myapplication.R;

import org.w3c.dom.Text;

public class Bouclefor extends AppCompatActivity {
   private TextView BF;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bouclefor);
        BF = findViewById(R.id.bf);
        BF.setText("la boucle 'for',elle aussi comme la boucle 'while' ,permet de réaliser de nombreuses  itérations d'un bloc d'instruction ,en d'autres termes plus claires ,elle permet de répéter un bloc de code , aussi elle dite borné car on sait le nombre exacte d'itération .\n\nElle peut itérer sur tout variable donner aprés son compteur (liste , chaine de caractère...).\n\n\nLa structure générale est la suivante :\n\n\nfor element in (sequence):\n\t\t\tbloc à répéter   ");
        BF.setTextSize(20);
    }
}