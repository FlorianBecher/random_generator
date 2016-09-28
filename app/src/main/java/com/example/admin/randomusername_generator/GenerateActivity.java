package com.example.admin.randomusername_generator;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GenerateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generate);
    }
    public void openGenerateView(View v){
        Intent intent = new Intent(this, GenerateActivity.class);
        startActivity(intent);
        List<String> firstWord = generateFirstWordList();
        List<String> secondWord = generateSecondWordList();
        List<String> thirdWord = generateThirdWordList();
        Random randomGenerator = new Random();
        int index1 = randomGenerator.nextInt(secondWord.size());
        String first = firstWord.get(index1);
        int index2 = randomGenerator.nextInt(secondWord.size());
        String second = firstWord.get(index2);
        int index3 = randomGenerator.nextInt(secondWord.size());
        String third = firstWord.get(index3);
        String finalWord = first+second+third;
        CharSequence word = finalWord;
        TextView tv = (TextView)findViewById(R.id.textViewName);
        tv.setText(word);


    }
    public List generateFirstWordList(){
        List<String> firstWord = new ArrayList<String>();
        firstWord.add("The");
        firstWord.add("Mr.");
        firstWord.add("Mrs.");
        firstWord.add("Dr.");
        firstWord.add("President");
        return firstWord;
    }
    public List generateSecondWordList(){
        List<String> secondWord = new ArrayList<String>();
        secondWord.add("Cool");
        secondWord.add("Crazy");
        secondWord.add("Fancy");
        secondWord.add("Anxious");
        secondWord.add("Attractive");
        secondWord.add("Charming");
        secondWord.add("Stupid");
        secondWord.add("Happy");
        secondWord.add("Brilliant");
        secondWord.add("Lucky");
        secondWord.add("Wise");
        secondWord.add("Soft");
        secondWord.add("Big");
        secondWord.add("Fast");
        secondWord.add("Loud");
        secondWord.add("Heavy");
        secondWord.add("Wet");
        secondWord.add("Rich");
        secondWord.add("Old");
        secondWord.add("Young");
        secondWord.add("Ugly");
        return secondWord;
    }
    public List generateThirdWordList(){
        List<String> thirdWord = new ArrayList<String>();
        thirdWord.add("Fighter");
        thirdWord.add("Runner");
        thirdWord.add("Hustler");
        thirdWord.add("Believer");
        thirdWord.add("Sucker");
        thirdWord.add("Student");
        thirdWord.add("Teacher");
        thirdWord.add("Fish");
        thirdWord.add("Dick");
        thirdWord.add("Dude");
        return thirdWord;
    }
}
