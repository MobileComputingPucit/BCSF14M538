package com.example.sarosh.foodrecipes;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class fast extends AppCompatActivity {

    DatabaseHelper databaseHelper = new DatabaseHelper(this);
    String dbstring = "";

    int[] IMAGES = {R.drawable._burger, R.drawable.pizza, R.drawable.fried_chicken, R.drawable.fries};
    String[] NAME = {"Zinger Burger", "Pizza", "Fried Chicken", "Fries"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fast);

        //Finding the listView widget from XML File
        ListView listView = (ListView) findViewById(R.id.list_view);

        //Creating object of our custom List Adaptar to bind our data to list.
        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);

        //Set onClickListener for the change on item selection
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                            @Override
                                            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                                                if (i == 0) {

                                                    String name = "";
                                                    String ingredients = "";
                                                    String recipe = "";
                                                    SQLiteDatabase sqLiteDatabase = databaseHelper.getReadableDatabase();

                                                    String query1 = "SELECT * FROM fast_food WHERE ID_FAST='1'";


                                                    Cursor c = sqLiteDatabase.rawQuery(query1, null);

                                                    if (c.moveToFirst()) {
                                                        do {
                                                             name = c.getString(1);
                                                            ingredients = c.getString(2);
                                                            recipe = c.getString(3);

                                                        } while (c.moveToNext());

                                                        c.close();
                                                    }

                                                    dbstring = "Name: " + name + "\n" + "Ingredients: " + ingredients + "\n" + "Recipe: " + recipe;

                                                    Intent intent = new Intent(fast.this, burger.class);
                                                    intent.putExtra("valuesFromDatabase", dbstring);
                                                    startActivity(intent);

                                                    sqLiteDatabase.close();

                                                } else if (i == 1) {
                                                    String name = "";
                                                    String ingredients = "";
                                                    String recipe = "";
                                                    SQLiteDatabase sqLiteDatabase = databaseHelper.getReadableDatabase();

                                                    String query1 = "SELECT * FROM fast_food WHERE ID_FAST='2'";


                                                    Cursor c = sqLiteDatabase.rawQuery(query1, null);

                                                    if (c.moveToFirst()) {
                                                        do {
                                                            name = c.getString(1);
                                                            ingredients = c.getString(2);
                                                            recipe = c.getString(3);

                                                        } while (c.moveToNext());

                                                        c.close();
                                                    }

                                                    dbstring = "Name: " + name + "\n" + "Ingredients: " + ingredients + "\n" + "Recipe: " + recipe;

                                                    Intent intent = new Intent(fast.this, pizza.class);
                                                    intent.putExtra("valuesFromDatabase", dbstring);
                                                    startActivity(intent);

                                                    sqLiteDatabase.close();

                                                } else if (i == 2) {
                                                    String name = "";
                                                    String ingredients = "";
                                                    String recipe = "";
                                                    SQLiteDatabase sqLiteDatabase = databaseHelper.getReadableDatabase();

                                                    String query1 = "SELECT * FROM fast_food WHERE ID_FAST='3'";


                                                    Cursor c = sqLiteDatabase.rawQuery(query1, null);

                                                    if (c.moveToFirst()) {
                                                        do {
                                                            name = c.getString(1);
                                                            ingredients = c.getString(2);
                                                            recipe = c.getString(3);

                                                        } while (c.moveToNext());

                                                        c.close();
                                                    }

                                                    dbstring = "Name: " + name + "\n" + "Ingredients: " + ingredients + "\n" + "Recipe: " + recipe;

                                                    Intent intent = new Intent(fast.this, fried_chicken.class);
                                                    intent.putExtra("valuesFromDatabase", dbstring);
                                                    startActivity(intent);

                                                    sqLiteDatabase.close();
                                                } else if (i == 3) {

                                                    String name = "";
                                                    String ingredients = "";
                                                    String recipe = "";
                                                    SQLiteDatabase sqLiteDatabase = databaseHelper.getReadableDatabase();

                                                    String query1 = "SELECT * FROM fast_food WHERE ID_FAST='4'";


                                                    Cursor c = sqLiteDatabase.rawQuery(query1, null);

                                                    if (c.moveToFirst()) {
                                                        do {
                                                             name = c.getString(1);
                                                            ingredients = c.getString(2);
                                                            recipe = c.getString(3);

                                                        } while (c.moveToNext());

                                                        c.close();
                                                    }

                                                    dbstring = "Name: " + name + "\n" + "Ingredients: " + ingredients + "\n" + "Recipe: " + recipe;

                                                    Intent intent = new Intent(fast.this, fries.class);
                                                    intent.putExtra("valuesFromDatabase", dbstring);
                                                    startActivity(intent);

                                                    sqLiteDatabase.close();

                                                }
                                            }

                                        }
        );
    }

        class CustomAdapter extends BaseAdapter{

            @Override
            public int getCount() {
                // This will tell the total number of items in the list
                return IMAGES.length;
            }

            @Override
            public Object getItem(int i) {
                return null;
            }

            @Override
            public long getItemId(int i) {

                return 0;
            }

            @Override
            public View getView(int i, View view, ViewGroup viewGroup) {


                //It will help to show the layout we created in custom_layout.xml
                view = getLayoutInflater().inflate(R.layout.customlayout,null);

                //Getting references of widgets inside variables
                ImageView imageView = (ImageView) view.findViewById(R.id.product_picture);
                TextView tv_Categories = (TextView) view.findViewById(R.id.tvFoodName);

                //setting array values to custom list view
                imageView.setImageResource(IMAGES[i]);
                tv_Categories.setText(NAME[i]);

                return view;
            }

    }

}