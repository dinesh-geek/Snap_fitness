package com.example.lcoworkoutapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.LinearLayout;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class aboutusfragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View v=inflater.inflate(R.layout.aboutus,container,false);
        LinearLayout layout = v.findViewById(R.id.diet_plan_everyday);
        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), dietplan.class);
                startActivity(intent);
            }
        });
        LinearLayout Llayout = v.findViewById(R.id.to_check_bmi);
        Llayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), Bmi.class);
                startActivity(intent);
            }
        });
        LinearLayout Lexerciselayout = v.findViewById(R.id.llexercise);
        Lexerciselayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), personalizedExerciseActivity.class);
                startActivity(intent);
            }
        });
        LinearLayout Ltraineelayout = v.findViewById(R.id.to_check_trainee);
        Ltraineelayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), GymTraineeActivity.class);
                startActivity(intent);
            }
        });
      return v;
    }
}
