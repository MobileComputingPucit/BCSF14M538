package com.example.sarosh.foodrecipes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class lasagna extends AppCompatActivity {

    TextView tvLasagna;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lasagna);

        tvLasagna = (TextView) findViewById(R.id.tvLasagna);

        Bundle getvalue = getIntent().getExtras();
        String value = getvalue.getString("valuesFromDatabase");

        tvLasagna.setText(value);

    }
}
