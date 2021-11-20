package com.evolutions.jabar.videoyoutube.view;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.SimpleTarget;
import com.evolutions.jabar.videoyoutube.R;
import com.evolutions.jabar.videoyoutube.model.Fisika;
import com.google.android.youtube.player.YouTubePlayerView;

public class ScrollingActivity extends AppCompatActivity
        /* YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener */{
    private static final int REQUEST_NUMBER = 999;
    private YouTubePlayerView youTubePlayerView;
    private TextView txt_judul,txt_isi,txt_isi2;
    private AppBarLayout imgPhoto;
 public static String KEY_ITEM = "key_item";
 private Fisika item;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
txt_judul = (TextView) findViewById(R.id.txt_judul);
txt_isi = (TextView) findViewById(R.id.txt_materi);
txt_isi2 = (TextView)findViewById(R.id.txt_materi_2);
imgPhoto = (AppBarLayout) findViewById(R.id.app_bar);
item = (Fisika)getIntent().getSerializableExtra(KEY_ITEM);
txt_judul.setText(Html.fromHtml(item.getJudul()));
txt_isi.setText(Html.fromHtml(item.getIsi_materi()));
txt_isi2.setText(Html.fromHtml(item.getIsi_materi2()));

Glide.with(ScrollingActivity.this).load(item.getGambar()).asBitmap().into(new SimpleTarget<Bitmap>(){
            public void onResourceReady(Bitmap resource, GlideAnimation<? super Bitmap> glideAnimation) {
                Drawable drawable = new BitmapDrawable(resource);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                    imgPhoto.setBackground(drawable);
                }
            }
        });


    }
    }

