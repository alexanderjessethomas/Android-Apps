package com.example.alexj.rockpaperscissors;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button rockButton;
    Button paperButton;
    Button scissorsButton;
    TextView scoreView;
    ImageView YourChoice;
    ImageView ComputerChoice;
    int yourScore = 0;
    int computerScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rockButton = (Button)findViewById(R.id.rockButton);
        paperButton = (Button)findViewById(R.id.paperButton);
        scissorsButton = (Button)findViewById(R.id.scissorsButton);

        YourChoice = (ImageView)findViewById(R.id.YourChoice);
        ComputerChoice = (ImageView)findViewById(R.id.ComputerChoice);

        scoreView = (TextView)findViewById(R.id.scoreView);

        rockButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                YourChoice.setImageResource(R.drawable.rock);
                String message = computerTurn("rock");
                Toast.makeText(MainActivity.this, message, Toast.LENGTH_LONG).show();
                scoreView.setText("Score: Your's " + Integer.toString(yourScore) + " Computer's " + Integer.toString(computerScore));
            }
        });

        paperButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                YourChoice.setImageResource(R.drawable.paper);
                String message = computerTurn("paper");
                Toast.makeText(MainActivity.this, message, Toast.LENGTH_LONG).show();
                scoreView.setText("Score: Your's " + Integer.toString(yourScore) + " Computer's " + Integer.toString(computerScore));
            }
        });

        scissorsButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                YourChoice.setImageResource(R.drawable.scissors);
                String message = computerTurn("scissors");
                Toast.makeText(MainActivity.this, message, Toast.LENGTH_LONG).show();
                scoreView.setText("Score: Your's " + Integer.toString(yourScore) + " Computer's " + Integer.toString(computerScore));
            }
        });
    }

    public String computerTurn(String choice){
        String computerChoice = "";
        Random number = new Random();
        int choiceNumber = number.nextInt(3) + 1;

        if(choiceNumber ==1){
            computerChoice = "rock";
            ComputerChoice.setImageResource(R.drawable.rock);
        }else if(choiceNumber ==2){
            computerChoice = "paper";
            ComputerChoice.setImageResource(R.drawable.paper);
        }else if (choiceNumber ==3){
            computerChoice = "scissors";
            ComputerChoice.setImageResource(R.drawable.scissors);
        }


        if(computerChoice == choice){
            return "Draw, you and the computer think alike.";
        }else if(choice == "rock" && computerChoice == "scissors"){
            yourScore++;
            return "Rock beats scissors. Congrats you beat the Computer!!";
        }else if(computerChoice == "rock" && choice == "scissors"){
            computerScore++;
            return "Rock beats scissors. The computer beat you :(";
        }else if(choice == "paper" && computerChoice == "rock"){
            yourScore++;
            return "Paper beats rock. Congrats you beat the Computer!!";
        }else if(computerChoice == "paper" && choice == "rock"){
            computerScore++;
            return "Paper beats rock. The computer beat you :(";
        }else if(choice == "scissors" && computerChoice == "paper"){
            yourScore++;
            return "Scissors beat paper. Congrats you beat the Computer!!";
        }else if(computerChoice == "scissors" && choice == "paper") {
            computerScore++;
            return "Scissors beat paper. The computer beat you :(";
        }else
            return "Error: you should never see this.";
    }

}
