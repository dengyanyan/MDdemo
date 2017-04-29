package com.mrdeng.mddemo.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mrdeng.mddemo.R;
import com.mrdeng.mddemo.adapter.RvAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class FragmentA extends Fragment {

    @Bind(R.id.rv)
    RecyclerView mRv;

    private List<String> mStringList;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_fragment, container, false);
        ButterKnife.bind(this, view);
        mRv.setLayoutManager(new LinearLayoutManager(getActivity()));
        mStringList = new ArrayList<>();
        for (char i = 'A'; i <= 'Z'; i++) {
            mStringList.add(String.valueOf(i));
        }


        RvAdapter adapter = new RvAdapter(getActivity(), mStringList);
        mRv.setAdapter(adapter);
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}
