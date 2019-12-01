package com.plugin.pregnantcarekuwuk.FragmentBumil;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.plugin.pregnantcarekuwuk.Activity.IntentChatActivity;
import com.plugin.pregnantcarekuwuk.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ChatFragment extends Fragment {
    private LinearLayout Felix;


    public ChatFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_chat, container, false);

        Felix = view.findViewById(R.id.drfelix);
        Felix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent f = new Intent(getActivity(), IntentChatActivity.class);
                startActivity(f);
            }
        });

        // Inflate the layout for this fragment

        return view;

    }

}
