package com.yusup.bookfriend.view;

import com.yusup.bookfriend.R;

public enum  ModelObject {
    SATU(R.string.satu, R.layout.fragment_view1),
    DUA(R.string.dua, R.layout.fragment_view2);


    private int mTitleResId;
    private int mLayoutResId;

    ModelObject(int titleResId, int layoutResId) {
        mTitleResId = titleResId;
        mLayoutResId = layoutResId;
    }

    public int getTitleResId() {
        return mTitleResId;
    }

    public int getLayoutResId() {
        return mLayoutResId;
    }


}
