package com.example.korisnik.findme;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TabHost;
import android.widget.TextView;

import static android.R.attr.host;

/**
 * Created by Korisnik on 7.10.2017..
 */

public class ResultsActivity extends AppCompatActivity {

    public TextView newestFirstBtn;
    public TextView priceLowestBtn;
    public TextView priceHighestBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        newestFirstBtn = (TextView) findViewById(R.id.newestFirstBtn);
        priceLowestBtn = (TextView) findViewById(R.id.priceLowesttBtn);
        priceHighestBtn = (TextView) findViewById(R.id.priceHighestBtn);


        newestFirstBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                newestFirstBtn.setTextColor(getResources().getColor(R.color.green));
                newestFirstBtn.setTypeface(Typeface.DEFAULT_BOLD);
                priceLowestBtn.setTextColor(getResources().getColor(R.color.gray));
                priceLowestBtn.setTypeface(Typeface.DEFAULT);
                priceHighestBtn.setTextColor(getResources().getColor(R.color.gray));
                priceHighestBtn.setTypeface(Typeface.DEFAULT);

            }
        });

        priceLowestBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                priceLowestBtn.setTextColor(getResources().getColor(R.color.green));
                priceLowestBtn.setTypeface(Typeface.DEFAULT_BOLD);
                newestFirstBtn.setTextColor(getResources().getColor(R.color.gray));
                newestFirstBtn.setTypeface(Typeface.DEFAULT);
                priceHighestBtn.setTextColor(getResources().getColor(R.color.gray));
                priceHighestBtn.setTypeface(Typeface.DEFAULT);

            }
        });

        priceHighestBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                priceHighestBtn.setTextColor(getResources().getColor(R.color.green));
                priceHighestBtn.setTypeface(Typeface.DEFAULT_BOLD);
                priceLowestBtn.setTextColor(getResources().getColor(R.color.gray));
                priceLowestBtn.setTypeface(Typeface.DEFAULT);
                newestFirstBtn.setTextColor(getResources().getColor(R.color.gray));
                newestFirstBtn.setTypeface(Typeface.DEFAULT);

            }
        });

    }
}
