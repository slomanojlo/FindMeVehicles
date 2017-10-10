package com.example.korisnik.findme;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Korisnik on 10.10.2017..
 */

public class SellYourVehicle6Activity extends AppCompatActivity {

    public Button backBtn;
    public Button nextBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sell_your_vehicle_6);

        backBtn = (Button) findViewById(R.id.backBtn);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(view.getContext(), SellYourVehicle5Activity.class);
                view.getContext().startActivity(Intent);}
        });
    }
}