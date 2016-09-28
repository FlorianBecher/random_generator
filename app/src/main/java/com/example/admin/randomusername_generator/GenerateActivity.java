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

        Random randomchoose = new Random();
        int random = randomchoose.nextInt(5);

        if(random == 1){
            nameGenerator1();
        }else if(random == 2){
            nameGenerator2();
        }else if(random == 3){
            nameGenerator3();
        }else if(random == 0){
            nameGenerator2();
        }else{
            nameGenerator3();
        }

        count();
    }

    private void count(){
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

    private void nameGenerator1(){
        List<String> normalNames = generateNormalWordList();

        Random randomGenerator = new Random();
        int index1 = randomGenerator.nextInt(normalNames.size());
        String stringWord = normalNames.get(index1);

        CharSequence word = stringWord;
        TextView tv = (TextView)findViewById(R.id.textViewName);
        tv.setText(word);
    }

    private void nameGenerator2(){
        //List<String> firstOfTwo = generateFirstOfTwoWordList();
        //List<String> secondOfTwo = generateSecondOfTwoWordList();
        List<String> secondWordList = generateSecondWordList();
        List<String> thirdWordList = generateThirdWordList();

        Random randomGenerator = new Random();
        int index1 = randomGenerator.nextInt(secondWordList.size());
        String firstWord = secondWordList.get(index1);

        int index2 = randomGenerator.nextInt(thirdWordList.size());
        String secondWord = thirdWordList.get(index2);

        String finalWord = firstWord+secondWord;
        CharSequence word = finalWord;
        TextView tv = (TextView)findViewById(R.id.textViewName);
        tv.setText(word);
    }

    private void nameGenerator3(){
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
    }

    private List generateFirstWordList(){
        List<String> firstWord = new ArrayList<String>();
        firstWord.add("The");
        firstWord.add("Mr.");
        firstWord.add("Mrs.");
        firstWord.add("Dr.");
        return firstWord;
    }
    private List generateSecondWordList(){
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
    private List generateThirdWordList(){
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
    private List generateNormalWordList(){
        List<String> normalWord = new ArrayList<String>();
        normalWord.add("Hans");
        normalWord.add("Peter");
        normalWord.add("Sandro");
        normalWord.add("Eric");
        normalWord.add("Alexander");
        normalWord.add("Alexandra");
        normalWord.add("Gloaria");
        normalWord.add("Elisa");
        normalWord.add("Johannes");
        normalWord.add("Dieter");
        normalWord.add("Sabrina");
        normalWord.add("Erica");
        normalWord.add("Sabine");
        normalWord.add("Melanie");
        normalWord.add("Olivia");
        normalWord.add("Livia");
        normalWord.add("Silvan");
        normalWord.add("Livio");
        normalWord.add("Enis");
        return normalWord;
    }
/*
    private List generateFirstOfTwoWordList(){
        List<String> firstOfTwo = new ArrayList<String>();
        firstOfTwo.add("");
        firstOfTwo.add("Peter");
        firstOfTwo.add("Sandro");
        firstOfTwo.add("Eric");
        firstOfTwo.add("Alexander");
        firstOfTwo.add("Alexandra");
        firstOfTwo.add("Gloaria");
        firstOfTwo.add("Elisa");
        firstOfTwo.add("Johannes");
        firstOfTwo.add("Dieter");
        firstOfTwo.add("Sabrina");
        firstOfTwo.add("Erica");
        firstOfTwo.add("Sabine");
        firstOfTwo.add("Melanie");
        firstOfTwo.add("Olivia");
        firstOfTwo.add("Livia");
        firstOfTwo.add("Silvan");
        firstOfTwo.add("Livio");
        return firstOfTwo;
    }

    private List generateSecondOfTwoWordList(){
        List<String> secondOfTwo = new ArrayList<String>();
        secondOfTwo.add("Hans");
        secondOfTwo.add("Peter");
        secondOfTwo.add("Sandro");
        secondOfTwo.add("Eric");
        secondOfTwo.add("Alexander");
        secondOfTwo.add("Alexandra");
        secondOfTwo.add("Gloaria");
        secondOfTwo.add("Elisa");
        secondOfTwo.add("Johannes");
        secondOfTwo.add("Dieter");
        secondOfTwo.add("Sabrina");
        secondOfTwo.add("Erica");
        secondOfTwo.add("Sabine");
        secondOfTwo.add("Melanie");
        secondOfTwo.add("Olivia");
        secondOfTwo.add("Livia");
        secondOfTwo.add("Silvan");
        secondOfTwo.add("Livio");
        return secondOfTwo;
    }
*/
}
