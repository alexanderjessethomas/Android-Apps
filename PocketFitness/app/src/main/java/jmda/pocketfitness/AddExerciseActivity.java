package jmda.pocketfitness;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class AddExerciseActivity extends AppCompatActivity implements View.OnClickListener
{
    private Intent viewIntent;
    private DBHandler saveData;
    EditText activity;
    EditText time_spent;
    Button add;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        saveData = saveData.getInstance(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_exercise);

        add = (Button) findViewById(R.id.add);
        this.viewIntent = new Intent(this, ViewExerciseActivity.class);
        add.setOnClickListener(this);
    }

    public void onClick(View v)
    {
        activity = (EditText) findViewById(R.id.activity);
        time_spent = (EditText) findViewById(R.id.time);

        DateFormat df = new SimpleDateFormat("EEE, MMM d");
        String time = df.format(Calendar.getInstance().getTime());

        if (activity.getText().toString().equals("clear"))
            saveData.clearTable("Exercise");
        else
            saveData.insertExercise(activity.getText().toString(), Float.parseFloat(time_spent.getText().toString()), time);

        startActivity(viewIntent);
    }
}