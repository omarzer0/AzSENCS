package com.example.azsencs.adapter.tab;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.azsencs.R;
import com.example.azsencs.data.Item;
import com.example.azsencs.ui.HomeFragment;

import java.util.ArrayList;


public class TabLayoutPagerAdapter extends FragmentPagerAdapter {
    private ArrayList<Item> committees;
    private ArrayList<Item> events;
    private ArrayList<Item> sponsors;

    private static final int[] TAB_TITLES = new int[]{R.string.committees, R.string.events
            , R.string.sponsors};

    private Context context;

    public TabLayoutPagerAdapter(@NonNull FragmentManager fm, int behavior, Context context,
                                 ArrayList<Item> committees, ArrayList<Item> events, ArrayList<Item> sponsors) {
        super(fm, behavior);
        this.context = context;
        this.committees = committees;
        this.events = events;
        this.sponsors = sponsors;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        ArrayList<Item> items = new ArrayList<>();
        switch (position) {
            case 0:
                items = new ArrayList<>(committees);
                break;
            case 1:
                items = new ArrayList<>(events);
                break;
            case 2:
                items = new ArrayList<>(sponsors);
                break;
        }
        return HomeFragment.newInstance(items);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return context.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        return TAB_TITLES.length;
    }
}
