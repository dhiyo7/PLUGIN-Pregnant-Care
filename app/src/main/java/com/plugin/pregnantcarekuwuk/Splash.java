package com.plugin.pregnantcarekuwuk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.plugin.pregnantcarekuwuk.Activity.LoginActivity;
import com.plugin.pregnantcarekuwuk.Activity.RegisterActivity;


public class Splash extends AppCompatActivity {

    private ImageView logo;
    private LinearLayout linear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splash);

        logo = (ImageView) findViewById(R.id.logo);
        linear = (LinearLayout) findViewById(R.id.linear);

        Animation myanim = AnimationUtils.loadAnimation(this,R.anim.transition);
        logo.startAnimation(myanim);
        linear.startAnimation(myanim);


        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        logo = (ImageView) findViewById(R.id.logo);

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), LoginActivity.class));
                finish();
            }
        }, 3000L);

     }

}
