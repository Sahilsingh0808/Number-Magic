package com.sahil.number;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

public class Main3Activity extends AppCompatActivity {
    ImageView imageView2;
    TextView textview5,textview4,textview6;
    Timer timer,timer1,timer2;


long backPressesTime;

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
        setContentView(R.layout.activity_main3);




    }



    @Override
    public void onBackPressed() {

        if(backPressesTime+2000>System.currentTimeMillis())
        {

            super.onBackPressed();

            return;
        }
        else
        {
            Toast.makeText(getBaseContext(),"Press back again to exit",Toast.LENGTH_SHORT).show();
        }

        backPressesTime=System.currentTimeMillis();
    }





    public void func9(View view) {
        Intent intent = new Intent(Main3Activity.this, Main7Activity.class);
        startActivity(intent);
    }


}





