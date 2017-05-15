package com.example.peter.helloworld;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Peter on 2017/5/15.
 */

public class WeeksAdapter extends RecyclerView.Adapter<WeeksAdapter.ViewHolder>{

    private List<Weeks> mWeeksList;

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView weeksName;

        public ViewHolder(View view) {
            super(view);
            weeksName = (TextView) view.findViewById(R.id.weeks_name);
        }
    }

    public WeeksAdapter(List<Weeks> weeksList) {
        mWeeksList = weeksList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.weeks_item, parent, false);
        final ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Weeks weeks = mWeeksList.get(position);
        holder.weeksName.setText(weeks.getWeeksName());
    }

    @Override
    public int getItemCount() {
        return mWeeksList.size();
    }

}
