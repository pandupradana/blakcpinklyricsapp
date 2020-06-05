package com.project.blackpinklyrics.activity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import com.project.blackpinklyrics.R;
import com.project.blackpinklyrics.adapter.AdapterLyrics;
import com.project.blackpinklyrics.model.ModelLyrics;

import java.util.ArrayList;

public class LyricsSong extends AppCompatActivity {

    RecyclerView mRecyclerView;
    AdapterLyrics adapterLyrics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lyrics_song);

        mRecyclerView = findViewById(R.id.recycleView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapterLyrics = new AdapterLyrics(this, getListLyrics());
        mRecyclerView.setAdapter(adapterLyrics);
    }

    private ArrayList<ModelLyrics> getListLyrics() {

        ArrayList<ModelLyrics> modelLyrics = new ArrayList<>();

        ModelLyrics m = new ModelLyrics();
        m.setTitle("Kill This Love");
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
        m.setImage(R.drawable.squareon);
        modelLyrics.add(m);

        m = new ModelLyrics();
        m.setTitle("Don’t Know What To Do");
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
        m.setImage(R.drawable.squareon);
        modelLyrics.add(m);

        m = new ModelLyrics();
        m.setTitle("DDU-DU DDU-DU");
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
        m.setImage(R.drawable.squareon);
        modelLyrics.add(m);

        m = new ModelLyrics();
        m.setTitle("Forever Young");
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
        m.setImage(R.drawable.squareon);
        modelLyrics.add(m);

        m = new ModelLyrics();
        m.setTitle("Don’t Know What To Do");
        m.setLyrics("a");
        m.setImage(R.drawable.squareon);
        modelLyrics.add(m);

        m = new ModelLyrics();
        m.setTitle("Don’t Know What To Do");
        m.setLyrics("d");
        m.setImage(R.drawable.squareon);
        modelLyrics.add(m);

        m = new ModelLyrics();
        m.setTitle("Don’t Know What To Do");
        m.setLyrics("f");
        m.setImage(R.drawable.squareon);
        modelLyrics.add(m);

        m = new ModelLyrics();
        m.setTitle("Don’t Know What To Do");
        m.setLyrics("g");
        m.setImage(R.drawable.squareon);
        modelLyrics.add(m);

        m = new ModelLyrics();
        m.setTitle("Don’t Know What To Do");
        m.setLyrics("r");
        m.setImage(R.drawable.squareon);
        modelLyrics.add(m);

        m = new ModelLyrics();
        m.setTitle("Don’t Know What To Do");
        m.setLyrics("g");
        m.setImage(R.drawable.squareon);
        modelLyrics.add(m);


        return modelLyrics;




    }



}