package com.project.blackpinklyrics;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.project.blackpinklyrics.activity.LyricsSong;
import com.project.blackpinklyrics.game.MainActivity;

public class MainMenu extends AppCompatActivity {

    ImageButton btn_1, btn_2, btn_3, btn_4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        /** --BUTTON PROFILE--

        btn_1 = (ImageButton) findViewById(R.id.imagejennie);
        btn_2 = (ImageButton) findViewById(R.id.imagelisa);
        btn_3 = (ImageButton) findViewById(R.id.imagejisoo);
        btn_4 = (ImageButton) findViewById(R.id.imagerose);





        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(MainActivity.this, Wallpaper.class);
                String pathpic="btn_1";
                i.putExtra("PATH_PICTURE",pathpic);
                startActivity(i);

            }
        });



        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(MainActivity.this,Wallpaper.class);
                String pathpic="btn_2";
                i.putExtra("PATH_PICTURE",pathpic);
                startActivity(i);

            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(MainActivity.this,Wallpaper.class);
                String pathpic="btn_3";
                i.putExtra("PATH_PICTURE",pathpic);
                startActivity(i);

            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(MainActivity.this,Wallpaper.class);
                String pathpic="btn_4";
                i.putExtra("PATH_PICTURE",pathpic);
                startActivity(i);

            }
        });

         **/

        /**final SearchView searchView = (SearchView) findViewById(R.id.search_view);
        searchView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                searchView.setIconified(false);
            }
        });
         **/


        CardView cardView = (CardView) findViewById(R.id.CardView);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainMenu.this, LyricsSong.class);
                startActivity(intent);
            }
        });

        CardView cardView1 = (CardView) findViewById(R.id.CardView1);
        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainMenu.this, MainActivity.class);
                startActivity(intent);
            }
        });

        CardView cardView2 = (CardView) findViewById(R.id.CardView2);
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainMenu.this, About.class);
                startActivity(intent);
            }
        });
    }
}
