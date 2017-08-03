package com.example.alexj.upintheclouds;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.io.*;

public class Game extends AppCompatActivity {
    Integer total = 0;
    Integer wordsfound = 0;
    String[] anagrams;
    TextView textViewScore;
    TextView textViewDisplay;
    TextView textViewPossible;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        Button buttonEnter = (Button) findViewById(R.id.buttonEnter);
        Button buttonMenu = (Button) findViewById(R.id.buttonMenu);
        Button buttonInstructions = (Button) findViewById(R.id.buttonInstructions);
        textViewScore = (TextView) findViewById(R.id.textViewScore);
        textViewPossible = (TextView) findViewById(R.id.textViewPossible);
        textViewDisplay = (TextView) findViewById(R.id.textViewDisplay);

        try{
            InputStreamReader userInput = new InputStreamReader(getAssets().open("anagrams.txt"));
            BufferedReader buffer = new BufferedReader(userInput);
            anagrams = buffer.readLine().split(" ");
            textViewDisplay.setText(anagrams[0]);
            total = anagrams.length - 1;
            textViewPossible.setText("Possible: " + total);
            textViewScore.setText("Score: " + wordsfound);
        }catch(IOException e){
            e.printStackTrace();
        }


        buttonEnter.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View sub) {
                EditText userInput = (EditText)findViewById(R.id.editTextUserInput);
                String submission = userInput.getText().toString();

                for(int i = 0; i < anagrams.length; i++){
                    if(anagrams[i] != null){
                        if(anagrams[i].equals(submission)){
                            wordsfound += 1;
                            textViewScore.setText("Score: " + wordsfound);
                            anagrams[i] = null;

                        }

                    }

                }
                userInput.setSelectAllOnFocus(true);
            }
        });

        buttonMenu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);

            }
        });
        buttonInstructions.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Instructions.class);
                startActivity(intent);

            }

        });
    }

}


