package com.plugin.pregnantcarekuwuk.FragmentBumil;


import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.plugin.pregnantcarekuwuk.Activity.MakanActivity;
import com.plugin.pregnantcarekuwuk.Activity.MinumActivity;
import com.plugin.pregnantcarekuwuk.Activity.OlahragaActivity;
import com.plugin.pregnantcarekuwuk.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class BerandaFragment extends Fragment {

    private CardView mnMakan, mnMinum, mnOlahraga;



    public BerandaFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_beranda, container, false);

        mnMakan = view.findViewById(R.id.mnMakan);
        mnMakan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m = new Intent(getActivity(), MakanActivity.class);
                startActivity(m);

            }
        });

        mnMinum = view.findViewById(R.id.mnMinum);
        mnMinum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mnm = new Intent(getActivity(), MinumActivity.class);
                startActivity(mnm);
            }
        });

        mnOlahraga = view.findViewById(R.id.mnOlahraga);
        mnOlahraga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent or = new Intent(getActivity(), OlahragaActivity.class);
                startActivity(or);
            }
        });


        return view;
    }

}
