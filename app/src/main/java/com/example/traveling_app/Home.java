package com.example.traveling_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.traveling_app.Maldivs.Maldivs_Activity;
import com.example.traveling_app.databinding.ActivityHomeBinding;

public class Home extends AppCompatActivity {
    private ActivityHomeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.Maldivs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, Maldivs_Activity.class);
                startActivity(intent);
            }
        });
//        binding.luxemburg.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(Home.this,Luxemburg_Activity.class);
//                startActivity(intent);
//            }
//        });
    }
}