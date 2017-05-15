package com.example.peter.helloworld.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.peter.helloworld.Movies;
import com.example.peter.helloworld.R;
import com.example.peter.helloworld.Tops;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Peter on 2017/5/12.
 */

public class ReviewFragment extends Fragment {

    private RecyclerView recyclerView;

    public ReviewFragment() {
        super();
    }

    public static ReviewFragment newInstance() {
        ReviewFragment fragment = new ReviewFragment();
        return fragment;
    }

    private List<Tops> topsList = new ArrayList<>();

    private void initTops() {
        Tops top250 = new Tops(R.drawable.top250);
        Tops topnew = new Tops(R.drawable.topnew);
        Tops topticket = new Tops(R.drawable.topticket);
        Tops topweek = new Tops(R.drawable.topweek);
        topsList.add(top250);
        topsList.add(topnew);
        topsList.add(topticket);
        topsList.add(topweek);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        initTops();
        View contentView = inflater.inflate(R.layout.fragment_review, container, false);
        recyclerView = (RecyclerView) contentView.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(),
                LinearLayoutManager.HORIZONTAL, false));
        recyclerView.setAdapter(new TopsAdapter(topsList));
        return contentView;
    }

    private class TopsAdapter extends RecyclerView.Adapter<TopsAdapter.ViewHolder> {

        private List<Tops> mTopsList;

        class ViewHolder extends RecyclerView.ViewHolder {
            ImageView topsImg;

            public ViewHolder(View view) {
                super(view);
                topsImg = (ImageView) view.findViewById(R.id.top_img);
            }
        }

        public TopsAdapter(List<Tops> topsList) {
            mTopsList = topsList;
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.top_item, parent, false);
            ReviewFragment.TopsAdapter.ViewHolder holder = new ViewHolder(view);
            return holder;
        }

        @Override
        public void onBindViewHolder(ReviewFragment.TopsAdapter.ViewHolder holder, int position) {
            Tops tops = mTopsList.get(position);
            holder.topsImg.setImageResource(tops.getImageId());
        }

        @Override
        public int getItemCount() {
            return mTopsList.size();
        }
    }
}
