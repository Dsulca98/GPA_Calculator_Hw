package com.example.gpa_calculator1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText mGpa1;
    private EditText mGpa2;
    private EditText mGpa3;
    private EditText mGpa4;
    private EditText mGpa5;
    private TextView  mResult;
    private LinearLayout mbackColor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       mGpa1=(EditText)findViewById(R.id.gpa1);
        mGpa2=(EditText)findViewById(R.id.gpa2);
        mGpa3=(EditText)findViewById(R.id.gpa3);
        mGpa4=(EditText)findViewById(R.id.gpa4);
        mGpa5=(EditText)findViewById(R.id.gpa5);
        mResult=(TextView)findViewById(R.id.result);
        mbackColor=(LinearLayout)findViewById(R.id.layout_background);
    }

       public void calculateClick(View view) {
        int GPA1 = Integer.parseInt(mGpa1.getText().toString());
        int GPA2 = Integer.parseInt(mGpa2.getText().toString());
        int GPA3 = Integer.parseInt(mGpa3.getText().toString());
        int GPA4 = Integer.parseInt(mGpa4.getText().toString());
        int GPA5 = Integer.parseInt(mGpa5.getText().toString());

        int avgGPA;
        avgGPA=GPA1+GPA2+GPA3+GPA4+GPA5;
        avgGPA= avgGPA/5;
        feedback(avgGPA);

    }

    public void feedback(int gpa){

        if(gpa<=60)
        {
            mResult.setText("Your GPA is: "+gpa+"\nYou could do better");
            mbackColor.setBackgroundColor(Color.parseColor("#F44336"));

        }
        else if(gpa>=61&&gpa<=79)
        {
            mResult.setText("Your GPA is: "+gpa+"\nPass");
            mbackColor.setBackgroundColor(Color.parseColor("#FFEB3B"));
        }
        else if(gpa>=80&&gpa<=100)
        {
            mResult.setText("Your GPA is: "+gpa+"\nGreat job");
            mbackColor.setBackgroundColor(Color.parseColor("#4CAF50"));
        }

    }


    }
