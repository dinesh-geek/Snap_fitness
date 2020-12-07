package com.example.lcoworkoutapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import meow.bottomnavigation.MeowBottomNavigation;


public class MainActivity extends AppCompatActivity {
    Button random_button;
    Button daily_button;
   BottomNavigationView bottomNavigationView;


    Fragment fragment=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        random_button = findViewById(R.id.random_button);
        daily_button = findViewById(R.id.daily_button);


       getSupportFragmentManager().beginTransaction().replace(R.id.framelayout, new homefragement()).commit();

       bottomNavigationView = findViewById(R.id.bottom_navigation);
      bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
               menuItem.setChecked(true);

                switch (menuItem.getItemId())
                {
                    case R.id.home :  fragment =new homefragement();


                    break;
                    case R.id.about:  fragment=new aboutusfragment();


                        break;
                    case R.id.developer:fragment=new developerfragement();

                    break;
                }


                getSupportFragmentManager().beginTransaction().replace(R.id.framelayout,fragment).commit();






                return false;
            }
        });



    }


}
