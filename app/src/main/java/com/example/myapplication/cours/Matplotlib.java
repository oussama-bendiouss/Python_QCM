package com.example.myapplication.cours;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.TextView;

import com.example.myapplication.R;

public class Matplotlib extends AppCompatActivity {

    private TextView NUMP;
    private TextView FUNNUMP;
    private TextView TBM;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matplotlib);
        NUMP = findViewById(R.id.tmatplot);
        FUNNUMP = findViewById(R.id.funnumpy);
        TBM = findViewById(R.id.basematplot);

        NUMP.setText("matplotlib est une bibliothèque Python capable de produire des graphes de qualité. matplotlib peut être utilisé dans des scripts Python, le shell Python et IPython, le notebook Jupyter, des serveurs d’application web et dans quatre outils d’interface graphique.\n" +
                "Il permet de générer des graphes, histogrames, des spectres de puissance (lié à la transformée de Fourier), des graphiques à bares, des graphiques d’erreur, des nuages de dispersion, etc… en quelques lignes de code.\n"
              +
                "Pour des graphiques simples, le module matplotlib.pyplot fournit une interface comme MATLAB spécialement adaptée avec IPython.\nIl est généralement utiliser avec le module \"numpy\".Voici un example");
        FUNNUMP.setText("Je ne parlerai pas ici de tout les cas possibles ,si vous etes intéréssé par un tel graphe, une petit recherche sur le site de python et vous le trouvez 😁.\nCe que je veux ajouter, c'est explication des fonctions de base. ");
        TBM.setText("-plt.plot(X,f(X),label='' #pour dessiner votre graphe \n-plt.show() #pour afficher le graphe \n-plt.grid() #dessiner les grilles \n-xlabel('nom d'axe des abscisses ') et ylabel('nom d'axe des ordonnés')\n\nSinon je vous propose de visiter la documentation de cette bibliothéque avant de l'utiliser ");
    }
}