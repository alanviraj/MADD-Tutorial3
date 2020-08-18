package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et1,et2 ;
    Button btnk;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.num1x);
        et2 = findViewById(R.id.num2x);
        btnk = findViewById(R.id.btnx_ok);


        btnk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //make test is a static method , context = 'where -one to another application or to one to anther function'
               /* Toast toast = Toast .makeText(getApplicationContext(),"sending message..." , Toast.LENGTH_LONG);
                toast.show();

                toast.setGravity(Gravity.TOP|Gravity.CENTER, 0,0);*/


                //Creating the LayoutInflater instance
                LayoutInflater li = getLayoutInflater();
                //Getting the View object as defined in the customtoast.xml file
                View layout = li.inflate(R.layout.layoutcustom, (ViewGroup)
                        findViewById(R.id.custom_toast_layout));
                //Creating the Toast object
                Toast toast = new Toast(getApplicationContext());
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                toast.setView(layout);//setting the view of custom toast layout
                toast.show();


                String n1 = et1.getText().toString();
                String n2 = et2.getText().toString();

                Intent i = new Intent(MainActivity.this , SecondActivity.class);

                i.putExtra("EXTRA_1" , n1);
                i.putExtra("EXTRA_2" , n2);

                startActivity(i);
            }
        });
    }
}
