package com.example.lcoworkoutapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class dietplan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dietplan);

        ImageSlider imageSlider = findViewById(R.id.slider);
        List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.day_1,"Day 1"));
        slideModels.add(new SlideModel(R.drawable.day_2,"Day 2"));
        slideModels.add(new SlideModel(R.drawable.day_3,"Day 3"));
        slideModels.add(new SlideModel(R.drawable.day_4,"Day 4"));
        slideModels.add(new SlideModel(R.drawable.day_5,"Day 5"));
        slideModels.add(new SlideModel(R.drawable.day_6,"Day 6"));
        slideModels.add(new SlideModel(R.drawable.day_7,"Day 7"));
        imageSlider.setImageList(slideModels,true);
    }
}