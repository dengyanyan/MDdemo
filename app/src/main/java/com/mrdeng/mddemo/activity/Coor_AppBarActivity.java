package com.mrdeng.mddemo.activity;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.mrdeng.mddemo.R;
import com.mrdeng.mddemo.fragment.FragmentA;

import java.util.ArrayList;
import java.util.List;

public class Coor_AppBarActivity extends AppCompatActivity {

    private AppBarLayout mAppbar;
    private Toolbar mToolbar;
    private TabLayout mTab;
    private ViewPager mViewPager;

    private List<Fragment> mFragmentList;
    private List<String> mTitleList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coor__app_bar);
        initView();
    }

    private void initView() {
        mAppbar = (AppBarLayout) findViewById(R.id.appbar);
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mTab = (TabLayout) findViewById(R.id.tablayout);
        mViewPager = (ViewPager) findViewById(R.id.viewpager);

        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("Toolbar_Scroll_With_Page");

        initTabs();

        MyPagerAdapter mAdapter = new MyPagerAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(mAdapter);
        mTab.setTabMode(TabLayout.MODE_FIXED);

        mTab.setupWithViewPager(mViewPager);
        mTab.setTabsFromPagerAdapter(mAdapter);


    }

    private void initTabs() {
        mFragmentList = new ArrayList<>();
        mTitleList = new ArrayList<>();

        mFragmentList.add(new FragmentA());
        mFragmentList.add(new FragmentA());
        mFragmentList.add(new FragmentA());
        mTitleList.add("A");
        mTitleList.add("B");
        mTitleList.add("C");

    }

    public class MyPagerAdapter extends FragmentPagerAdapter {


        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }


        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mTitleList.get(position);
        }
    }

}
