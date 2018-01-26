package com.example.sarosh.foodrecipes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class italian extends AppCompatActivity {

    int[] IMAGES = {R.drawable.pasta, R.drawable.lasagna, R.drawable.sphagetto, R.drawable.macaroni};
    String[] NAME = {"Italian Pasta", "Chicken Lasagna", "Sphagetti with meatballs", "Macaroni and cheese"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.italian);

        //Finding the listView widget from XML File
        ListView listView = (ListView) findViewById(R.id.list_view);

        //Creating object of our custom List Adaptar to bind our data to list.
        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);

        //Set onClickListener for the change on item selection
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                            @Override
                                            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                                                if (i == 0){
                                                    Intent intent = new Intent(italian.this, pasta.class);
                                                    startActivity(intent);

                                                }

                                                else if (i == 1){
                                                    Intent intent = new Intent(italian.this, lasagna.class);
                                                    startActivity(intent);
                                                }

                                                else if (i == 2){
                                                    Intent intent = new Intent(italian.this, sphagetti.class);
                                                    startActivity(intent);
                                                }

                                                else if (i == 3){
                                                    Intent intent = new Intent(italian.this, macroni.class);
                                                    startActivity(intent);
                                                }
                                            }
                                        }
        );

    }


    class CustomAdapter extends BaseAdapter {

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

