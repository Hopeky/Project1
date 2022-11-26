package com.example.SuperMiner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void startNewActivity(View v) {
        Intent intent = new Intent(this, Developer.class);
        startActivity(intent);
    }
    public void startGame(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    
}