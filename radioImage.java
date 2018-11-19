package com.example.combo.app15;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RadioButton r1,r2,r3;
    ImageView iv1;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r1 = (RadioButton)findViewById(R.id.radio1);
        r2 = (RadioButton)findViewById(R.id.radio2);
        r3 = (RadioButton)findViewById(R.id.radio3);
        iv1 = (ImageView)findViewById(R.id.imageView1);
        tv = (TextView)findViewById(R.id.textview1);

        r1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    iv1.setImageResource(R.drawable.a1);
                    tv.setText("CHICK");
                }
            }
        });

        r2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    iv1.setImageResource(R.drawable.a2);
                    tv.setText("RABBIT");
                }
            }
        });

        r3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    iv1.setImageResource(R.drawable.a3);
                    tv.setText("CAT");
                }
            }
        });
    }


}
