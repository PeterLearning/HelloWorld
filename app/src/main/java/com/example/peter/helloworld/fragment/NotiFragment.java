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

import com.example.peter.helloworld.CinemaActivity;
import com.example.peter.helloworld.Movies;
import com.example.peter.helloworld.Noti;
import com.example.peter.helloworld.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Peter on 2017/5/12.
 */

public class NotiFragment extends Fragment {
    public NotiFragment() {
        super();
    }

    public static NotiFragment newInstance() {
        NotiFragment fragment = new NotiFragment();
        return fragment;
    }

    private RecyclerView recyclerView;

    private List<Noti> notiList = new ArrayList<>();


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        initNoti();
        View contentView = inflater.inflate(R.layout.fragment_noti, container, false);
        recyclerView = (RecyclerView) contentView.findViewById(R.id.recycler_view_noti);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(),
                LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(new NotiFragment.NotiAdapter(notiList));
        return contentView;
    }



    private class NotiAdapter extends RecyclerView.Adapter<NotiFragment.NotiAdapter.ViewHolder> {

        private List<Noti> mNotiList;

        class  ViewHolder extends RecyclerView.ViewHolder {
            ImageView notiImg;
            TextView notiTitle;
            TextView notiInfo;
            TextView notiAuth;
            View  notiView;

            public ViewHolder (View view) {
                super(view);
                notiImg = (ImageView) view.findViewById(R.id.noti_img);
                notiTitle  = (TextView)  view.findViewById(R.id.noti_title);
                notiInfo  = (TextView)  view.findViewById(R.id.noti_info);
                notiAuth  = (TextView)  view.findViewById(R.id.noti_auth);
                notiView = view;
            }
        }

        public NotiAdapter(List<Noti> notiList) {
            mNotiList = notiList;
        }

        @Override
        public NotiFragment.NotiAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.noti_item, parent, false);
            final NotiFragment.NotiAdapter.ViewHolder holder = new NotiFragment.NotiAdapter.ViewHolder(view);
            return holder;
        }

        @Override
        public void onBindViewHolder(NotiFragment.NotiAdapter.ViewHolder holder, int position) {
            Noti noti = mNotiList.get(position);
            holder.notiImg.setImageResource(noti.getNotiImg());
            holder.notiTitle.setText(noti.getNotiTitle());
            holder.notiInfo.setText(noti.getNotiInfo());
            holder.notiAuth.setText(noti.getNotiAuth());
        }

        @Override
        public int getItemCount() {
            return mNotiList.size();
        }
    }

    private void initNoti() {
        Noti na = new Noti("乱世爱情", "《GONE WITH THE WIND》在中国的翻译有两个版本：《乱世佳人》和《飘》。我比较喜欢后者，", "life 评论 乱世佳人", R.drawable.na);
        Noti nb = new Noti("十年沉船，苍苔不生", "大西洋的海水也是一样深邃，望不到边的海面和星空，漂浮的人是一粒粒的微不足道，真真是绝望到苍凉。", "林 淮 评论 泰坦尼克号",R.drawable.nb);
        Noti nc = new Noti("如果爱我，请为我修剪一片雪花","我还依稀记得爱德华的脸。那是一张何等支离破碎的脸。那些疤痕像雪地上雪橇划过的印记，触目惊心却又让人心疼。","林夏生 评论 剪刀手爱德华", R.drawable.nc);
        Noti nd = new Noti("一起去看夜晚的大海","相比《大话西游》，我更喜欢《喜剧之王》。因为前者太颠覆，而后者太普通。然而，这样子一普通，对于周星驰而言，恐怕就意味着出位了。","海阳 评论 喜剧之王", R.drawable.nd);
        Noti ne = new Noti("我们无处安放的孤独","有些电影是你看过之后，心中涌动万千却无从下笔，是你满脑子的思绪却不知从何整理，《海上钢琴师》就是这样一部让我欲罢不能欲言又止的电影。","玉茗 评论 海上钢琴师", R.drawable.ne);
        Noti nf = new Noti("拿屠刀的优雅绅士","“我准备向他提出一个他不可能拒绝的条件。”这就是他的谈判技巧。他是一手拿马丁尼，一手拿屠刀的优雅绅士；是谈着肮脏买卖，穿着高贵西装的职业","公子羽 评论 教父", R.drawable.nf);
        Noti ng = new Noti("无望的爱","《天堂电影院》，这次看的是导演剪辑版，长达2小时53分钟。Giuseppe Tornatore这“时空三部曲”中，我还是最喜欢《天堂电影院》。","Aubergine 评论", R.drawable.ng);

        notiList.add(na);
        notiList.add(nb);
        notiList.add(nc);
        notiList.add(nd);
        notiList.add(ne);
        notiList.add(nf);
        notiList.add(ng);
    }
}
