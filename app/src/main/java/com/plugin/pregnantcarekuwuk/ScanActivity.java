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
                // 设置雷达扫描一圈时间
                .setRadarScanTime(2000)
                // 设置雷达背景颜色
                .setRadarBackgroundColor(Color.WHITE)
                // 设置雷达背景圆圈数量
                .setRadarBackgroundLinesNumber(4)
                // 设置雷达背景圆圈宽度
                .setRadarBackgroundLinesWidth(2)
                // 设置雷达背景圆圈颜色
                .setRadarBackgroundLinesColor(Color.GRAY)
                // 设置雷达扫描颜色
                .setRadarScanColor(0xFFAAAAAA)
                // 设置雷达扫描透明度
                .setRadarScanAlpha(0xAA);

        radarScanView.startScan();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                radarScanView.stopScan();
                startActivity(new Intent(ScanActivity.this, MainUserActivity.class));
            }
        }, 2000);

    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return super.onSupportNavigateUp();
    }
}
