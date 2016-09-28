package com.example.admin.randomusername_generator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class GenerateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generate);
    }
    public void openGenerateView(View v){
        Intent intent = new Intent(this, GenerateActivity.class);
        startActivity(intent);

    }
}
