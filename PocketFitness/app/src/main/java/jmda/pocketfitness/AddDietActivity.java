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

public class AddDietActivity extends AppCompatActivity implements View.OnClickListener
{
    private Intent viewIntent;
    private DBHandler saveData;
    Button add;
    EditText food;
    EditText calories;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        saveData = saveData.getInstance(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_diet);

        add = (Button) findViewById(R.id.add);
        this.viewIntent = new Intent(this, ViewDietActivity.class);
        add.setOnClickListener(this);
    }

    public void onClick(View v)
    {
        food = (EditText) findViewById(R.id.food);
        calories = (EditText) findViewById(R.id.calories);

        DateFormat df = new SimpleDateFormat("EEE, MMM d");
        String time = df.format(Calendar.getInstance().getTime());

        if (food.getText().toString().length() == 0)
            saveData.clearTable("Diet");
        else if (calories.getText().toString().length() == 0)
            saveData.insertDiet(food.getText().toString(), 0, time);
        else
            saveData.insertDiet(food.getText().toString(), Float.parseFloat(calories.getText().toString()), time);

        startActivity(viewIntent);
    }
}