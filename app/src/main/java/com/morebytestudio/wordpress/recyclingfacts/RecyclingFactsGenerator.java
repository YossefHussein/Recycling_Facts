package com.morebytestudio.wordpress.recyclingfacts;

import java.util.Random;
/// we crated this class for generate facts for app
public class RecyclingFactsGenerator {

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

    public String recyclingFactsGenerator() {
        // Random it is class in java.
        // use this class for chose between information in array (facts)
        Random randomGen = new Random();
        // that is method in class ti is say for mobile.
        // give me array and length of array will be random
        int randomNum = randomGen.nextInt(facts.length);
        // in fact hse facts array
        String fact = facts[randomNum];
        // in the end please give me fact or returning this variable which sided facts array
        return fact;

    }
}
