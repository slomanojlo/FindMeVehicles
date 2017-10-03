package com.example.korisnik.findme;

import android.graphics.Color;
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

    public TabHost host;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_car);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        host = (TabHost)findViewById(R.id.tabHost);
        host.setup();
//        host.setOnTabChangedListener(new TabHost.OnTabChangeListener(){
//            @Override
//            public void onTabChanged(String tabId) {
//                if(tab1.equals(tabId)) {
//                    //destroy earth
//                }
//                if(TAB_2_TAG.equals(tabId)) {
//                    //destroy mars
//                }
//            }});

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

//    public static void setTabColor(TabHost host) {
//        for(int i=0;i<host.getTabWidget().getChildCount();i++) {
//            host.getTabWidget().getChildAt(i).setBackgroundColor(Color.parseColor("#FF0000")); //unselected
//        }
//        host.getTabWidget().getChildAt(host.getCurrentTab()).setBackgroundColor(Color.parseColor("#0000FF")); // selected
//    }


//
//
//    }
}
