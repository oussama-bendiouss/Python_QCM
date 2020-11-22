package com.example.python_qcm.Model;

import java.util.Collections;
import java.util.List;

public class questionbank {
    private List<Question> listequestion;
    private int questionsuivante;
    public questionbank(List<Question> ques){
        listequestion = ques;
        Collections.shuffle(listequestion);
        questionsuivante = 0 ; 
    }
    public Question getquestion(){
        if (listequestion.size()==questionsuivante){
            questionsuivante  = 0;
        }
        return listequestion.get(questionsuivante++);
    }
}
