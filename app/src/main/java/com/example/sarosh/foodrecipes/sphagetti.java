package com.example.sarosh.foodrecipes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class sphagetti extends AppCompatActivity {

    TextView tvSphagetti;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sphagetti);

        tvSphagetti = (TextView) findViewById(R.id.tvSphagetti);

        Bundle getvalue = getIntent().getExtras();
        String value = getvalue.getString("valuesFromDatabase");

        tvSphagetti.setText(value);

    }
}
