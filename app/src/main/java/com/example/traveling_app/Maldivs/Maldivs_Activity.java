package com.example.traveling_app.Maldivs;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.traveling_app.Login;
import com.example.traveling_app.Onboarding;
import com.example.traveling_app.R;
import com.example.traveling_app.databinding.ActivityMaldivsBinding;
import com.example.traveling_app.databinding.ActivityOnboardingBinding;

public class Maldivs_Activity extends AppCompatActivity {
    private ActivityMaldivsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMaldivsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.booking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Maldivs_Activity.this, Date_Activity.class);
                startActivity(intent);
            }
        });
    }
}