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

    }


}