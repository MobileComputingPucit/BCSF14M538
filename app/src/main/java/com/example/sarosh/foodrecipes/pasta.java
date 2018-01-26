package com.example.sarosh.foodrecipes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class pasta extends AppCompatActivity {

    TextView tvPasta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pasta);

        tvPasta = (TextView) findViewById(R.id.tvPasta);

        Bundle getvalue = getIntent().getExtras();
        String value = getvalue.getString("valuesFromDatabase");

        tvPasta.setText(value);

    }
}
