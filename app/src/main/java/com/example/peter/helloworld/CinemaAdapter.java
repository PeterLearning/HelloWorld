package com.example.peter.helloworld;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Peter on 2017/5/15.
 */

public class CinemaAdapter extends ArrayAdapter<Cinema>{

    private int resourceId;

    public CinemaAdapter(Context context, int textViewResourceId,
                         List<Cinema> objects) {
        super(context, textViewResourceId, objects);
        resourceId = textViewResourceId;
    }

    class ViewHolder {
        TextView cinName;
        TextView cinMoney;
        TextView cinInfo;
        TextView cinDistance;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Cinema cinema = getItem(position);
        View view;
        ViewHolder viewHolder;
        if (convertView == null) {
            view = LayoutInflater.from(getContext()).inflate(resourceId, parent,
                    false);
            viewHolder = new ViewHolder();
            viewHolder.cinName = (TextView) view.findViewById(R.id.cin_name);
            viewHolder.cinMoney = (TextView) view.findViewById(R.id.cin_money);
            viewHolder.cinInfo = (TextView) view.findViewById(R.id.cin_info);
            viewHolder.cinDistance = (TextView) view.findViewById(R.id.cin_distance);
            view.setTag(viewHolder);
        } else {
            view = convertView;
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.cinName.setText(cinema.getCinName());
        viewHolder.cinMoney.setText(cinema.getCinMoney());
        viewHolder.cinInfo.setText(cinema.getCinInfo());
        viewHolder.cinDistance.setText(cinema.getCinDistance());
        return view;
    }

}
