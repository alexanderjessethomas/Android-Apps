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

public class AddSleepActivity extends AppCompatActivity implements View.OnClickListener
{
    private Intent addIntent;
    private DBHandler saveData;
    EditText sleep;
    Button add;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        saveData = saveData.getInstance(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_sleep);

        add = (Button) findViewById(R.id.add);
        this.addIntent = new Intent(this, ViewSleepActivity.class);
        add.setOnClickListener(this);
    }

    public void onClick(View v)
    {
        sleep = (EditText) findViewById(R.id.sleep);

        DateFormat df = new SimpleDateFormat("EEE, MMM d");
        String time = df.format(Calendar.getInstance().getTime());

        if (sleep.getText().toString().equals("clear"))
            saveData.clearTable("Sleep");
        else
            saveData.insertSleep(Float.parseFloat(sleep.getText().toString()), time);

        startActivity(addIntent);
    }
}
