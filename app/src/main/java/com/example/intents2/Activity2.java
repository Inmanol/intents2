package com.example.intents2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

         textView = findViewById(R.id.salutacio);
         String nom = getIntent().getStringExtra("etiquietaNom");

         Bundle sacRecuperat = getIntent().getExtras();

         sacRecuperat.getString("etiquietaNom");

         int edat = sacRecuperat.getInt("etiquietaNom");


         textView.setText("Hola " + nom + ", tens " + edat + " anys.");
    }
}