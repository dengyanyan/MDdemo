package com.mrdeng.mddemo.activity;

import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.mrdeng.mddemo.R;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class CoorFabActivity extends AppCompatActivity {

    @Bind(R.id.fab)
    FloatingActionButton mFab;
    @Bind(R.id.activity_login)
    CoordinatorLayout mActivityLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coor_fab);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.fab)
    public void onViewClicked() {
        final Snackbar mSnackBar = Snackbar.make(mActivityLogin, "点击了fab", Snackbar.LENGTH_LONG);
        mSnackBar.setAction("取消", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //
                mSnackBar.dismiss();
            }
        });
        if (mSnackBar.isShown()) {
            mFab.setEnabled(false);
        } else {
            mFab.setEnabled(true);
        }
        mSnackBar.show();

    }
}
