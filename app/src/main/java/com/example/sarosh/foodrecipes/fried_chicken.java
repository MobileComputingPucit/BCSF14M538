package com.example.sarosh.foodrecipes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class fried_chicken extends AppCompatActivity {
TextView tvFriedChicken;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fried_chicken);

        tvFriedChicken = (TextView) findViewById(R.id.tvFriedChicken);

        Bundle getvalue = getIntent().getExtras();
        String value = getvalue.getString("valuesFromDatabase");

        tvFriedChicken.setText(value);
    }
}
