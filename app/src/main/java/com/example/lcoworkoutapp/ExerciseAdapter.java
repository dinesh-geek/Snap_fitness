package com.example.lcoworkoutapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ExerciseAdapter extends RecyclerView.Adapter<ExerciseAdapter.ExerciseHolder> {
    private Context context;
    private String[] exerciseName;
    private int[] exerciseImageValue ={
           R.drawable.lunges,
            R.drawable.plank,
           R.drawable.workout,
            R.drawable.squat,
            R.drawable.workout1,
            R.drawable.workout2,
            R.drawable.workout3,
            R.drawable.body_weight,
            R.drawable.sit_up,
            R.drawable.dumbbell
    };

    public ExerciseAdapter(Context context){
        this.context = context;
        this.exerciseName = context.getResources().getStringArray(R.array.exercise_name);
    }
    @NonNull
    @Override
    public ExerciseHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ExerciseHolder(LayoutInflater.from(context).inflate(R.layout.cell_exercise,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ExerciseHolder holder, int position) {
          String currentExerciseName = exerciseName[position];
          holder.mTvExerciseName.setText(currentExerciseName);
          holder.mIvExerciseImage.setImageResource(exerciseImageValue[position]);
    }

    @Override
    public int getItemCount() {
        return exerciseName.length;
    }

    public class ExerciseHolder extends RecyclerView.ViewHolder {
        private TextView mTvExerciseName;
        private ImageView mIvExerciseImage;

        public ExerciseHolder(@NonNull View itemView) {
            super(itemView);

            mTvExerciseName = itemView.findViewById(R.id.tv_exercise_name);
            mIvExerciseImage = itemView.findViewById(R.id.iv_exercise_image);
        }
    }
}
