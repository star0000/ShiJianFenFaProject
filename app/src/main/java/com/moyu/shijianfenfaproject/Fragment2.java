package com.moyu.shijianfenfaproject;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by 墨羽 on 2018/7/17.
 */

public class Fragment2 extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        TextView textView = new TextView(getContext());
        textView.setText("第二个fragment");
        textView.setBackgroundColor(Color.YELLOW);

        return textView;
    }
}
