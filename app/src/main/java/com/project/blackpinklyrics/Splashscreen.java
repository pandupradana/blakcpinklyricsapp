package com.project.blackpinklyrics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

public class Splashscreen extends AppCompatActivity {

    private int waktu_loading=3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
            setContentView(R.layout.activity_splashscreen);
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {

                    Intent home=new Intent(Splashscreen.this, MainActivity.class);
                    startActivity(home);
                    finish();
                }
            },waktu_loading);
        }
}
