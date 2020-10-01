package com.project.blackpinklyrics.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;


import com.project.blackpinklyrics.R;

public class LyricsDetail extends AppCompatActivity {

    TextView mTitleTv, mLyricsTv, mAlbumTv, mDateTv;
    ImageView mImageTv;

    private Toolbar mToolbar;

    private static final String TAG = "LyricsDetail";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lyrics_detail);

        /** iklan
        //Inisialisasi Banner Ads
        AdView adView = findViewById(R.id.adView);
        adView.loadAd(new AdRequest.Builder().build());

        //Membuat Event Pada Siklus Hidup Iklan
        adView.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                //Kode disini akan di eksekusi saat Iklan Ditutup
                //Toast.makeText(getApplicationContext(), "Iklan Dititup", Toast.LENGTH_SHORT).show();
                super.onAdClosed();
            }

            @Override
            public void onAdFailedToLoad(int i) {
                //Kode disini akan di eksekusi saat Iklan Gagal Dimuat
                //Toast.makeText(getApplicationContext(), "Iklan Gagal Dimuat", Toast.LENGTH_SHORT).show();
                super.onAdFailedToLoad(i);
            }

            @Override
            public void onAdLeftApplication() {
                //Kode disini akan di eksekusi saat Pengguna Meniggalkan Aplikasi/Membuka Aplikasi Lain
                //Toast.makeText(getApplicationContext(), "Iklan Ditinggalkan", Toast.LENGTH_SHORT).show();
                super.onAdLeftApplication();
            }

            @Override
            public void onAdOpened() {
                //Kode disini akan di eksekusi saat Pengguna Mengklik Iklan
                //Toast.makeText(getApplicationContext(), "Iklan Diklik", Toast.LENGTH_SHORT).show();
                super.onAdOpened();
            }

            @Override
            public void onAdLoaded() {
                //Kode disini akan di eksekusi saat Iklan Selesai Dimuat
                //Toast.makeText(getApplicationContext(), "Iklan Selesai Dimuat", Toast.LENGTH_SHORT).show();
                super.onAdLoaded();
            }

        });

         **/

        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        mToolbar.setNavigationIcon(R.drawable.ic_baseline_arrow_pinkmuda);
        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        mToolbar.setTitle(getTitle());

        mTitleTv = findViewById(R.id.song_title);
        mLyricsTv = findViewById(R.id.song_lyrics);
        mAlbumTv = findViewById(R.id.song_album);
        mDateTv = findViewById(R.id.song_date);
        mImageTv = findViewById(R.id.song_image);

        Intent intent = getIntent();

        String mTitle = intent.getStringExtra("title");
        String mLyrics = intent.getStringExtra("lyrics");
        String mAlbum = intent.getStringExtra("album");
        String mDate = intent.getStringExtra("date");

        byte[] mBytes = getIntent().getByteArrayExtra("image");

        Bitmap bitmap = BitmapFactory.decodeByteArray(mBytes, 0, mBytes.length);

        mTitleTv.setText(mTitle);
        mLyricsTv.setText(mLyrics);
        mAlbumTv.setText(mAlbum);
        mDateTv.setText(mDate);
        mImageTv.setImageBitmap(bitmap);

    }

}

