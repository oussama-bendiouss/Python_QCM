package com.example.myapplication.controller;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.example.myapplication.R;
import com.example.myapplication.model.Question;
import com.example.myapplication.model.QuestionBank;
import java.util.Arrays;

public class GameActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView mQuestionTextView;
    private Button mAnswerButton1;
    private Button mAnswerButton2;
    private Button mAnswerButton3;
    private Button mAnswerButton4;

    private QuestionBank mQuestionBank;
    private Question mCurrentQuestion;

    private int mScore;
    private int mNumberOfQuestions;

    public static final String BUNDLE_EXTRA_SCORE = "BUNDLE_EXTRA_SCORE";
    public static final String BUNDLE_STATE_SCORE = "currentScore";
    public static final String BUNDLE_STATE_QUESTION = "currentQuestion";

    private boolean mEnableTouchEvents;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        System.out.println("GameActivity::onCreate()");

        mQuestionBank = this.generateQuestions();

        if (savedInstanceState != null) {
            mScore = savedInstanceState.getInt(BUNDLE_STATE_SCORE);
            mNumberOfQuestions = savedInstanceState.getInt(BUNDLE_STATE_QUESTION);
        } else {
            mScore = 0;
            mNumberOfQuestions = 4;
        }

        mEnableTouchEvents = true;

        // Wire widgets
        mQuestionTextView = (TextView) findViewById(R.id.activity_game_question_text);
        mAnswerButton1 = (Button) findViewById(R.id.activity_game_answer1_btn);
        mAnswerButton2 = (Button) findViewById(R.id.activity_game_answer2_btn);
        mAnswerButton3 = (Button) findViewById(R.id.activity_game_answer3_btn);
        mAnswerButton4 = (Button) findViewById(R.id.activity_game_answer4_btn);

        // Use the tag property to 'name' the buttons
        mAnswerButton1.setTag(0);
        mAnswerButton2.setTag(1);
        mAnswerButton3.setTag(2);
        mAnswerButton4.setTag(3);

        mAnswerButton1.setOnClickListener(this);
        mAnswerButton2.setOnClickListener(this);
        mAnswerButton3.setOnClickListener(this);
        mAnswerButton4.setOnClickListener(this);

        mCurrentQuestion = mQuestionBank.getQuestion();
        this.displayQuestion(mCurrentQuestion);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putInt(BUNDLE_STATE_SCORE, mScore);
        outState.putInt(BUNDLE_STATE_QUESTION, mNumberOfQuestions);

        super.onSaveInstanceState(outState);
    }

    @Override
    public void onClick(View v) {
        int responseIndex = (int) v.getTag();

        if (responseIndex == mCurrentQuestion.getAnswerIndex()) {
            // Good answer
            Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
            mScore++;
        } else {
            // Wrong answer
            Toast.makeText(this, "Wrong answer!", Toast.LENGTH_SHORT).show();
        }

        mEnableTouchEvents = false;

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                mEnableTouchEvents = true;

                // If this is the last question, ends the game.
                // Else, display the next question.
                if (--mNumberOfQuestions == 0) {
                    // End the game
                    endGame();
                } else {
                    mCurrentQuestion = mQuestionBank.getQuestion();
                    displayQuestion(mCurrentQuestion);
                }
            }
        }, 500); // LENGTH_SHORT is usually 2 second long
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        return mEnableTouchEvents && super.dispatchTouchEvent(ev);
    }

    private void endGame() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle("Well done!")
                .setMessage("Your score is " + mScore)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // End the activity
                        Intent intent = new Intent();
                        intent.putExtra(BUNDLE_EXTRA_SCORE, mScore);
                        setResult(RESULT_OK, intent);
                        finish();
                    }
                })
                .setCancelable(false)
                .create()
                .show();


    }

    private void displayQuestion(final Question question) {
        mQuestionTextView.setText(question.getQuestion());
        mAnswerButton1.setText(question.getChoiceList().get(0));
        mAnswerButton2.setText(question.getChoiceList().get(1));
        mAnswerButton3.setText(question.getChoiceList().get(2));
        mAnswerButton4.setText(question.getChoiceList().get(3));
    }

    private QuestionBank generateQuestions() {
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
        Question q15=new Question("min(max(False,-2,-5), 1,5)",Arrays.asList("-5","-2","1","False"),3);
        Question q16=new Question(">>> t = (1, 2, 3)\n" + ">>> t.append( (4, 5, 6) )\n" + ">>>print len(t)",Arrays.asList("3","4","6","Erreur"),3);
        Question q17=new Question("if None:\n" + "    print(“Lorem Ipsum”)",Arrays.asList("Lorem Ipsum","False","Le code n’affichera rien"," Erreur de syntaxe"),2);
        Question q18=new Question("En Python, les boucles « for » et « while » peuvent avoir une instruction « else » optionnelle?",Arrays.asList("Seule la boucle « for » peut avoir une instruction « else » optionnelle"," Seule la boucle « while » peut avoir une instruction « else » optionnelle","Les deux boucles peuvent avoir une instruction « else » optionnelle","Les boucles ne peuvent pas avoir d’autre instruction en Python"),2);
        Question q19=new Question("Que fait la fonction « re.match »?",Arrays.asList("Correspond à un motif à n’importe quelle position de la chaîne","Correspond à un motif au début de la chaîne"," Cette fonction n’existe pas","Aucune de ces réponses n’est vraie"),1);
        Question q20=new Question("Est-il préférable d’utiliser la boucle « for » plutôt que « while » si vous effectuez une itération dans une séquence (comme: list)?",Arrays.asList("Non, il vaut mieux utiliser la boucle « While »","Oui, il vaut mieux utiliser la boucle « for »","Non, vous ne pouvez pas parcourir une séquence en utilisant la boucle « while ».","Non, vous ne pouvez pas parcourir une séquence à l’aide d’une boucles."),1);
        return new QuestionBank(Arrays.asList(q1,q2,q3,q4,q5,q6,q7,q8,q9,q10,q11,q12,q13,q14,q15,q16,q17,q18,q19,q20));}
    @Override
    protected void onStart() {
        super.onStart();

        System.out.println("GameActivity::onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();

        System.out.println("GameActivity::onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();

        System.out.println("GameActivity::onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();

        System.out.println("GameActivity::onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        System.out.println("GameActivity::onDestroy()");
    }
}
