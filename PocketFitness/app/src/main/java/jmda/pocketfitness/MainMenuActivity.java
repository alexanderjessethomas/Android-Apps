package jmda.pocketfitness;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainMenuActivity extends AppCompatActivity implements View.OnClickListener
{
    private Intent intent;
    Button profile;
    Button diet;
    Button exercise;
    Button sleep;
    Button progress;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        profile = (Button) findViewById(R.id.profile);
        diet = (Button) findViewById(R.id.diet);
        exercise = (Button) findViewById(R.id.exercise);
        sleep = (Button) findViewById(R.id.sleep);
        progress = (Button) findViewById(R.id.progress);

        profile.setOnClickListener(this);
        diet.setOnClickListener(this);
        exercise.setOnClickListener(this);
        sleep.setOnClickListener(this);
        progress.setOnClickListener(this);
    }

    public void onClick(View v)
    {

        switch (v.getId()) {
            case R.id.profile:
                intent = new Intent(this, ProfilePageActivity.class);
                break;
            case R.id.diet:
                intent = new Intent(this, AddDietActivity.class);
                break;
            case R.id.exercise:
                intent = new Intent(this, AddExerciseActivity.class);
                break;
            case R.id.sleep:
                intent = new Intent(this, AddSleepActivity.class);
                break;
            case R.id.progress:
                intent = new Intent(this, ViewProgressActivity.class);
                break;
        }

        startActivity(intent);
    }
}
