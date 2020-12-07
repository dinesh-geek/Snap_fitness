package com.example.lcoworkoutapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class sliderAdapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public sliderAdapter(Context context){
        this.context = context;
    }

    public int[] slide_images = {
          R.drawable.onboardpic1,
            R.drawable.onboardpic2,
            R.drawable.onboardpic3
    };
    public String[] slide_desc={
        "Inhale the future, exhale the past.",
            "Be stronger than your excuses.",
            "Energy & Persistence conquer all things."
    };
    @Override
    public int getCount() {
        return slide_desc.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == (RelativeLayout)object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_layout,container,false);
        ImageView ivSlideImage = (ImageView) view.findViewById(R.id.image_of_slide);
        TextView tvSlideDesc = (TextView) view.findViewById(R.id.description_of_slide);

        ivSlideImage.setImageResource(slide_images[position]);
        tvSlideDesc.setText(slide_desc[position]);

        container.addView(view);


        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((RelativeLayout)object);
    }
}
