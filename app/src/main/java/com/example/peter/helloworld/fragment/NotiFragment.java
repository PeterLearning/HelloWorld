package com.example.peter.helloworld.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.peter.helloworld.R;

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

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_noti, container, false);
    }
}