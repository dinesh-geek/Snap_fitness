package com.example.lcoworkoutapp;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HealthtipsAdapter extends RecyclerView.Adapter<HealthtipsAdapter.HealthTipsHolder> {

    Context context;
    ArrayList<HealthTips> healthTips;

    public int[] list_video = {
            R.raw.fitness,
            R.raw.exercise,
            R.raw.run,
            R.raw.yoga
    };

    public String[] list_title = {
            "Exercise not only changes your body, it changes your mind,your attitude and your mood.",
            "Sometimes a workout is all the Therapy you need.",
            "Jogging helps to build strong bones and improves cardiovascular fitness.",
            "Yoga means addition of Energy, Strength and Beauty to Body, Mind and Soul"

    };
    public HealthtipsAdapter(Context context){
        this.context = context;
    }

    @NonNull
    @Override
    public HealthtipsAdapter.HealthTipsHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new HealthTipsHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.cell_for_health_tips,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull HealthtipsAdapter.HealthTipsHolder holder, int position) {
        int videoUrl = list_video[position];
        String videoTitle = list_title[position];
        String videoPath = "android.resource://" + context.getPackageName() + "/" + videoUrl ;
        Uri uri = Uri.parse(videoPath);

        holder.mTvTipsTitle.setText(videoTitle);
        holder.mVideoTips.setVideoURI(uri);
        holder.mVideoTips.start();
        holder.mVideoTips.requestFocus();
        holder.mVideoTips.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });

    }

    @Override
    public int getItemCount() {
        return list_title.length;
    }

    public class HealthTipsHolder extends RecyclerView.ViewHolder{
        private VideoView mVideoTips;
        private TextView mTvTipsTitle;
        public HealthTipsHolder(@NonNull View itemView) {
            super(itemView);

            mVideoTips = itemView.findViewById(R.id.vv_health_tips);
            mTvTipsTitle = itemView.findViewById(R.id.tv_health_tips_title);
        }
    }
}
/*           If it doesn't sweat, jiggle, or pant, it's not alive
             Health is hearty, health is harmony, health is happiness.
            "Exercise not only changes your body, it changes your mind, your attitude and your mood.",
            "Sometimes a workout is all the Therapy you need.",
            "Jogging helps to build strong bones and improves cardiovascular fitness." */