package jmda.pocketfitness;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import jmda.droidbuy.AddActivity;

public class MainMenuActivity extends AppCompatActivity implements View.OnClickListener
{
    private Intent intent;
    Button add;
    Button progress;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        add = (Button) findViewById(R.id.add);
        progress = (Button) findViewById(R.id.progress);


        add.setOnClickListener(this);
        progress.setOnClickListener(this);
    }

    public void onClick(View v)
    {

        switch (v.getId()) {

            case R.id.add:
                intent = new Intent(this, AddActivity.class);
                break;

            case R.id.progress:
                intent = new Intent(this, ViewList.class);
                break;
        }

        startActivity(intent);
    }
}
