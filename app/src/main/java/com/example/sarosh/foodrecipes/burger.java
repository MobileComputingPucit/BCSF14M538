package com.example.sarosh.foodrecipes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class burger extends AppCompatActivity {

    TextView tvBurger;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.burger);

        tvBurger = (TextView) findViewById(R.id.tvBurger);
        Bundle getvalue = getIntent().getExtras();
        String value = getvalue.getString("valuesFromDatabase");
        tvBurger.setText(value);
    }
}
