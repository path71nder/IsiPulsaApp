package com.example.isipulsaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.isipulsaapp.activity.PengisianPulsaActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void StartPengisianPulsa(View view) {
        Intent intent = new Intent(this, PengisianPulsaActivity.class);
        startActivity(intent);
    }
}
