package com.example.traveling_app.Maldivs;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.traveling_app.R;
import com.example.traveling_app.databinding.ActivityDateBinding;
import com.example.traveling_app.databinding.ActivityMaldivsBinding;

public class Date_Activity extends AppCompatActivity {
    private ActivityDateBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = ActivityDateBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Date_Activity.this, Detailbooking.class);
                startActivity(intent);
            }
        });
    }
}