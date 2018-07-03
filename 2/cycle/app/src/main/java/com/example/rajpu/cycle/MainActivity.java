package com.example.rajpu.cycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);}
        @Override
                protected void onStart() {
            super.onStart();

            Toast.makeText(MainActivity.this, "cycle Started", Toast.LENGTH_SHORT).show();

        }

    @Override
    protected void onStop() {
        super.onStop();

        Toast.makeText(MainActivity.this, "cycle Stop", Toast.LENGTH_SHORT).show();

    } @Override
    protected void onPause() {
        super.onPause();

        Toast.makeText(MainActivity.this, "cycle pause", Toast.LENGTH_SHORT).show();

    }
    @Override
    protected void onResume() {
        super.onResume();

        Toast.makeText(MainActivity.this, "cycle resume", Toast.LENGTH_SHORT).show();

    }
    @Override
    protected void onRestart() {
        super.onRestart();

        Toast.makeText(MainActivity.this, "cycle restart", Toast.LENGTH_SHORT).show();

    }
    @Override
    protected void onDestroy() {
        super.onDestroy();

        Toast.makeText(MainActivity.this, "cycle destroy", Toast.LENGTH_SHORT).show();

    }




}

