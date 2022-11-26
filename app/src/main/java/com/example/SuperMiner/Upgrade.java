package com.example.SuperMiner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class Upgrade extends AppCompatActivity {
    Button btn_power_up, btn_multiply, btn_kill_up;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upgrade);
        btn_power_up = (Button)findViewById(R.id.btn_power_up);
        btn_multiply = (Button)findViewById(R.id.btn_multiply);
        btn_kill_up = (Button)findViewById(R.id.btn_kill_up);

        btn_power_up.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (diamonds.countmoney >= 5) {
                    diamonds.dmg += 5;
                    diamonds.countmoney -= 5;
                    diamonds.textmoney.setText(diamonds.countmoney +"");
                }
            }
        });
        btn_multiply.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (diamonds.countmoney >= 2000) {
                    diamonds.countmoney -= 2000;
                    diamonds.textmoney.setText(diamonds.countmoney +"");
                }
            }
        });

        btn_kill_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (diamonds.countmoney >=4000) {
                    diamonds.OK =true;
                }
            }
        });


    }
}