package com.example.sarosh.foodrecipes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class shashlik extends AppCompatActivity {

    TextView tvShashlik;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shashlik);

        tvShashlik = (TextView) findViewById(R.id.tvShashlik);

        Bundle getvalue = getIntent().getExtras();
        String value = getvalue.getString("valuesFromDatabase");

        tvShashlik.setText(value);

    }
}
