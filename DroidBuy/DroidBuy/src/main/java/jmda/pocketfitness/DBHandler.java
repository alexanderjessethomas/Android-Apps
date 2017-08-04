package jmda.pocketfitness;

import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.Context;
import android.content.ContentValues;
import android.database.Cursor;
import java.util.ArrayList;

public class DBHandler extends SQLiteOpenHelper
{
    private static final String DATABASE_NAME = "inventoryApp.db";
    private static final int DATABASE_VERSION = 1;
    private static final String TABLE_NAME_1 = "products";


    public static final String KEY_ID = "_id";
    public static final String PRODUCT = "product";
    public static final String Quantity = "calories";
    public static final String DATE = "date";

    private static DBHandler instance = null;
    private SQLiteDatabase db = getWritableDatabase();

    public static DBHandler getInstance(Context context)
    {
        if (instance == null) {
            instance = new DBHandler(context);
        }
        return instance;
    }

    private DBHandler(Context context)
    {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        String sql = "CREATE TABLE " + TABLE_NAME_1 + " (" + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + PRODUCT + " TEXT, " + Quantity + " FLOAT, " + DATE + " TEXT" + ");";
        db.execSQL(sql);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME_1);

        onCreate(db);
    }

    public void insertDiet(String product, float calories, String date)
    {
        ContentValues values = new ContentValues();

        values.put(PRODUCT, product);
        values.put(Quantity, calories);
        values.put(DATE, date);

        db.insertOrThrow(TABLE_NAME_1, null, values);
    }




    public ArrayList<Product> getDietInfo()
    {
        ArrayList<Product> list = new ArrayList<>();
        String[] from = {PRODUCT, Quantity, DATE};
        SQLiteDatabase db = getReadableDatabase();

        Cursor cursor = db.query(TABLE_NAME_1, from, null, null, null, null, "_id DESC");

        if (cursor.moveToFirst()) {
            do {
                Product product = new Product(cursor.getString(0), cursor.getFloat(1), cursor.getString(2));
                list.add(product);
            } while (cursor.moveToNext());
        }

        cursor.close();
        return list;
    }

    public long countItem(){
        SQLiteDatabase db = getReadableDatabase();
        return DatabaseUtils.queryNumEntries(db, TABLE_NAME_1);
    }


    public void clearTable(String table)
    {
        SQLiteDatabase db = getWritableDatabase();
        String sql = "DELETE FROM " + table;
        db.execSQL(sql);
    }
}
