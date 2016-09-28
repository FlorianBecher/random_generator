package com.example.admin.randomusername_generator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void firstGenerateName(View v){
        Intent intent = new Intent(this, GenerateActivity.class);
        startActivity(intent);
    }



}
