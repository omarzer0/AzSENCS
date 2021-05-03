package com.example.azsencs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.azsencs.adapter.tab.TabLayoutPagerAdapter;
import com.example.azsencs.data.Item;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Item> committees = new ArrayList<>();
    ArrayList<Item> events = new ArrayList<>();
    ArrayList<Item> sponsors = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // here get all lists to be displayed
        // using network or database this will be changed later
        //TODO 1: use real data
        setFakeData();

        setTabLayout();

    }

    private void setTabLayout() {
        TabLayoutPagerAdapter pagerAdapter = new TabLayoutPagerAdapter(getSupportFragmentManager()
                , TabLayoutPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT, this, committees, events, sponsors);
        ViewPager viewPager = findViewById(R.id.activity_main_view_pager);
        viewPager.setAdapter(pagerAdapter);
        TabLayout tabLayout = findViewById(R.id.activity_main_tab_layout);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setFakeData() {
        committees.add(new Item(R.drawable.and, "Android"));
        committees.add(new Item(R.drawable.and, "Android"));
        committees.add(new Item(R.drawable.and, "Android"));
        committees.add(new Item(R.drawable.and, "Android"));

        events.add(new Item(R.drawable.ev6, "AZ-SENCS Opining"));
        events.add(new Item(R.drawable.ev6, "AZ-SENCS Opining"));
        events.add(new Item(R.drawable.ev6, "AZ-SENCS Opining"));
        events.add(new Item(R.drawable.ev6, "AZ-SENCS Opining"));

        sponsors.add(new Item(R.drawable.comp4, "Innovate Egypt"));
        sponsors.add(new Item(R.drawable.comp4, "Innovate Egypt"));
        sponsors.add(new Item(R.drawable.comp4, "Innovate Egypt"));
        sponsors.add(new Item(R.drawable.comp4, "Innovate Egypt"));
    }
}