package com.example.sarosh.foodrecipes;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseLockedException;

/**
 * Created by Sarosh on 1/25/2018.
 */
public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "recipe.db";
    public static final String TABLE_NAME = "pakistani_food";
    public static final String COL_1 = "ID";
    public static final String COL_2 = "NAME";
    public static final String COL_3 = "INGREDIENTS";
    public static final String COL_4 = "RECIPE";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table " + TABLE_NAME + "(ID INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL , NAME TEXT, INGREDIENTS TEXT, RECIPE TEXT)");


        ContentValues contentValues = new ContentValues();
        ContentValues contentValues2 = new ContentValues();
        ContentValues contentValues3 = new ContentValues();
        ContentValues contentValues4 = new ContentValues();


        contentValues.put(COL_2, "Biryani");
        contentValues.put(COL_3, "\n"+"Chicken ½ kg \n" +
                " Lal mirch powder (Red chili powder) 2 tsp or to taste\n" +
                "Haldee powder (Turmeric powder) ½ tsp\n" +
                "Dhania powder (Coriander powder) 1 tsp\n" +
                "Garam masala powder 1 tsp\n" +
                "Oil ½ Cup\n" +
                "Hari elaichi (Green cardamom) 3-4\n" +
                "Laung (Cloves) 4-5\n" +
                "Tez paat (Bay leaves) 2-3\n" +
                "Badiyan ka phool (Star anise) 1\n" +
                "Zeera (Cumin seeds) ½ tsp\n" +
                "Hari mirch (Green chilies) julienne 3-4\n" +
                "Adrak lehsan paste (Ginger garlic paste) 2 tbs\n" +
                "Tamatar (Tomato) 1 small\n" +
                "Namak (Salt) 1 tsp or to taste\n" +
                "Dahi (Yogurt) whisked ½ Cup\n" +
                "Zarda ka rang (Yellow food color) ½ tsp or as required\n" +
                "Chawal (Rice) Sella ½ kg (soaked & boiled with salt)\n" +
                "Pyaz (Onion) fried 1 medium\n" +
                "Hara dhania (Fresh coriander) chopped 2-3 tbs\n" +
                "Podina (Mint leaves) chopped 2-3 tbs\n" +
                "Hari mirch ka achar (Pickled green chilies) 2 tbs\n" +
                "Chawal (Rice) Sella boiled\n" +
                "Pyaz (Onion) fried 1 small\n" +
                "Kewra water 1 tbs\n");
        contentValues.put(COL_4, "\n "+"1.In chicken,add red chili powder,turmeric powder,coriander powder and garam masala powder,mix well and marinate for 15 minutes.\n" +
                "2.Cut pickled green chilies with the help of kitchen scissor & set aside.\n" +
                "3.In pot,add oil,green cardamom,cloves,bay leaves,star anise,cumin seeds and mix well.\n" +
                "4.Now add marinated chicken,green chilies and mix well.\n" +
                "5.Add ginger garlic paste and mix well for 2-3 minutes then cover and cook on low flame for 6-8 minutes.\n" +
                "6.Add tomato and salt,mix well and cook until tomatoes are soft.\n" +
                "7.Add yogurt and mix well,cover and cook for 5 minutes then cook on high flame until oil separates.\n" +
                "8.In yogurt,add yellow food color and mix well & add it in pot.\n" +
                "9.Cut pickled green chilies with the help of kitchen scissor & set aside.\n" +
                "10.Add half quantity of boiled rice,fried onion,fresh coriander,mint leaves,pickled green chilies,remaining  boiled rice,fried onion and kewra water.\n" +
                "11.Cover and steam cook on low flame for 8-10 minutes.");

        sqLiteDatabase.insert(TABLE_NAME, null, contentValues);


        contentValues2.put(COL_2, "White Chicken Karahi");
        contentValues2.put(COL_3, "chicken, spices");
        contentValues2.put(COL_4, "make it");

        sqLiteDatabase.insert(TABLE_NAME, null, contentValues2);

        contentValues3.put(COL_2, "Seekh Kabab");
        contentValues3.put(COL_3, "chopped chicken, spices");
        contentValues3.put(COL_4, "make it");

        sqLiteDatabase.insert(TABLE_NAME, null, contentValues3);


        contentValues4.put(COL_2, "Malai Boti");
        contentValues4.put(COL_3, "Chicken pieces,spices");
        contentValues4.put(COL_4, "make it");

        sqLiteDatabase.insert(TABLE_NAME, null, contentValues4);



    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }


}