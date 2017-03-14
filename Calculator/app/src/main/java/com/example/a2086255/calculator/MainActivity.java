package com.example.a2086255.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Stack;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView textView;
    private View.OnClickListener clickListener;
    private Stack pila;
    private double resultado;
    private boolean point;
    private double num;
    private double v1;
    private double v2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button_0).setOnClickListener(this);
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
        findViewById(R.id.button_ac).setOnClickListener(this);
        findViewById(R.id.button_inver).setOnClickListener(this);
        findViewById(R.id.button_sin).setOnClickListener(this);
        findViewById(R.id.button_cos).setOnClickListener(this);
        findViewById(R.id.button_tan).setOnClickListener(this);
        textView = (TextView)findViewById(R.id.result);
        pila = new Stack();
        resultado = 0;
        point = false;
    }

    @Override
    public void onClick(View v) {
        View contenedor = v.getRootView();
        switch (v.getId()){
            case R.id.button_0:
                num = 0;
                if(point){pointFuntion(v1,num);}
                else{pila.push(num);}
                textView.setText("0.0");
                break;
            case R.id.button_1:
                textView.setText("1.0");
                num = 1;
                if(point){pointFuntion(v1,num);}
                else{pila.push(num);}
                break;
            case R.id.button_2:
                textView.setText("2.0");
                num = 2;
                if(point){pointFuntion(v1,num);}
                else{pila.push(num);};
                break;
            case R.id.button_3:
                textView.setText("3.0");
                num = 3;
                if(point){pointFuntion(v1,num);}
                else{pila.push(num);}
                break;
            case R.id.button_4:
                textView.setText("4.0");
                num = 4;
                if(point){pointFuntion(v1,num);}
                else{pila.push(num);}
                break;
            case R.id.button_5:
                textView.setText("5.0");
                num = 5;
                if(point){pointFuntion(v1,num);}
                else{pila.push(num);}
                break;
            case R.id.button_6:
                textView.setText("6.0");
                num = 6;
                if(point){pointFuntion(v1,num);}
                else{pila.push(num);}
                break;
            case R.id.button_7:
                textView.setText("7.0");
                num = 7;
                if(point){pointFuntion(v1,num);}
                else{pila.push(num);}
                break;
            case R.id.button_8:
                textView.setText("8.0");
                num = 8;
                if(point){pointFuntion(v1,num);}
                else{pila.push(num);}
                break;
            case R.id.button_9:
                textView.setText("9.0");
                num = 9;
                if(point){pointFuntion(v1,num);}
                else{pila.push(num);}
                break;
            case R.id.button_multi:
                if(pila.size()>=2){
                    v1=(double)pila.pop();
                    v2=(double)pila.pop();
                    num = v2*v1;
                    pila.push(num);
                    textView.setText(""+num);
                }
                break;
            case R.id.button_div:
                if(pila.size()>=2){
                    v1=(double)pila.pop();
                    v2=(double)pila.pop();
                    num = v2/v1;
                    pila.push(num);
                    textView.setText(""+num);
                }
                break;
            case R.id.button_rest:
                if(pila.size()>=2){
                    v1=(double)pila.pop();
                    v2=(double)pila.pop();
                    num = v2-v1;
                    pila.push(num);
                    textView.setText(""+num);
                }
                break;
            case R.id.button_plus:
                if(pila.size()>=2){
                    v1=(double)pila.pop();
                    v2=(double)pila.pop();
                    num = v2+v1;
                    pila.push(num);
                    textView.setText(""+num);
                }
                break;
            case R.id.button_point:
                    v1 = (double)pila.pop();
                    point = true;
                break;
            case R.id.button_ac:
                pila.clear();
                textView.setText("0.0");
                break;
            case R.id.button_inver:
                v1 = (double)pila.pop();
                pila.push(-v1);
                textView.setText(""+(-v1));
                break;
            case R.id.button_sin:
                v1 = (double)pila.pop();
                v2 = Math.sin(v1);
                pila.push(v2);
                textView.setText(""+v2);
                break;
            case R.id.button_cos:
                v1 = (double)pila.pop();
                v2 = Math.cos(v1);
                pila.push(v2);
                textView.setText(""+v2);
                break;
            case R.id.button_tan:
                v1 = (double)pila.pop();
                v2 = Math.tan(v1);
                pila.push(v2);
                textView.setText(""+v2);
                break;
        }
    }

    private void pointFuntion(double v1, double v2){
        double r = v1 +(v2/10);
        pila.push(r);
        textView.setText(""+r);
        point = false;
    }
}
