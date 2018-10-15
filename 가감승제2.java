package com.example.combo1.app12;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et1, et2;
    Button btA, btS, btM, btD;
    TextView tv1;
    int num1, num2, rst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.edit1);
        et2 = (EditText)findViewById(R.id.edit2);
        btA = (Button)findViewById(R.id.btnA);
        btS = (Button)findViewById(R.id.btnS);
        btM = (Button)findViewById(R.id.btnM);
        btD = (Button)findViewById(R.id.btnD);
        tv1 = (TextView)findViewById(R.id.erst);

        View.OnClickListener clisten = new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //입력값 가져오기
                num1 = Integer.parseInt(et1.getText().toString());
                num2 = Integer.parseInt(et2.getText().toString());
                //계산하기
                switch(v.getId()){
                    case R.id.btnA:
                        rst = num1 + num2;
                        break;
                    case R.id.btnS:
                        rst = num1 - num2;
                        break;
                    case R.id.btnM:
                        rst = num1 * num2;
                        break;
                    case R.id.btnD:
                        rst = num1 / num2;
                        break;
                }
                tv1.setText("RESULT : "+rst);
            }
        };

        btA.setOnClickListener(clisten);
        btS.setOnClickListener(clisten);
        btM.setOnClickListener(clisten);
        btD.setOnClickListener(clisten);
    }
}
