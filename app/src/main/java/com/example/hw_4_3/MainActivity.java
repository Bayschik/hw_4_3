package com.example.hw_4_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.hw_4_3.CONTINENT.ContinentFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().add(R.id.container, new ContinentFragment()).commit();
    }
}