package com.example.korisnik.findme;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TabHost;

/**
 * Created by Korisnik on 4.10.2017..
 */

public class SellYourVehicle3Activity extends AppCompatActivity {

    public Button backBtn;
    public Button nextBtn;
    public static final String one = "One";
    public static final String two = "Two";
    public static final String three = "Three";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sell_your_vehicle_3);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();



        String[] items = new String[] {one, two, three};
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, items);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        backBtn = (Button) findViewById(R.id.backBtn);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(view.getContext(), SellYourVehicle2Activity.class);
                view.getContext().startActivity(Intent);}
        });

        nextBtn = (Button) findViewById(R.id.nextBtn);
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(view.getContext(), SellYourVehicle4Activity.class);
                view.getContext().startActivity(Intent);}
        });

//        nextBnt = (Button) findViewById(R.id.signInBtn);
//        nextBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent Intent = new Intent(view.getContext(), SignInActivity.class);
//                view.getContext().startActivity(Intent);}
//        });

    }
}
