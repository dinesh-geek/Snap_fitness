package com.example.lcoworkoutapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class developerfragement extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View v= inflater.inflate(R.layout.developer,container,false);
        final Button mbtnCall = v.findViewById(R.id.bt_call);
        final Button mbtnsendmail = v.findViewById(R.id.bt_mailid);
        mbtnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                docallNumber("8639540963");
            }
        });
        mbtnsendmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               dosendMail("dineshsahu003@gmail.com");
            }
        });
        Button mbtncall1 = v.findViewById(R.id.bt_call1);
        Button mbtnsendmail1 = v.findViewById(R.id.bt_mailid1);
        mbtncall1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                docallNumber("7683982914");
            }
        });
        mbtnsendmail1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dosendMail("kisankadul@gmail.com");
            }
        });
        Button mbtncall2 = v.findViewById(R.id.bt_call2);
        Button mbtnsendmail2 = v.findViewById(R.id.bt_mailid2);
        mbtncall2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                docallNumber("6371415232");
            }
        });
        mbtnsendmail2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dosendMail("govinda.anil.123@gmail.com");
            }
        });
        Button mbtnCall3 = v.findViewById(R.id.bt_call3);
        Button mbtnsendMail3 = v.findViewById(R.id.bt_mailid3);
        mbtnCall3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                docallNumber("637105812");
            }
        });
        mbtnsendMail3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dosendMail("vaddiasha31@gmail.com");
            }
        });

        return  v;
    }
    private void docallNumber(String number ){
        String phoneNumber = "tel:" + number;
        Intent callIntent = new Intent(Intent.ACTION_DIAL);
        callIntent.setData(Uri.parse(phoneNumber));
        startActivity(callIntent);
    }
    private void dosendMail(String email){
        Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("mailto:"+ email));
        startActivity(intent);
    }
}
