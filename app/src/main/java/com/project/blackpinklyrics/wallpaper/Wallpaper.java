package com.project.blackpinklyrics.wallpaper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.app.WallpaperManager;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.io.IOException;

import com.project.blackpinklyrics.R;

public class Wallpaper extends AppCompatActivity {

    LinearLayout theme_preview;
    Button btn_save;
    String newString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wallpaper);

        btn_save=(Button)findViewById(R.id.btn_save);
        theme_preview=(LinearLayout)findViewById(R.id.theme_preview);


        if(savedInstanceState==null){
            Bundle extras=getIntent().getExtras();
            if(extras==null){
                newString=null;
            }else {
                newString=extras.getString("PATH_PICTURE");
                if(newString.equals("btn_1")){
                    theme_preview.setBackgroundResource(R.drawable.jennie_wp);

                    btn_save.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            WallpaperManager wlp=WallpaperManager.getInstance(getApplicationContext());
                            Toast.makeText(getApplicationContext()," Wallpaper Berhasil dipasang",Toast.LENGTH_SHORT).show();
                            try{
                                wlp.setResource(+ R.drawable.jennie_wp);
                            }catch (IOException e){
                                e.printStackTrace();
                            }
                        }
                    });
                }else if (newString.equals("btn_2")) {
                    theme_preview.setBackgroundResource(R.drawable.lisa_wp);
                    btn_save.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            WallpaperManager wlp=WallpaperManager.getInstance(getApplicationContext());
                            Toast.makeText(getApplicationContext()," Wallpaper Berhasil dipasang",Toast.LENGTH_SHORT).show();
                            try{
                                wlp.setResource(+ R.drawable.lisa_wp);
                            }catch (IOException e){
                                e.printStackTrace();
                            }
                        }
                    });

                }else if (newString.equals("btn_3")) {
                    theme_preview.setBackgroundResource(R.drawable.jisoo_wp);
                    btn_save.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            WallpaperManager wlp=WallpaperManager.getInstance(getApplicationContext());
                            Toast.makeText(getApplicationContext(),"Wallpaper Berhasil dipasang",Toast.LENGTH_SHORT).show();
                            try{
                                wlp.setResource(+ R.drawable.jisoo_wp);
                            }catch (IOException e){
                                e.printStackTrace();
                            }
                        }
                    });
                }else if (newString.equals("btn_4")) {
                    theme_preview.setBackgroundResource(R.drawable.rose_wp);
                    btn_save.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            WallpaperManager wlp=WallpaperManager.getInstance(getApplicationContext());
                            Toast.makeText(getApplicationContext(),"Wallpaper Berhasil dipasang",Toast.LENGTH_SHORT).show();
                            try{
                                wlp.setResource(+ R.drawable.rose_wp);
                            }catch (IOException e){
                                e.printStackTrace();
                            }
                        }
                    });



            }
        }


    }



    }
}
