package com.example.drinkinggame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class PullonPyoritys extends AppCompatActivity {
    public static ArrayList<String> totuudet = new ArrayList<String>();
    public static ArrayList<String> tehtavat = new ArrayList<String>();

    TextView kysymys;
    int indeksi;
    Random rand = null;
    String kysymysTeksti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pullon_pyoritys);

        kysymys = (TextView) findViewById(R.id.kysymys);
        createTotuudet();
        createTehtavat();
    }

    public void nextTotuus(View v) {
        System.out.println("Koko: " + totuudet.size() + "\n");
        if (totuudet.size() == 0) {
            kysymys.setText("Kaikki totuus-kysymykset käyty läpi.");
            createTotuudet();
        } else {
            rand = new Random();
            System.out.println("Rand: " + rand + "\n");
            indeksi = rand.nextInt(totuudet.size());
            kysymysTeksti = totuudet.get(indeksi);
            kysymys.setText(kysymysTeksti);
            totuudet.remove(indeksi);
        }
    }

    public void nextTehtava(View v) {
        System.out.println("Koko: " + tehtavat.size() + "\n");
        if (tehtavat.size() == 0) {
            kysymys.setText("Kaikki tehtävä-kysymykset käyty läpi.");
            createTehtavat();
        } else {
            rand = new Random();
            System.out.println("Rand: " + rand + "\n");
            indeksi = rand.nextInt(tehtavat.size());
            kysymysTeksti = tehtavat.get(indeksi);
            kysymys.setText(kysymysTeksti);
            tehtavat.remove(indeksi);
        }
    }

    public void createTotuudet() {
        totuudet.add("Oletko ihastunut tällä hetkellä kehenkään? Jos kyllä, niin kuka hän on?");
        totuudet.add("Mitä et kehtaisi kertoa vanhemmillesi?");
        totuudet.add("Oletko suudellut koskaan samaa sukupuolta olevaa henkilöä?");
        totuudet.add("Oletko koskaan yllättänyt vanhempiasi harrastamassa seksiä?");
        totuudet.add("Mitä tekisit, jos olisit päivän vastakkaista sukupuolta?");
        totuudet.add("Kenen kanssa tämän pelin pelaajista haluaisit vaihtaa elämiä keskenään?");
        totuudet.add("Oletko koskaan harjoitellut suutelemista (esim. peilin edessä, kädellä, mansikalla...).");
        totuudet.add("Mikä on salainen paheesi?");
        totuudet.add("Laulatko suihkussa?");
        totuudet.add("Mikä olisi selaushistoriassasi sellaista, mikä hävettäisi sinua, jos joku näkisi sen?");
        totuudet.add("Kuka tästä huoneesta on seksikkäin?");
        totuudet.add("Viimeisin viesti, jonka lähetit?");
        totuudet.add("Mistä et pidä vasemmanpuoleisessa pelaajassa?");
        totuudet.add("Uskotko meneväsi naimisiin nykyisen kumppanisi kanssa?");
        totuudet.add("Mikä on laittominta mitä olet koskaan tehnyt?");
        totuudet.add("Ketä tästä huoneesta olisi kamalinta deittailla?");
        totuudet.add("Oletko ikinä ajatellut pettäväsi kumppaniasi?");
        totuudet.add("Mikä on lapsellisin asia, mitä teet edelleen?");
        totuudet.add("Mitkä ovat huonoimmat treffit, joilla olet ollut?");
        totuudet.add("Oletko koskaan ollut ihastunut kaverisi tyttö-/poikaystävään?");
        totuudet.add("Fuck-marry-kill tästä huoneesta?");
        totuudet.add("Seksikkäintä miehessä?");
        totuudet.add("Seksikkäintä naisessa?");
        totuudet.add("Naisille: Voisitko deittailla itseäsi lyhyempää miestä?\nMiehille: Voisitko deittailla itseäsi pidempää naista?");
        totuudet.add("Kumpaa deittailisit mieluummin: rumaa, joka on hyvä sängyssä, vai kuumaa, joka on huono sängyssä?");
        totuudet.add("Jos sinun pitäisi deittailla jonkun kaverisi kumppania, kuka se olisi?");
        totuudet.add("Jos vanhempasi inhoaisivat kumppaniasi, mitä tekisit?");
        totuudet.add("Jos kumppanisi inhoaisi parasta kaveriasi, mitä tekisit?");
        totuudet.add("Kenelle olet kateellinen?");
        totuudet.add("Suurin turn off?");
        totuudet.add("Kun olit lapsi, mitä ajattelit silloin, millaista elämäsi olisi nyt?");
        totuudet.add("Jos et ole/olisi saanut ensi suudelmaasi vielä, kenen kanssa tästä huoneesta haluaisit tehdä sen?");
        totuudet.add("Kenen tästä huoneesta oletat olevan paras flirttailija?");
        totuudet.add("Kenen tästä huoneesta oletat olevan paras suutelija?");
        totuudet.add("Arvostele oikealla puolellasi oleva pelaaja asteikolla 1-10, 10 on kuumin.");
        totuudet.add("Kerro ärsyttävä asia itsestäsi.");
        totuudet.add("Mitä pelkäät eniten parisuhteessa?");
        totuudet.add("Oletko neitsyt?");
        totuudet.add("Kuinka pitkä on/oli pisin parisuhteesi?");
        totuudet.add("Voisitko olla etäsuhteessa?");
        totuudet.add("Voisitko poseerata Playboy-lehdelle?");
        totuudet.add("Kuinka montaa ihmistä olet suudellut?");
        totuudet.add("Milloin ja missä tapahtui ensisuudelmasi?");
        totuudet.add("Milloin menetit neitsyytesi ja kenelle?");
        totuudet.add("Mikä on lempikehonosa kumppanissasi?");
        totuudet.add("Menisitko ulos itseäsi vanhemman kanssa? Kuinka vanha on liian vanha?");
        totuudet.add("Jos sinun pitäisi harrastaa kolmenkimppaa tämän huoneen henkilöiden kanssa, ketä ne olisivat ja miksi?");
        totuudet.add("Kuinka montaa ihmistä olet suudellut?");
        totuudet.add("Kuinka monta seksikumppania sinulla on ollut?");
        totuudet.add("Viimeisin kerta kuin itkit ja miksi?");
        totuudet.add("Onko sinulla tallennettuna tuhmia kuvia/videoita puhelimeesi?");
    }

    public void createTehtavat() {
        tehtavat.add("Suutele kauneinta/komeinta henkilöä tässä huoneessa.");
        tehtavat.add("Juokse talon ympäri alusvaatteisillaan.");

    }
}
