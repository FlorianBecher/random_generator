package com.example.admin.randomusername_generator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void changeCount(View v){
        TextView myTextView = (TextView)findViewById(R.id.count);
        CharSequence sNumber = myTextView.getText();
        int num = (Integer.valueOf((String) sNumber));
        ++num;
        String sNum = String.valueOf(num);
        CharSequence cNum = sNum;
        myTextView.setText(cNum);
        number = num;
    }


}
