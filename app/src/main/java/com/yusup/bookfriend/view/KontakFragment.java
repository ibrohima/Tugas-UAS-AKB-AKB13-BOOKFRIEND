/**
 * 13 - 05 - 2019
 * 10116589
 * YUSUP MAULANA IBROHIM
 * IF13/ AKB13
 */
package com.yusup.bookfriend.view;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yusup.bookfriend.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class KontakFragment extends Fragment {


    public KontakFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_kontak, container, false);
    }

}
