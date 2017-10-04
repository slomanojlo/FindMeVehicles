package com.example.korisnik.findme;


import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class RefineSearch1Activity extends AppCompatActivity {

    public static final String one = "One";
    public static final String two = "Two";
    public static final String three = "Three";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refine_search_1);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        String[] items = new String[] {one, two, three};
        Spinner spinnerMake = (Spinner) findViewById(R.id.spinnerMake);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, items);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerMake.setAdapter(adapter);

        String[] items2 = new String[] {one, two, three};
        Spinner spinnerModel = (Spinner) findViewById(R.id.spinnerModel);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, items2);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerModel.setAdapter(adapter);

        String[] items3 = new String[] {one, two, three};
        Spinner spinnerNewUsed = (Spinner) findViewById(R.id.spinnerNewUsed);
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, items2);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerNewUsed.setAdapter(adapter);

    }



}