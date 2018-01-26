package com.example.sarosh.foodrecipes;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;
import android.widget.ListView;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import android.widget.BaseAdapter;

import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity {

    TextView pakistaniText, fastText, chineseText, italianText;
    ImageView pakistani, fast, chinese, italian;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pakistaniText = (TextView) findViewById(R.id.pakistaniText);
        fastText = (TextView) findViewById(R.id.fastText);
        chineseText = (TextView) findViewById(R.id.chineseText);
        italianText = (TextView) findViewById(R.id.italianText);

        pakistani = (ImageView) findViewById(R.id.pakistani);
        fast = (ImageView) findViewById(R.id.fast);
        chinese = (ImageView) findViewById(R.id.chinese);
        italian = (ImageView) findViewById(R.id.italian);

    }

    public void onClick(View view)
    {
        if(view.getId()==R.id.pakistani){
            Intent intent = new Intent(MainActivity.this, pakistani.class);
            startActivity(intent);
        }

        else if(view.getId()==R.id.fast){
            Intent intent = new Intent(MainActivity.this, fast.class);
            startActivity(intent);
        }

        else if(view.getId()==R.id.chinese){
            Intent intent = new Intent(MainActivity.this, chinese.class);
            startActivity(intent);
        }

        else if(view.getId()==R.id.italian){
            Intent intent = new Intent(MainActivity.this, italian.class);
            startActivity(intent);
        }
    }


}

