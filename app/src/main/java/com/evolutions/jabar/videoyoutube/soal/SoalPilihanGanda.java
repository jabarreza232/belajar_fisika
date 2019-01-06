package com.evolutions.jabar.videoyoutube.soal;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.evolutions.jabar.videoyoutube.view.HasilSkoring;
import com.evolutions.jabar.videoyoutube.R;
import com.evolutions.jabar.videoyoutube.view.Soal2PilihanGanda;

import java.util.concurrent.TimeUnit;

public class SoalPilihanGanda extends AppCompatActivity {
    TextView txtSkor, txtSoal, txtTimer;
    RadioGroup mrgPilihanJawaban;
    RadioButton mrbPilihanJawaban1, mrbPilihanJawaban2, mrbPilihanJawaban3, mrbPilihanJawaban4, mrbPilihanJawaban5;
    Button btnSubmit;
    int skor = 0;
    int arr; //untuk menampung nilai panjang array
    int x; //menunjukkan konten sekarang
    String jawaban; //menampung jawaban benar
    Soal2PilihanGanda soalPG = new Soal2PilihanGanda();
    private static final String FORMAT = "%02d:%02d:%02d";
    int seconds, minutes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal_pilihan_ganda);
        setTitle("Soal Pilihan Ganda");

        txtSkor = (TextView) findViewById(R.id.tv_Skor);
        txtSoal = (TextView) findViewById(R.id.tvSoal);
        mrgPilihanJawaban = (RadioGroup) findViewById(R.id.rgPilihanJawaban);
        mrbPilihanJawaban1 = (RadioButton) findViewById(R.id.rbPilihanJawaban1);
        mrbPilihanJawaban2 = (RadioButton) findViewById(R.id.rbPilihanJawaban2);
        mrbPilihanJawaban3 = (RadioButton) findViewById(R.id.rbPilihanJawaban3);
        mrbPilihanJawaban4 = (RadioButton) findViewById(R.id.rbPilihanJawaban4);
        mrbPilihanJawaban5 = (RadioButton) findViewById(R.id.rbPilihanJawaban5);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);
MulaiTimer();
        txtSkor.setText("" + skor);
        setKontent();
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cekJawaban();
            }
        });

    }

    private void MulaiTimer() {
        txtTimer =(TextView)findViewById(R.id.txt_timer);
        new CountDownTimer(600000, 100) {
            @SuppressLint({"DefaultLocale", "SetTextI18n"})
            public void onTick(long millisUntilFinished) {
                txtTimer.setText("" + String.format(FORMAT,
                        TimeUnit.MILLISECONDS.toHours(millisUntilFinished),
                        TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished) - TimeUnit.HOURS.toMinutes(
                                TimeUnit.MILLISECONDS.toHours(millisUntilFinished)),
                        TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished) - TimeUnit.MINUTES.toSeconds(
                                TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished))));
            }


            public void onFinish() {
                String jumlahSkor = String.valueOf(skor);
                Intent intent = new Intent(SoalPilihanGanda.this, HasilSkoring.class);
                intent.putExtra("skorAkhir", jumlahSkor);
                intent.putExtra("activity", "PilihanGanda");

                startActivity(intent);

            }

        }.start();
    }

    public void setKontent() {
        mrgPilihanJawaban.clearCheck();
        arr = soalPG.pertanyaan.length;

        if (x >= arr) {//jika nilai x melebihi nilai arr(panjang array) maka akan pindah activity (kuis selesai)
            String jumlahSkor = String.valueOf(skor);
            Intent i = new Intent(SoalPilihanGanda.this, HasilSkoring.class);

            i.putExtra("skorAkhir", jumlahSkor);
            i.putExtra("activity", "PilihanGanda");
            startActivity(i);

        } else {
            txtSoal.setText(soalPG.getPertanyaan(x));
            mrbPilihanJawaban1.setText(soalPG.getPilihanJawaban1(x));
            mrbPilihanJawaban2.setText(soalPG.getPilihanJawaban2(x));
            mrbPilihanJawaban3.setText(soalPG.getPilihanJawaban3(x));
            mrbPilihanJawaban4.setText(soalPG.getPilihanJawaban4(x));
            mrbPilihanJawaban5.setText(soalPG.getPilihanJawaban5(x));
            jawaban = soalPG.getJawabanBenar(x);
        }
        x++;
    }

    public void cekJawaban() {
        if (mrbPilihanJawaban1.isChecked()) {
            if (mrbPilihanJawaban1.getText().toString().equals(jawaban)) {
                skor = skor + 20;
                txtSkor.setText("" + skor);

                setKontent();
            } else {
                txtSkor.setText("" + skor);
                setKontent();
            }
        } else if (mrbPilihanJawaban2.isChecked()) {
            if (mrbPilihanJawaban2.getText().toString().equals(jawaban)) {
                skor = skor + 20;
                txtSkor.setText("" + skor);
                setKontent();
            } else {
                txtSkor.setText("" + skor);

                setKontent();
            }
        } else if (mrbPilihanJawaban3.isChecked()) {
            if (mrbPilihanJawaban3.getText().toString().equals(jawaban)) {
                skor = skor + 20;
                txtSkor.setText("" + skor);

                setKontent();
            } else {
                txtSkor.setText("" + skor);
                setKontent();

            }
        } else if (mrbPilihanJawaban4.isChecked()) {
            if (mrbPilihanJawaban4.getText().toString().equals(jawaban)) {
                skor = skor + 20;
                txtSkor.setText("" + skor);
                setKontent();
            } else {
                txtSkor.setText("" + skor);
                setKontent();
            }
        } else if (mrbPilihanJawaban5.isChecked()) {
            if (mrbPilihanJawaban5.getText().toString().equals(jawaban)) {
                skor = skor + 20;
                txtSkor.setText("" + skor);
                setKontent();
            } else {
                txtSkor.setText("" + skor);
                setKontent();
            }


        } else {
            Toast.makeText(this, "Silahkan pilih Jawaban dulu !", Toast.LENGTH_SHORT).show();
        }
    }

    public void onBackPressed() {
        Toast.makeText(this, "Selesaikan Kuis Terlebih dahulu !", Toast.LENGTH_SHORT).show();
    }


}
