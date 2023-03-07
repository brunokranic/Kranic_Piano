package com.example.kranic_piano;

import androidx.appcompat.app.AppCompatActivity;

import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button a, b, c, d, e, f, g, g1;

    int noteA, noteB, noteC, noteD, noteE, noteF, noteG, noteG1;
    SoundPool soundPool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a = (Button) findViewById(R.id.BtnA);
        b = (Button) findViewById(R.id.BtnB);
        c = (Button) findViewById(R.id.BtnC);
        d = (Button) findViewById(R.id.BtnD);
        e = (Button) findViewById(R.id.BtnE);
        f = (Button) findViewById(R.id.BtnF);
        g = (Button) findViewById(R.id.BtnG);
        g1 = (Button) findViewById(R.id.BtnG1);

        soundPool = new SoundPool.Builder().setMaxStreams(5).build();

        noteA = soundPool.load(this, R.raw.a, 1);
        noteB = soundPool.load(this, R.raw.b, 1);
        noteC = soundPool.load(this, R.raw.c1, 1);
        noteD = soundPool.load(this, R.raw.d, 1);
        noteE = soundPool.load(this, R.raw.e, 1);
        noteF = soundPool.load(this, R.raw.f, 1);
        noteG = soundPool.load(this, R.raw.g, 1);
        noteG1 = soundPool.load(this, R.raw.g1, 1);

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(noteA, 1, 1, 0, 0, 1);
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(noteB, 1, 1, 0, 0, 1);
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(noteC, 1, 1, 0, 0, 1);
            }
        });
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(noteD, 1, 1, 0, 0, 1);
            }
        });
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(noteE, 1, 1, 0, 0, 1);
            }
        });
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(noteF, 1, 1, 0, 0, 1);
            }
        });
        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(noteG, 1, 1, 0, 0, 1);
            }
        });
        g1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(noteG1, 1, 1, 0, 0, 1);
            }
        });

    }
}



