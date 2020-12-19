package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ContatUs extends AppCompatActivity {
    private Button  BretourC;
    private Button TMAIL;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_contatc_us);
     BretourC= findViewById(R.id.bretourcontact);
     TMAIL= findViewById(R.id.tmail);
     BretourC.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent cont = new Intent();
             cont.setClass(ContatUs.this,Principale.class);
             startActivity(cont);
             finish();
         }
     });

     TMAIL.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             composeEmail("assadben223@gmail.com" ,"Réclamation de problème ");
         }
     });

            }
    public void composeEmail(String  addresses, String subject) {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_EMAIL, addresses);
        intent.putExtra(Intent.EXTRA_SUBJECT, subject);

            startActivity(intent);

    }}
