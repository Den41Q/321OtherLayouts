package com.example.a321otherlayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView result;
    private Button mBtnZero;
    private Button mBtnOne;
    private Button mBtnTwo;
    private Button mBtnThree;
    private Button mBtnFour;
    private Button mBtnFive;
    private Button mBtnSix;
    private Button mBtnSeven;
    private Button mBtnEight;
    private Button mBtnNine;
    private Button mBtnPoint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        result = findViewById(R.id.result);
        mBtnZero = findViewById(R.id.btn_0);
        mBtnOne = findViewById(R.id.btn_1);
        mBtnTwo = findViewById(R.id.btn_2);
        mBtnThree = findViewById(R.id.btn_3);
        mBtnFour = findViewById(R.id.btn_4);
        mBtnFive = findViewById(R.id.btn_5);
        mBtnSix = findViewById(R.id.btn_6);
        mBtnSeven = findViewById(R.id.btn_7);
        mBtnEight = findViewById(R.id.btn_8);
        mBtnNine = findViewById(R.id.btn_9);
        mBtnPoint = findViewById(R.id.btn_point);

        mBtnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ("0".equalsIgnoreCase(result.getText().toString())) {
                    result.setText(" ");
                }
                result.setText(result.getText().toString() + "0");
            }
        });

        mBtnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ("0".equalsIgnoreCase(result.getText().toString())) {
                    result.setText(" ");
                }
                result.setText(result.getText().toString() + "1");
            }
        });

        mBtnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ("0".equalsIgnoreCase(result.getText().toString())) {
                    result.setText(" ");
                }
                result.setText(result.getText().toString() + "2");
            }
        });

        mBtnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ("0".equalsIgnoreCase(result.getText().toString())) {
                    result.setText(" ");
                }
                result.setText(result.getText().toString() + "3");
            }
        });

        mBtnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ("0".equalsIgnoreCase(result.getText().toString())) {
                    result.setText(" ");
                }
                result.setText(result.getText().toString() + "4");
            }
        });

        mBtnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ("0".equalsIgnoreCase(result.getText().toString())) {
                    result.setText(" ");
                }
                result.setText(result.getText().toString() + "5");
            }
        });

        mBtnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ("0".equalsIgnoreCase(result.getText().toString())) {
                    result.setText(" ");
                }
                result.setText(result.getText().toString() + "6");
            }
        });

        mBtnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ("0".equalsIgnoreCase(result.getText().toString())) {
                    result.setText(" ");
                }
                result.setText(result.getText().toString() + "7");
            }
        });

        mBtnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ("0".equalsIgnoreCase(result.getText().toString())) {
                    result.setText(" ");
                }
                result.setText(result.getText().toString() + "8");
            }
        });

        mBtnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ("0".equalsIgnoreCase(result.getText().toString())) {
                    result.setText(" ");
                }
                result.setText(result.getText().toString() + "9");
            }
        });

        mBtnPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!result.getText().toString().contains(".")) {
                    result.setText(result.getText().toString() + ".");
                } else {
                }
            }
        });
    }
}