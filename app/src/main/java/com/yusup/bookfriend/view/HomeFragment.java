/**
 * 13 - 05 - 2019
 * 10116589
 * YUSUP MAULANA IBROHIM
 * IF13/ AKB13
 */
package com.yusup.bookfriend.view;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yusup.bookfriend.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {
    View myview;
    ViewPager viewPager;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        myview = inflater.inflate(R.layout.fragment_home, container, false);
        viewPager =(ViewPager) myview.findViewById(R.id.viewpager1);
        viewPager.setAdapter(new CustomPagerAdapter(getActivity()));
        return myview;


    }

}
