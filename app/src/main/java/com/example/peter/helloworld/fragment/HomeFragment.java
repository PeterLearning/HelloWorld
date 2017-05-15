package com.example.peter.helloworld.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.peter.helloworld.CinemaActivity;
import com.example.peter.helloworld.LoginActivity;
import com.example.peter.helloworld.Movies;
import com.example.peter.helloworld.R;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Peter on 2017/5/12.
 */

public class HomeFragment extends Fragment {

    public HomeFragment() {
        super();
    }

    public static HomeFragment newInstance() {
        HomeFragment fragment = new HomeFragment();
        return fragment;
    }

    private RecyclerView recyclerView;

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

//    @Override
//    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
//        super.onActivityCreated(savedInstanceState);
//        Button homeButton = (Button) getActivity().findViewById(R.id.home_button);
//        homeButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(getActivity(), "hello", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//    }

    private class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.ViewHolder> {

        private List<Movies> mMoviesList;

        class  ViewHolder extends RecyclerView.ViewHolder {
            ImageView moviesImg;
            TextView  moviesNm;
            TextView  moviesDir;
            TextView  moviesStar;
            TextView  moviesCat;
            Button    homeButton;
            View  moviesView;

            public ViewHolder (View view) {
                super(view);
                moviesImg = (ImageView) view.findViewById(R.id.img);
                moviesNm  = (TextView)  view.findViewById(R.id.nm);
                moviesDir  = (TextView)  view.findViewById(R.id.dir);
                moviesStar  = (TextView)  view.findViewById(R.id.star);
                moviesCat  = (TextView)  view.findViewById(R.id.cat);
                homeButton = (Button)  view.findViewById(R.id.home_button);
                moviesView = view;
            }
         }

        public MoviesAdapter(List<Movies> moviesList) {
            mMoviesList = moviesList;
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.movies_item, parent, false);
            final ViewHolder holder = new ViewHolder(view);

            holder.homeButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //int position = holder.getAdapterPosition();
                    //Movies movies = mMoviesList.get(position);
//                    Toast.makeText(v.getContext(), "you click the button",
//                            Toast.LENGTH_LONG).show();
                    Intent homeIntent = new Intent(getActivity(), CinemaActivity.class);
                    startActivity(homeIntent);
                }
            });
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
        Movies a = new Movies("摔跤吧！爸爸","尼特什·提瓦瑞","阿米尔·汗,萨卡诗·泰瓦,法缇玛·萨那·纱卡",
         "喜剧,动作,家庭",R.drawable.a);
        Movies b = new Movies("银河护卫队2","詹姆斯·古恩","克里斯·帕拉特,佐伊·索尔达娜,戴夫·巴蒂斯塔",
                "动作,冒险,科幻",R.drawable.b);
        Movies c = new Movies("加勒比海盗5：死无对证","乔阿吉姆·罗恩尼,艾斯彭·山德伯格","约翰尼·德普,奥兰多·布鲁姆,杰弗里·拉什",
                "喜剧,动作,奇幻",R.drawable.c);
        Movies d = new Movies("亚瑟王：斗兽争霸","盖·里奇","查理·汉纳姆,裘德·洛,艾瑞克·巴纳",
                "动作,冒险,奇幻",R.drawable.d);
        Movies e = new Movies("超凡战队","迪恩·以色列特","戴克·蒙哥马利,娜奥米·斯科特,林路迪",
                "动作,冒险,科幻",R.drawable.e);
        Movies f = new Movies("异星觉醒","丹尼尔·伊斯皮诺萨","\"杰克·吉伦哈尔,丽贝卡·弗格森,瑞安·雷诺兹",
                "恐怖,惊悚,科幻",R.drawable.f);
            moviesList.add(a);
            moviesList.add(b);
            moviesList.add(c);
            moviesList.add(d);
            moviesList.add(e);
            moviesList.add(f);

    }
}
