package com.project.blackpinklyrics.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


import com.project.blackpinklyrics.R;

public class LyricsDetail extends AppCompatActivity {

    TextView mTitleTv, mLyricsTv;
    ImageView mImageTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lyrics_detail);

        mTitleTv = findViewById(R.id.song_title);
        mLyricsTv = findViewById(R.id.song_lyrics);
        mImageTv = findViewById(R.id.song_image);

        Intent intent = getIntent();

        String mTitle = intent.getStringExtra("title");
        String mLyrics = intent.getStringExtra("lyrics");

        byte[] mBytes = getIntent().getByteArrayExtra("image");

        Bitmap bitmap = BitmapFactory.decodeByteArray(mBytes, 0, mBytes.length);

        mTitleTv.setText(mTitle);
        mLyricsTv.setText(mLyrics);
        mImageTv.setImageBitmap(bitmap);

    }

}

