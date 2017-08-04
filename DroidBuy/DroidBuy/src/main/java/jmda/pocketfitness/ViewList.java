package jmda.pocketfitness;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class ViewList extends AppCompatActivity
{
    private DBHandler saveData;
    TableLayout table;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_list);
        saveData = saveData.getInstance(this);

        table = (TableLayout)this.findViewById(R.id.table);
        ArrayList<Product> all = saveData.getDietInfo();

        long count = saveData.countItem();

        for(int i = 0; i < count; i++) {
            TableRow row = (TableRow)LayoutInflater.from(this).inflate(R.layout.diet_format, null);
            String time = "" + all.get(i).getCalories();

            ((TextView)row.findViewById(R.id.product)).setText(all.get(i).getFood());
            ((TextView)row.findViewById(R.id.date)).setText(all.get(i).getDate());
            ((TextView)row.findViewById(R.id.quantity)).setText(time);
            table.addView(row);
        }
        table.requestLayout();
    }
}