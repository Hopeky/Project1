package com.example.superminer;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;
public class Diamonds extends AppCompatActivity {

    /*private void goBack(View v) {
        Intent intent = new Intent(this, MenuLevels.class);
        startActivity(intent);
    }*/

    static public int countmoney = 0;
    static public int money = 100;
    public int[] hp = new int[25];
    Button block1,block2, block3,block4,block5,block6,block7,block8,block9,block10,block26,block27,block28,block29,block30,block31,block32,block33,block34,block35,block36,block37,block38,block39,block40;
    TextView textmoney;

    public void Damage(Button but, int i)
    {
        hp[i]--;
        but.setText(String.valueOf(hp[i]));
        if (hp[i] <= 0) {
            but.setVisibility(View.INVISIBLE);
            countmoney += money;
            textmoney.setText(String.valueOf(countmoney));
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diamonds);

        for(int i = 0; i < 25; i++) {
            if (i < 10)
            {
                hp[i] = 50;
            }
            else if(i == 15)
            {
                hp[i]=300;
            }
            else if(i == 21)
            {
                hp[i] = 300;
            }
            else
            {
                hp[i] = 100;
            }

            Log.d("myTag", "hp"+i+"="+hp[i]);
        }

        block1 = findViewById(R.id.block1);
        block2 = findViewById(R.id.block2);
        block3 = findViewById(R.id.block3);
        block4 = findViewById(R.id.block4);
        block5 = findViewById(R.id.block5);
        block6 = findViewById(R.id.block6);
        block7 = findViewById(R.id.block7);
        block8 = findViewById(R.id.block8);
        block9 = findViewById(R.id.block9);
        block10 = findViewById(R.id.block10);
        block26 = (Button) findViewById(R.id.block26);
        block27 = (Button) findViewById(R.id.block27);
        block28 = (Button) findViewById(R.id.block28);
        block29 = (Button) findViewById(R.id.block29);
        block30 = (Button) findViewById(R.id.block30);
        block31 = (Button) findViewById(R.id.block31);
        block32 = (Button) findViewById(R.id.block32);
        block33 = (Button) findViewById(R.id.block33);
        block34 = (Button) findViewById(R.id.block34);
        block35 = (Button) findViewById(R.id.block35);
        block36 = (Button) findViewById(R.id.block36);
        block37 = (Button) findViewById(R.id.block37);
        block38 = (Button) findViewById(R.id.block38);
        block39 = (Button) findViewById(R.id.block39);
        block40 = (Button) findViewById(R.id.block40);



        // btn_shop = (Button)findViewById(R.id.btn_shop);
        textmoney = (TextView) findViewById(R.id.point);
        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.block1:
                    {
                        Damage(block1, 0);
                        break;
                    }
                    case R.id.block2: {
                        Damage(block2, 1);
                        break;
                    }
                    case R.id.block3: {
                        Damage(block3, 2);
                        break;
                    }
                    case R.id.block4: {
                        Damage(block4, 3);
                        break;
                    }
                    case R.id.block5: {
                        Damage(block5, 4);
                        break;
                    }
                    case R.id.block6: {
                        Damage(block6, 5);
                        break;
                    }
                    case R.id.block7: {
                        Damage(block7, 6);
                        break;
                    }
                    case R.id.block8: {
                        Damage(block8, 7);
                        break;
                    }
                    case R.id.block9: {
                        Damage(block9, 8);
                        break;
                    }
                    case R.id.block10: {
                        Damage(block10, 9);
                        break;
                    }
                    case R.id.block26: {
                        Damage(block26, 10);
                        break;
                    }
                    case R.id.block27: {
                        Damage(block27, 11);
                        break;
                    }
                    case R.id.block28: {
                        Damage(block28, 12);
                        break;
                    }
                    case R.id.block29: {
                        Damage(block29, 13);
                        break;
                    }
                    case R.id.block30: {
                        Damage(block30, 14);
                        break;
                    }
                    case R.id.block31: {
                        Damage(block31, 18);
                        break;
                    }
                    case R.id.block32: {
                        Damage(block32, 16);
                        break;
                    }
                    case R.id.block33: {
                        Damage(block33, 17);
                        break;
                    }
                    case R.id.block34: {
                        Damage(block34, 15);
                        break;
                    }
                    case R.id.block35: {
                        Damage(block35, 19);
                        break;
                    }
                    case R.id.block36: {
                        Damage(block36, 20);
                        break;
                    }
                    case R.id.block37: {
                        Damage(block37, 21);
                        break;
                    }
                    case R.id.block38: {
                        Damage(block38, 22);
                        break;
                    }
                    case R.id.block39: {
                        Damage(block39, 23);
                        break;
                    }
                    case R.id.block40: {
                        Damage(block40, 24);
                        break;
                    }
                }
            }


        };
        block1.setOnClickListener(onClickListener);
        block2.setOnClickListener(onClickListener);
        block3.setOnClickListener(onClickListener);
        block4.setOnClickListener(onClickListener);
        block5.setOnClickListener(onClickListener);
        block6.setOnClickListener(onClickListener);
        block7.setOnClickListener(onClickListener);
        block8.setOnClickListener(onClickListener);
        block9.setOnClickListener(onClickListener);
        block10.setOnClickListener(onClickListener);
        block26.setOnClickListener(onClickListener);
        block27.setOnClickListener(onClickListener);
        block28.setOnClickListener(onClickListener);
        block29.setOnClickListener(onClickListener);
        block30.setOnClickListener(onClickListener);
        block31.setOnClickListener(onClickListener);
        block32.setOnClickListener(onClickListener);
        block33.setOnClickListener(onClickListener);
        block34.setOnClickListener(onClickListener);
        block35.setOnClickListener(onClickListener);
        block36.setOnClickListener(onClickListener);
        block37.setOnClickListener(onClickListener);
        block38.setOnClickListener(onClickListener);
        block39.setOnClickListener(onClickListener);
        block40.setOnClickListener(onClickListener);
    }



    }




