package com.sahil.number;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.provider.Settings;
import android.view.View;
import android.webkit.WebView;
import android.widget.Toast;

public class Main19Activity extends AppCompatActivity {

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
        setContentView(R.layout.activity_main19);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    public void back(View view) {
        finish();
    }

    public void playagain(View view) {
        Intent intent1=new Intent(Main19Activity.this,Main3Activity.class);
        startActivity(intent1);
    }

    public void quit(View view) {

        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setCancelable(false);
        builder.setTitle("CONFIRM EXIT");
        builder.setMessage("Are your sure you want to Quit?");
        builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {


                Toast.makeText(getApplicationContext(),"We will be happy to see you again",Toast.LENGTH_SHORT).show();
                finishAffinity();


            }
        })
                .setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        builder.create().show();
    }

    public void support(View view) {
        Intent intent5=new Intent(Main19Activity.this,Main20ActivityContactSupport.class);
        startActivity(intent5);
    }

    public void trouble(View view) {
        Intent intent6=new Intent(Main19Activity.this,Main20ActivityTroubleshoot.class);
        startActivity(intent6);
    }

    public void about(View view) {
        Intent intent7=new Intent(Main19Activity.this,Main20ActivityPrivacyPolicy.class);
        startActivity(intent7);
    }

    public void notify(View view) {

        Toast.makeText(this,"This version delivers no notification",Toast.LENGTH_LONG).show();
        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.Q) {
            Intent intent=new Intent(Settings.ACTION_APP_NOTIFICATION_BUBBLE_SETTINGS);
            intent.putExtra(Settings.EXTRA_APP_PACKAGE,getPackageName());
            startActivity(intent);
        }
        else
        {
            Intent intent=new Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
            intent.setData(Uri.parse("package:"+getPackageName()));
            startActivity(intent);
        }

    }

    public void rate(View view) {

        launchMarket();

    }
    public void launchMarket()
    {
        Uri uri = Uri.parse("market://details?id=" + getPackageName());
        Intent myAppLinkToMarket = new Intent(Intent.ACTION_VIEW, uri);
        try {
            startActivity(myAppLinkToMarket);
        } catch (ActivityNotFoundException e) {
            Toast.makeText(this, " unable to find market app", Toast.LENGTH_LONG).show();
        }

    }
    public void share(View view) {
        try {
            Intent intent8 = new Intent(Intent.ACTION_SEND);
            intent8.setType("text/plain");
            intent8.putExtra(Intent.EXTRA_TEXT, "Hey, this is a wonderful app. It guesses the number you think. Yes I am serious! Try the app yourself.\nAndroid Download Link: https://play.google.com/store/apps/details?id=com.sahil.number");
            startActivity(intent8);

        } catch (Exception e) {
            startActivity(new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://play.google.com/store/apps/details?id=com.sahil.number")));
        }
    }





}

