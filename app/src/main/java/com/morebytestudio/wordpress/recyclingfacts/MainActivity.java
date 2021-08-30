package com.morebytestudio.wordpress.recyclingfacts;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    // here i write new variable
    private TextView RecyclingFactsTextView;
    private Button FactsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclingFactsGenerator recyclingFactsGenerator = new RecyclingFactsGenerator();
        // calling the component
        RecyclingFactsTextView = findViewById(R.id.RecyclingFactsTextView);
        FactsButton = findViewById(R.id.FactsButton);

        FactsButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                /// now we calling recyclingFactsGenerator method
                String fact = recyclingFactsGenerator.recyclingFactsGenerator();
                RecyclingFactsTextView.setText(fact);
                // we us log in app for know do this point is worked
                Log.e(" is it run ","yes is run :)");
            }
        });
    }
}