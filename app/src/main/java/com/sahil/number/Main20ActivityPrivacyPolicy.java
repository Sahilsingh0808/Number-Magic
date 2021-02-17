package com.sahil.number;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class Main20ActivityPrivacyPolicy extends AppCompatActivity {

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
        setContentView(R.layout.activity_main20_privacy_policy);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }



    public void policy(View view) {
       new AlertDialog.Builder(this)
                .setTitle("Privacy Policy")
                .setMessage("Number Magic considers privacy to be of the upmost importance, " +
                        "which is why we would never invade it. We do not collect or use any of your data in our services." )
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                }) .create().show();
    }

    public void disc(View view) {
        new AlertDialog.Builder(this)
                .setTitle("Disclaimer")
                .setMessage("Pictures and captions in this app do not reflect the opinions of the developer. Make sure to read our Privacy Policy")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .create().show();

    }



}
