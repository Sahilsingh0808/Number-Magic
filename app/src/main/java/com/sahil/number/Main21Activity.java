package com.sahil.number;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import java.util.Timer;
import java.util.TimerTask;

public class Main21Activity extends AppCompatActivity {
Timer timer;
MediaPlayer mediaPlayer;
int n2=0;
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

        setContentView(R.layout.activity_main21);

        n2=getIntent().getIntExtra("num",n2);
        if(n2>=0&&n2<=100) {
            mediaPlayer = MediaPlayer.create(this, R.raw.load);
            mediaPlayer.start();
        }
        timer=new Timer();
        if(n2<100) {
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    Intent intent = new Intent(Main21Activity.this, Main17Activity.class);
                    intent.putExtra("num", n2);
                    startActivity(intent);
                    finish();
                }
            }, 5500);
        }
        else {
            Intent intent = new Intent(Main21Activity.this, Main17Activity.class);
            intent.putExtra("num", n2);
            startActivity(intent);
            finish();

        }

    }



}
