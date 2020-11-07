package com.example.scanapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void clickHandler(View view) {
        Intent homeIntent=new Intent(HomeActivity.this,MainActivity.class);
       // homeIntent.putExtra("mykey",name);
        startActivity(homeIntent);
    }

    public void clickHandler2(View view) {
        Intent homeIntent=new Intent(HomeActivity.this,FirstActivity.class);
        // homeIntent.putExtra("mykey",name);
        startActivity(homeIntent);

    }
}