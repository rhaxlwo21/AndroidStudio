package com.example.combo.app_98;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.textservice.TextInfo;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2,e3;
    CheckBox ch1;
    RadioButton r1,r2;
    ImageView img1;
    Button btn1;
    TextView t1,t2,t3,re1,re2,re3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("주문");

        e1 = (EditText)findViewById(R.id.edit1);
        e2 = (EditText)findViewById(R.id.edit2);
        e3 = (EditText)findViewById(R.id.edit3);
        ch1 = (CheckBox)findViewById(R.id.check1);
        r1 = (RadioButton)findViewById(R.id.radio1);
        r2 = (RadioButton)findViewById(R.id.radio2);
        img1 = (ImageView)findViewById(R.id.image);
        btn1 = (Button)findViewById(R.id.button1);
        t1 = (TextView)findViewById(R.id.text1);
        t2 = (TextView)findViewById(R.id.text2);
        t3 = (TextView)findViewById(R.id.text3);
        re1 = (TextView)findViewById(R.id.result1);
        re2 = (TextView)findViewById(R.id.result2);
        re3 = (TextView)findViewById(R.id.result3);

        r1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(r1.isChecked()==true)
                    img1.setImageResource(R.drawable.a1);
            }
        });

        r2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(r2.isChecked()==true)
                    img1.setImageResource(R.drawable.a2);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String piza = e1.getText().toString();
                String don = e2.getText().toString();
                String sal = e3.getText().toString();

                int cnt1 = Integer.parseInt(piza);
                int cnt2 = Integer.parseInt(don);
                int cnt3 = Integer.parseInt(sal);

                int count = cnt1 + cnt2 + cnt3;
                int sum = cnt1 * 15000 + cnt2 * 10000 + cnt3 * 5000;
                if(ch1.isChecked())
                    sum = sum * 95/100;

                re1.setText("주문 개수 :"+ count);
                re2.setText("주문 금액 :"+ sum);
                if(r1.isChecked())
                    re3.setText("피클이 선택되었습니다.");
                else
                    re3.setText("소스가 선택되었습니다.");
            }
        });
    }
}
