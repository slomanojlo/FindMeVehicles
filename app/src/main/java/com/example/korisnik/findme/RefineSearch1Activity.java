package com.example.korisnik.findme;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class RefineSearch1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refine_search_1);

        String[] items = new String[] {"One", "Two", "Three"};
        Spinner spinnerMake = (Spinner) findViewById(R.id.spinnerMake);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, items);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerMake.setAdapter(adapter);

        String[] items2 = new String[] {"One", "Two", "Three"};
        Spinner spinnerModel = (Spinner) findViewById(R.id.spinnerModel);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, items2);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerModel.setAdapter(adapter);

        String[] items3 = new String[] {"One", "Two", "Three"};
        Spinner spinnerNewUsed = (Spinner) findViewById(R.id.spinnerNewUsed);
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, items2);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerNewUsed.setAdapter(adapter);

    }



}