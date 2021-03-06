package com.project.blackpinklyrics.adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.project.blackpinklyrics.CustomFilter;
import com.project.blackpinklyrics.ItemClickListener;
import com.project.blackpinklyrics.R;
import com.project.blackpinklyrics.activity.LyricsDetail;
import com.project.blackpinklyrics.model.ModelLyrics;
import com.project.blackpinklyrics.viewholder.ViewHolderLyrics;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;


public class AdapterLyrics extends RecyclerView.Adapter<ViewHolderLyrics> implements Filterable {

    Context c;
    public ArrayList<ModelLyrics> modelLyrics, filterList;
    CustomFilter filter;

    public AdapterLyrics(Context c, ArrayList<ModelLyrics> modelLyrics) {
        this.c = c;
        this.modelLyrics = modelLyrics;
        this.filterList = modelLyrics;
    }

    @NonNull
    @Override
    public ViewHolderLyrics onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_lyrics, null, false);
        RecyclerView.LayoutParams lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        view.setLayoutParams(lp);
        return new ViewHolderLyrics(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolderLyrics holder, int position) {

        holder.mTitle.setText(modelLyrics.get(position).getTitle());
        holder.mLyrics.setText(modelLyrics.get(position).getLyrics());
        holder.mAlbum.setText(modelLyrics.get(position).getAlbum());
        holder.mDate.setText(modelLyrics.get(position).getDate());
        holder.mImageView.setImageResource(modelLyrics.get(position).getImage());

        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClickListener(View v, int position) {
                String gTitle = modelLyrics.get(position).getTitle();
                String gLyrics = modelLyrics.get(position).getLyrics();
                String gAlbum = modelLyrics.get(position).getAlbum();
                String gDate = modelLyrics.get(position).getDate();
                BitmapDrawable bitmapDrawable = (BitmapDrawable)holder.mImageView.getDrawable();

                Bitmap bitmap = bitmapDrawable.getBitmap();

                ByteArrayOutputStream stream = new ByteArrayOutputStream();

                bitmap.compress(Bitmap.CompressFormat.PNG, 100,stream);

                byte[] bytes = stream.toByteArray();

                Intent intent = new Intent (c, LyricsDetail.class);
                intent.putExtra("title", gTitle);
                intent.putExtra("lyrics", gLyrics);
                intent.putExtra("album", gAlbum);
                intent.putExtra("date", gDate);
                intent.putExtra("image", bytes);
                c.startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return modelLyrics.size();
    }

    @Override
    public Filter getFilter() {

        if (filter == null){
            filter = new CustomFilter(filterList, this);
        }

        return filter;
    }
}
