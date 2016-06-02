package com.qiito.umepal.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.qiito.umepal.fragments.NewRefereeFragment;

/**
 * Created by vivek on 2/6/16.
 */
public class NewRefereeAdapter extends BaseAdapter {
    NewRefereeFragment newRefereeFragmentoObject=new NewRefereeFragment();
    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
    private class ViewHolder {

    }
}
