package com.example.lcoworkoutapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class OnBoardActivity extends AppCompatActivity {

    private ViewPager mSlideViewpager;
    private LinearLayout mDotLayout;

    private TextView[] mDots;
    private sliderAdapter adapter;

    private Button mBackbutton;
    private Button mNextButton;

    private int mCurrentPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_board);

        mBackbutton = (Button) findViewById(R.id.btn_back);
        mNextButton = (Button) findViewById(R.id.btn_next);

        mSlideViewpager = findViewById(R.id.vp_onboard);
        mDotLayout = findViewById(R.id.ll_dots);
        adapter = new sliderAdapter(this);
        mSlideViewpager.setAdapter(adapter);
        addDotsIndicator(0);
        mSlideViewpager.addOnPageChangeListener(viewListener);

        mNextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mCurrentPage == mDots.length - 1) {
                    startActivity(new Intent(OnBoardActivity.this, MainActivity.class));
                    finish();
                } else {
                    mSlideViewpager.setCurrentItem(mCurrentPage + 1);
                }
            }
        });
        mBackbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mSlideViewpager.setCurrentItem(mCurrentPage - 1);
            }
        });
    }
    public void addDotsIndicator( int position){
     mDots = new TextView[3];
     mDotLayout.removeAllViews();
     for (int i=0;i<mDots.length;i++){
         mDots[i] = new TextView(this);
         mDots[i].setText(Html.fromHtml("&#8226"));
         mDots[i].setTextSize(35);
         mDots[i].setTextColor(getResources().getColor(R.color.colorAccent));
         mDotLayout.addView(mDots[i]);
     }
     if(mDots.length>0){
         mDots[position].setTextColor(getResources().getColor(R.color.tint));
     }
    }
    ViewPager.OnPageChangeListener viewListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int i) {
          addDotsIndicator(i);
          mCurrentPage =i;
          if(i== 0){
              mNextButton.setEnabled(true);
              mBackbutton.setEnabled(false);
              mBackbutton.setVisibility(View.INVISIBLE);

              mNextButton.setText("Next");
              mBackbutton.setText("");
          }else if(i == mDots.length-1){
              mNextButton.setEnabled(true);
              mBackbutton.setEnabled(true);
              mBackbutton.setVisibility(View.VISIBLE);

              mNextButton.setText("Finish");
              mBackbutton.setText("Back");
          }else {
              mNextButton.setEnabled(true);
              mBackbutton.setEnabled(true);
              mBackbutton.setVisibility(View.VISIBLE);

              mNextButton.setText("Next");
              mBackbutton.setText("Back");
          }
        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };
}