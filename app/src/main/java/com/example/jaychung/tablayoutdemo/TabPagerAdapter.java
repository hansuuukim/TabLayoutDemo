package com.example.jaychung.tablayoutdemo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Jay Chung on 2016-11-06.
 */

public class TabPagerAdapter extends FragmentPagerAdapter {
    int tabCount;
    int pos_info;

    public TabPagerAdapter(FragmentManager fm, int numberOfTabs){
        super(fm);
        this.tabCount = numberOfTabs;
    }

    @Override
    public Fragment getItem(int position){
        switch (position){
            case 0:
                Tab1Fragment tab1 = new Tab1Fragment();
                this.pos_info = position;

                return tab1;
            case 1:
                Tab2Fragment tab2 = new Tab2Fragment();
                return tab2;
            case 2:
                Tab3Fragment tab3 = new Tab3Fragment();
                return tab3;
            default:
                return null;
        }
    }

    @Override
    public int getCount(){ return tabCount; }
}
