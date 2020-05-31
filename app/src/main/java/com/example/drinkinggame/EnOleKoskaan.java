package com.example.drinkinggame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Random;

public class EnOleKoskaan extends AppCompatActivity {

    public static ArrayList<String> kysymykset = new ArrayList<>();
    Random rand = null;
    TextView kysymys;
    int indeksi;
    String kysymysTeksti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_en_ole_koskaan);
    }

    public void NextQuestion(View v) {
        if (kysymykset.size() == 0) {
            kysymys.setText("Kaikki kysymykset käyty läpi.");
            createEnOleKoskaat();
        } else {
            rand = new Random();
            indeksi = rand.nextInt(kysymykset.size());
            kysymysTeksti = kysymykset.get(indeksi);
            kysymys.setText(kysymysTeksti);
            kysymykset.remove(indeksi);
        }
    }

    public void createEnOleKoskaat() {
        kysymykset.add("... harrastanut seksiä.");


    }
}
