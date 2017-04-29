package com.mrdeng.mddemo.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Button;
import android.widget.LinearLayout;

import com.mrdeng.mddemo.R;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.btn_coor_fab)
    Button mBtnCoorFab;
    @Bind(R.id.activity_main)
    LinearLayout mActivityMain;
    @Bind(R.id.toolbar)
    Toolbar mToolbar;
    @Bind(R.id.btn_coor_appbar)
    Button mBtnCoorAppbar;
    @Bind(R.id.btn_coor_coll_appbar)
    Button mBtnCoorCollAppbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_coor_fab)
    public void fab() {
        startActivity(new Intent(MainActivity.this, CoorFabActivity.class));
    }

    @OnClick(R.id.btn_coor_appbar)
    public void appbar() {
        startActivity(new Intent(MainActivity.this, Coor_AppBarActivity.class));
    }

    @OnClick(R.id.btn_coor_coll_appbar)
    public void coll() {
        startActivity(new Intent(MainActivity.this, CoorCollAppBarActivity.class));
    }
}
