package com.moyu.shijianfenfaproject;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by 墨羽 on 2018/7/17.
 */

public class Fragment1 extends Fragment{

    private View fragment1View;
    private ViewPager innerViewpager;
    private ListView lvFragment1;
    private ArrayList<Integer> picList = new ArrayList<>();
    private ArrayList<String> dataList = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        fragment1View = inflater.inflate(R.layout.fragment1, container, false);
        innerViewpager = fragment1View.findViewById(R.id.innerviewpager);
        lvFragment1 = fragment1View.findViewById(R.id.lv_fragment1);
        return fragment1View;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        initData();

        innerViewpager.setAdapter(new PagerAdapter() {

            private ImageView imageView;

            @Override
            public int getCount() {
                return picList.size();
            }

            @Override
            public boolean isViewFromObject(View view, Object object) {
                return view == object;
            }

            @Override
            public Object instantiateItem(ViewGroup container, int position) {
                imageView = new ImageView(getActivity());
                imageView.setImageResource(picList.get(position));
              //  Toast.makeText(getContext(),picList.size()+"",Toast.LENGTH_SHORT).show();
                container.addView(imageView);
                return imageView;
            }

            @Override
            public void destroyItem(ViewGroup container, int position, Object object) {
               // super.destroyItem(container, position, object);
                container.removeView((View) object);
            }
        });

        lvFragment1.setAdapter(new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,dataList));

    }

    private void initData() {
        picList.add(R.drawable.a);
        picList.add(R.drawable.b);
        picList.add(R.drawable.c);
        picList.add(R.drawable.d);

        for (int i = 0; i < 20; i++) {
            dataList.add("你好"+i);
        }
    }


}
