package com.plugin.pregnantcarekuwuk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

import com.kongqw.radarscanviewlibrary.RadarScanView;

public class ScanActivity extends AppCompatActivity {
    RadarScanView radarScanView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        getSupportActionBar().setTitle("Scanning...");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        radarScanView = (RadarScanView) findViewById(R.id.radarScanView);

        radarScanView
                .setRadarScanTime(2000)
                .setRadarBackgroundColor(Color.WHITE)
                .setRadarBackgroundLinesNumber(4)
                .setRadarBackgroundLinesWidth(2)
                .setRadarBackgroundLinesColor(Color.GRAY)
                .setRadarScanColor(0xFFAAAAAA)
                .setRadarScanAlpha(0xAA);

        radarScanView.startScan();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                radarScanView.stopScan();
                startActivity(new Intent(ScanActivity.this, MainUserActivity.class));
                finish();
            }
        }, 2000);

    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return super.onSupportNavigateUp();
    }
}
