package com.example.sarosh.foodrecipes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class chowmein extends AppCompatActivity {

    TextView tvChowmein;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chowmein);
        tvChowmein = (TextView) findViewById(R.id.tvChowmein);

        Bundle getvalue = getIntent().getExtras();
        String value = getvalue.getString("valuesFromDatabase");

        tvChowmein.setText(value);

    }
}
