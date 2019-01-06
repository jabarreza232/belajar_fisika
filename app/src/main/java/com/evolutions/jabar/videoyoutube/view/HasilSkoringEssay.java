package com.evolutions.jabar.videoyoutube.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.evolutions.jabar.videoyoutube.R;
import com.evolutions.jabar.videoyoutube.fragment.fragment_materi;
import com.evolutions.jabar.videoyoutube.soal.SoalEssay;
import com.evolutions.jabar.videoyoutube.soal.SoalPilihanGanda;

public class HasilSkoringEssay extends AppCompatActivity {
    TextView tvHasilAkhir;
    Button btnMenu, btnRestart, btnShare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_skoring_essay);
        setTitle("Hasil Nilai");
        tvHasilAkhir = (TextView) findViewById(R.id.tvSkorAkhir);
        btnMenu = (Button) findViewById(R.id.btnMenu);
        btnRestart = (Button) findViewById(R.id.btnRestart);
        btnShare = (Button) findViewById(R.id.btnShare);
        setSkor();
        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HasilSkoringEssay.this, Main2Activity.class);
                startActivity(i);

            }
        });
        btnRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HasilSkoringEssay.this, SoalEssay.class);
                startActivity(i);
            }
        });
        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_SEND);
                i.setType("text/plain");
                String skorEssay = getIntent().getStringExtra("skorAkhir2");
                i.putExtra(Intent.EXTRA_SUBJECT, "Quiz Belajar Fisika");
                i.putExtra(Intent.EXTRA_TEXT, "Aku senang menyelesaikan quiz belajar fisika :) \n" + "Disini aku mendapatkan Nilai : " + skorEssay + "%\n" + "Sungguh Pencapaian Luar biasa bagi saya :)");
                startActivity(Intent.createChooser(i, "Share Via"));
            }
        });

    }


    private void setSkor() {
        String activity = getIntent().getStringExtra("activity");
        String skorPilgan = getIntent().getStringExtra("skorAkhir");
        String skorEssay = getIntent().getStringExtra("skorAkhir2");
        if (activity.equals("PilihanGanda")) {
            tvHasilAkhir.setText("Nilai :" + skorPilgan + "%");
        } else if (activity.equals("Essay")) {
            tvHasilAkhir.setText("Nilai :" + skorEssay + "%");
        }
    }

    public void onBackPressed() {
        Toast.makeText(this, "Tidak bisa Kembali,Silahkan tekan menu", Toast.LENGTH_SHORT).show();
    }
}