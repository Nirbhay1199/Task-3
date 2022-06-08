package com.nirbhay.task3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

import com.nirbhay.task3.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;

        binding.image1.setOnClickListener(view1 -> {
            Toast toast = Toast.makeText(context, "Image 1: Bird", duration);
            toast.setGravity(Gravity.CENTER,0,0);
            toast.show();
        });

        binding.image2.setOnClickListener(view12 -> {
            Toast toast = Toast.makeText(context, "Image 2: Tiger", duration);
            toast.setGravity(Gravity.CENTER,0,0);
            toast.show();
        });

        binding.image3.setOnClickListener(view12 -> {
            Toast toast = Toast.makeText(context, "Image 3: Giraffe and Zebra", duration);
            toast.setGravity(Gravity.CENTER,0,0);
            toast.show();
        });

        binding.image4.setOnClickListener(view12 -> {
            Toast toast = Toast.makeText(context, "Image 3: Peacock", duration);
            toast.setGravity(Gravity.CENTER,0,0);
            toast.show();
        });

    }

}