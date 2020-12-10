package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ContatUs extends AppCompatActivity {
    private Button  BretourC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_contatc_us);
     BretourC= findViewById(R.id.bretourcontact);
     BretourC.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent cont = new Intent();
             cont.setClass(ContatUs.this,Principale.class);
             startActivity(cont);
             finish();
         }
     });
    }
}