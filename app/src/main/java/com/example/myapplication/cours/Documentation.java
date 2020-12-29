package com.example.myapplication.cours;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.myapplication.R;

public class Documentation extends AppCompatActivity {
    private TextView Doc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_documentation);
        Doc= findViewById(R.id.doc);
        Doc.setText("Les Commentaires sont trés importants dans un code python ,et dans n'importe quel autre language ,c'est vrai qu'ils ne sont pas obligatoire ,mais ils ne sont pas du tout inutiles .\nIls nous aident a bien comprendre le code , surtout quand le code est compliqué .\nPour documenter votre code il suffit d'ajouter des commentaires significatifs qui explique ta ligne de code entre un couple de \"\"\".\nDonc ton code sera comme cela:\"\"\" votre code \"\"\"  ");
    }
}