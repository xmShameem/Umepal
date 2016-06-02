package com.qiito.umepal.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.qiito.umepal.R;
import com.qiito.umepal.Utilvalidate.UtilValidate;
import com.qiito.umepal.fragments.NewRefereeFragment;
import com.qiito.umepal.holder.UserObjectHolder;

import java.util.List;

/**
 * Created by vivek on 2/6/16.
 */
public class NewRefereeAdapter extends BaseAdapter {
    NewRefereeFragment newRefereeFragmentoObject=new NewRefereeFragment();
    private Activity activity;
    private LayoutInflater inflater;
    private ViewHolder viewHolder;
    private List<UserObjectHolder> newRefereeList;

    public NewRefereeAdapter(NewRefereeFragment newRefereeFragmentoObject, Activity activity,List<UserObjectHolder> newRefereeList ,ViewHolder viewHolder) {
        this.newRefereeFragmentoObject = newRefereeFragmentoObject;
        this.activity = activity;
        inflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.viewHolder = viewHolder;
        this.newRefereeList=newRefereeList;
    }

    @Override
    public int getCount() {
        return newRefereeList.size() ;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null){
            viewHolder = new ViewHolder();
            convertView = inflater.inflate(R.layout.new_reffree_listitem, null);
            viewHolder.pic= (ImageView) convertView.findViewById(R.id.pic);
            viewHolder.name= (TextView) convertView.findViewById(R.id.name);
            viewHolder.confirmButton= (Button) convertView.findViewById(R.id.confirmButton);
            convertView.setTag(viewHolder);


        }
     else {
        viewHolder = (ViewHolder) convertView.getTag();
    }
        if (UtilValidate.isNotNull(newRefereeList)){

        }

        return convertView;
    }
    private class ViewHolder {
        ImageView pic;
        TextView name;
        Button confirmButton;

    }
}
