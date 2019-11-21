package com.plugin.pregnantcarekuwuk.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.plugin.pregnantcarekuwuk.MainActivity;
import com.plugin.pregnantcarekuwuk.MainUserActivity;
import com.plugin.pregnantcarekuwuk.R;

public class RegisterActivity extends AppCompatActivity {

    private Button btnUmum, btnRegis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        initViews();
        intent();
    }


    private void initViews() {
        btnUmum = findViewById(R.id.btnUmum);
        btnRegis = findViewById(R.id.btnRegis);
    }

    private void intent() {
        btnUmum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(RegisterActivity.this, MainUserActivity.class);
                startActivity(a);
            }
        });

        btnRegis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(RegisterActivity.this, MainActivity.class);
                startActivity(a);
            }
        });
    }


}
