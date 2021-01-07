package com.example.myapplication.cours;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import com.example.myapplication.R;

public class String extends AppCompatActivity {
    private TextView T1;
    private TextView T2;
    private TextView T3;
    private  TextView T4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_string);
        T1=findViewById(R.id.str);
        T2 = findViewById(R.id.exstr);
        T3 = findViewById(R.id.str1);
        T4 = findViewById(R.id.ex2str);
        T1.setText(" Les chaînes sont entre ' ou \" et les \\n, \\t sont toujours évalués dedans !\n\n" + "On peut aussi faire commencer et finir une chaîne par un triple double quotes \"\"\" ou simple quote ''' (permet d'inclure des retours chariots.)\nConcaténation de chaînes : x = 'aaa' + 'bbb' donne aaabbb.\n" +
                "Répétition d'une chaîne : x = 'ab' * 5 donne ababababab\n" +
                "Extraction de sous-chaînes :.\n" );
        T2.setText("x = 'abcdef' : définition de la chaîne.\n\n" +
                "print(x[2]) : 3ème caractère (indice commence à 0), ici c.\n\n" +
                "print(x[0:3]) : caractères d'indices 0 à 3 - 1, ici abc.\n\n" +
                "print(x[1:]) : caractères à partir de l'indice 1, ici bcdef.\n\n" +
                "print(x[:3]) : caractères jusqu'à l'indice 3 - 1, ici abc.\n\n" +
                "print(x[-2:]) : les 2 derniers caractères, ici ef.\n\n" +
                "print(x[0:-2]) : toute la chaîne sauf les 2 derniers caractères.\n\n" +
                "si l'index de fin est > à la longueur, c'est la longueur qui est utilisée.\n\n" +
                "print(len(x)) : longueur, ici 6.\n\n" +
                "x[::2] : chaîne avec un caractère sur deux (en commençant par le premier), ici ace.\n\n" +
                "x[1::2] : chaîne avec un caractère sur deux en commençant par le deuxième, ici bdf.\n\n" +
                "x[::-1] : la chaîne renversée, ici fedcba.\n\n");
        T3.setText("Les chaînes sont read-only (non mutables), donc on ne peut pas faire x[1] = 'x'\n" +
                "Eclater une chaîne en liste de caractères : l = list(myString)\n" +
                "Fonctions sur les chaînes :\n");
        T4.setText("'N' in s : renvoie True si N est un caractère de s.\n\n" +
                "s.count('ab') : retourne le nombre de chaîne \"ab\" (non overlappant).\n\n" +
                "isalnum, isalpha, isdigit, islower, isupper, isspace : tests sur le type des caractères de la chaîne (False si chaîne vide).\n\n" +
                "s.startswith('ab') : renvoie True si commence par \"ab\" (idem avec endswith).\n\n" +
                "s.find('ab') : retourne le plus petit index correspondant à la chaîne \"ab\" (-1 si pas trouvé).\n\n" +
                "s.find('ab', 3) : retourne le plus petit index correspondant à la chaîne \"ab\" dans s[3:] (-1 si pas trouvé).\n\n" +
                "s.find('ab', 3, 15) : retourne le plus petit index correspondant à la chaîne \"ab\" dans s[3:15] (-1 si pas trouvé).\n\n" +
                "s.rfind('ab') : retourne le plus grand index correspondant à la chaîne \"ab\" (-1 si pas trouvé), i.e commence par la recherche par la fin\n\n" +
                "s.index('ab') comme find, mais si sous-chaîne non trouvé, lève une ValueError.\n\n" +
                "s.lower() : renvoie la chaîne convertie en minuscules (idem avec s.upper() pour les majuscules), sans affecter s\n\n" +
                "s.capitalize() : met en majuscule la première lettre et en minuscules toutes les autres quelque soit la casse de départ.\n\n" +
                "s.title() : renvoie une chaîne où toutes les premières lettres de chaque mot sont en majuscule et le reste en minuscules.\n\n" +
                "s.replace('old', 'new') : remplace toutes les occurrences de \"old\" par \"new\", sans affecter s.\n\n" +
                "s.replace('old', 'new', 1) : remplace seulement la première occurrence.\n\n" +
                "s.translate(str.maketrans('ACGT', 'TGCA')) : renvoie la chaîne avec les A remplacés par des T, les C par des G, etc (maketrans construit une table de traduction des 255 caractères)\n\n" +
                "s.translate(None, '\\n') : enlève les retours chariots, sans affecter s.\n\n" +
                "s.translate(None, 'aeiouy') : enlève les voyelles.\n\n" +
                "str.split(s) : retourne une liste de chaînes en coupant sur les caractères blancs (espace, tabulation, retours chariot). Si s est vide, la liste est vide.\n\n" +
                "on peut aussi faire s.split(). Par exemple, ' a b c '.split() donne ['a', 'b', 'c']. Donc attention, split se comporte différemment sans argument ou avec une chaîne ayant un espace :\n\n" +
                "' a b'.split(' ') : renvoie ['', 'a', '', 'b']\n\n" +
                "' a b'.split() : renvoie ['a', 'b'] : les chaines vides sont éliminés !\n\n" +
                "s.split('\\t') : splitte sur les tabulations, et se comporte bien par défaut si à la fin de la chaîne, il y a des tabulations consécutives (contrairement à perl). Attention, c'est une chaîne qui est utilisée et non un pattern pour indiquer où couper.\n\n" +
                "str.split(s, 'a') : splitte sur les \"a\" (chaîne). Si s est vide, la liste comporte un élément, la chaîne vide.\n\n" +
                "sep.join(stringList) : concatène les chaînes stringList avec la chaîne sep comme séparateur.\n\n" +
                "s.strip() : retourne un chaîne avec les espaces à gauche et à droite retirés (trim), y compris les retours chariot (sinon, rstrip ou lstrip pour un seul côté).\n\n" +
                "s.strip('a') : retourne une chaîne avec les 'a' des deux côtés enlevés (pareil avec lstrip et rstrip)\n\n" +
                "s.center(15) : retourne une chaîne de longueur 15 avec des espaces pour centrer la chaîne (si s est de longueur > 15, retourn s). s.center(15, '-') : utilise '-' au lieu d'un espace.\n\n" +
                "s.ljust(15) : justification à gauche (rjust pour à droite), sans affecter s\n\n" +
                "ord('A') : renvoie 65 (conversion d'un caractère en code décimal).\n\n" +
                "chr(65) : renvoie 'A' (conversion d'un code décimal en caractère, fonction inverse de la fonction ord).");
        }
    }
