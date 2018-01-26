package com.example.sarosh.foodrecipes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class manchurian extends AppCompatActivity {

    TextView tvManchurian;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manchurian);

        tvManchurian = (TextView) findViewById(R.id.tvManchurian);

        Bundle getvalue = getIntent().getExtras();
        String value = getvalue.getString("valuesFromDatabase");

        tvManchurian.setText(value);

    }
}
