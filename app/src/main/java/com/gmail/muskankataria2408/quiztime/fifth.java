package com.gmail.muskankataria2408.quiztime;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class fifth extends AppCompatActivity {
Button b;
EditText t;
String s="Mercury";
int score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);
        b=(Button)findViewById(R.id.button);
        Intent intent=getIntent();
        score=intent.getIntExtra("score",score);
        t=(EditText)findViewById(R.id.editText);


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(t.getText().toString().equalsIgnoreCase(s))
                {
                    score=score+3;
                    Intent i=new Intent(fifth.this,sixth.class);
                    i.putExtra("score",score);
                    startActivity(i);
                }
                else {
                    if(s.equals(null))
                    {
                        Toast toast = Toast.makeText(getApplicationContext(), "Check atleast one button", Toast.LENGTH_LONG);
                        toast.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 10);
                        toast.show();
                    }
                    else
                        score = score - 1;
                    Intent i=new Intent(fifth.this,sixth.class);
                    i.putExtra("score",score);
                    startActivity(i);
                }

            }
        });
    }
}
