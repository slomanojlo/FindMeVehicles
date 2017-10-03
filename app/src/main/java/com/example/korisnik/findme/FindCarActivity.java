package com.example.korisnik.findme;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;

/**
 * Created by Korisnik on 3.10.2017..
 */

public class FindCarActivity extends AppCompatActivity {

    TabHost tabHost;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_car);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        TabHost host = (TabHost)findViewById(R.id.tabHost);
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
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//
//
//    }
}
