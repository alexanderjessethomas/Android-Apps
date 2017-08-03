package com.example.alexj.upintheclouds;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class Instructions extends AppCompatActivity implements View.OnClickListener {
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instructions);

        Button buttonMenu = (Button) findViewById(R.id.buttonInstructions);
        buttonMenu.setOnClickListener(this);
    }

    public void onClick(View v)
    {

        switch (v.getId()) {
            case R.id.buttonMenu:
                intent = new Intent(this, MainActivity.class);
                break;
        }

        startActivity(intent);
    }

}
