package com.example.rajpu.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class next extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        Bundle b=getIntent().getExtras();
        String u = b.getString("user");
       // int p = b.getInt("password");
        String p = b.getString("password");




        TextView g = (TextView) findViewById(R.id.textView);

                if(u.equals("admin")&&(p.equals("1234")))
        g.setText("welcome");
        else
            g.setText("invalid");
    }
}
