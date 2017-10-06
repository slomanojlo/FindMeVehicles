package com.example.korisnik.findme;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TabHost;

/**
 * Created by Korisnik on 4.10.2017..
 */

public class SellYourVehicleActivity extends AppCompatActivity {

    public TabHost host;
    public static final String one = "One";
    public static final String two = "Two";
    public static final String three = "Three";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sell_your_vehicle);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        host = (TabHost)findViewById(R.id.tabHost);
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
        spinnerModel.setAdapter(adapter2);

        String[] items3 = new String[] {one, two, three};
        Spinner spinnerModelVariant = (Spinner) findViewById(R.id.spinnerModelVariant);
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, items2);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerModelVariant.setAdapter(adapter3);
    }
}
