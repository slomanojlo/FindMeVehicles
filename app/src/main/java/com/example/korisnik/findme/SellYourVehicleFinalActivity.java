package com.example.korisnik.findme;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Korisnik on 10.10.2017..
 */

public class SellYourVehicleFinalActivity extends AppCompatActivity {

    public Button modifyBtn;
    public Button submitBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sell_your_vehicle_final);

        modifyBtn = (Button) findViewById(R.id.modifyBtn);
        modifyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(view.getContext(), SellYourVehicleActivity.class);
                view.getContext().startActivity(Intent);}
        });

        submitBtn = (Button) findViewById(R.id.submitBtn);
        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(view.getContext(), MainActivity.class);
                view.getContext().startActivity(Intent);}
        });
    }
}