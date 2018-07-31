package com.gmail.muskankataria2408.quiztime;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class score extends AppCompatActivity {
Button b;
TextView t;
int score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        b = (Button) findViewById(R.id.button);
        t = (TextView) findViewById(R.id.ques);
        Bundle extras = getIntent().getExtras();

        if (extras != null) {
            score = extras.getInt("score");
            t.setText(score + "/30");
            b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(score.this, allanswers.class);

                    startActivity(i);
                    finishAffinity();
                }
            });
        }
    }}

