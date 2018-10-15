package com.example.combo1.app11;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText e1, e2;
    Button btnA, btnS, btnM, btnD;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = (EditText)findViewById(R.id.edit1);
        e2 = (EditText)findViewById(R.id.edit2);
        btnA = (Button)findViewById(R.id.buttonA);
        btnS = (Button)findViewById(R.id.buttonS);
        btnM = (Button)findViewById(R.id.buttonM);
        btnD = (Button)findViewById(R.id.buttonD);
        tv = (TextView)findViewById(R.id.result);

        btnA.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //입력값 가져오기
                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();

                //문자를 숫자로 바꾼다
                int n1 = Integer.parseInt(s1);
                int n2 = Integer.parseInt(s2);

                //더하기
                int sum = n1 + n2;

                //결과값 보여주기
                tv .setText("Result by ADD: "+ sum);
            }
            });

        btnS.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //입력값 숫자로 가져오기
                int n1 = Integer.parseInt(e1.getText().toString());
                int n2 = Integer.parseInt(e2.getText().toString());
                //빼기
                int sum = n1 - n2;
                //결과 보여주기
                tv.setText("Result by Sub: "+sum);
            }
        });

        btnM.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v){
               //입력 받은 값 가져오기
               String s1 = e1.getText().toString();
               String s2 = e2.getText().toString();
               //문자를 숫자로 바꾸기
               int n1 = Integer.parseInt(s1);
               int n2 = Integer.parseInt(s2);
               //곱하기
               int sum = n1 * n2;
               //결과 보여주기
               tv.setText("Result by MUL: "+sum);
           }
        });

        btnD.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v){
               //입력값 숫자로 가져오기
               int n1 = Integer.parseInt(e1.getText().toString());
               int n2 = Integer.parseInt(e2.getText().toString());
               //나누기
               int sum = n1 / n2;
               //결과 보여주기
               tv.setText("Result bt DIV: "+ sum);
           }
        });
    }
}
