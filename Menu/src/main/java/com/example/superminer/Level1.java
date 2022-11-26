package com.example.superminer;

import androidx.appcompat.app.AppCompatActivity ;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class Level1 extends AppCompatActivity {

    Block blok1 = new Block(500);

    TextView text;
    Button bblock1;
    Button bblock2;
    Button bblock3;

    public void Damage() {
        blok1.TakeDamage(100);
        if (blok1.health <= 0) {
            bblock1.setVisibility(View.INVISIBLE);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1);
// анализируем, какая кнопка была нажата. Всего один метод для всех кнопок
        text = (TextView) findViewById(R.id.TextBlock);
        bblock1 = (Button) findViewById(R.id.block1);
        bblock2 = (Button) findViewById(R.id.block2);
        bblock3 = (Button) findViewById(R.id.block3);

        View.OnClickListener onClickListener = new OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.block1:
                        text.setText("1");
                        Damage();
                        break;


                    case R.id.block2:
                        text.setText("2");
                        Damage();
                        break;

                    case R.id.block3:
                        text.setText("3");
                        Damage();
                        break;
                }
            }
        };
        // устанавливаем один обработчик для всех кнопок
        bblock1.setOnClickListener(onClickListener);
        bblock2.setOnClickListener(onClickListener);
        bblock3.setOnClickListener(onClickListener);
    }
}

