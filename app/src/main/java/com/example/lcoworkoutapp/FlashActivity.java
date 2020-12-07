package com.example.lcoworkoutapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class FlashActivity extends AppCompatActivity {
    private TextView mAppName;
    private static int SPLASH_TIME = 5500;
    private Animation animAppName;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flash);

        mAppName = findViewById(R.id.tv_app_name);
        animAppName = AnimationUtils.loadAnimation(FlashActivity.this, R.anim.app_name);
        mAppName.setAnimation(animAppName);

        LottieAnimationView firstflash = findViewById(R.id.flash_screen);
        LottieAnimationView secondflash = findViewById(R.id.flash_screen1);
        TextView snap = findViewById(R.id.tv_app_name);
        firstflash.animate().translationY(1600).setDuration(1000).setStartDelay(4000);
        secondflash.animate().translationY(1600).setDuration(1000).setStartDelay(4000);
        snap.animate().translationY(1600).setDuration(1000).setStartDelay(4000);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                sharedPreferences = getSharedPreferences("onBoardingScreen", MODE_PRIVATE);

                boolean isFirstTime = sharedPreferences.getBoolean("firstTime", true);

                if (isFirstTime) {
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putBoolean("firstTime",false);
                    editor.commit();
                    startActivity(new Intent(FlashActivity.this, OnBoardActivity.class));
                    finish();
                }else {
                    startActivity(new Intent(FlashActivity.this, MainActivity.class));
                    finish();
                }
            }
        }, SPLASH_TIME);


    }
}