package com.droidmarvin.joyslide;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.view.PagerAdapter;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

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

            "REBEL",
            "RELIGIOUS",
            "GORGEOUS",
            "CONSERVATIVE"

            };
//list of descriptions

    public String []lst_descriptions = {

            "She's got a rebelheart, like Godzilla. A natural Rebel. ",
            "Deeply religious.And in terms of " +
                    "seduction, it can make even the most able of seducers confused and frustrated." +
                    "She may take me to Heaven though "
            ,
            "Pum pum Skraaaa. Skididi Jigi jigi yeyeee",
            "She favores her traditional views and values; always inclined to oppose change, always cautious." +
                    "Somewhat of a late-in-life child. Background hides a lot"

    };


    //list of background colors

    public int []lst_backgroundcolor = {

            Color.rgb(55,55,55),
            Color.rgb(239, 85, 85),
            Color.rgb(110, 49, 89),
            Color.rgb(1, 188, 212)
    };


public SlideAdapter (Context context) {
    this.context = context;
}
    @Override
    public int getCount() {
        return lst_titles.length;

    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view == (LinearLayout)object );
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.slide, container, false);
        LinearLayout layoutslide = (LinearLayout) view.findViewById(R.id.slidelinearlayout);
        ImageView imgslide = (ImageView) view.findViewById(R.id.slideimg);
        TextView txttitle = (TextView) view.findViewById(R.id.txttitle);
        TextView description = (TextView) view.findViewById(R.id.txtdescription);

        layoutslide.setBackgroundColor(lst_backgroundcolor[position]);
        imgslide.setImageResource(lst_images[position]);
        txttitle.setText(lst_titles[position]);
        description.setText(lst_descriptions[position]);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout)object);
    }
}
