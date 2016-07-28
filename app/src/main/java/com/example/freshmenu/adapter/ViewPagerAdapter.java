package com.example.freshmenu.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hp on 23-Feb-16.
 */
public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    CharSequence Titles[]; // This will Store the Titles of the Tabs which are Going to be passed when ViewPagerAdapter is created
    int NumbOfTabs;
    private final List<Fragment> mFragmentList = new ArrayList<>();
    public ViewPagerAdapter(FragmentManager fm, CharSequence mTitles[], int mNumbOfTabsumb) {
        super(fm);
        this.Titles = mTitles;
        this.NumbOfTabs = mNumbOfTabsumb;
    }

    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }
    @Override
    public CharSequence getPageTitle(int position){
        return Titles[position];
    }

    @Override
    public int getCount() {
        return NumbOfTabs;
    }
    public void addFrag(Fragment fragment) {
        mFragmentList.add(fragment);

    }

}
