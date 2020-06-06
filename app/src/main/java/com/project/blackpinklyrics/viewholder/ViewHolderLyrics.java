package com.project.blackpinklyrics.viewholder;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.project.blackpinklyrics.ItemClickListener;
import com.project.blackpinklyrics.R;

public class ViewHolderLyrics extends RecyclerView.ViewHolder implements View.OnClickListener{

    public ImageView mImageView;
    public TextView mTitle;
    public TextView mLyrics;
    public TextView mAlbum;
    public TextView mDate;
    ItemClickListener itemClickListener;


    public ViewHolderLyrics(@NonNull View itemView) {
        super(itemView);

        this.mImageView = itemView.findViewById(R.id.song_image);
        this.mTitle = itemView.findViewById(R.id.song_title);
        this.mLyrics = itemView.findViewById(R.id.song_lyrics);
        this.mAlbum = itemView.findViewById(R.id.song_album);
        this.mDate = itemView.findViewById(R.id.song_date);

        itemView.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        this.itemClickListener.onItemClickListener(v, getLayoutPosition());
    }

    public void setItemClickListener(ItemClickListener ic){

        this.itemClickListener = ic;
    }
}
