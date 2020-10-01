package com.project.blackpinklyrics.activity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.MenuItemCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.SearchView;


import com.google.firebase.analytics.FirebaseAnalytics;
import com.project.blackpinklyrics.R;
import com.project.blackpinklyrics.adapter.AdapterLyrics;
import com.project.blackpinklyrics.model.ModelLyrics;

import java.util.ArrayList;

public class LyricsSong extends AppCompatActivity {

    RecyclerView mRecyclerView;
    AdapterLyrics adapterLyrics;

    private Toolbar mToolbar;
    private FirebaseAnalytics mFirebaseAnalytics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lyrics_song);
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);

        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        mToolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);
        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        mToolbar.setTitle("Lyrics Song");

        mRecyclerView = findViewById(R.id.recycleView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setHasFixedSize(true);

        mRecyclerView.setItemViewCacheSize(20);
        mRecyclerView.setDrawingCacheEnabled(true);
        mRecyclerView.setDrawingCacheQuality(View.DRAWING_CACHE_QUALITY_HIGH);

        adapterLyrics = new AdapterLyrics(this, getListLyrics());
        mRecyclerView.setAdapter(adapterLyrics);

    }

    private ArrayList<ModelLyrics> getListLyrics() {

        ArrayList<ModelLyrics> modelLyrics = new ArrayList<>();

        ModelLyrics m = new ModelLyrics();
        m.setTitle("Ice Cream");
        m.setDate("2020");
        m.setAlbum("Pre-release Single");
        m.setLyrics("[Verse 1: Selena Gomez, Lisa & Jennie]\n" +
                "Come a little closer 'cause you lookin' thirsty\n" +
                "I'ma make it better, sip it like a Slurpee\n" +
                "Snow cone chilly, get it free like Willy (Oh)\n" +
                "In the jeans like Billie, you be poppin' like a wheelie\n" +
                "Even in the sun, you know I keep it icy\n" +
                "You could take a lick, but it's too cold to bite me (Hahaha)\n" +
                "Brr, brr, frozen, you're the one been chosen\n" +
                "Play the part like Moses, keep it fresh like roses (Oh)\n" +
                "\n" +
                "[Chorus: Rosé, Selena Gomez & Jennie]\n" +
                "Look so good, yeah, look so sweet (Hey)\n" +
                "Lookin' good, enough to eat\n" +
                "Coldest with the kiss, so he call me ice cream\n" +
                "Catch me in the fridge, right where the ice be\n" +
                "Look so good, yeah, look so sweet (Hey)\n" +
                "Baby, you deserve a treat\n" +
                "Diamonds on my wrist, so he call me ice cream\n" +
                "You could double-dip 'cause I know you like me\n" +
                "\n" +
                "[Post-Chorus: Jennie]\n" +
                "Ice cream chillin', chillin', ice cream chillin'\n" +
                "Ice cream chillin', chillin', ice cream chillin'\n" +
                "\n" +
                "[Verse 2: Selena Gomez, Rosé, Jisoo & Jennie]\n" +
                "I know that my heart can be so cold\n" +
                "But I'm sweet for you, come put me in a cone (In a cone)\n" +
                "You're the only touch, yeah, they get me melting\n" +
                "He's my favorite flavor, always gonna pick him\n" +
                "You're the cherry piece, just stay on top of me, so\n" +
                "I can't see nobody else for me, no\n" +
                "Get it, flip it, scoop it, do it like that, oh yeah, oh yeah\n" +
                "Like it, love it, lick it, do it like la-la-la, oh yeah\n" +
                "[Chorus: Rosé, Selena Gomez & Jennie]\n" +
                "Look so good, yeah, look so sweet (Hey)\n" +
                "Lookin' good, enough to eat\n" +
                "Coldest with the kiss, so he call me ice cream\n" +
                "Catch me in the fridge, right where the ice be\n" +
                "Look so good, yeah, look so sweet (Hey)\n" +
                "Baby, you deserve a treat\n" +
                "Diamonds on my wrist, so he call me ice cream\n" +
                "You could double-dip 'cause I know you like me\n" +
                "\n" +
                "[Post-Chorus: Jisoo, Jisoo & Lisa]\n" +
                "Ice cream chillin', chillin', ice cream chillin'\n" +
                "Ice cream chillin', chillin', ice cream chillin'\n" +
                "Ice cream chillin', chillin', ice cream chillin'\n" +
                "Ice cream chillin', chillin', ice cream\n" +
                "\n" +
                "[Verse 3: Lisa]\n" +
                "Chillin' like a villain, yeah, I ra-ra-ra\n" +
                "Michin michindeushan sokdo in my La Ferra'\n" +
                "Neomu ppalleo neoneun ppikkeut wonhandamyeon geunyang jireum\n" +
                "Millis, billis, maeil beoreum hanyeoreum sonmoge eoreum\n" +
                "Keep it movin' like my lease up\n" +
                "Think you, fly, boy, where your visa?\n" +
                "Mona Lisa kinda Lisa\n" +
                "Needs an ice cream man that treats her\n" +
                "Keep it movin' like my lease up\n" +
                "Think you fly, boy, where your visa?\n" +
                "Mona Lisa kinda Lisa\n" +
                "Needs an ice cream man that treats her (Hey)\n" +
                "[Outro: Rosé, Selena Gomez & Jennie]\n" +
                "Na, na-na-na-na\n" +
                "Na, na-na-na-na (Hey)\n" +
                "Ice on my wrist, yeah, I like it like this\n" +
                "Get the bag with the cream\n" +
                "If you know what I mean\n" +
                "Ice cream, ice cream, ice cream chillin'\n" +
                "Na, na-na-na-na\n" +
                "Na, na-na-na-na (Hey)\n" +
                "Ice on my wrist, yeah, I like it like this\n" +
                "And I'm nice with the cream\n" +
                "If you know what I mean\n" +
                "Ice cream, ice cream, ice cream");
        m.setImage(R.drawable.img_icecream);
        modelLyrics.add(m);

        m = new ModelLyrics();
        m.setTitle("How You Like That");
        m.setDate("2020");
        m.setAlbum("Pre-release Single");
        m.setLyrics("[Intro: Lisa]\n" +
                "BLACKPINK in your area\n" +
                "\n" +
                "[Verse 1: Jennie & Jisoo]\n" +
                "Boran deusi muneojyeosseo\n" +
                "Badageul ttulko jeo jihakkaji\n" +
                "Ot kkeutjarak japgetdago\n" +
                "Jeo nopi du soneul ppeodeobwado\n" +
                "\n" +
                "[Pre-Chorus: Rosé]\n" +
                "Dasi kamkamhan igose light up the sky\n" +
                "Ne du nuneul bomyeo I'll kiss you goodbye\n" +
                "Silkeot biuseora kkoljoeunikka\n" +
                "Ije neohui hana dul set\n" +
                "\n" +
                "[Chorus: Jennie, Lisa, & Jisoo]\n" +
                "Ha, how you like that? (Woo!)\n" +
                "You gon' like that, that-that-that, that, that-that-that, that\n" +
                "How you like that? (Bada bing, bada boom, boom, boom)\n" +
                "How you like that, that-that-that, that, that-that-that, that\n" +
                "\n" +
                "[Post-Chorus: Lisa, Rosé, Jennie]\n" +
                "Now, look at you, now look at me (Uh)\n" +
                "Look at you, now look at me (Uh)\n" +
                "Look at you, now look at me\n" +
                "How you like that?\n" +
                "Now, look at you, now look at me (Uh)\n" +
                "Look at you, now look at me (Uh)\n" +
                "Look at you, now look at me\n" +
                "How you like that?\n" +
                "[Verse 2: Lisa]\n" +
                "Your girl need it all and that's a hundred\n" +
                "Baek gae junge baek nae mokseul wonhae\n" +
                "Karma come and get some\n" +
                "Ttakajiman eojjeol su eopjana\n" +
                "What's up, I'm right back\n" +
                "Bangasoereul cock back\n" +
                "Plain Jane get hijacked, don't like me?\n" +
                "Then tell me how you like that, like that\n" +
                "\n" +
                "[Pre-Chorus: Jennie & Jisoo]\n" +
                "Deo kamkamhan igose shine like the stars\n" +
                "Geu misoreul ttimyeo I'll kiss you goodbye\n" +
                "Silkeot biuseora kkoljoeunikka\n" +
                "Ije neohui hana dul set\n" +
                "\n" +
                "[Chorus: Rosé, Jennie, Jisoo & Lisa]\n" +
                "Ha, how you like that? (Woo!)\n" +
                "You gon' like that, that-that-that, that, that-that-that, that\n" +
                "How you like that? (Bada bing, bada boom, boom, boom)\n" +
                "How you like that, that-that-that, that, that-that-that, that\n" +
                "\n" +
                "[Post-Chorus: Lisa, Rosé, Jennie]\n" +
                "Now, look at you, now look at me (Uh)\n" +
                "Look at you, now look at me (Uh)\n" +
                "Look at you, now look at me\n" +
                "How you like that?\n" +
                "Now, look at you, now look at me (Uh)\n" +
                "Look at you, now look at me (Uh)\n" +
                "Look at you, now look at me\n" +
                "How you like that?\n" +
                "[Bridge: Rosé, Jisoo, Jennie & All]\n" +
                "Nalgae ileun chaero churakaetdeon nal\n" +
                "Eoduun nanal soge gatyeo itdeon nal\n" +
                "Geuttaejjeume neon nal kkeunnaeya haesseo\n" +
                "Look up in the sky\n" +
                "It's a bird, it's a plane\n" +
                "Yeah-eah-eah-eah\n" +
                "Bring out your boss bitch\n" +
                "Yeah-eah-eah-eah\n" +
                "BLACKPINK!\n" +
                "\n" +
                "[Outro: All, Rosé & Jennie]\n" +
                "Ddu, ddu, ddu, ddu-ddu-ddu\n" +
                "Ddu, ddu, ddu, ddu-ddu-ddu\n" +
                "How you like that?\n" +
                "Ddu, ddu, ddu, ddu-ddu-ddu\n" +
                "Ddu, ddu, ddu, du-du-du-ddu\n" +
                "You gon' like that\n" +
                "Ddu, ddu, ddu, ddu-ddu-ddu\n" +
                "Ddu, ddu, ddu, ddu-ddu-ddu\n" +
                "How you like that?\n" +
                "Ddu, ddu, ddu, ddu-ddu-ddu\n" +
                "Ddu, ddu, ddu, du-du-du-ddu");
        m.setImage(R.drawable.howyoulikethat);
        modelLyrics.add(m);

        m = new ModelLyrics();
        m.setTitle("Kill This Love");
        m.setDate("2019");
        m.setAlbum("Kill This Love");
        m.setLyrics("[Intro: Jennie, Lisa]\n" +
                "Yeah, yeah, yeah\n" +
                "BLACKPINK IN YOUR AREA!\n" +
                "Yeah, yeah, yeah\n" +
                "\n" +
                "[Verse 1: Jennie]\n" +
                "Cheonsa gateun \"hi\" kkeuten angma gateun \"bye\"\n" +
                "Maebeon michildeuthan high dwien baeteoya haneun price\n" +
                "Igeon dabi eomneun test\n" +
                "Maebeon sokdeorado yes\n" +
                "Ttakan gamjeongui noye\n" +
                "Eoreo jugeul saranghae\n" +
                "\n" +
                "[Verse 2: Lisa]\n" +
                "Here I come kickin' the door, uh\n" +
                "Gajang dokan geollo jwo, uh\n" +
                "Ppeonhadi ppeonhan geu love\n" +
                "Deo naenwabwa give me some more\n" +
                "Araseo maedallyeo byeorang kkeute\n" +
                "Hanmadimyeon tto like hebeolle hae\n" +
                "Geu ttatteuthan tteollimi saeppalgan seollemi\n" +
                "Machi heaven gatgetjiman\n" +
                "You might not get in it\n" +
                "\n" +
                "[Pre-Chorus: Jisoo & Rosé]\n" +
                "Look at me, look at you\n" +
                "Nuga deo apeulkka\n" +
                "You smart nuga you are\n" +
                "Du nune pinunmul heureuge doendamyeon\n" +
                "So sorry nuga you are\n" +
                "Na eotteokae nayakan nal gyeondil su eopseo\n" +
                "Aesseo du nuneul garin chae\n" +
                "Sarangui sumtongeul kkeuneoyagesseo\n" +
                "[Chorus: All, Lisa, Jennie]\n" +
                "Let's kill this love!\n" +
                "Yeah-yeah-yeah-yeah, yeah-yeah-yeah\n" +
                "Rum, pum, pum, pum, pum, pum, pum\n" +
                "Let's kill this love!\n" +
                "Rum, pum, pum, pum, pum, pum, pum\n" +
                "\n" +
                "[Verse 3: Jennie, Lisa]\n" +
                "Feelin' like a sinner\n" +
                "It's so fire with him I go boo, hoo\n" +
                "He said \"you look crazy\"\n" +
                "Thank you, baby\n" +
                "I owe it all to you\n" +
                "Got me all messed up\n" +
                "His love is my favorite\n" +
                "But you plus me\n" +
                "Sadly can be dangerous\n" +
                "\n" +
                "[Pre-Chorus: Rosé & Jisoo]\n" +
                "Lucky me, lucky you\n" +
                "Gyeolgugen geojitmal we lie\n" +
                "So what? So what?\n" +
                "Manyage naega neol jiuge\n" +
                "Doendamyeon so sorry\n" +
                "I'm not sorry\n" +
                "Na eotteokae nayakan nal gyeondil su eopseo\n" +
                "Aesseo nunmureul gamchun chae, eh\n" +
                "Sarangui sumtongeul kkeuneoyagesseo\n" +
                "[Chorus: All, Lisa, Jennie]\n" +
                "Let's kill this love!\n" +
                "Yeah-yeah-yeah-yeah, yeah-yeah-yeah\n" +
                "Rum, pum, pum, pum, pum, pum, pum\n" +
                "Let's kill this love!\n" +
                "Rum, pum, pum, pum, pum, pum, pum\n" +
                "\n" +
                "[Bridge: Rosé]\n" +
                "We all commit to love\n" +
                "That makes you cry, oh oh\n" +
                "We're all making love\n" +
                "That kills you inside, yeah\n" +
                "\n" +
                "[Outro: All]\n" +
                "We must kill this love (Yeah! Yeah!)\n" +
                "Yeah, it's sad but true\n" +
                "Gotta kill this love (Yeah! Yeah!)\n" +
                "Before it kills you too\n" +
                "Kill this love (Yeah! Yeah!)\n" +
                "Yeah, it's sad but true\n" +
                "Gotta kill this love (Yeah! Yeah!)\n" +
                "Gotta kill, let's kill this love!");
        m.setImage(R.drawable.img_killthislove);
        modelLyrics.add(m);

        m = new ModelLyrics();
        m.setTitle("Don’t Know What To Do");
        m.setDate("2019");
        m.setAlbum("Kill This Love");
        m.setLyrics("[Verse 1: Jennie, Lisa]\n" +
                "Jamkkan nuga siganeul jom meomchwobwa\n" +
                "Mwonga keuge eogeusnan geol nan neukkyeo\n" +
                "Aesseo eosaekhage useoboda\n" +
                "Ijen geureon naega ansseureowo\n" +
                "\n" +
                "[Pre-Chorus: Rosé, Jisoo]\n" +
                "Anya gwaenchanhdago malhajiman\n" +
                "Don’t know what to do without you\n" +
                "Hachanheun igose hollo nama\n" +
                "Geuryeobon ne gieogeun blue\n" +
                "Sarameun byeonhae\n" +
                "Wae naman irae\n" +
                "Oneulcheoreom yeppeun nare\n" +
                "Eotteohge ireohge modeun ge beokchagiman hae\n" +
                "Don’t know what to do\n" +
                "\n" +
                "[Chorus: Rosé]\n" +
                "I don’t know what to do without you (yeah, he-hey)\n" +
                "I don’t know what to do without you (yeah, he-hey)\n" +
                "I don’t know what to do without\n" +
                "\n" +
                "[Post-Chorus: Lisa, Jisoo]\n" +
                "You, you, you\n" +
                "You know I don’t know what to do\n" +
                "Don’t know what to do without you\n" +
                "[Verse 2: Jisoo, Lisa]\n" +
                "Jamkkan wassda tteonan saramdeulcheoreom\n" +
                "Geunyang urin anieossdeon geoji mwo\n" +
                "Hoksirado jeonhwaga ullilkka bwa\n" +
                "Gwaenhan gidael haneun naega miwo\n" +
                "Jakku ttokttak georineun sigye soriga\n" +
                "Yunanhi geoseullyeo\n" +
                "\n" +
                "[Pre-Chorus: Jennie, Rosé]\n" +
                "Kkwaena meoljjeonghae boijiman\n" +
                "Don’t know what to do without you\n" +
                "Ireon nae mam geoure deulkilkka bwa\n" +
                "Geuryeobon nae ipsureun Blue\n" +
                "Honjaga pyeonhae\n" +
                "Nan geunyang geurae\n" +
                "Oneulcheoreom yeppeun nare\n" +
                "Eotteohge ireohge modeun ge beokchagiman hae\n" +
                "Don’t know what to do\n" +
                "\n" +
                "[Chorus: Jennie]\n" +
                "I don’t know what to do without you (yeah, he-hey)\n" +
                "I don’t know what to do without you (yeah, he-hey)\n" +
                "I don’t know what to do without\n" +
                "\n" +
                "[Post-Chorus: Lisa, Jisoo]\n" +
                "You, you, you\n" +
                "You know I don’t know what to do\n" +
                "Don’t know what to do without you\n" +
                "[Outro: Rosé]\n" +
                "Anya gwaenchanhdago malhajiman\n" +
                "Don’t know what to do without you\n" +
                "Hachanheun igose hollo nama\n" +
                "Geuryeobon ne gieogeun blue");
        m.setImage(R.drawable.img_killthislove);
        modelLyrics.add(m);

        m = new ModelLyrics();
        m.setTitle("Kick It");
        m.setDate("2019");
        m.setAlbum("Kill This Love");
        m.setLyrics("[Verse 1: Jennie, Lisa]\n" +
                "Gyeolloni mwonde\n" +
                "Tto geuraeseo\n" +
                "Eojjeogessdaneun geonde\n" +
                "I’ll break ya break ya heart\n" +
                "Never asked for much\n" +
                "Aesseo noryeok ttawin ma\n" +
                "Swipge baeteun mal\n" +
                "Juwo damjima\n" +
                "I ain’t nothin’ like\n" +
                "The same same girls that you’ve had\n" +
                "Geurae nan meosdaero hae\n" +
                "\n" +
                "[Pre-Chorus: Rosé, Jisoo]\n" +
                "Eoduun bami nal gamssajiman\n" +
                "Ijeseoya nareul wihaeseo\n" +
                "Chumeul chul su isseo\n" +
                "Neoran byeogeul neomeoseo\n" +
                "I’ll kick it if you’re down\n" +
                "Kick it if you down\n" +
                "\n" +
                "[Chorus: Jennie, Lisa]\n" +
                "Can I kick it? (Yeah)\n" +
                "Kamkamhan jeo haneul wie\n" +
                "Hanbatang nanrireul chimyeo bureul jireul geoya\n" +
                "Can I kick it? (Yeah)\n" +
                "Neoraneun sesangeul buswobeorigo\n" +
                "Na hwanhage nunbusyeo beoril geoya\n" +
                "[Post-Chorus: Rosé, Jisoo]\n" +
                "And I’m letting it all out\n" +
                "Ilheul geon eopsjanha\n" +
                "Ijen nareul chajeul georago\n" +
                "Na honjayeodo gwaenchanha\n" +
                "Bulssanghaehaji ma\n" +
                "Ijen neoreul ijeul georago\n" +
                "\n" +
                "[Verse 2: Lisa]\n" +
                "Never needed nothin’ else\n" +
                "Just a lil love from myself\n" +
                "When you couldn’t be the one to help\n" +
                "Had to kick it and I did it tell\n" +
                "Whoever you wanna tell\n" +
                "Get kicked to the curb, ya kicked out\n" +
                "Never kick a girl when she kicked down\n" +
                "Who you gon kiss now\n" +
                "Know you gon miss how I move\n" +
                "From the top\n" +
                "To the bottom of my kicks now\n" +
                "\n" +
                "[Pre-Chorus: Jisoo & Rosé]\n" +
                "Eoduun bami nal gamssajiman\n" +
                "Ijeseoya nareul wihaeseo\n" +
                "Chumeul chul su isseo\n" +
                "Neoran byeogeul neomeoseo\n" +
                "I’ll kick it if you’re down\n" +
                "Kick it if you down\n" +
                "[Chorus: Jennie, Lisa]\n" +
                "Can I kick it? (Yeah)\n" +
                "Kamkamhan jeo haneul wie\n" +
                "Hanbatang nanrireul chimyeo bureul jireul geoya\n" +
                "Can I kick it? (Yeah)\n" +
                "Neoraneun sesangeul buswobeorigo\n" +
                "Na hwanhage nunbusyeo beoril geoya\n" +
                "\n" +
                "[Post-Chorus: Rosé, Jisoo]\n" +
                "And I’m letting it all out\n" +
                "Ilheul geon eopsjanha\n" +
                "Ijen nareul chajeul georago\n" +
                "Na honjayeodo gwaenchanha\n" +
                "Bulssanghaehaji ma\n" +
                "Ijen neoreul ijeul georago\n" +
                "\n" +
                "[Bridge: Jennie]\n" +
                "Gyeolloni mwonde\n" +
                "Tto geuraeseo\n" +
                "Eojjeogessdaneun geonde\n" +
                "Dapdaphan neoui sesangeseo beoseona\n" +
                "Nopi naragal tenikka\n" +
                "\n" +
                "[Outro]\n" +
                "I’ll kick it how I wanna kick it\n" +
                "When I wanna kick it\n" +
                "No, you can’t tell me not to kick it\n" +
                "Cause I’m bout to kick it\n" +
                "I’ll kick it how I wanna kick it\n" +
                "When I wanna kick it\n" +
                "No, you can’t tell me not to kick it\n" +
                "Cause I’m bout to kick it\n" +
                "[Outro 2: Rosé, Jisoo]\n" +
                "And I’m letting it all out\n" +
                "Ilheul geon eopsjanha\n" +
                "Ijen nareul chajeul georago\n" +
                "Na honjayeodo gwaenchanha\n" +
                "Bulssanghaehaji ma\n" +
                "Ijen neoreul ijeul georago");
        m.setImage(R.drawable.img_killthislove);
        modelLyrics.add(m);

        m = new ModelLyrics();
        m.setTitle("Hope Not");
        m.setDate("2019");
        m.setAlbum("Kill This Love");
        m.setLyrics("[Verse 1: Jennie, Lisa]\n" +
                "Siwonhan baram buneun changgae anja\n" +
                "Meon haneul barabomyeo neoreul geuryeo nan\n" +
                "Eojjeol su eopsneun nan baboinga bwa\n" +
                "Sagyejeori bakkwieodo byeonhaji anha\n" +
                "\n" +
                "[Pre-Chorus: Rosé, Jennie]\n" +
                "Huhoehan deul soyongeopsda haedo\n" +
                "Nan neol aetage saenggakhae (I was wrong)\n" +
                "Amu ildo eopsneun geoscheoreom\n" +
                "Useojulge neol mannamyeon\n" +
                "\n" +
                "[Chorus: Rosé, Jisoo]\n" +
                "For you nan apado joha\n" +
                "Hamkkehaneun dongan\n" +
                "Neoege sangcheoman namgyeojun nanikka\n" +
                "But you nega wonhan sarang\n" +
                "Naboda naeun saram manna haengbokhae\n" +
                "Nal ijeul mankeum maneun anigil\n" +
                "\n" +
                "[Verse 2: Rosé, Lisa]\n" +
                "Jeo goyohan dalbicce jam mot deuneun bam\n" +
                "Amuri gidaryeodo neon ojil anha\n" +
                "Nae yeopen chorahan binjari hana\n" +
                "Nan deo isang honjaga naccseolji anha\n" +
                "[Pre-Chorus: Jisoo, Jennie]\n" +
                "Huhoehan deul soyongeopsda haedo\n" +
                "Nan neol aetage saenggakhae(I was wrong)\n" +
                "Amu ildo eopsneun geoscheoreom\n" +
                "Useojulge neol mannamyeon\n" +
                "\n" +
                "[Chorus: Jisoo & Rosé]\n" +
                "For you nan apado joha\n" +
                "Hamkkehaneun dongan\n" +
                "Neoege sangcheoman namgyeojun nanikka\n" +
                "But you nega wonhan sarang\n" +
                "Naboda naeun saram manna haengbokhae\n" +
                "Nal ijeul mankeum maneun anigil\n" +
                "\n" +
                "[Bridge: All, Rosé]\n" +
                "Yeah, yeah, yeah (mankeum maneun anigil)\n" +
                "Yeah, yeah, yeah (mankeum maneun anigil)\n" +
                "Yeah, yeah, yeah\n" +
                "Yeojeonhi igoseseo neol ijji moshae\n" +
                "\n" +
                "[Chorus: Jennie, Rosé]\n" +
                "For you nan apado joha\n" +
                "Hamkkehaneun dongan neoege\n" +
                "Sangcheoman namgyeojun nanikka\n" +
                "But you nega wonhan sarang\n" +
                "Naboda naeun saram manna haengbokhae\n" +
                "Nal ijeul mankeum maneun anigil");
        m.setImage(R.drawable.img_killthislove);
        modelLyrics.add(m);

        m = new ModelLyrics();
        m.setTitle("DDU-DU DDU-DU");
        m.setDate("2018");
        m.setAlbum("Square Up");
        m.setLyrics("[Intro: All, Rosé]\n" +
                "BLACKPINK!\n" +
                "Ah yeah, ay yeah!\n" +
                "BLACKPINK!\n" +
                "Ah yeah, ay yeah!\n" +
                "\n" +
                "[Verse 1: Jennie]\n" +
                "Chakan eolgure geureochi mothan taedo\n" +
                "Ganyeorin mommae sok garyeojin volumeeun du baero\n" +
                "Geochimeopsi jikjin guji bojin anchi nunchi\n" +
                "Black hamyeon Pink urin yeppeujanghan Savage\n" +
                "\n" +
                "[Verse 2: Lisa]\n" +
                "Wonhal ttaen daenoko ppaetji\n" +
                "Neon mwol haedo kallo mul begi\n" +
                "Du sonen gadeukan fat check\n" +
                "Gunggeumhamyeon haebwa fact check\n" +
                "Nun nopin kkokdaegi\n" +
                "Mul mannan mulgogi\n" +
                "Jom dokae nan Toxic\n" +
                "You hokae I'm Foxy\n" +
                "\n" +
                "[Pre-Chorus: Rosé & Jisoo]\n" +
                "Du beon saenggakae\n" +
                "Heunhan namdeulcheoreom chakan cheogeun mot hanikka\n" +
                "Chakgakaji ma\n" +
                "Swipge useojuneun geon nal wihan geoya\n" +
                "Ajigeun jal moreugetji\n" +
                "Guji wonhamyeon test me\n" +
                "Neon bul bodeusi ppeonhae\n" +
                "Manmanhan geol wonhaetdamyeon\n" +
                "[Chorus: Jennie]\n" +
                "Oh wait til' I do what I (do)\n" +
                "Hit you with that ddu-du ddu-du du (Ah yeah, ay yeah!)\n" +
                "Hit you with that ddu-du ddu-du du (Ah yeah, ay yeah!)\n" +
                "\n" +
                "[Verse 3: Jennie]\n" +
                "BLACKPINK\n" +
                "Jigeum naega georeoganeun georin\n" +
                "BLACKPINK 4 way sageori\n" +
                "Dongseonambuk sabangeuro run it\n" +
                "Need a bucket list ssak da I bought it\n" +
                "Neol danggineun geotdo meolli milchineun geotdo\n" +
                "Jemeotdaero haneun bad girl\n" +
                "Jokeon sileohageon nuga mwora hadeon\n" +
                "When the bass drop it’s another banger\n" +
                "\n" +
                "[Pre-Chorus: Jisoo & Rosé]\n" +
                "Du beon saenggakae\n" +
                "Heunhan namdeulcheoreom chakan cheogeun mot hanikka\n" +
                "Chakgakaji ma\n" +
                "Swipge useojuneun geon nal wihan geoya\n" +
                "Ajigeun jal moreugetji\n" +
                "Guji wonhamyeon test me\n" +
                "Neon bul bodeusi ppeonhae\n" +
                "Manmanhan geol wonhaetdamyeon\n" +
                "[Chorus: Jennie & Lisa]\n" +
                "Oh wait til' I do what I (do)\n" +
                "Hit you with that ddu-du ddu-du du (Ah yeah, ay yeah!)\n" +
                "Hit you with that ddu-du ddu-du du (Ah yeah, ay yeah!)\n" +
                "\n" +
                "[Bridge: Rosé & Lisa]\n" +
                "What you gonna do when I\n" +
                "Come come through with that that uh uh huh\n" +
                "What you gonna do when I\n" +
                "Come come through with that that uh uh huh\n" +
                "Tteugeowo tteugeowo tteugeowo like fire\n" +
                "Tteugeowo tteugeowo tteugeowo like fire\n" +
                "\n" +
                "[Drop: All, Jisoo & Rosé]\n" +
                "BLACKPINK! Hey!\n" +
                "Ah yeah, ay yeah! Ah yeah, ay yeah!\n" +
                "Tteugeowo tteugeowo tteugeowo like fire\n" +
                "Tteugeowo tteugeowo tteugeowo like fire\n" +
                "\n" +
                "[Outro: Jennie]\n" +
                "Hit you with that ddu-du ddu-du du");
        m.setImage(R.drawable.img_sqareup);
        modelLyrics.add(m);

        m = new ModelLyrics();
        m.setTitle("Forever Young");
        m.setDate("2018");
        m.setAlbum("Square Up");
        m.setLyrics("[Intro: Jennie]\n" +
                "Tteonaji ma just stay\n" +
                "Jigeum i siganeul meomchun chae\n" +
                "Neowa hamkkeramyeon nan\n" +
                "I could die in this moment\n" +
                "\n" +
                "[Chorus: Rosé]\n" +
                "Forever young\n" +
                "Forever young\n" +
                "Forever young\n" +
                "Forever young\n" +
                "\n" +
                "[Verse 1: Jisoo]\n" +
                "Neoui nune bichin naui moseubi\n" +
                "Neul cheoeum mannan geu nalman gatgil\n" +
                "Sori eopsi taoreuneun bulkkotgachi\n" +
                "Majimakcheoreom nae ip matchugil\n" +
                "\n" +
                "[Refrain: Rosé & Lisa]\n" +
                "Dalbit arae nae maeumeun seolle\n" +
                "Eunhasuro chumchureo gallae let’s go\n" +
                "Jigeum let go\n" +
                "Oneuri gado huhoe eopge\n" +
                "Sigani uri dureul tteeo noheul su eopge\n" +
                "Sungani yeongwonhal su itge\n" +
                "[Pre-Chorus: Jennie & Rosé]\n" +
                "Neon nae maeume bureul jilleojwo\n" +
                "Huhoe eomneun jeoleumi taoreuge\n" +
                "Jigeumcheoreom neowa hamkkeramyeon tonight\n" +
                "I could die in this moment\n" +
                "\n" +
                "[Chorus: Jennie]\n" +
                "Forever young\n" +
                "Forever young\n" +
                "Forever young\n" +
                "Forever young\n" +
                "\n" +
                "[Post-Chorus: Lisa]\n" +
                "Maeilmaeil bam bam\n" +
                "I noraereul bulleo bulleo\n" +
                "Know we got that bomb bomb\n" +
                "Come again come again\n" +
                "\n" +
                "[Verse 2: Jennie]\n" +
                "Forever young boy so we ride or die\n" +
                "Kkeuchi eopseul geotcheoreom dallyeo neowa na\n" +
                "Bulgeun sunset arae neoneun jigeum nae yeope\n" +
                "Pinked out or murdered out like it ain’t no thing\n" +
                "Da pillyo eopseo juingongeun uri\n" +
                "Say life’s a bitch? But mine’s a movie\n" +
                "Nae Diamondcheoreom we’ll shine together\n" +
                "Whenever wherever forever ever ever\n" +
                "[Refrain: Jisoo & Lisa]\n" +
                "Jjarithage deo wiheomhage\n" +
                "Sesang jeo kkeutkkaji gabollae let’s go\n" +
                "Jigeum let go\n" +
                "Oneuri gado huhoe eopge\n" +
                "Sigani uri dureul tteeo noeul su eopge\n" +
                "Sungani yeongwonhal su itge\n" +
                "\n" +
                "[Pre-Chorus: Rosé & Jennie]\n" +
                "Neon nae maeume bureul jilleojwo\n" +
                "Huhoe eomneun jeoleumi taoreuge\n" +
                "Sesang mueotdo duryeopji ana tonight\n" +
                "I could die in this moment\n" +
                "\n" +
                "[Interlude: Rosé]\n" +
                "Forever young (Blackpink is the Revolution)\n" +
                "\n" +
                "[Pre-Bridge: Rosé]\n" +
                "Dari tteugo byeori tteumyeon chumchuneun body\n" +
                "Kkeuchi eopsi dallyeoboja we like to party\n" +
                "Dari tteugo byeori tteumyeon chumchuneun body\n" +
                "Kkeuchi eopsi dallyeoboja we like to party\n" +
                "\n" +
                "[Bridge: Lisa]\n" +
                "Girls wanna have some fun\n" +
                "We go dumb dumb dumb\n" +
                "Girls wanna have some fun\n" +
                "What you want want want\n" +
                "Girls wanna have some fun\n" +
                "We go dumb dumb dumb\n" +
                "Girls wanna have some fun\n" +
                "We ain’t done done done\n" +
                "[Outro: Lisa]\n" +
                "Whatta bum bum whatta bum bum\n" +
                "Whatta bum bum whatta bum bum\n" +
                "Whatta bum bum whatta bum bum\n" +
                "Whatta bum bum whatta bum bum\n" +
                "Whatta bum bum whatta bum bum\n" +
                "Whatta bum bum whatta bum bum\n" +
                "Whatta bum bum whatta bum bum\n" +
                "Whatta bum bum whatta bum bum");
        m.setImage(R.drawable.img_sqareup);
        modelLyrics.add(m);

        m = new ModelLyrics();
        m.setTitle("See U Later");
        m.setDate("2018");
        m.setAlbum("Square Up");
        m.setLyrics("[Verse 1: Jisoo & Lisa]\n" +
                "Aswiul geosdo eobs-eo\n" +
                "Jinjja hal mankeum haess-eo\n" +
                "Nan eochapi neo ttawi iss-euna eobs-euna ttoggat-a\n" +
                "Maebeon yagsog-eun beonbog\n" +
                "Tto sel su eobs-i banbog\n" +
                "Neolan namja ttag geu jeongdo nae ma-eum da jwossjiman no\n" +
                "\n" +
                "[Refrain: Jennie & Rosé]\n" +
                "Bin kkangtong gat-eun ne sorry\n" +
                "Ijen geujeo gae jijneun soli\n" +
                "Jeongsin-eul chaligo boni ne modeun ge ogeulgeolyeo\n" +
                "Neol beolyeojul ge recycle\n" +
                "Ne yeop-e geunyeoneun babo\n" +
                "Oneul nan malhal ge I don’t want you no more\n" +
                "\n" +
                "[Pre-Chorus 1: Jennie & Lisa]\n" +
                "Hold up yeong-wonhal geola haess-eo?\n" +
                "Geunde gyeollon-eun tto you messed up\n" +
                "Wassda gassda gabyeoun neon ping pong\n" +
                "Nan jigeum neoleul chaneun geoya ding dong\n" +
                "Playa you ain’t know?\n" +
                "Salam jalmos gollass-eo\n" +
                "Naman-eul balabogo wihae baddeul-eo jwoss-eoya hae\n" +
                "Yeowangbeolcheoleom\n" +
                "[Chorus: Jennie, Lisa, & Rosé]\n" +
                "See u later boy see u later\n" +
                "See u later boy see u later later\n" +
                "See u later boy see u later\n" +
                "Would have could have should have, didn’t\n" +
                "See u later boy see u later\n" +
                "See u later boy see u later later\n" +
                "See u later boy see u later\n" +
                "See u later maybe never\n" +
                "\n" +
                "[Verse 2: Jisoo & Lisa]\n" +
                "Kongkkagji beosgyeojyeoss-eo\n" +
                "Jab-ado soyong-eobs-eo\n" +
                "Tto ilaessdajeolaessda ileokungjeoleokung guchahae\n" +
                "Ijeneun You ain’t got no best friend\n" +
                "Oeloul geoya weekend\n" +
                "Geulae neon loser oetol-i mosdoen yang-achi ha\n" +
                "\n" +
                "[Refrain: Jennie & Rosé]\n" +
                "Bin kkangtong gat-eun ne sorry\n" +
                "Ijen geujeo gae jijneun soli\n" +
                "Jeongsin-eul chaligo boni ne modeun ge ogeulgeolyeo\n" +
                "Neol beolyeojul ge recycle\n" +
                "Ne yeop-e geunyeoneun babo\n" +
                "Oneul nan malhal ge I don’t want you no more\n" +
                "[Pre-Chorus 2: Jennie & Lisa]\n" +
                "Apeumdo moleuge ppallassdeon siganmankeum\n" +
                "Neoneun hug gan geoya jigeum bang-geum\n" +
                "Naega nugunji kkameog-eossni ttogbalo gieoghae\n" +
                "I’m a boss bish\n" +
                "Neo jeongdoneun balo jeongdon\n" +
                "Imi jiwoss-eo ne jeonhwabeonho\n" +
                "Seollem-eul hyanghae dasi simjang-ui sidong-eul geolgo boomin\n" +
                "Pedal to the metal like\n" +
                "\n" +
                "[Chorus: Jennie, Lisa, & Rosé]\n" +
                "See u later boy see u later\n" +
                "See u later boy see u later later\n" +
                "See u later boy see u later\n" +
                "Would have could have should have, didn’t\n" +
                "See u later boy see u later\n" +
                "See u later boy see u later later\n" +
                "See u later boy see u later\n" +
                "See u later maybe never\n" +
                "\n" +
                "[Bridge: Jisoo & Rosé]\n" +
                "Good bye baby naega ne gyeot-e iss-eoss-eul ttae jalhaji wae\n" +
                "Why you wanna go and do that do that why\n" +
                "Nae dwismoseub-eul joh-ahadeon neo\n" +
                "Jigeum silkeos bogo jal gieoghae\n" +
                "Bye bye bye bye bye\n" +
                "[Chorus: Jennie, Lisa, & Rosé]\n" +
                "See u later boy see u later\n" +
                "See u later boy see u later later\n" +
                "See u later boy see u later\n" +
                "Would have could have should have, didn’t\n" +
                "See u later boy see u later\n" +
                "See u later boy see u later later\n" +
                "See u later boy see u later\n" +
                "See u later maybe never");
        m.setImage(R.drawable.img_sqareup);
        modelLyrics.add(m);

        m = new ModelLyrics();
        m.setTitle("Really");
        m.setDate("2018");
        m.setAlbum("Square Up");
        m.setLyrics("[Chorus: Jennie & Rosé]\n" +
                "If you really really love me malhaejwo\n" +
                "Na eobs-i haludo beotil su eobsdago really really\n" +
                "Jibchaghal mankeum wonhandago really\n" +
                "If you really really want me malhaejwo\n" +
                "Neo jeoldae jamsido hannun an pandago really really\n" +
                "Daleun namjawaneun daleudago really\n" +
                "\n" +
                "[Verse 1: Jisoo & Jennie]\n" +
                "Haneul-ui byeol-ilado ttajugessda malhae\n" +
                "Sigan-eun manhji anh-a iss-eul ttae jalhae\n" +
                "Daleun yeoja bogileul dol gat-i bondago hae\n" +
                "Ttaelon geojismal gatji anh-eun geojismal-eul nan wonhae\n" +
                "Byeol bol il eobsneun ne juwiui yeoja\n" +
                "Geuman gwanlihago ssag da jeonglihae ne eojang\n" +
                "Eochapi neon naege oge dwae iss-eunikka\n" +
                "Better act like you know what\n" +
                "Better act like you know what\n" +
                "\n" +
                "[Rap 1: Lisa]\n" +
                "Eyes have been callin me baby\n" +
                "Body been tellin me take me\n" +
                "Boys have been sayin to date me\n" +
                "Your lips should be sayin the same thing\n" +
                "For real, what’s the deal\n" +
                "Got a feelin' that you feelin' me\n" +
                "Ayy, but I don’t play with them fakes\n" +
                "Keep it real with me\n" +
                "[Chorus: Rosé & Jennie]\n" +
                "If you really really love me malhaejwo\n" +
                "Na eobs-i haludo beotil su eobsdago really really\n" +
                "Jibchaghal mankeum wonhandago really\n" +
                "If you really really want me malhaejwo\n" +
                "Neo jeoldae jamsido hannun an pandago really really\n" +
                "Daleun namjawaneun daleudago really\n" +
                "\n" +
                "[Verse 2: Rosé, Jisoo & Jennie]\n" +
                "Hanbeon haejumyeon du beon haejul ge ppoppo\n" +
                "Geuleohdago hambulo deul-idaemyeon no no\n" +
                "Dul-i nunman maj-eumyeon haha hihi hoho\n" +
                "Oelowossdeon jinannal-eun neolo inhae no more\n" +
                "Sul-eun masyeodo yeonlag-eun ssibjima yeah\n" +
                "Ije kkeut-ilan nae mal-eun midjima yeah\n" +
                "Bogjabhan ge aniya swibge saeng-gaghae 1, 2, 3\n" +
                "Sangsanghaebwa uliga hana doeneun ge eotteolji\n" +
                "\n" +
                "[Rap 2: Lisa]\n" +
                "Want a romance like the old times\n" +
                "Want to slow dance when it’s show time\n" +
                "Just me and you, and that slow jam that we both like\n" +
                "That playlist, my favorite, so play it, but baby\n" +
                "F a love song I need you to say it say it\n" +
                "\n" +
                "[Chorus: Jisoo & Rosé]\n" +
                "If you really really love me malhaejwo\n" +
                "Na eobs-i haludo beotil su eobsdago really really\n" +
                "Jibchaghal mankeum wonhandago really\n" +
                "If you really really want me malhaejwo\n" +
                "Neo jeoldae jamsido hannun an pandago really really\n" +
                "Daleun namjawaneun daleudago\n" +
                "[Outro: Lisa]\n" +
                "I gotta know that you’re for real\n" +
                "Really really really\n" +
                "I gotta know that you’re for real\n" +
                "Really really really\n" +
                "I gotta know that you’re for real\n" +
                "Really really really\n" +
                "I gotta know that you’re for real\n" +
                "Really really really");
        m.setImage(R.drawable.img_sqareup);
        modelLyrics.add(m);

        m = new ModelLyrics();
        m.setTitle("As If It's Your Last");
        m.setDate("2017");
        m.setAlbum("Blackpink");
        m.setLyrics("[Intro: Jennie & Lisa]\n" +
                "Little bit of that\n" +
                "Little bit of this\n" +
                "Little bit of that\n" +
                "Gimme gimme gimme\n" +
                "Gimme little bit of that\n" +
                "\n" +
                "[Verse 1: Jennie]\n" +
                "Neo mwonde jakku saenggakna\n" +
                "Jajonsim sanghae aega ta\n" +
                "Eolguri tteugeobgo gaseumeun gyesok ttwieo\n" +
                "Nae momi mamdaero andwae eojireowo\n" +
                "\n" +
                "[Verse 2: Jisoo]\n" +
                "Neon han jumui morae gata\n" +
                "Jabhil deut jabhiji anha\n" +
                "Neon swibji anheun geol geuraeseo deo kkeullyeo\n" +
                "Nae mami mamdaero andwae eoieopseo\n" +
                "\n" +
                "[Pre-Chorus: Rosé]\n" +
                "Jigeum neoreul wonhaneun\n" +
                "Nae sumgyeori neukkyeojini\n" +
                "Neol barabogo isseodo\n" +
                "Missing you\n" +
                "Seotun nal won’t you set me free\n" +
                "[Chorus: Jennie, Rosé]\n" +
                "Baby nal teojil geotcheoreom anajwo\n" +
                "Geuman saenggakhae mwoga geuri eoryeowo\n" +
                "Geojitmalcheoreom kiss haejwo naega neoege\n" +
                "Majimak sarangin geotcheoreom\n" +
                "\n" +
                "[Hook: Lisa]\n" +
                "Majimakcheoreom ma-ma-majimakcheoreom\n" +
                "Majimak bamin geotcheoreom love\n" +
                "Majimakcheoreom ma-ma-majimakcheoreom\n" +
                "Naeil ttawin eopsneun geotcheoreom\n" +
                "\n" +
                "[Verse 3: Lisa]\n" +
                "Uh I'mma fall in love baby\n" +
                "You gon' finna catch me\n" +
                "Uh give you all of this baby\n" +
                "Call me pretty and nasty\n" +
                "Cause we gonna get it\n" +
                "My love you can bet it on\n" +
                "Black we gon double\n" +
                "The stack on them whoa!\n" +
                "I be the Bonnie and\n" +
                "You be my Clyde\n" +
                "We ride or die\n" +
                "Xs and Os\n" +
                "[Pre-Chorus: Jisoo]\n" +
                "Siganeun heulleoganeunde\n" +
                "Maeumman geuphaejiji\n" +
                "Nae sesangeun neo hanaman\n" +
                "Missing you\n" +
                "Seotun nal won’t you set me free\n" +
                "\n" +
                "[Chorus: Rosé, Jennie]\n" +
                "Baby nal teojil geotcheoreom anajwo\n" +
                "Geuman saenggakhae mwoga geuri eoryeowo\n" +
                "Geojitmalcheoreom kiss haejwo naega neoege\n" +
                "Majimak sarangin geotcheoreom\n" +
                "\n" +
                "[Hook: Lisa]\n" +
                "Majimakcheoreom ma-ma-majimakcheoreom\n" +
                "Majimak bamin geotcheoreom love\n" +
                "Majimakcheoreom ma-ma-majimakcheoreom\n" +
                "Naeil ttawin eopsneun geotcheoreom\n" +
                "\n" +
                "[Bridge: Jennie, Rosé, Lisa]\n" +
                "One two three\n" +
                "Saeroun sijakiya\n" +
                "Jeoldae dwidorabojin anheul geonikka\n" +
                "Nal neoege deonjimyeon\n" +
                "Neoneun nal kkok jabajwo\n" +
                "Sesangeun uril kkeokkji moshal tenikka\n" +
                "BLACKPINK in your area\n" +
                "\n" +
                "[Chorus: Jennie, Rosé]\n" +
                "Baby nal teojil geotcheoreom anajwo\n" +
                "Geuman saenggakhae mwoga geuri eoryeowo\n" +
                "Geojitmalcheoreom kiss haejwo naega neoege\n" +
                "Majimak sarangin geotcheoreom\n" +
                "\n" +
                "[Hook: Lisa]\n" +
                "Majimakcheoreom ma-ma-majimakcheoreom\n" +
                "Majimak bamin geotcheoreom love\n" +
                "Majimakcheoreom ma-ma-majimakcheoreom\n" +
                "Naeil ttawin eopsneun geotcheoreom");
        m.setImage(R.drawable.img_asifityourlast);
        modelLyrics.add(m);

        m = new ModelLyrics();
        m.setTitle("Boombayah");
        m.setDate("2016");
        m.setAlbum("Square One");
        m.setLyrics("[Intro: Jennie]\n" +
                "(Hot) BLACKPINK in your area\n" +
                "(Hot) BLACKPINK in your area\n" +
                "\n" +
                "[Verse 1: Lisa]\n" +
                "Been a bad girl, I know I am\n" +
                "And I’m so hot, I need a fan\n" +
                "I don’t want a boy, I need a man\n" +
                "\n" +
                "[Verse 2: Jennie]\n" +
                "Click-clack Badda bing badda boom\n" +
                "Muneul bakchamyeon modu nal barabom\n" +
                "Gudi aesseo noryeok an haedo\n" +
                "Modeun namjadeuleun kopiga pangpangpang\n" +
                "Pangpang parapara pangpangpang\n" +
                "Jigeum nal wihan chukbaereul jjanjjanjjan\n" +
                "Hands up nae sonen bottle full o’ Henny\n" +
                "Nega malloman deuddeon gyaega naya Jennie\n" +
                "\n" +
                "[Pre-Chorus 1: Jisoo & Lisa]\n" +
                "Chumchuneun bulbicheun nal gamssago done\n" +
                "Black to the pink eodiseodeun teukbyeolhae (Oh yes)\n" +
                "Chyeoda bodeun maldeun I wanna dance\n" +
                "Like ttaradaradanttan\n" +
                "Ttaradaradanttan ttudurubbau\n" +
                "[Pre-Chorus 2: Rosé & Jisoo]\n" +
                "Joha i bunwigiga joha\n" +
                "Joha nan jigeum nega joha\n" +
                "Jeongmal banhaesseo oneul bam\n" +
                "Neowa chumchugo sipeo\n" +
                "\n" +
                "[Chorus: All]\n" +
                "BOOMBAYAH\n" +
                "YAH YAH YAH BOOMBAYAH\n" +
                "YAH YAH YAH BOOMBAYAH\n" +
                "YAH YAH YAH YAH\n" +
                "BOOM BOOM BA BOOM\n" +
                "BOOM BA oppa!\n" +
                "YAH YAH YAH YAH YAH YAH\n" +
                "YAH YAH YAH YAH\n" +
                "YAH YAH YAH YAH YAH YAH\n" +
                "YAH YAH YAH YAH oppa!\n" +
                "YAH YAH YAH YAH YAH YAH\n" +
                "YAH YAH YAH YAH\n" +
                "YAH YAH YAH YAH YAH YAH\n" +
                "YAH BOOM BOOM BA\n" +
                "BOOMBAYAH\n" +
                "(Hot) (BLACKPINK in your area)\n" +
                "\n" +
                "[Verse 3: Lisa]\n" +
                "Uh, Ije dallyeoyaji mwol eotteokhae\n" +
                "Nan cheol eobseo geob eobseo Man\n" +
                "Middle finger up, F U pay me\n" +
                "90s baby, I pump up the jam\n" +
                "Dallyeobwa dallyeobwa oppaya LAMBO\n" +
                "Oneuleun neowa na jeolmeumeul GAMBLE\n" +
                "Gamhi nal makjima hoksina nuga nal makado\n" +
                "I’m gonna go brrrr, RAMBO\n" +
                "[Pre-Chorus: Jisoo & Jennie]\n" +
                "Ne soni nae heorireul gamssago done\n" +
                "Front to my back\n" +
                "Nae mommaeneun teukbyeolhae Oh yes\n" +
                "Ne nunbicheun I know you wanna touch\n" +
                "Like touch touch touch\n" +
                "T-touch ttudurubbau\n" +
                "\n" +
                "[Pre-Chorus 2: Rosé & Jisoo]\n" +
                "Joha i bunwigiga joha\n" +
                "Joha nan jigeum nega joha\n" +
                "Jeongmal meosisseo oneul bam\n" +
                "Neowa chumchugo sipeo\n" +
                "\n" +
                "[Chorus: All]\n" +
                "BOOMBAYAH\n" +
                "YAH YAH YAH BOOMBAYAH\n" +
                "YAH YAH YAH BOOMBAYAH\n" +
                "YAH YAH YAH YAH\n" +
                "BOOM BOOM BA\n" +
                "BOOM BOOM BA oppa!\n" +
                "YAH YAH YAH YAH YAH\n" +
                "YAH YAH YAH YAH YAH\n" +
                "YAH YAH YAH YAH YAH\n" +
                "YAH YAH YAH YAH YAH oppa!\n" +
                "YAH YAH YAH YAH YAH\n" +
                "YAH YAH YAH YAH YAH\n" +
                "YAH YAH YAH YAH YAH\n" +
                "YAH YAH BOOM BOOM BA\n" +
                "BOOMBAYAH\n" +
                "[Outro: Rosé]\n" +
                "Oneuleun maen jeongsin ttawin beorigo\n" +
                "Haneuleul neomeoseo olla gal geoya\n" +
                "Kkeuteul moreuge ppalli dalligo sipeo\n" +
                "Let’s go, let’s go\n" +
                "Oneuleun maen jeongsin ttawin beorigo\n" +
                "Haneuleul neomeoseo olla gal geoya\n" +
                "Kkeuteul moreuge ppalli dalligo sipeo\n" +
                "Let’s go, let’s go");
        m.setImage(R.drawable.img_squareone);
        modelLyrics.add(m);

        m = new ModelLyrics();
        m.setTitle("Whistle");
        m.setDate("2016");
        m.setAlbum("Square One");
        m.setLyrics("[Intro]\n" +
                "Hey boy\n" +
                "\n" +
                "[Hook]\n" +
                "Make’ em whistle like a missile bomb, bomb\n" +
                "Every time I show up, blow up, uh\n" +
                "Make’ em whistle like a missile bomb, bomb\n" +
                "Every time I show up, blow up, uh\n" +
                "\n" +
                "[Verse 1]\n" +
                "Neon neomu areumdawo\n" +
                "Neol ijeul suga eobseo\n" +
                "Geu nunbichi ajik nareul\n" +
                "Ireohge seollege hae Boom boom\n" +
                "24/365 ojik neowa gachi hagopa\n" +
                "Najedo i bamedo\n" +
                "Ireohge neoreul wonhae Mmm... Mmm...\n" +
                "\n" +
                "[Verse 2]\n" +
                "Modeun namjadeuli nal maeil Check out\n" +
                "Daebubuni nal gajil su itda chakgak\n" +
                "Jeoldae manheun geol wonchi\n" +
                "Anha mameul wonhae nan\n" +
                "Neon simjangeul doryeonae boyeobwa\n" +
                "Aju ssikssikhage ttaeron Chic chic hage\n" +
                "So hot so hot naega\n" +
                "Eojjeol jul moreuge hae\n" +
                "Najimaki bulleojwo\n" +
                "Nae gwitgae doneun hwiparamcheoreom\n" +
                "[Pre-Chorus]\n" +
                "Idaero jinachiji mayo\n" +
                "Neodo nacheoreom nal\n" +
                "Ijeul suga eobtdamyeon Whoa\n" +
                "Neol hyanghan i maeumeun Fire\n" +
                "Nae simjangi ppareuge ttwijanha\n" +
                "Jeomjeom gakkai deullijanha\n" +
                "\n" +
                "[Chorus]\n" +
                "Hwiparam\n" +
                "Uh, hwi param param param\n" +
                "(Can you hear that?)\n" +
                "Hwi parapara para bam\n" +
                "Hwiparam\n" +
                "Uh, hwi param param param\n" +
                "(Can you hear that?)\n" +
                "Hwi parapara para bam\n" +
                "\n" +
                "[Verse 4]\n" +
                "Hold up\n" +
                "Amu mal haji ma\n" +
                "Just whistle to my heart\n" +
                "Geu soriga jigeum nareul\n" +
                "Ireohge seollege hae Boom boom\n" +
                "Saenggakeun jiruhae\n" +
                "Neukkimi Shhh\n" +
                "Every day all day\n" +
                "Nae gyeoteman issejwo Zoom zoom\n" +
                "[Verse 5]\n" +
                "Uh eonjena nan Stylin’\n" +
                "Dodohajiman ne apeseon Darlin’\n" +
                "Tteugeowojijanha Like a desert island\n" +
                "Neo alagalsurok ullyeodaeneun maeumsok\n" +
                "Geuman naeppae neomeowara\n" +
                "Naege Boy ijen Checkmate\n" +
                "Geimeun naega Win (Uh-huh)\n" +
                "Nan neol taekhae anajwo deo\n" +
                "Sege nuga neol garo\n" +
                "Chae gagi jeone naega (Uh)\n" +
                "\n" +
                "[Pre-Chorus]\n" +
                "Idaero jinachiji mayo\n" +
                "Neodo nacheoreom nal\n" +
                "Ijeul suga eobtdamyeon Whoa\n" +
                "Neol hyanghan i maeumeun Fire\n" +
                "Nae simjangi ppareuge ttwijanha\n" +
                "Jeomjeom gakkai deullijanha\n" +
                "\n" +
                "[Chorus]\n" +
                "Hwiparam\n" +
                "Uh, hwi param param param\n" +
                "(Can you hear that?)\n" +
                "Hwi parapara para bam\n" +
                "Hwiparam\n" +
                "Uh, hwi param param param\n" +
                "(Can you hear that?)\n" +
                "Hwi parapara para bam\n" +
                "This beat got me feelin’ like\n" +
                "[Bridge]\n" +
                "Baramcheoreom seuchyeoganeun\n" +
                "Heunhan inyeoni anigil\n" +
                "Manheun maleun pilyo eobseo\n" +
                "Jigeum neoui gyeote\n" +
                "Nareul deryeoga jwo\n" +
                "\n" +
                "[Hook]\n" +
                "Make’ em whistle like a missile bomb, bomb\n" +
                "Every time I show up, blow up, uh\n" +
                "Make’ em whistle like a missile bomb, bomb\n" +
                "Every time I show up, blow up, uh\n\n"+

        "[Spoken: Jisoo]\n" +
                "Hey, boy\n" +
                "\n" +
                "[Intro: Lisa]\n" +
                "Make 'em whistle like a missile, bomb, bomb\n" +
                "Every time I show up, blow up, uh\n" +
                "Make 'em whistle like a missile, bomb, bomb\n" +
                "Every time I show up, blow up, uh\n" +
                "\n" +
                "[Verse 1: Rosé & Lisa]\n" +
                "Suteki anata wa wasureru wake nai\n" +
                "Hitomi ni kokoro ga tokidoki suru wa, boom, boom\n" +
                "24/365 anata ga koishi wa\n" +
                "Yuru mo yoru ni mo zutto mo tometeru, hmm, hmm\n" +
                "\n" +
                "[Verse 2: Jennie]\n" +
                "Yeah, all the boys stand in line just to check out\n" +
                "Forget about the bet, I'ma blow their breath out\n" +
                "Got my mind on my money and my money on my mind (Uh)\n" +
                "Dough, it ain't really work if ya broke\n" +
                "See me skrrt, skrrt with it, watch you go go get it\n" +
                "So hot, so hot when the sauce get to dripping, I lick (Uh)\n" +
                "Got them begging, \"Give me some more\"\n" +
                "Baby put them lips together make that whistle blow\n" +
                "\n" +
                "[Pre-Chorus: Rosé & Jisoo]\n" +
                "Ikanai de sono mama\n" +
                "Anata mo onaji komochi nara, whoa-oh-oh\n" +
                "Omoi kokarete fire\n" +
                "Kokoro ga deku natteru wa dandan kikoete kuru wa\n" +
                "[Chorus: Jisoo; Jennie & Lisa]\n" +
                "Hwiparam (Uh)\n" +
                "Hwi param param\n" +
                "(Can you hear that?)\n" +
                "Hwi parapara para bam\n" +
                "Hwiparam (Uh)\n" +
                "Hwi param param\n" +
                "(Can you hear that?)\n" +
                "Hwi parapara para bam\n" +
                "\n" +
                "[Verse 3: Jennie & Jisoo]\n" +
                "Hold up\n" +
                "Shabera naide\n" +
                "Just whistle to my heart\n" +
                "Hontou ga kikoeru dokidoki suru wa, boom, boom\n" +
                "Kangae sukizu\n" +
                "Kanjite Shh!\n" +
                "Every day, all day\n" +
                "Soba ni ite zutto, zoom, zoom\n" +
                "\n" +
                "[Verse 4: Lisa]\n" +
                "Uh, every day I'm stylin'\n" +
                "Killin' everything in my way, I'm wildin'\n" +
                "Aiming for your heart, I'm gonna see you, darlin'\n" +
                "Smooth criminal, I'm bad, untouchable\n" +
                "I be feeling myself when you looking my way\n" +
                "Watch your queen, checkmate for the win (Uh-huh)\n" +
                "Pull up on deck, BLACKPINK, write the check, boy\n" +
                "Let me hear you whistle again, uh\n" +
                "[Pre-Chorus: Jisoo & Rosé]\n" +
                "Ikanai de sono mama\n" +
                "Anata mo onaji kimochi nara, whoa-oh-oh\n" +
                "Omoi kokarete Fire\n" +
                "Kokoro ga deku natteru wa dandan kikoete kuru wa\n" +
                "\n" +
                "[Chorus: Rosé; Jennie; Lisa & Jisoo]\n" +
                "Hwiparam (Uh)\n" +
                "Hwi param param\n" +
                "(Can you hear that?)\n" +
                "Hwi parapara para bam\n" +
                "Hwiparam (Uh)\n" +
                "Hwi param param\n" +
                "(Can you hear that?)\n" +
                "Hwi parapara para bam\n" +
                "\n" +
                "[Spoken: Rosé]\n" +
                "This beat got me feelin' like\n" +
                "\n" +
                "[Bridge: Jennie, Jisoo & Rosé]\n" +
                "Deai ga sugisaru kaze de wa nai yō ni\n" +
                "Kotoba wa ira nai\n" +
                "Ima wa soba ni itai dake yo\n" +
                "Ooh-ooh-ooh, ooh-ooh-ooh, ooh\n" +
                "\n" +
                "[Outro: Lisa]\n" +
                "Make 'em whistle like a missile, bomb, bomb\n" +
                "Every time I show up, blow up, uh\n" +
                "Make 'em whistle like a missile, bomb, bomb\n" +
                "Every time I show up, blow up, uh");
        m.setImage(R.drawable.img_squareone);
        modelLyrics.add(m);

        m = new ModelLyrics();
        m.setTitle("Playing With Fire");
        m.setDate("2016");
        m.setAlbum("Square Two");
        m.setLyrics("[Verse 1: Jennie & Jisoo]\n" +
                "Uri eomman maeil naege malhaesseo\n" +
                "Eonjena namja joshimharago\n" +
                "Sarangeun machi buljangnan gataseo\n" +
                "Dachinikka eh\n" +
                "Eomma mari kkok majeuljjido molla\n" +
                "Neol bomyeon nae mami tteugeopge daraolla\n" +
                "Duryeoumbodan neol hyanghan kkeullimi\n" +
                "Deo keunikka eh\n" +
                "\n" +
                "[Pre-Chorus: Rosé & Lisa]\n" +
                "Meomchul su eomneun i tteollimeun\n" +
                "On and on and on\n" +
                "Nae jeonbureul neoran sesange\n" +
                "Da deonjigo shipeo\n" +
                "Look at me look at me now\n" +
                "Ireoke neon nal aetaeugo itjana\n" +
                "Kkeul su eopseo\n" +
                "Uri sarangeun buljangnan (oh-oh-oh-oh)\n" +
                "\n" +
                "[Chorus: Jennie, Lisa & Jisoo]\n" +
                "My love is on fire\n" +
                "Now burn baby burn\n" +
                "Buljangnan (oh-oh-oh-oh)\n" +
                "My love is on fire\n" +
                "So don’t play with me boy\n" +
                "Buljangnan\n" +
                "[Verse 2: Lisa]\n" +
                "Oh no nan imi meolli wabeoryeonneungeol\n" +
                "Eoneusae i modeun ge jangnani anin geol\n" +
                "Sarangiran ppalgan bulsshi\n" +
                "Bureora baram deo keojeoganeun bulkkil\n" +
                "Ige yaginji doginji uri eommado molla\n" +
                "Nae mam doduginde wae gyeongchaldo molla\n" +
                "Bul buteun nae shimjange deo bueora neoran gireum\n" +
                "Kiss him will I diss him\n" +
                "I don’t know but I miss him\n" +
                "Jungdogeul neomeoseon i sarangeun crack\n" +
                "Nae shimjange saekkareun black\n" +
                "\n" +
                "[Pre-Chorus: Jennie, Jisoo & Rosé]\n" +
                "Meomchul su eomneun i tteollimeun\n" +
                "On and on and on\n" +
                "Nae jeonbureul neoran bulkkil sogeuro\n" +
                "Deonjigo shipeo\n" +
                "Look at me look at me now\n" +
                "Ireoke neon nal aetaeugo itjana\n" +
                "Kkeul su eopseo\n" +
                "Uri sarangeun buljangnan (oh-oh-oh-oh)\n" +
                "\n" +
                "[Chorus: Rosé, Lisa & Jisoo]\n" +
                "My love is on fire\n" +
                "Now burn baby burn\n" +
                "Buljangnan (oh-oh-oh-oh)\n" +
                "My love is on fire\n" +
                "So don’t play with me boy\n" +
                "Buljangnan\n" +
                "[Outro: Jennie & Rosé]\n" +
                "Geotjabeul suga eomneun geol\n" +
                "Neomuna ppalli peojeo ganeun i bulkkil\n" +
                "Ireon nal meomchuji ma\n" +
                "I sarangi oneul bameul taeweobeorige Woo");
        m.setImage(R.drawable.img_squaretwo);
        modelLyrics.add(m);

        m = new ModelLyrics();
        m.setTitle("Stay");
        m.setDate("2016");
        m.setAlbum("Square Two");
        m.setLyrics("[Verse 1: Rosé, Jennie]\n" +
                "Tukhamyeon geochin maldeullo nae mame sangcheoreul naenohgo\n" +
                "Mianhadan mal hanmadi eopsi tto na honja wirohago\n" +
                "Oneul harudo hoksi nal tteonalkka neul buranhae hae\n" +
                "I just want you to stay\n" +
                "Jeomjeom mudyeojyeo ganeun neoui geu mupyojeong soge\n" +
                "Cheoncheonhi naeryeonohjamyeo geoure soksagigon hae\n" +
                "Nal dangyeonhage saenggakhaneun neojiman geuge neodawo\n" +
                "Geuraedo stay stay stay with me\n" +
                "\n" +
                "[Pre-Chorus: Jisoo]\n" +
                "Neol talmeun deushan seulpeun mellodi (oh)\n" +
                "Ireohge nal ullineunde eh eh\n" +
                "Ne hyanggineun dalkomhan felony (oh)\n" +
                "Neomu mipjiman saranghae\n" +
                "\n" +
                "[Chorus: Rosé, Jisoo, Jennie]\n" +
                "Eoduun bami nal gadugi jeone\n" +
                "Nae gyeoteul tteonajima\n" +
                "Ajik nal saranghani nae mamgwa gatdamyeon\n" +
                "Oneureun tteonajima\n" +
                "Gudi neoyeoyaman haneun iyuneun mutjima\n" +
                "Geujeo nae gyeote stay with me\n" +
                "\n" +
                "[Post-Chorus: Lisa, All, Rosé]\n" +
                "It goes a little something like\n" +
                "La la la la la la la la la la la la la la la la la la\n" +
                "La la la la la la la la la la la la la la la la la la\n" +
                "Jigeum dangjang manheun geol baraneun ge anya\n" +
                "Geujeo nae gyeote stay with me\n" +
                "[Verse 2: Jennie, Lisa]\n" +
                "Sasireun nan deo baraneun ge eopseo ije\n" +
                "Simjangeun ttwigin haneun geonji mugamgakhae geurae\n" +
                "Saramdeulgwaui eokjiseureon hanmadibodan\n" +
                "Neowaui eosaekhan chimmugi charari joha\n" +
                "So stay geuge eodiga dwaessgeon mariya\n" +
                "Gakkeum eodumi ol ttaemyeon I’ll be your fire\n" +
                "Geojit gateun sesang sok yuilhan truth it’t you\n" +
                "This a letter from me to you\n" +
                "\n" +
                "[Pre-Chorus: Rosé]\n" +
                "Neol talmeun deushan seulpeun mellodi (oh)\n" +
                "Ireohge nal ullineunde eh eh\n" +
                "Ne hyanggineun dalkomhan felony (oh)\n" +
                "Neomu mipjiman saranghae\n" +
                "\n" +
                "[Chorus: Jisoo, Lisa, Jennie]\n" +
                "Eoduun bami nal gadugi jeone\n" +
                "Nae gyeoteul tteonajima\n" +
                "Ajik nal saranghani nae mamgwa gatdamyeon\n" +
                "Oneureun tteonajima\n" +
                "Gudi neoyeoyaman haneun iyuneun mutjima\n" +
                "Geujeo nae gyeote stay with me\n" +
                "\n" +
                "[Post-Chorus: Lisa, All, Jisoo, Rosé]\n" +
                "It goes a little something like\n" +
                "La la la la la la la la la la la la la la la la la la\n" +
                "La la la la la la la la la la la la la la la la la la\n" +
                "Jigeum dangjang manheun geol baraneun ge anya\n" +
                "Geujeo nae gyeote stay with me\n" +
                "It goes a little something like\n" +
                "La la la la la la la la la la la la la la la la la la\n" +
                "La la la la la la la la la la la la la la la la la la\n" +
                "Jigeum dangjang manheun geol baraneun ge anya\n" +
                "Geujeo nae gyeote stay with me");
        m.setImage(R.drawable.img_squaretwo);
        modelLyrics.add(m);

        m = new ModelLyrics();
        m.setTitle("Sure Thing (Miguel Cover)");
        m.setDate("2017");
        m.setAlbum("Cover");
        m.setLyrics("[Intro: Jennie]\n" +
                "Love you like a brother\n" +
                "Treat you like a friend\n" +
                "Respect you like a lover\n" +
                "\n" +
                "[Refrain: Lisa]\n" +
                "You could bet that, never gotta sweat that\n" +
                "You could bet that, never gotta sweat that\n" +
                "You could bet that, never gotta sweat that\n" +
                "You could bet that, never gotta sweat that, that, that\n" +
                "\n" +
                "[Verse 1: Rosé & Jennie]\n" +
                "If you'd be the cash, I'd be the rubber-band\n" +
                "You'd be the match, I'mma be the fuse, boom!\n" +
                "Painter baby you could be the muse\n" +
                "I'm the reporter, baby you could be the news\n" +
                "'Cause you're the cigarette and I'm the smoker\n" +
                "We raise a bet, cause you're the joker truth told\n" +
                "You are the chalk and I can be the blackboard\n" +
                "And you can be the talk and I could be the walk\n" +
                "\n" +
                "[Chorus: Jisoo & Rosé]\n" +
                "Even when the sky comes falling\n" +
                "Even when the sun don't shine\n" +
                "I got faith in you and I\n" +
                "So put your pretty little hands in mine\n" +
                "Even when we're down to the wire babe\n" +
                "Even when it's do or die\n" +
                "We can do it baby simple and plain\n" +
                "Cause this love is a sure thing\n" +
                "[Refrain: Lisa & Jennie]\n" +
                "You could bet that, never got to sweat that\n" +
                "You could bet that, never got to sweat that\n" +
                "You could bet that, never got to sweat that\n" +
                "You could bet that, never got to sweat that, that, that\n" +
                "\n" +
                "[Verse 2: Jisoo, Jennie & (Rosé)]\n" +
                "You could be the lover I'll be the fighter babe\n" +
                "If I'm the blunt, you could be the lighter babe, fire it up!\n" +
                "Writer babe, you could be the quote\n" +
                "If I'm the lyric baby you could be the note, record that!\n" +
                "Saint, I'm a sinner, prize, I'm a winner, and it's you\n" +
                "What can I do to deserve that\n" +
                "Paper baby, I'll be the pen\n" +
                "Say that I'm the one, cause you are ten\n" +
                "(Real and not pretend)\n" +
                "\n" +
                "[Chorus: Jisoo & Rosé]\n" +
                "Even when the sky comes falling\n" +
                "Even when the sun don't shine\n" +
                "I got faith in you and I\n" +
                "So put your pretty little hands in mine\n" +
                "Even when we're down to the wire babe\n" +
                "Even when it's do or die\n" +
                "We can do it baby simple and plain\n" +
                "Cause this love is a sure thing\n" +
                "[Bridge: Lisa & Jennie]\n" +
                "Rock with me baby\n" +
                "Let me hold you in my arms\n" +
                "Talk to me baby, yeah\n" +
                "Rock with me baby\n" +
                "Let me hold you in my arms\n" +
                "Talk to me baby\n" +
                "I fall in love every single time I look into your eyes\n" +
                "Those eyes; they never lie\n" +
                "I can tell your mine\n" +
                "It's so hard when you're not around\n" +
                "I get mad thinking how I can't always have you around\n" +
                "I wanna make you spend the whole day with me boy\n" +
                "Play me like your toy, I'm all yours to enjoy\n" +
                "Hoping this moment lasts long and forever\n" +
                "I got no fear what so ever, you're my one & only lover\n" +
                "Roll a dice I bet it twice\n" +
                "Don't you think I can live a life without\n" +
                "You in it you can bet that\n" +
                "Never sweat that you know what I'm best at\n" +
                "Ready or not, I'm gon' have you by tonight\n" +
                "I call the shots won't you be my kryptonite\n" +
                "\n" +
                "[Outro: All]\n" +
                "Love you like a brother\n" +
                "Treat you like a friend\n" +
                "Respect you like a lover\n");
        m.setImage(R.drawable.img_surething);
        modelLyrics.add(m);

        m = new ModelLyrics();
        m.setTitle("So Hot (THEBLACKLABEL Remix)");
        m.setDate("2017");
        m.setAlbum("THEBLACKLABEL Remix");
        m.setLyrics("[Intro: Jennie]\n" +
                "BLACKPINK in your area\n" +
                "BLACKPINK in your area\n" +
                "\n" +
                "[Verse 1: Jennie]\n" +
                "Wae jakku chyeodaboni wae\n" +
                "Naega geureohge yeppeuni\n" +
                "Amuri geureohdago geureohge chyeodabomyeon\n" +
                "Naega jom ssukseureopjanhni\n" +
                "(Why you wanna do that?)\n" +
                "\n" +
                "[Pre-Chorus: Rosé]\n" +
                "Naega jinagal ttaemada\n" +
                "Gogae dollineun namjadeul\n" +
                "Dwieseo neukkyeojineun tteugeoun siseondeul\n" +
                "Eotteohge hamyeon joheulji\n" +
                "\n" +
                "[Chorus: Jennie, Rosé, JiSoo & Lisa]\n" +
                "I′m so hot nan neomu yeppeoyo\n" +
                "I′m so fine nan neomu maelyeok isseo\n" +
                "I′m so cool nan neomu meotjyeo\n" +
                "I’m so so so hot hot\n" +
                "\n" +
                "[Verse 2: Lisa & Jennie]\n" +
                "A little bit of black, with a little bit of pink\n" +
                "But ain't none little about this\n" +
                "Been living it big, uh\n" +
                "Your crib could fit in my crib\n" +
                "Pretty as shhhhhh\n" +
                "Don't gotta say it no more\n" +
                "Look at my face and they know\n" +
                "They've seen it before, oh\n" +
                "Made it to vogue\n" +
                "Put the pop, back in pop, at the top\n" +
                "What we rock, they all rock, had to stop\n" +
                "Have to shop, Keep the swagger on five mil\n" +
                "We the only gang to run the game in high-heels\n" +
                "[Pre-Chorus: Jisoo]\n" +
                "Joyonghi salgo sipeunde\n" +
                "Dareun yeojaaedeulcheoreom\n" +
                "Eommaneun wae nal ireohge nahanwaseo\n" +
                "Nae salmeul pigonhage haneunji\n" +
                "\n" +
                "[Chorus: Rosé, Jisoo & Lisa]\n" +
                "I'm so hot\n" +
                "Nan neomu yeppeoyo\n" +
                "I'm so fine\n" +
                "Nan neomu maelyeok isseo\n" +
                "I'm so cool\n" +
                "Nan neomu meotjyeo\n" +
                "I'm so so so hot hot\n" +
                "\n" +
                "[Chorus: Jisoo, Jennie, Rosé & Lisa]\n" +
                "I'm so hot\n" +
                "Nan neomu yeppeoyo\n" +
                "I'm so fine\n" +
                "Nan neomu maelyeok isseo\n" +
                "I'm so cool\n" +
                "Nan neomu meotjyeo\n" +
                "I'm so so so hot hot");
        m.setImage(R.drawable.img_sohot);
        modelLyrics.add(m);


        return modelLyrics;


    }


    @Override
    public boolean onCreateOptionsMenu (Menu menu){

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);

        MenuItem item = menu.findItem(R.id.search);
        //item.expandActionView();

        /**item.setOnActionExpandListener(new MenuItem.OnActionExpandListener() {
            @Override
            public boolean onMenuItemActionExpand(MenuItem item) {

                return true;

            }

            @Override
            public boolean onMenuItemActionCollapse(MenuItem item) {

                return true;
            }
        });
         **/


        final SearchView searchView = (SearchView) MenuItemCompat.getActionView(item);

        //View v = searchView.findViewById(androidx.appcompat.R.id.search_plate);
        //v.setBackgroundColor(Color.parseColor("#FFF99CAC"));

        //ImageView searchCloseIcon = (ImageView)searchView.findViewById(androidx.appcompat.R.id.search_close_btn);
        //searchCloseIcon.setImageResource(R.drawable.ic_baseline_close_24);

        //ImageView voiceIcon = (ImageView)searchView.findViewById(androidx.appcompat.R.id.search_voice_btn);
        //voiceIcon.setImageResource(R.drawable.abc_ic_voice_search);

        //ImageView searchIcon = (ImageView)searchView.findViewById(androidx.appcompat.R.id.search_mag_icon);
        //searchIcon.setImageResource(R.drawable.ic_search_black_24dp);

        searchView.setQueryHint("Search Lyrics");
        searchView.setIconifiedByDefault(false);
        searchView.setMaxWidth(Integer.MAX_VALUE);




        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {

                adapterLyrics.getFilter().filter(query);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapterLyrics.getFilter().filter(newText);
                return false;
            }
        });


        searchView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               searchView.setIconified(false);
            }
        });


        /**
         *

        AutoCompleteTextView searchSrcText = searchView.findViewById(androidx.appcompat.R.id.search_src_text);
        searchSrcText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
              if (!hasFocus){
                  InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
                  inputMethodManager.hideSoftInputFromWindow(v.getWindowToken(), 0);
              }
            }
        });
         */

        return true;
    }

}