package com.example.lcoworkoutapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class personalizedExerciseActivity extends AppCompatActivity {
    HealthtipsAdapter healthTipsAdapter;
    private RecyclerView mRcHealthTips;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personalized_exercise);
        mRcHealthTips = findViewById(R.id.rv_health_tips);

        mRcHealthTips.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
        healthTipsAdapter = new HealthtipsAdapter(this);
        mRcHealthTips.setAdapter(healthTipsAdapter);

        RecyclerView mRcExercise = findViewById(R.id.rv_exercise);
        mRcExercise.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));
        ExerciseAdapter exerciseAdapter = new ExerciseAdapter(personalizedExerciseActivity.this);
        mRcExercise.setAdapter(exerciseAdapter);
        RecyclerView mRcYoga = findViewById(R.id.rv_yoga);
        mRcYoga.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));
        YogaAdapter yogaAdapter = new YogaAdapter(personalizedExerciseActivity.this);
        mRcYoga.setAdapter(yogaAdapter);

        ImageSlider imageSlider = findViewById(R.id.slider1);
        List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.eat_clean,""));
        slideModels.add(new SlideModel(R.drawable.go_up,""));
        slideModels.add(new SlideModel(R.drawable.motivationalquote,""));
        imageSlider.setImageList(slideModels,true);
    }
}