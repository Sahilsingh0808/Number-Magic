package com.sahil.number;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.Image;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class Main17Activity extends AppCompatActivity {

    int n1=0;
    TextView textView11,textView14;
    ImageView gif,gif1,gif2,gif3,gif4,gif5,gif6,gif7;
    Timer timer;
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
        setContentView(R.layout.activity_main17);
        n1=getIntent().getIntExtra("num",n1);

        textView11=(TextView)findViewById(R.id.textView11);
        textView14=(TextView)findViewById(R.id.textView14);
        gif=(ImageView)findViewById(R.id.gifImageView) ;
        gif1=(ImageView)findViewById(R.id.gifImageView1) ;
        gif2=(ImageView)findViewById(R.id.gifImageView2) ;
        gif3=(ImageView)findViewById(R.id.gifImageView3) ;
        gif4=(ImageView)findViewById(R.id.gifImageView4) ;
        gif5=(ImageView)findViewById(R.id.gifImageView5) ;
        gif6=(ImageView)findViewById(R.id.gifImageView6);
        gif7=(ImageView)findViewById(R.id.gifImageView7);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        MediaPlayer mediaPlayer;
        if(n1>=0&&n1<100) {
            String patri = "android.resource://" + getPackageName() + "/" + R.drawable.thanksfor;
            Uri uri0 = Uri.parse(patri);
            gif7.setImageURI(uri0);
            mediaPlayer=MediaPlayer.create(this,R.raw.tada);
            mediaPlayer.start();
        }
        if(n1>0&&n1<100)
            textView11.setText("Your number is " + n1);

        else if(n1==0)
            textView11.setText("Your number is 100");


        else {
            textView14.setText("You did some mistake!");
            mediaPlayer = MediaPlayer.create(this, R.raw.sad);
            mediaPlayer.start();
        }
        String a="patt";
        String pat="";

        if(n1>=0&&n1<100)
        {

            if(n1>0&&n1<10)
            {
               gif(gif,n1);
            }
            else if(n1==0)
            {
                gif(gif3,1);
                gif(gif4,0);
                gif(gif5,0);
            }
            else{
                int x=n1/10;
                int y=n1-(x*10);
                gif(gif1,x);
                gif(gif2,y);
            }
        }
        else
        {
            String patr="android.resource://"+getPackageName()+"/"+R.drawable.error;
            Uri uri= Uri.parse(patr);
            gif6.setImageURI(uri);

        }

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
                  exit();


            }
        })
                .setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(),"Lets play again",Toast.LENGTH_SHORT).show();
                    }
                });
        builder.create().show();
    }

    public void playagain(View view) {
        Intent intent1=new Intent(Main17Activity.this,Main3Activity.class);
        startActivity(intent1);
    }
    public void exit()
    {

        finishAffinity();
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

    public void setting(View view) {
        Intent intent3=new Intent(Main17Activity.this,Main19Activity.class);
        startActivity(intent3);
    }
    public void gif(ImageView imageView,int a)
    {
        String pat="";
        switch(a)
        {
            case 0:
                pat="android.resource://"+getPackageName()+"/"+R.drawable.zero;
                Uri uri0= Uri.parse(pat);
                imageView.setImageURI(uri0);
                break;
            case 1:
                pat="android.resource://"+getPackageName()+"/"+R.drawable.animeone;
                Uri uri= Uri.parse(pat);
                imageView.setImageURI(uri);
                break;
            case 2:
                pat="android.resource://"+getPackageName()+"/"+R.drawable.animetwo;
                Uri uri1= Uri.parse(pat);
                imageView.setImageURI(uri1);
                break;
            case 3:
                pat="android.resource://"+getPackageName()+"/"+R.drawable.animethree;
                Uri uri2= Uri.parse(pat);
                imageView.setImageURI(uri2);
                break;
            case 4:
                pat="android.resource://"+getPackageName()+"/"+R.drawable.animefour;
                Uri uri3= Uri.parse(pat);
                imageView.setImageURI(uri3);
                break;
            case 5:
                pat="android.resource://"+getPackageName()+"/"+R.drawable.animefive;
                Uri uri4= Uri.parse(pat);
                imageView.setImageURI(uri4);
                break;
            case 6:
                pat="android.resource://"+getPackageName()+"/"+R.drawable.animesix;
                Uri uri5= Uri.parse(pat);
                imageView.setImageURI(uri5);
                break;
            case 7:
                pat="android.resource://"+getPackageName()+"/"+R.drawable.animeseven;
                Uri uri6= Uri.parse(pat);
                imageView.setImageURI(uri6);
                break;
            case 8:
                pat="android.resource://"+getPackageName()+"/"+R.drawable.animeight;
                Uri uri7= Uri.parse(pat);
                imageView.setImageURI(uri7);
                break;
            case 9:
                pat="android.resource://"+getPackageName()+"/"+R.drawable.nineanime;
                Uri uri8= Uri.parse(pat);
                imageView.setImageURI(uri8);
                break;

        }



    }

}
