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

public class firstques extends AppCompatActivity {
 Button b;
    private RadioGroup radioGroup;
 int score=0;
 RadioButton r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstques);
        radioGroup=(RadioGroup)findViewById(R.id.RGroup);

        b=(Button)findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId=radioGroup.getCheckedRadioButtonId();
                r=(RadioButton)findViewById(selectedId);
                if(selectedId==R.id.Abdominal)
                {
                    score=score+3;
                    Intent i=new Intent(firstques.this,second.class);
                    i.putExtra("score",score);
                    startActivity(i);
                }
                else {
                    if (selectedId==R.id.Arm||selectedId==R.id.Chest||selectedId==R.id.Back)
                    {
                        score=score-1;
                        Intent i=new Intent(firstques.this,second.class);
                        i.putExtra("score",score);
                        startActivity(i);
                    }
                    else
                    {
                        Toast.makeText(firstques.this,"Check atleast one button",Toast.LENGTH_LONG).show();
                    }
                }
            }
        });


//        else
//        {
//            if(r1.isChecked()) {
//                score = score - 1;
//                intent(score);
//            }
//           else {if(r2.isChecked())
//            {
//                score = score - 1;
//                intent(score);
//            }
//           else{ if(r4.isChecked())
//            {
//                score = score - 1;
//                intent(score);
//            }
//            else
//            {
//                Toast.makeText(firstques.this,"Check atleast one button",Toast.LENGTH_SHORT).show();
//
//            }
//    }}}}


//    public void intent(final int score)
//    {
//
//
//        b.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i=new Intent(firstques.this,second.class);
//                i.putExtra("score",score);
//                startActivity(i);
//            }
//        });
//    }
}}
