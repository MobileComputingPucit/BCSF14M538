package com.example.sarosh.foodrecipes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class macroni extends AppCompatActivity {

    TextView tvMacroni;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.macroni);
        tvMacroni = (TextView) findViewById(R.id.tvMacroni);

        Bundle getvalue = getIntent().getExtras();
        String value = getvalue.getString("valuesFromDatabase");

        tvMacroni.setText(value);

    }
}
