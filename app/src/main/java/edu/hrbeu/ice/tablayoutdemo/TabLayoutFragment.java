package edu.hrbeu.ice.tablayoutdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by ice on 2016/7/19.
 */
public class TabLayoutFragment extends Fragment {
    public static String TABLAYOUT_FRAGMENT = "tab_fragment";
    private TextView txt;
    private int type;

    public static TabLayoutFragment newInstance(int type) {
        TabLayoutFragment fragment = new TabLayoutFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable(TABLAYOUT_FRAGMENT, type);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            type = (int) getArguments().getSerializable(TABLAYOUT_FRAGMENT);
        }

    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tablayout, container, false);
        initView(view);
        return view;
    }


    protected void initView(View view) {
        txt = (TextView) view.findViewById(R.id.tab_txt);


        switch (type) {
            case 1:
                txt.setText("这是综艺Fragment");
                break;
            case 2:
                txt.setText("这是体育Fragment");
                break;
            case 3:
                txt.setText("这是新闻Fragment");
                break;
            case 4:
                txt.setText("这是热点Fragment");
                break;
            case 5:
                txt.setText("这是头条Fragment");
                break;
            case 6:
                txt.setText("这是军事Fragment");
                break;
            case 7:
                txt.setText("这是历史Fragment");
                break;
            case 8:
                txt.setText("这是科技Fragment");
                break;
            case 9:
                txt.setText("这是人文Fragment");
                break;
            case 10:
                txt.setText("这是地理Fragment");
                break;
        }


    }

}
