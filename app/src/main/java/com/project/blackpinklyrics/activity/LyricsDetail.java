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

    TextView mTitleTv, mLyricsTv, mAlbumTv, mDateTv;
    ImageView mImageTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lyrics_detail);

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

