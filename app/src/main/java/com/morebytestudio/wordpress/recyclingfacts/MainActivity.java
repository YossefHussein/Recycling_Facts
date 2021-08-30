package com.morebytestudio.wordpress.recyclingfacts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    // here i write new variable
    private TextView RecyclingFactsTextView;
    private Button FactsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // calling the component
        RecyclingFactsTextView = findViewById(R.id.RecyclingFactsTextView);
        FactsButton = findViewById(R.id.FactsButton);
        FactsButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Random randomGen = new Random();
                String youssef = "95% من معلومات العالم لاتزال مخزنه على الورق واغلبها لاتتم مشاهدته مرة اخرى";
                RecyclingFactsTextView.setText(youssef);
            }
        });
    }
}