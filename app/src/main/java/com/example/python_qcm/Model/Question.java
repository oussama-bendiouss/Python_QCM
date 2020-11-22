package com.example.python_qcm.Model;

import java.util.List;

public class Question {
    private String question;
    private List<String> réponse ;
    private int solu;
    public Question(String q , List<String> choise , int so ){
        question = q;
        réponse = choise;
        solu = so ;

    }


}
