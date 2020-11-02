package com.example.myquizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ScoreActivity extends AppCompatActivity {

    private TextView scoreView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        scoreView = findViewById(R.id.textView2);
        Intent intent = getIntent();
        int score = intent.getIntExtra("SCORE", 0);

        scoreView.setText(""+score);
    }
}