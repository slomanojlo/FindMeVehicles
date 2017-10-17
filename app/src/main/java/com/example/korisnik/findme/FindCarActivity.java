package com.example.korisnik.findme;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TabHost;
import android.widget.Toast;

import org.json.JSONArray;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import com.example.korisnik.models.*;
import com.example.korisnik.models.VehicleFeatureTypes;
import com.example.korisnik.models.VehicleTypes;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.List;

/**
 * Created by Korisnik on 3.10.2017..
 */

public class FindCarActivity extends AppCompatActivity implements TabHost.OnTabChangeListener {

    public TabHost host;
    public View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_car);
        view = getLayoutInflater().inflate(R.layout.activity_find_car, null);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        List<VehicleTypes> list;

        new RetrieveCarType().execute(this);

    }

    @Override
    public void onTabChanged(String tabId) {
        Toast.makeText(getApplicationContext(), "Selected Tab " + tabId, Toast.LENGTH_LONG).show();
        Log.i("selected tab ", tabId);
    }


    protected void updateTabWithValues(List<VehicleTypes> result) {
        host = (TabHost) findViewById(R.id.tabHost);
        host.setup();
        host.setOnTabChangedListener(this);

        for (int i = 0; i < result.size(); i++) {
            TabHost.TabSpec spec = host.newTabSpec(result.get(i).name);
            spec.setContent(R.id.tab1);
            spec.setIndicator(result.get(i).name);
            host.addTab(spec);
        }
    }

    class RetrieveCarType extends AsyncTask<Context, Void, List<VehicleTypes>> {
        private Exception exception;

        @Override
        protected List<VehicleTypes> doInBackground(Context... params) {
            List<VehicleTypes> data = null;
            try {
                URL url = new URL(String.format("http://findme.onlime.com/api/v1/vehicle_types"));
                HttpURLConnection connection =
                        (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("GET");
                //connection.addRequestProperty("Header key", "Header value");
                connection.connect();
                int status = connection.getResponseCode();

                BufferedReader reader = new BufferedReader(
                        new InputStreamReader(connection.getInputStream()));

                StringBuffer json = new StringBuffer(1024);
                String tmp = "";
                while ((tmp = reader.readLine()) != null)
                    json.append(tmp).append("\n");
                reader.close();


                //JSONObject obj =  new JSONObject(json.toString());
                JSONArray arr = new JSONArray(json.toString());

                Type listType = new TypeToken<List<VehicleTypes>>() {
                }.getType();
                data = new Gson().fromJson(json.toString(), listType);

                // This value will be 404 if the request was not
                // successful
                if (status != 200) {
                    return null;
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

            return data;
        }

        @Override
        protected void onPostExecute(List<VehicleTypes> vehicleTypes) {
            super.onPostExecute(vehicleTypes);
            updateTabWithValues(vehicleTypes);
        }


    }
}

class RetrieveVehicleFeatures extends AsyncTask<Context, Integer, List<VehicleFeatureTypes>> {
    private Exception exception;

    @Override
    protected List<VehicleFeatureTypes> doInBackground(Context... params) {
        List<VehicleFeatureTypes> data = null;
        try {
            URL url = new URL(String.format("http://findme.onlime.com/api/v1/vehicle_feature_types?vehicle_type=" + params[1].toString()));
            HttpURLConnection connection =
                    (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            //connection.addRequestProperty("Header key", "Header value");
            connection.connect();
            int status = connection.getResponseCode();

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(connection.getInputStream()));

            StringBuffer json = new StringBuffer(1024);
            String tmp = "";
            while ((tmp = reader.readLine()) != null)
                json.append(tmp).append("\n");
            reader.close();


            //JSONObject obj =  new JSONObject(json.toString());
            JSONArray arr = new JSONArray(json.toString());

            Type listType = new TypeToken<List<VehicleTypes>>() {
            }.getType();
            data = new Gson().fromJson(json.toString(), listType);

            // This value will be 404 if the request was not
            // successful
            if (status != 200) {
                return null;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return data;
    }




}



