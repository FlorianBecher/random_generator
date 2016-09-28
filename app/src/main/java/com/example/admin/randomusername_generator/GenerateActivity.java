package com.example.admin.randomusername_generator;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.TextView;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GenerateActivity extends AppCompatActivity {

    public int number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generate);
        generateName(null);
    }

    public void generateName(View v){
        //Generate Name

        List<String> firstWord = generateFirstWordList();
        List<String> secondWord = generateSecondWordList();
        List<String> thirdWord = generateThirdWordList();
        Random randomGenerator = new Random();
        int index1 = randomGenerator.nextInt(firstWord.size());
        String first = firstWord.get(index1);
        int index2 = randomGenerator.nextInt(secondWord.size());
        String second = secondWord.get(index2);
        int index3 = randomGenerator.nextInt(thirdWord.size());
        String third = thirdWord.get(index3);
        String finalWord = first+second+third;
        CharSequence word = finalWord;
        TextView tv = (TextView)findViewById(R.id.textViewName);
        tv.setText(word);

        //Counting up!
        TextView myTextView = (TextView)findViewById(R.id.generate_count);
        CharSequence sNumber = myTextView.getText();
        int num = (Integer.valueOf((String) sNumber));
        ++num;
        String sNum = String.valueOf(num);
        CharSequence cNum = sNum;
        myTextView.setText(cNum);
        number = num;
    }

    public List generateFirstWordList(){
        List<String> firstWord = new ArrayList<String>();
        firstWord.add("The");
        firstWord.add("Mr.");
        firstWord.add("Mrs.");
        firstWord.add("Dr.");
        return firstWord;
    }
    public List generateSecondWordList(){
        List<String> secondWord = new ArrayList<String>();
        secondWord.add("Cool");
        secondWord.add("Crazy");
        secondWord.add("Fancy");
        secondWord.add("Anxious");
        secondWord.add("Charming");
        secondWord.add("Stupid");
        secondWord.add("Happy");
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
