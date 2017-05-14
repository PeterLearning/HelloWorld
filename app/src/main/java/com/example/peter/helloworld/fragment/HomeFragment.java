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

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Peter on 2017/5/12.
 */

public class HomeFragment extends Fragment {

    private RecyclerView recyclerView;

    public HomeFragment() {
        super();
    }

    public static HomeFragment newInstance() {
        HomeFragment fragment = new HomeFragment();
        return fragment;
    }

    private List<Movies> moviesList = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        initMovies();
        View contentView = inflater.inflate(R.layout.fragment_home, container, false);
        recyclerView = (RecyclerView) contentView.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(),
                LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(new MoviesAdapter(moviesList));
        return contentView;
    }

    private class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.ViewHolder> {

        private List<Movies> mMoviesList;

        class  ViewHolder extends RecyclerView.ViewHolder {
            ImageView moviesImg;
            TextView  moviesNm;
            TextView  moviesDir;
            TextView  moviesStar;
            TextView  moviesCat;

            public ViewHolder (View view) {
                super(view);
                moviesImg = (ImageView) view.findViewById(R.id.img);
                moviesNm  = (TextView)  view.findViewById(R.id.nm);
                moviesDir  = (TextView)  view.findViewById(R.id.dir);
                moviesStar  = (TextView)  view.findViewById(R.id.star);
                moviesCat  = (TextView)  view.findViewById(R.id.cat);
            }
         }

        public MoviesAdapter(List<Movies> moviesList) {
            mMoviesList = moviesList;
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.movies_item, parent, false);
            ViewHolder holder = new ViewHolder(view);
            return holder;
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            Movies movies = mMoviesList.get(position);
            holder.moviesImg.setImageResource(movies.getImgId());
            holder.moviesNm.setText(movies.getNm());
            holder.moviesDir.setText(movies.getDir());
            holder.moviesStar.setText(movies.getStar());
            holder.moviesCat.setText(movies.getCat());
        }

        @Override
        public int getItemCount() {
            return mMoviesList.size();
        }
    }

    private void initMovies() {
        for (int i = 0; i < 12; i++) {
            Movies a = new Movies("摔跤吧！爸爸","尼特什·提瓦瑞","阿米尔·汗,萨卡诗·泰瓦,法缇玛·萨那·纱卡",
                    "喜剧,动作,家庭",R.drawable.a);
            moviesList.add(a);
        }
    }
}
