package com.example.slaec;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button a;
EditText ed;
String st;
EditText ed1;
TextView tv;
String st1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a=findViewById(R.id.button5);
        ed =findViewById(R.id.editText);
        ed1=findViewById(R.id.editText2);
        tv=findViewById(R.id.textView);
        a.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                st1=ed1.getText().toString();
                st=ed.getText().toString();
                Toast.makeText(MainActivity.this, "logged in "+st+"  \n"+st1, Toast.LENGTH_SHORT).show();
                tv.setText(st+"\n"+st1);
            }
        });
    }
}
