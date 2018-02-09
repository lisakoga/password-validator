package com.example.lizzie.password_validator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void textbox(View view)
    {
        TextView text1 = findViewById(R.id.textView);
        EditText text2 = findViewById(R.id.editText);
        if (Validator.pwCheck(text2.getText().toString()))
        {
            text1.setText("Strong");
        }
        else
        {
            text1.setText("Not strong!");
        }

    }

}
