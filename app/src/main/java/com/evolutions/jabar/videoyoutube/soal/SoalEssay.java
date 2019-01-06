package com.evolutions.jabar.videoyoutube.soal;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.CountDownTimer;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.evolutions.jabar.videoyoutube.view.HasilSkoring;
import com.evolutions.jabar.videoyoutube.R;
import com.evolutions.jabar.videoyoutube.view.HasilSkoringEssay;
import com.evolutions.jabar.videoyoutube.view.Soal1Essay;
import com.squareup.picasso.Picasso;

import java.util.concurrent.TimeUnit;

import static android.media.MediaExtractor.MetricsConstants.FORMAT;

public class SoalEssay extends AppCompatActivity {
TextView txt_skor2,txt_soal2,txt_timer;
ImageView mivGambar;
EditText edtJawaban;
Button btnSubmit2;
int x=0;
int arr;
int skor;
String jawaban;
Soal1Essay essay=new Soal1Essay();
    private static final String FORMAT = "%02d:%02d:%02d";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal_essay);
        setTitle("Soal Essay");
txt_skor2 = (TextView)findViewById(R.id.tvSkor2);
txt_soal2 = (TextView)findViewById(R.id.tvSoal2);
mivGambar = (ImageView)findViewById(R.id.ivGambar);
edtJawaban = (EditText)findViewById(R.id.edtJawaban);
btnSubmit2 = (Button)findViewById(R.id.btnSubmit2);
setKonten();
mulaiTimer();
btnSubmit2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        cekJawaban();
    }
}); }
    private void mulaiTimer(){
        txt_timer = (TextView)findViewById(R.id.txt_timer_essay);

        new CountDownTimer(600000, 100) {
            @SuppressLint({"SetTextI18n", "DefaultLocale"})
            @Override
            public void onTick(long millisUntilFinished) {
                txt_timer.setText("" + String.format(FORMAT,
                        TimeUnit.MILLISECONDS.toHours(millisUntilFinished),
                        TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished) - TimeUnit.HOURS.toMinutes(
                                TimeUnit.MILLISECONDS.toHours(millisUntilFinished)),
                        TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished) - TimeUnit.MINUTES.toSeconds(
                                TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished))));
            }

            @Override
            public void onFinish() {
                String jumlahSkor = String.valueOf(skor);
                Intent intent = new Intent(SoalEssay.this, HasilSkoringEssay.class);
                intent.putExtra("skorAkhir", jumlahSkor);
                intent.putExtra("activity", "Essay");
                startActivity(intent);
            }
        }.start();
    }

    public void setKonten() {
    edtJawaban.setText(null);
    arr= essay.pertanyaan.length;
    if (x>=arr){
    String jumlahSkor = String.valueOf(skor);
    Intent i = new Intent(SoalEssay.this,HasilSkoringEssay.class);
    i.putExtra("skorAkhir2",jumlahSkor);
    i.putExtra("activity","Essay");
    startActivity(i);

    }else{
    txt_soal2.setText(essay.getPertanyaan(x));
    ubahGambar();
    jawaban = essay.getJawabanBenar(x);
}
x++;

    }

    public void ubahGambar(){
        Picasso.with(this).load(essay.getStringGambar(x)).into(mivGambar);
    }
    public void cekJawaban(){
        if (!edtJawaban.getText().toString().isEmpty()){
            if (edtJawaban.getText().toString().equalsIgnoreCase(jawaban)){
                skor = skor+20;
                txt_skor2.setText(""+skor);
                setKonten();
            }else{
                txt_skor2.setText(""+skor);
                setKonten();
            }

        }else{
            Toast.makeText(this,"Silahkan Pilih Jawaban Terlebih dahulu",Toast.LENGTH_SHORT).show();

        }
    }
    public void onBackPressed(){
        Toast.makeText(this,"Selesaikan kuis terlebih dahulu !",Toast.LENGTH_SHORT).show();
    }
}
