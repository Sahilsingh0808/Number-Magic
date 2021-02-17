package com.sahil.number;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

import android.os.Bundle;
import android.widget.TextView;



public class Main9Activity extends AppCompatActivity {
    Timer timer,timer1;
    TextView textView;
    ImageView imageView4;
    ImageView imageView5;
    MediaPlayer mediaPlayer;

    public Main9Activity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View decorView=getWindow().getDecorView();
        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.KITKAT) {
            decorView.setSystemUiVisibility(
                    View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                            |
                            View.SYSTEM_UI_FLAG_HIDE_NAVIGATION|
                            View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY

            );


        }

        setContentView(R.layout.activity_main9);
        mediaPlayer = MediaPlayer.create(this, R.raw.songl);
        imageView4=(ImageView)findViewById(R.id.imageView4);
        imageView5=(ImageView)findViewById(R.id.imageView5);
        mediaPlayer.start();
        imageView4.animate().alpha(1f).scaleY(1f).scaleX(1f).rotationBy(345f).setDuration(3000);
        imageView5.animate().alpha(1f).scaleY(1f).scaleX(1f).rotationBy(375f).setDuration(3000);

        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(Main9Activity.this, Main3Activity.class);


                startActivity(intent);

                finish();
            }
        }, 5800);


    }
}
