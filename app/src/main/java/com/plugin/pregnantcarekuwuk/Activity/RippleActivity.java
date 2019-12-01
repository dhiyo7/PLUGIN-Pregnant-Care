package com.plugin.pregnantcarekuwuk.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.plugin.pregnantcarekuwuk.R;
import com.skyfishjy.library.RippleBackground;

public class RippleActivity extends AppCompatActivity {

    private LinearLayout lnRipple;
    private RippleBackground rippleBg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ripple);

        lnRipple =  findViewById(R.id.lnRipple);
        rippleBg.startRippleAnimation();

    }
}
