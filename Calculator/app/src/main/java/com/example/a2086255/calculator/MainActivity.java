package com.example.a2086255.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private String result = "";
    private TextView textView;
    private View.OnClickListener clickListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button_1).setOnClickListener(this);
        findViewById(R.id.button_2).setOnClickListener(this);
        findViewById(R.id.button_3).setOnClickListener(this);
        findViewById(R.id.button_4).setOnClickListener(this);
        findViewById(R.id.button_5).setOnClickListener(this);
        findViewById(R.id.button_6).setOnClickListener(this);
        findViewById(R.id.button_7).setOnClickListener(this);
        findViewById(R.id.button_8).setOnClickListener(this);
        findViewById(R.id.button_9).setOnClickListener(this);
        findViewById(R.id.button_div).setOnClickListener(this);
        findViewById(R.id.button_multi).setOnClickListener(this);
        findViewById(R.id.button_rest).setOnClickListener(this);
        findViewById(R.id.button_plus).setOnClickListener(this);
        findViewById(R.id.button_point).setOnClickListener(this);
        textView = (TextView)findViewById(R.id.result);
    }

    @Override
    public void onClick(View v) {
        View contenedor = v.getRootView();
        switch (v.getId()){
            case R.id.button_0:
                textView.setText("0");
                break;
            case R.id.button_1:
                textView.setText("1");
                break;
            case R.id.button_2:
                textView.setText("2");
                break;
            case R.id.button_3:
                textView.setText("3");
                break;
            case R.id.button_4:
                textView.setText("4");
                break;
            case R.id.button_5:
                textView.setText("5");
                break;
            case R.id.button_6:
                textView.setText("6");
                break;
            case R.id.button_7:
                textView.setText("7");
                break;
            case R.id.button_8:
                textView.setText("8");
                break;
            case R.id.button_9:
                textView.setText("9");
                break;
            case R.id.button_multi:
                break;
            case R.id.button_div:
                break;
            case R.id.button_rest:
                break;
            case R.id.button_plus:
                break;
            case R.id.button_point:
                break;
        }
    }

}
