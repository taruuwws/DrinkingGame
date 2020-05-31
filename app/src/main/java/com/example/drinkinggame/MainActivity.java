package com.example.drinkinggame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Context context = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = MainActivity.this;
    }

    public void goSpinTheBottle(View v) {
        startActivity(new Intent(MainActivity.this,PullonPyoritys.class));
    }

    public void goNeverHaveIEver(View v) {
        startActivity(new Intent(MainActivity.this,EnOleKoskaan.class));
    }
}
