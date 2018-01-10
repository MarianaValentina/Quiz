package com.example.android.quizzproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void quizAboutFashion(View v) {
        Intent i = new Intent(MainActivity.this, Fashion_Quizz.class);
        startActivity(i);
    }

    public void quizAboutSports(View v) {
        Intent i = new Intent(MainActivity.this, Sports_Quizz.class);
        startActivity(i);
    }

    public void quizAboutCulture(View v) {
        Intent i = new Intent(MainActivity.this, Culture_Quizz.class);
        startActivity(i);
    }
}
