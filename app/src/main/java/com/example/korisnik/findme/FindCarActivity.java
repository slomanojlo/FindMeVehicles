package com.example.korisnik.findme;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TabHost;

/**
 * Created by Korisnik on 3.10.2017..
 */

public class FindCarActivity extends AppCompatActivity {

    public TabHost host;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_car);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        host = (TabHost) findViewById(R.id.tabHost);
        host.setup();

        //Tab 1
        TabHost.TabSpec spec = host.newTabSpec("Cars");
        spec.setContent(R.id.tab1);
        spec.setIndicator("Cars");
        host.addTab(spec);

        //Tab 2
        spec = host.newTabSpec("Bikes");
        spec.setContent(R.id.tab2);
        spec.setIndicator("Bikes");
        host.addTab(spec);

        //Tab 3
        spec = host.newTabSpec("Vans");
        spec.setContent(R.id.tab3);
        spec.setIndicator("Vans");
        host.addTab(spec);

        String[] items = new String[]{"One", "Two", "Three"};
        Spinner spinnerMake = (Spinner) findViewById(R.id.spinnerMake);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, items);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerMake.setAdapter(adapter);

        String[] items2 = new String[]{"One", "Two", "Three"};
        Spinner spinnerModel = (Spinner) findViewById(R.id.spinnerModel);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, items);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerModel.setAdapter(adapter);

        String[] items3 = new String[]{"One", "Two", "Three"};
        Spinner spinnerMinPrice = (Spinner) findViewById(R.id.spinnerMinPrice);
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, items);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerMinPrice.setAdapter(adapter);

        String[] items4 = new String[]{"One", "Two", "Three"};
        Spinner spinnerMaxPrice = (Spinner) findViewById(R.id.spinnerMaxPrice);
        ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, items);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerMaxPrice.setAdapter(adapter);

        String[] items5 = new String[]{"One", "Two", "Three"};
        Spinner spinnerMilage = (Spinner) findViewById(R.id.spinnerMilage);
        ArrayAdapter<String> adapter5 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, items);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerMilage.setAdapter(adapter);

        String[] items6 = new String[]{"One", "Two", "Three"};
        Spinner spinnerYearManufacture = (Spinner) findViewById(R.id.spinnerYearManufacture);
        ArrayAdapter<String> adapter6 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, items);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerYearManufacture.setAdapter(adapter);
    }


}
