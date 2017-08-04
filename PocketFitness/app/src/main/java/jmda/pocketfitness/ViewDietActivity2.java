package jmda.pocketfitness;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class ViewDietActivity2 extends AppCompatActivity
{
    private DBHandler saveData;
    TableLayout table;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_diet);
        saveData = saveData.getInstance(this);

        table = (TableLayout)this.findViewById(R.id.table);
        ArrayList<Diet> all = saveData.getDietInfo();

        long count = saveData.countDiet();

        for(int i = 0; i < count; i++) {
            TableRow row = (TableRow)LayoutInflater.from(this).inflate(R.layout.diet_format, null);
            String time = "" + all.get(i).getCalories();

            ((TextView)row.findViewById(R.id.food)).setText(all.get(i).getFood());
            ((TextView)row.findViewById(R.id.date)).setText(all.get(i).getDate());
            ((TextView)row.findViewById(R.id.calories)).setText(time);
            table.addView(row);
        }
        table.requestLayout();
    }
}