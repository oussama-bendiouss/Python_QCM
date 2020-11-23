package com.example.python_qcm.Controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.python_qcm.Model.Question;
import com.example.python_qcm.Model.questionbank;
import com.example.python_qcm.R;
import com.google.android.material.textfield.TextInputEditText;

import java.util.Arrays;

public class MainActivity2 extends AppCompatActivity {
       private   TextView E21;
       private  Button B21;
       private  Button B22;
       private Button B23;
       private Button B24;
       private questionbank bquestion;
       private Question questionrecent ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //bquestion= this.genequestion();
        B21=findViewById(R.id.b21);
        B22=findViewById(R.id.b22);
        B23=findViewById(R.id.b23);
        B24= findViewById(R.id.b24);
        E21 = findViewById(R.id.t21);
        B21.getTag(0);
        B22.getTag(1);
        B23.getTag(2);
        B24.getTag(4);
        questionrecent = bquestion.getquestion();
        //this.displayquestion(questionrecent);


    }
    private questionbank genequestion(){
        Question q1= new Question("Laquelle des fonctions suivantes convertit un « string » en « float » en python?", Arrays.asList("str(x)","float(x)","long(x [,base] )","int(x [,base])"),1);
        Question q2=new Question("En python 3, que fait l’opérateur //",Arrays.asList("Division entière","Retourne le reste","Division du float par zéro","idem a ** b"),0);
        Question q3 = new Question("En Python, laquelle des fonctions suivantes vérifie dans une chaîne de caractères que tous les caractères sont des chiffres?",Arrays.asList("isdigit()","isalnum()","capitalize()","shuffle(lst)"),0);
        Question q4=new Question("Python est un langage _______?",Arrays.asList(" interprété","machine","compilé","binaire"),0);
        Question q5=new Question("Quel est le type de données pour un caractère en python?",Arrays.asList("chr","char","character","python ne possède aucun type de données pour les caractères, ils sont traités comme des chaînes de caractères (String)"),3);
        Question q6=new Question("Quelle est la fonction qui compare les éléments des deux listes?",Arrays.asList("eq(list1, list2)","len(list1, list2)","cmp(list1, list2)","max(list1, list2)"),2);
        Question q7=new Question("Laquelle des fonctions suivantes renvoie le plus petit caractère de la chaîne str?",Arrays.asList("lower()","strip()","upper(str)","min(str)"),3);
        Question q8=new Question("Quelle fonction est utilisée pour ouvrir le fichier en lecture en Python?",Arrays.asList("fopen(file_name, mode)","open(file_name, mode)","openfile(file_name, mode)","open_file(file_name, mode)"),1);
        Question q9=new Question("En python, quel mot clé est utilisé pour commencer une fonction?",Arrays.asList("function","fun","def","import"),2);
        Question q10=new Question("Lequel des opérateurs suivants en python est évalué à « true » s’il ne trouve pas de variable dans la séquence spécifiée sinon « false »?",Arrays.asList("**","is","not is ","//"),2);
        Question q11=new Question("Quelle fonction insère un objet à un index donné dans une liste?",Arrays.asList("list.index(obj)","list.index(obj)","list.pop(obj=list[-1])","list.remove(obj)"),1);
        Question q12= new Question("En python, quelle est la bonne méthode pour charger un module?",Arrays.asList("include math","import math","#include math.h","using math"),1);
        Question q13=new Question("Quelle est la sortie pour 'python' [-3]",Arrays.asList("h","t","o","Erreur : index négatif"),0);
        Question q14=new Question("Quelle sera la sortie du code suivant: print type(type(int))?",Arrays.asList("type ‘int’","type ‘int’","Error","0"),1);
        return new questionbank(Arrays.asList(q1,q2,q3,q4,q5,q6,q7,q8,q9,q10,q11,q12,q13,q14));
    }
}