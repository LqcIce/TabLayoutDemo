package edu.hrbeu.ice.tablayoutdemo;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TabLayout tab;
    private ViewPager viewpager;
    private TabAdapter adapter;
    public static final String[] tabTitle = new String[]{"综艺", "体育", "新闻", "热点", "头条", "军事", "历史", "科技", "人文", "地理"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        tab = (TabLayout) findViewById(R.id.tab);
        viewpager = (ViewPager) findViewById(R.id.viewpager);

        List<Fragment> fragments = new ArrayList<>();
        for (int i = 0; i < tabTitle.length; i++) {
            fragments.add(TabLayoutFragment.newInstance(i + 1));
        }
        adapter = new TabAdapter(getSupportFragmentManager(), fragments,tabTitle);
        //给ViewPager设置适配器
        viewpager.setAdapter(adapter);
        //将TabLayout和ViewPager关联起来。
        tab.setupWithViewPager(viewpager);
        //设置可以滑动
        tab.setTabMode(TabLayout.MODE_SCROLLABLE);
    }

}
