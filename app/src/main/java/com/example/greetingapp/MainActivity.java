/**
 make changes in xml java and drawable


 Section 7
 video no 72

 The Greeting app

 
 */
package com.example.greetingapp;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tv1;
    EditText et1;
    Button bt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1=findViewById(R.id.tectview1);
        et1=findViewById(R.id.editview1);
        bt1=findViewById(R.id.button1);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String name =et1.getText().toString();
                Toast.makeText(MainActivity.this, "Hello "+name, Toast.LENGTH_LONG).show();
            }
        });
    }
}