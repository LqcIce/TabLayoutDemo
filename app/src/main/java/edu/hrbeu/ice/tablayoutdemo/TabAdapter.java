package edu.hrbeu.ice.tablayoutdemo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by ice on 2016/7/19.
 */
public class TabAdapter extends FragmentPagerAdapter {

    private List<Fragment> fragments;
    private String[] tabTitle ;


    public TabAdapter(FragmentManager fm, List<Fragment> fragments, String[] tabTitle) {
        super(fm);
        this.fragments = fragments;
        this.tabTitle = tabTitle;
    }


    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    //设置tablayout标题，方法继承自PagerAdapter，默认是返回null，所以不重写这个方法tab就没字了
    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitle[position];

    }
}