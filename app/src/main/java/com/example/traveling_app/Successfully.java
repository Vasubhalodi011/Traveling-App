package com.example.traveling_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.traveling_app.databinding.ActivityLoginBinding;
import com.example.traveling_app.databinding.ActivitySuccessfullyBinding;

public class Successfully extends AppCompatActivity {
    private ActivitySuccessfullyBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySuccessfullyBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.bextpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Successfully.this, Home.class);
                startActivity(intent);
            }
        });
    }
}