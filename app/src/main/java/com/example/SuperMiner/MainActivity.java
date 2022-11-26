package com.example.SuperMiner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gold(View v){
        Intent intent = new Intent(this, gold.class);
        startActivity(intent);
    }

    public void diamonds(View v) {
        Intent intent = new Intent(this, diamonds.class);
        startActivity(intent);
    }
    public void silver(View v) {
        Intent intent = new Intent(this, silver.class);
        startActivity(intent);
    }
    public void iron(View v) {
        Intent intent = new Intent(this, iron.class);
        startActivity(intent);
    }
    public void coat(View v) {
        Intent intent = new Intent(this, coat.class);
        startActivity(intent);
    }
}