package com.example.korisnik.findme;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public Button refineSearchBtn;
    public Button findCarBtn;
    public Button sellYourVehicleBtn;
    public Button sellYourVehicle6Btn;
    public Button resultsBtn;
    public Button signInBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        refineSearchBtn = (Button) findViewById(R.id.refineSearchBtn);
        refineSearchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(view.getContext(), RefineSearch1Activity.class);
                view.getContext().startActivity(Intent);}
        });

        findCarBtn = (Button) findViewById(R.id.findCarBtn);
        findCarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(view.getContext(), FindCarActivity.class);
                view.getContext().startActivity(Intent);}
        });

        sellYourVehicle6Btn = (Button) findViewById(R.id.sellYourVehicle6Btn);
        sellYourVehicle6Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(view.getContext(), SellYourVehicle6Activity.class);
                view.getContext().startActivity(Intent);}
        });

        sellYourVehicleBtn = (Button) findViewById(R.id.sellYourVehicleBtn);
        sellYourVehicleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(view.getContext(), SellYourVehicleActivity.class);
                view.getContext().startActivity(Intent);}
        });

        resultsBtn = (Button) findViewById(R.id.resultsBtn);
        resultsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(view.getContext(), ResultsActivity.class);
                view.getContext().startActivity(Intent);}
        });

        signInBtn = (Button) findViewById(R.id.signInBtn);
        signInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(view.getContext(), SignInActivity.class);
                view.getContext().startActivity(Intent);}
        });

    }


}