package com.rmj.beacon.core.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.rmj.beacon.core.bean.BeaconBean;

import java.util.ArrayList;

/**
 * Created by G11 on 2014/6/17.
 */
public class BeaconAdapter extends BaseAdapter {
    ArrayList<BeaconBean> mBeaconsList;
    Context mContext;

    public BeaconAdapter(Context context) {
        mContext = context;
        mBeaconsList = new ArrayList<BeaconBean>();
    }

    @Override
    public int getCount() {
        return mBeaconsList.size();
    }

    @Override
    public Object getItem(int position) {
        return mBeaconsList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
