package com.example.korisnik.findme;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DetailedResultsActivity extends AppCompatActivity {

    public Button refineSearchBtn;
    public Button findCarBtn;
    public Button sellYourVehicleBtn;
    public Button sellYourVehicle6Btn;
    public Button resultsBtn;
    public Button signInBtn;
    public Button profileBtn;
    public Button emailBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_results);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();


    }


}