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
    String facts[] = {
            "95% من معلومات العالم لاتزال مخزنه على الورق واغلبها لاتتم مشاهدته مرة اخرى",
            "اعادة تدوير قاروة بلاستيك يوفر طاقة كافية لاضاءة مصباح بقدرة 60 واط لمدة 6 ساعات",
            "الاف المخلوقات البحرية تموت بسبب ابتلاعها اكياس البلاستيك التي تشبه قنديل البحر",
            "في كل عام يرمي الامريكان قوارير وزجاجات كافية لوصول القمر والعودة اليه 20 مره",
            "اعادة تدوير طن من البلاستيك يمكن ان يوفر حوالي 2000 غالون من البنزين",
            "بداية من عام 2015 جميع سكان نيويورك عليهم اعادة تدوير الاجهزة الالكترونية والا سيواجهون غرامه مقدارها 100 دولا",
            "اعادة تدوير علبة المنيوم يمكن ان يوفر طاقة تكفي لتشغيل تلفاز لساعتين",
            "اعادة تدوير طن من الورق يحافظ على 17 شجره",
            "اعادة تدوير علبة المنيوم يمكن ان يعيدها الى رف متجر خلال 60 يوم",
    };

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
                int randomenum = randomGen.nextInt(facts.length);
                String fact = facts[randomenum];
                RecyclingFactsTextView.setText(fact + randomenum);
            }
        });
    }
}