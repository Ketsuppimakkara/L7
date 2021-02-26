package com.example.l7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    TextView text;
    TextInputLayout inputBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputBox = (TextInputLayout) findViewById(R.id.inputBox);
        text = (TextView) findViewById(R.id.textView);
        text.setText("Alkuperäinen tylsä teksti.");
    }
    public void buttonPress (View v){
        System.out.println("Hello World!");
        text.setText(inputBox.getEditText().getText().toString());
        //text.setText("Hello World!");
    }
}