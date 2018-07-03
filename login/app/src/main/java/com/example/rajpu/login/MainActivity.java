package com.example.rajpu.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b =(Button) findViewById(R.id.button);

        b.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(),next.class);
                EditText et = (EditText)findViewById(R.id.editText3);
              i.putExtra("user",et.getText().toString());
                EditText eg = (EditText)findViewById(R.id.editText4);
                i.putExtra("password",eg.getText().toString());


                startActivity(i);
            }
        });
    }
}

