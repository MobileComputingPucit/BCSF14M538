package com.example.sarosh.foodrecipes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class karahi extends AppCompatActivity {

    TextView tvKarahi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.karahi);

        tvKarahi = (TextView) findViewById(R.id.tvKarahi);

        Bundle getvalue = getIntent().getExtras();
        String value = getvalue.getString("valuesFromDatabase");

        tvKarahi.setText(value);

    }
}
