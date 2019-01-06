package com.evolutions.jabar.videoyoutube.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.evolutions.jabar.videoyoutube.confirmquiz.SoalEssayConfirm;
import com.evolutions.jabar.videoyoutube.confirmquiz.SoalPilGanConfirm;
import com.evolutions.jabar.videoyoutube.R;


public class Quiz extends Fragment {
private ImageView imgPilihanGanda,imgEssay;
    public Quiz() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_quiz, container, false);
        imgPilihanGanda = (ImageView) view.findViewById(R.id.img_pilihan_ganda);
        imgEssay = (ImageView) view.findViewById(R.id.img_essay);

        imgPilihanGanda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SoalPilGanConfirm.class);
                startActivity(intent);
            }
        });

        imgEssay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SoalEssayConfirm.class);
                startActivity(intent);
            }
        });
        return view;
    }

}
