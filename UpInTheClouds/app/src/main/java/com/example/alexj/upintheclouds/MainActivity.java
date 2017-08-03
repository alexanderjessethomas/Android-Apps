package com.example.alexj.upintheclouds;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonStart = (Button) findViewById(R.id.buttonStart);
        Button buttonInstructions = (Button) findViewById(R.id.buttonInstructions);

        buttonInstructions.setOnClickListener(this);
        buttonStart.setOnClickListener(this);
    }
    public void onClick(View v)
    {

        switch (v.getId()) {
            case R.id.buttonInstructions:
                intent = new Intent(this, Instructions.class);
                break;
            case R.id.buttonStart:
                intent = new Intent(this, Game.class);
                break;

        }

        startActivity(intent);
    }
}
