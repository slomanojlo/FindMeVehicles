package com.example.korisnik.findme;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.widget.TabHost;
import android.widget.TextView;

import static android.R.attr.host;

/**
 * Created by Korisnik on 7.10.2017..
 */

public class ResultsActivity extends AppCompatActivity {

    public TabHost host;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        host = (TabHost)findViewById(R.id.tabHost);
        host.setup();

        //Tab 1
        TabHost.TabSpec spec = host.newTabSpec("Newest First");
        spec.setContent(R.id.tab1);
        spec.setIndicator("Newest First");
        host.addTab(spec);

        //Tab 2
        spec = host.newTabSpec("Price (Lowest)");
        spec.setContent(R.id.tab2);
        spec.setIndicator("Price (Lowest)");
        host.addTab(spec);

        //Tab 3
        spec = host.newTabSpec("Price (Highest)");
        spec.setContent(R.id.tab3);
        spec.setIndicator("Price (Highest)");
        host.addTab(spec);

//        host.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
//
//            @Override
//            public void onTabChanged(String tabId) {
//
//                for (int i = 0; i < host.getTabWidget().getChildCount(); i++) {
//                    host.getTabWidget().getChildAt(i).setBackgroundColor(Color.parseColor("#FF0000")); // unselected
//                    TextView tv = (TextView) host.getTabWidget().getChildAt(i).findViewById(android.R.id.title); //Unselected Tabs
//                    tv.setTextColor(Color.parseColor("#ffffff"));
//                }
//
//                host.getTabWidget().getChildAt(host.getCurrentTab()).setBackgroundColor(Color.parseColor("#0000FF")); // selected
//                TextView tv = (TextView) host.getCurrentTabView().findViewById(android.R.id.tabhost); //for Selected Tab
//                tv.setTextColor(Color.parseColor("#000000"));
//
//            }
//        });
    }
}
