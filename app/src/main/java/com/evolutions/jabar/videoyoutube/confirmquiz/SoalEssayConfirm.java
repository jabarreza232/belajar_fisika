package com.evolutions.jabar.videoyoutube.confirmquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.evolutions.jabar.videoyoutube.R;
import com.evolutions.jabar.videoyoutube.soal.SoalEssay;

public class SoalEssayConfirm extends AppCompatActivity implements View.OnClickListener {
private Button btnStart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal_essay_confirm);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle("Mulai Quiz");
  btnStart = (Button)findViewById(R.id.start2);
  btnStart.setOnClickListener(this);


    }
    public void onClick(View view){
        switch (view.getId()){
            case R.id.start2:
                Intent intent = new Intent(SoalEssayConfirm.this, SoalEssay.class);
                startActivity(intent);
                break;

        }
    }
}
