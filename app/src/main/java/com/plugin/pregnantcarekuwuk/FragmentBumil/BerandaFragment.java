package com.plugin.pregnantcarekuwuk.FragmentBumil;


import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.plugin.pregnantcarekuwuk.LihatHistory;
import com.plugin.pregnantcarekuwuk.Activity.MenuMakanActivity;
import com.plugin.pregnantcarekuwuk.Activity.MenuMinumActivity;
import com.plugin.pregnantcarekuwuk.Activity.MenuOlahragaActivity;
import com.plugin.pregnantcarekuwuk.R;
import com.plugin.pregnantcarekuwuk.Activity.ScanActivity;
import com.skyfishjy.library.RippleBackground;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * A simple {@link Fragment} subclass.
 */
public class BerandaFragment extends Fragment {

    private CardView mnMakan, mnMinum, mnOlahraga;
    private CircleImageView ivPannic;
    private RippleBackground rippleBg;
    private TextView LihatSemua;



    public BerandaFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_beranda, container, false);

        LihatSemua = view.findViewById(R.id.lihat_semua);
        LihatSemua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lihatsemua = new Intent(getActivity(), LihatHistory.class);
                startActivity(lihatsemua);
            }
        });

        mnMakan = view.findViewById(R.id.mnMakan);
        mnMakan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m = new Intent(getActivity(), MenuMakanActivity.class);
                startActivity(m);

            }
        });

        mnMinum = view.findViewById(R.id.mnMinum);
        mnMinum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mnm = new Intent(getActivity(), MenuMinumActivity.class);
                startActivity(mnm);
            }
        });

        mnOlahraga = view.findViewById(R.id.mnOlahraga);
        mnOlahraga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent or = new Intent(getActivity(), MenuOlahragaActivity.class);
                startActivity(or);
            }
        });

        rippleBg = view.findViewById(R.id.ripple_bg);
        ivPannic = view.findViewById(R.id.ivPannic);
        ivPannic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rippleBg.startRippleAnimation();
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        rippleBg.stopRippleAnimation();
                        startActivity(new Intent(getActivity(), ScanActivity.class));
                    }
                }, 3000);

            }
        });

        return view;
    }

}
