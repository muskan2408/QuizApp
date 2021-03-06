package com.gmail.muskankataria2408.quiztime;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class third extends AppCompatActivity {
Button b;
RadioButton r;
RadioGroup radioGroup;
int score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Bundle extras = getIntent().getExtras();

        if (extras != null) {
            score = extras.getInt("score");
            radioGroup=(RadioGroup)findViewById(R.id.RGroup);

            b=(Button)findViewById(R.id.button);
            b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int selectedId=radioGroup.getCheckedRadioButtonId();
                    r=(RadioButton)findViewById(selectedId);
                    if(selectedId==R.id.Back)
                    {
                        score=score+3;
                        Intent i=new Intent(third.this,fourth.class);
                        i.putExtra("score",score);
                        startActivity(i);
                    }
                    else {
                        if (selectedId==R.id.Arm||selectedId==R.id.Chest||selectedId==R.id.Abdominal)
                        {
                            score=score-1;
                            Intent i=new Intent(third.this,fourth.class);
                            i.putExtra("score",score);
                            startActivity(i);
                        }
                        else
                        {
                            Toast.makeText(third.this,"Check atleast one button",Toast.LENGTH_LONG).show();
                        }
                    }
                }
            });

        }
    }
}
