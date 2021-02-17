package com.sahil.number;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.provider.Settings;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class Main20ActivityTroubleshoot extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View decorView=getWindow().getDecorView();
        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.KITKAT) {
            decorView.setSystemUiVisibility(
                   View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                            |
                            View.SYSTEM_UI_FLAG_HIDE_NAVIGATION

                           |
                           View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
            );


        }
        setContentView(R.layout.activity_main20_troubleshoot);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    public void con(View view) {
        Intent intent=new Intent(Main20ActivityTroubleshoot.this,Main20ActivityContactSupport.class);
        startActivity(intent);
    }



    public void cache(View view) {
        Intent intent=new Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
        intent.setData(Uri.parse("package:"+getPackageName()));
        startActivity(intent);

    }
}
