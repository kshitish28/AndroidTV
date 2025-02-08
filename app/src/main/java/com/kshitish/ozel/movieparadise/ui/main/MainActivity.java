package com.kshitish.ozel.movieparadise.ui.main;

import android.os.Bundle;

import com.kshitish.ozel.movieparadise.ui.base.BaseTVActivity;


public class MainActivity extends BaseTVActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addFragment(MainFragment.newInstance());
    }
}
