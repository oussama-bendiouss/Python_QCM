package com.example.myapplication.cours;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.myapplication.R;

public class Numpy extends AppCompatActivity {
    private TextView Num;
    private TextView PI;
    private TextView TAB;
    private TextView ARR;
    private TextView LIN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numpy);
        Num = findViewById(R.id.num);
        PI = findViewById(R.id.pi);
        TAB = findViewById(R.id.tableau);
        ARR = findViewById(R.id.arrange);
        LIN = findViewById(R.id.linspace);
        Num.setText("La bibliothèque NumPy permet d’effectuer des calculs numériques avec Python. Elle introduit une gestion facilitée des tableaux de nombres.\n" +
                "\n" +
                "Il faut au départ importer le package numpy avec l’instruction suivante :\n" +
                "\n" +
                "import numpy as np\n\nBon, pour qu'on soit claire et honnête, on ne peut pas traiter tout ce qui a dans la bibliothèque Numpy parce qu'il est très grande, en gros ce que vous devez savoir, c'est qu'on utilise plus avec ces tableaux, en effet les tableaux de Numpy (array) , utilisé avec leur fonction prédéfinit, implique une bonne complexité temporelle (pour la complexité, c'est une notion que je pense pour un débutant, ce n'est pas grave s'il n'a aucune idée.). \n\n\n");
        PI.setText("np.pi\n" +
                "3.141592653589793");
        TAB.setText("Les tableaux (en anglais, array) peuvent être créés avec numpy.array(). On utilise des crochets pour délimiter les listes d’éléments dans les tableaux.\n\na = np.array([[1, 2, 3], [4, 5, 6]])\n\nPour accéder à un élément soit on le considére comme liste de liste, soit avec la notation mathématique a[0,1].");
        ARR.setText("Noter la différence entre numpy.arange() et range() :\n" +
                "\n" +
                "numpy.arange() retourne un objet de type numpy.ndarray.\n" +
                "\n" +
                "range() retourne un objet de type range.");
        LIN.setText("numpy.linspace() permet d’obtenir un tableau 1D allant d’une valeur de départ à une valeur de fin avec un nombre donné d’éléments.");
    }
}