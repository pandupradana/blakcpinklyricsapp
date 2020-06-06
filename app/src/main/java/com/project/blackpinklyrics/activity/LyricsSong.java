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
        mRecyclerView.setHasFixedSize(true);

        adapterLyrics = new AdapterLyrics(this, getListLyrics());
        mRecyclerView.setAdapter(adapterLyrics);
    }

    private ArrayList<ModelLyrics> getListLyrics() {

        ArrayList<ModelLyrics> modelLyrics = new ArrayList<>();

        ModelLyrics m = new ModelLyrics();
        m.setTitle("Kill This Love");
        m.setDate("5 April 2019");
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
        m.setImage(R.drawable.killthislove);
        modelLyrics.add(m);

        m = new ModelLyrics();
        m.setTitle("Don’t Know What To Do");
        m.setDate("5 April 2019");
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
        m.setImage(R.drawable.killthislove);
        modelLyrics.add(m);

        m = new ModelLyrics();
        m.setTitle("DDU-DU DDU-DU");
        m.setDate("15 June 2018");
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
        m.setImage(R.drawable.squareup);
        modelLyrics.add(m);

        m = new ModelLyrics();
        m.setTitle("Forever Young");
        m.setDate("15 June 2018");
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
        m.setImage(R.drawable.squareup);
        modelLyrics.add(m);

        m = new ModelLyrics();
        m.setTitle("As If It's Your Last");
        m.setDate("22 June 2017");
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
        m.setImage(R.drawable.asifityourlast);
        modelLyrics.add(m);

        m = new ModelLyrics();
        m.setTitle("Boombayah");
        m.setDate("8 August 2016");
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
        m.setImage(R.drawable.squareon);
        modelLyrics.add(m);

        m = new ModelLyrics();
        m.setTitle("Whistle");
        m.setDate("8 August 2016");
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
                "Every time I show up, blow up, uh");
        m.setImage(R.drawable.squareon);
        modelLyrics.add(m);

        m = new ModelLyrics();
        m.setTitle("Playing With Fire");
        m.setDate("1 November 2016");
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
        m.setImage(R.drawable.squaretwo);
        modelLyrics.add(m);

        m = new ModelLyrics();
        m.setTitle("Stay");
        m.setDate("1 November 2016");
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
        m.setImage(R.drawable.squaretwo);
        modelLyrics.add(m);

        m = new ModelLyrics();
        m.setTitle("Kick It");
        m.setDate("5 April 2019");
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
        m.setImage(R.drawable.killthislove);
        modelLyrics.add(m);


        return modelLyrics;




    }



}