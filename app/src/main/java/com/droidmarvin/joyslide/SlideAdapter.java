package com.droidmarvin.joyslide;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;

public class SlideAdapter extends PagerAdapter {

Context context;
LayoutInflater inflater;

//list of images
    public int[] lst_images = {
      R.drawable.image_1,
        R.drawable.image_2,
        R.drawable.image_3,
        R.drawable.image_4

    };

    //list of titles
public String []lst_titles = {

            };


    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return false;
    }
}
