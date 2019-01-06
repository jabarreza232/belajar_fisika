package com.evolutions.jabar.videoyoutube.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.evolutions.jabar.videoyoutube.R;
import com.evolutions.jabar.videoyoutube.soal.SoalPilihanGanda;

public class HasilSkoring extends AppCompatActivity {
TextView tvHasilAkhir;
Button btnMenu,btnRestart,btnShare;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_skoring);
      setTitle("Hasil Nilai");
    tvHasilAkhir = (TextView)findViewById(R.id.tvSkorAkhir);
    btnMenu = (Button)findViewById(R.id.btnMenu);
btnRestart = (Button) findViewById(R.id.btnRestart);
btnShare = (Button)findViewById(R.id.btnShare);

    setSkor();

    btnMenu.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent i= new Intent(HasilSkoring.this,Main2Activity.class);
            startActivity(i);
        }
    });
    btnRestart.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent i = new Intent(HasilSkoring.this, SoalPilihanGanda.class);
            startActivity(i);
        }
    });
btnShare.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("text/plain");
        String skorPilgan = getIntent().getStringExtra("skorAkhir");

        i.putExtra(Intent.EXTRA_SUBJECT,"Quiz Belajar Fisika");
        i.putExtra(Intent.EXTRA_TEXT,"Aku senang menyelesaikan quiz belajar fisika :) \n"+"Disini aku mendapatkan Nilai : "+skorPilgan+ "%\n"+"Sungguh Pencapaian Luar biasa bagi saya :)");
        startActivity(Intent.createChooser(i,"Share Via"));
    }
});

    }


    private void setSkor() {
    String activity = getIntent().getStringExtra("activity");
    String skorPilgan = getIntent().getStringExtra("skorAkhir");
    String skorEssay = getIntent().getStringExtra("skorAkhir2");
    if (activity.equals("PilihanGanda")){
        tvHasilAkhir.setText("Nilai :"+skorPilgan+"%");
    }else if (activity.equals("Essay")){
        tvHasilAkhir.setText("Nilai :"+skorEssay+"%");
    }

    }
    public void onBackPressed(){
        Toast.makeText(this,"Tidak bisa Kembali,Silahkan tekan menu",Toast.LENGTH_SHORT).show();
    }
}
