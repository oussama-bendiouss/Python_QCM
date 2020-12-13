package com.example.myapplication.cours;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import com.example.myapplication.R;

public class Liste extends AppCompatActivity {
     private TextView T1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste);
        T1 = findViewById(R.id.te1);

        T1.setText(Html.fromHtml(" <b><i>Liste</i></b>"));
    }
}