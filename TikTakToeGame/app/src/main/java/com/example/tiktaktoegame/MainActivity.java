package com.example.tiktaktoegame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    String b1, b2, b3, b4, b5, b6, b7, b8, b9;
    int flag = 0;
    int flag1 = 0;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
    }

    public void blank() {
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");

    }

    public void cheak(View view) {
        Button currentbtn = (Button) view;
        if (flag == 0) {
            currentbtn.setText("X");
            flag = 1;
            count++;
        } else {
            currentbtn.setText("O");
            flag = 0;
            count++;
        }
        if (count > 4) {
            b1 = btn1.getText().toString();
            b2 = btn2.getText().toString();
            b3 = btn3.getText().toString();
            b4 = btn4.getText().toString();
            b5 = btn5.getText().toString();
            b6 = btn6.getText().toString();
            b7 = btn7.getText().toString();
            b8 = btn8.getText().toString();
            b9 = btn9.getText().toString();

            if (b1.equals(b2) && b2.equals(b3) && !b1.equals("")) {
                if (b1.equals("X")) {
                    Toast.makeText(this, "winner is X ", Toast.LENGTH_SHORT).show();
                    flag1 = 1;
                } else {
                    Toast.makeText(this, "winner is O ", Toast.LENGTH_SHORT).show();
                    flag1 = 1;
                }
            } else if (b4.equals(b5) && b5.equals(b6) && !b4.equals("")) {
                if (b4.equals("X")) {
                    Toast.makeText(this, "winner is X ", Toast.LENGTH_SHORT).show();
                    flag1 = 1;

                } else {
                    Toast.makeText(this, "winner is O ", Toast.LENGTH_SHORT).show();
                    flag1 = 1;
                }

            } else if (b7.equals(b8) && b8.equals(b9) && !b7.equals("")) {
                if (b7.equals("X")) {
                    Toast.makeText(this, "winner is X ", Toast.LENGTH_SHORT).show();
                    flag1 = 1;

                } else {
                    Toast.makeText(this, "winner is O ", Toast.LENGTH_SHORT).show();
                    flag1 = 1;
                }

            } else if (b1.equals(b5) && b5.equals(b9) && !b5.equals("")) {
                if (b1.equals("X")) {
                    Toast.makeText(this, "winner is X ", Toast.LENGTH_SHORT).show();
                    flag1 = 1;
                } else {
                    Toast.makeText(this, "winner is O ", Toast.LENGTH_SHORT).show();
                    flag1 = 1;
                }

            } else if (b3.equals(b5) && b5.equals(b7) && !b5.equals("")) {
                if (b3.equals("X")) {
                    Toast.makeText(this, "winner is X ", Toast.LENGTH_SHORT).show();
                    flag1 = 1;

                } else {
                    Toast.makeText(this, "winner is O ", Toast.LENGTH_SHORT).show();
                    flag1 = 1;
                }

            } else if (b1.equals(b4) && b4.equals(b7) && !b4.equals("")) {
                if (b1.equals("X")) {
                    Toast.makeText(this, "winner is X ", Toast.LENGTH_SHORT).show();
                    flag1 = 1;

                } else {
                    Toast.makeText(this, "winner is O ", Toast.LENGTH_SHORT).show();
                    flag1 = 1;
                }

            } else if (b2.equals(b5) && b5.equals(b8) && !b5.equals("")) {
                if (b2.equals("X")) {
                    Toast.makeText(this, "winner is X ", Toast.LENGTH_SHORT).show();
                    flag1 = 1;
                } else {
                    Toast.makeText(this, "winner is O ", Toast.LENGTH_SHORT).show();
                    flag1 = 1;
                }

            } else if (b3.equals(b6) && b6.equals(b9) && !b6.equals("")) {
                if (b3.equals("X")) {
                    Toast.makeText(this, "winner is X ", Toast.LENGTH_SHORT).show();
                    flag1 = 1;

                } else {
                    Toast.makeText(this, "winner is O ", Toast.LENGTH_SHORT).show();
                    flag1 = 1;
                }

            }

            if (flag1 == 0 && count >= 9) {
                Toast.makeText(this, "Match Draw...!", Toast.LENGTH_SHORT).show();
                count=0;
                blank();
                cheak(view);
                return;
            }
        }
    }
}