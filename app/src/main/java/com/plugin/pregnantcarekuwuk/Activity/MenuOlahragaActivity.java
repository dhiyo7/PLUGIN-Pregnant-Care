package com.plugin.pregnantcarekuwuk.Activity;

import android.content.Intent;
import android.os.Bundle;

import com.plugin.pregnantcarekuwuk.R;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;

public class MenuOlahragaActivity extends AppCompatActivity {
    LinearLayout yoga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_olahraga);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        getSupportActionBar().setTitle("Daftar Olahraga");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        yoga = findViewById(R.id.yoga);
        yoga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yg = new Intent(MenuOlahragaActivity.this, DetailOlahragaActivity.class);
                startActivity(yg);
            }
        });
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return super.onSupportNavigateUp();
    }
}
