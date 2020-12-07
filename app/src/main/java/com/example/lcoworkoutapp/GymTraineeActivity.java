package com.example.lcoworkoutapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class GymTraineeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gym_trainee);
        ImageView num1 = findViewById(R.id.iv_num_one);
        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                docallNumber("9769100093");
            }
        });
        ImageView num2 = findViewById(R.id.iv_num_two);
        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                docallNumber("9930304664");
            }
        });
        ImageView num3 = findViewById(R.id.iv_num_three);
        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                docallNumber("9892831305");
            }
        });
        ImageView num4 = findViewById(R.id.iv_num_four);
        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                docallNumber("7947134378");
            }
        });
        ImageView num5 = findViewById(R.id.iv_num_five);
        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                docallNumber("7666121122");
            }
        });
        ImageView num6 = findViewById(R.id.iv_num_six);
        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                docallNumber("1141640264");
            }
        });
        ImageView num7 = findViewById(R.id.iv_num_seven);
        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                docallNumber("7947414122");
            }
        });
        ImageView num8 = findViewById(R.id.iv_num_eight);
        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                docallNumber("9769251664");
            }
        });
    }
    private void docallNumber(String number ){
        String phoneNumber = "tel:" + number;
        Intent callIntent = new Intent(Intent.ACTION_DIAL);
        callIntent.setData(Uri.parse(phoneNumber));
        startActivity(callIntent);
    }
}