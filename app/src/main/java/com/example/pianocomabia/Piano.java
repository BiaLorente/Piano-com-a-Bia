package com.example.pianocomabia;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Piano extends AppCompatActivity {
    private Button c4, d4, e4, f4, g4, a4, b4, c5;

    private SoundPool soundPool;
    private int sound_c4, sound_d4, sound_e4, sound_f4, sound_g4, sound_a4, sound_b4, sound_c5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.piano);

        c4 = (Button) findViewById(R.id.c4);
        d4 = (Button) findViewById(R.id.d4);
        e4 = (Button) findViewById(R.id.e4);
        f4 = (Button) findViewById(R.id.f4);
        g4 = (Button) findViewById(R.id.g4);
        a4 = (Button) findViewById(R.id.a4);
        b4 = (Button) findViewById(R.id.b4);
        c5 = (Button) findViewById(R.id.c5);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            soundPool = new SoundPool.Builder().setMaxStreams(5).build();
        } else {
            soundPool = new SoundPool(5, AudioManager.STREAM_MUSIC, 0);
        }

        sound_c4 = soundPool.load(this, R.raw.c4 , 1);
        sound_d4 = soundPool.load(this, R.raw.d4 , 1);
        sound_e4 = soundPool.load(this, R.raw.e4 , 1);
        sound_f4 = soundPool.load(this, R.raw.f4 , 1);
        sound_g4 = soundPool.load(this, R.raw.g4 , 1);
        sound_a4 = soundPool.load(this, R.raw.a4,  1);
        sound_b4 = soundPool.load(this, R.raw.b4 , 1);
        sound_c5 = soundPool.load(this, R.raw.c5 , 1);


        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(sound_c4, 1, 1, 0, 0, 1);
            }
        });

        d4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(sound_d4, 1, 1, 0, 0, 1);

            }
        });

        e4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(sound_e4, 1, 1, 0, 0, 1);

            }
        });

        f4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(sound_f4, 1, 1, 0, 0, 1);

            }
        });

        g4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(sound_g4, 1, 1, 0, 0, 1);

            }
        });

        a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(sound_a4, 1, 1, 0, 0, 1);

            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(sound_b4, 1, 1, 0, 0, 1);

            }
        });

        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(sound_c5, 1, 1, 0, 0, 1);

            }
        });


    }

}
