package jmda.droidbuy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import jmda.pocketfitness.DBHandler;
import jmda.pocketfitness.R;
import jmda.pocketfitness.ViewList;

public class AddActivity extends AppCompatActivity implements View.OnClickListener
{
    private Intent viewIntent;
    private DBHandler saveData;
    Button add;
    EditText product;
    EditText quantity;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        saveData = saveData.getInstance(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_product);

        add = (Button) findViewById(R.id.add);
        this.viewIntent = new Intent(this, ViewList.class);
        add.setOnClickListener(this);
    }

    public void onClick(View v)
    {
        product = (EditText) findViewById(R.id.product);
        quantity = (EditText) findViewById(R.id.quantity);

        DateFormat df = new SimpleDateFormat("EEE, MMM d");
        String time = df.format(Calendar.getInstance().getTime());

        if (product.getText().toString().length() == 0)
            saveData.clearTable("Product");
        else if (quantity.getText().toString().length() == 0)
            saveData.insertDiet(product.getText().toString(), 0, time);
        else
            saveData.insertDiet(product.getText().toString(), Float.parseFloat(quantity.getText().toString()), time);

        startActivity(viewIntent);
    }
}