package com.mrdeng.mddemo.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.mrdeng.mddemo.R;

import java.util.List;

/**
 * <pre>
 *      author  :  Mr.Deng
 *      time    :  2017/04/29
 *      desc    :
 *      version :  1.0.0
 * </pre>
 */

public class RvAdapter extends RecyclerView.Adapter<RvAdapter.MyHolder> {
    private Context mContext;
    private List<String> mStringList;

    public RvAdapter(Context context, List<String> stringList) {
        mContext = context;
        mStringList = stringList;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.layout_item_rv, parent, false);

        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
        holder.mTextView.setText(mStringList.get(position));
    }

    @Override
    public int getItemCount() {
        return mStringList.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        TextView mTextView;

        public MyHolder(View itemView) {
            super(itemView);
            mTextView = (TextView) itemView.findViewById(R.id.tv_item);
        }
    }

}
