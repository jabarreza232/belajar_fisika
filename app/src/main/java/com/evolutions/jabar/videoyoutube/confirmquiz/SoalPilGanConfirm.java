package com.evolutions.jabar.videoyoutube.confirmquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.evolutions.jabar.videoyoutube.R;
import com.evolutions.jabar.videoyoutube.soal.SoalPilihanGanda;

public class SoalPilGanConfirm extends AppCompatActivity implements View.OnClickListener{
private Button btnStart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal_pil_gan_confirm);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    btnStart= (Button)findViewById(R.id.start);
    setTitle("Mulai Quiz");

    btnStart.setOnClickListener(this);

    }
    public void onClick(View view){
        switch (view.getId()){
            case R.id.start:
                Intent intent =  new Intent(SoalPilGanConfirm.this, SoalPilihanGanda.class);
                startActivity(intent);
                break;
        }
    }
}
