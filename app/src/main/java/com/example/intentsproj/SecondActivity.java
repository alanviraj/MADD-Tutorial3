package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    Button btnAdd;
    String n1 ;
    String n2;
    EditText etn1 , etn2 ;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

            Intent i = getIntent();
            n1 = i.getStringExtra("EXTRA_1");
            n2 = i.getStringExtra("EXTRA_2");

            TextView tv1 = findViewById(R.id.num1_x2);
            tv1.setText(n1);
            TextView tv2 = findViewById(R.id.num2_x2);
            tv2.setText(n2);


            Button btn = findViewById(R.id.add_btn);
            Button btn1 = findViewById(R.id.sub_btn);
            Button btn2 = findViewById(R.id.mul_btn);
            Button btn3 = findViewById(R.id.div_btn);

            //set the edit text to the numbers received

            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    //retrieve the value from edit text

                    EditText out1 = findViewById(R.id.num1_x2);
                    EditText out2 = findViewById(R.id.num2_x2);

                    String val1 = out1.getText().toString();
                    String val2 = out2.getText().toString();


                    int res = Integer.parseInt(val1) +  Integer.parseInt(val2);

                    String result = "";
                    String value = Integer.toString(res);

                    result = val1+ "+" + val2 + "=" + value ;

                    TextView tv = findViewById(R.id.final_result);
                    tv.setText(result);

                }
            });

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    EditText out1 = findViewById(R.id.num1_x2);
                    EditText out2 = findViewById(R.id.num2_x2);

                    String val1 = out1.getText().toString();
                    String val2 = out2.getText().toString();

                    int res = Integer.parseInt(val1)  -  Integer.parseInt(val2);

                    String result = "";
                    String value = Integer.toString(res);

                    result = val1+ "-" + val2+ "=" + value ;

                    TextView tv = findViewById(R.id.final_result);
                    tv.setText(result);

                }
            });

            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    EditText out1 = findViewById(R.id.num1_x2);
                    EditText out2 = findViewById(R.id.num2_x2);

                    String val1 = out1.getText().toString();
                    String val2 = out2.getText().toString();

                    int res = Integer.parseInt(val1) *  Integer.parseInt(val2);

                    String result = "";
                    String value = Integer.toString(res);

                    result = val1+ "*" + val2 + "=" + value ;

                    TextView tv = findViewById(R.id.final_result);
                    tv.setText(result);

                }
            });


            btn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    EditText out1 = findViewById(R.id.num1_x2);
                    EditText out2 = findViewById(R.id.num2_x2);

                    String val1 = out1.getText().toString();
                    String val2 = out2.getText().toString();

                    int res = Integer.parseInt(val1) /  Integer.parseInt(val2);

                    String result = "";
                    String value = Integer.toString(res);

                    result = val1+ "/" + val2 + "=" + value ;

                    TextView tv = findViewById(R.id.final_result);
                    tv.setText(result);
                }
            });

    }
}
