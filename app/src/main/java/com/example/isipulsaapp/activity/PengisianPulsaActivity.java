package com.example.isipulsaapp.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.app.Fragment;

import com.example.isipulsaapp.R;
import com.example.isipulsaapp.fragment.XLFragment;

public class PengisianPulsaActivity extends AppCompatActivity {

    private XLFragment xlFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pengisian_pulsa);
        xlFragment = new XLFragment();
    }


}
