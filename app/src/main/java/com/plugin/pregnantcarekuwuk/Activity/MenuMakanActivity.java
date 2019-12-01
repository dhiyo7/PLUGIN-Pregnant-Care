package com.plugin.pregnantcarekuwuk.Activity;

import android.content.Intent;
import android.os.Bundle;

import com.plugin.pregnantcarekuwuk.R;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;

public class MenuMakanActivity extends AppCompatActivity {

    LinearLayout ikansalmon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_makan);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        getSupportActionBar().setTitle("Daftar Makanan");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ikansalmon = findViewById(R.id.ikansalmon);
        ikansalmon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent is = new Intent(MenuMakanActivity.this, DetailActivity.class);
                startActivity(is);
            }
        });
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return super.onSupportNavigateUp();
    }
}
