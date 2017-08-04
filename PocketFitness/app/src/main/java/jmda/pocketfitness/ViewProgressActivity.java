package jmda.pocketfitness;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ViewProgressActivity extends AppCompatActivity implements View.OnClickListener
{
    private Intent intent;
    Button btn1;
    Button btn2;
    Button btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_progress);

        btn1 = (Button) findViewById(R.id.button1);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
    }

    public void onClick(View v)
    {
        switch (v.getId()) {
            case R.id.button1:
                intent = new Intent(this, ViewExerciseActivity2.class);
                break;
            case R.id.button2:
                intent = new Intent(this, ViewDietActivity2.class);
                break;
            case R.id.button3:
                intent = new Intent(this, ViewSleepActivity2.class);
                break;
        }

        startActivity(intent);
    }
}