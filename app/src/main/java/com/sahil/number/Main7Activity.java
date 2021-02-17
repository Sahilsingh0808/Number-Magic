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
import android.widget.Button;
import android.widget.Toast;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class Main7Activity extends AppCompatActivity {
    int n=0,a=1;
    ImageView imageview3,imageview14,imageview15,imageview16,imageview17,imageview18,imageview19,imageview20;
    Button button1,button2;
    TextView textView9;
    MediaPlayer mediaPlayer;
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
        setContentView(R.layout.activity_main7);
        imageview3=(ImageView)findViewById(R.id.imageView3);
        imageview14=(ImageView)findViewById(R.id.imageView14);
        imageview15=(ImageView)findViewById(R.id.imageView15);
        imageview16=(ImageView)findViewById(R.id.imageView16);
        imageview17=(ImageView)findViewById(R.id.imageView17);
        imageview18=(ImageView)findViewById(R.id.imageView18);
        imageview19=(ImageView)findViewById(R.id.imageView19);
        imageview20=(ImageView)findViewById(R.id.imageView20);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
         textView9=(TextView)findViewById(R.id.textView9);




    }
long backPressesTime;






    public void yes(View view) {
       switch(a)
       {
           case 1:
               n = n + 2;
               a =2;
               imageview14.setImageAlpha(0);
               imageview3.setImageResource(R.drawable.boythree);
               imageview15.setImageResource(R.drawable.twopic);
               textView9.setText("2. Does your number appear here?");
               break;
           case 2:
               n=n+4;
               a=3;
                imageview15.setImageAlpha(0);
               imageview3.setImageResource(R.drawable.girl2);
               imageview16.setImageResource(R.drawable.thirdpic);
               textView9.setText("3. Does your number appear here?");
               break;
           case 3:
               n=n+1;
               a=4;
               imageview16.setImageAlpha(0);
               imageview3.setImageResource(R.drawable.boytwo);
               imageview17.setImageResource(R.drawable.fourpic);
               textView9.setText("4. Does your number appear here?");
               break;
           case 4:
               n=n+16;
               a=5;
               imageview17.setImageAlpha(0);
               imageview3.setImageResource(R.drawable.girl5);
               imageview18.setImageResource(R.drawable.fivepic);
               textView9.setText("5. Does your number appear here?");
               break;
           case 5:
               n=n+8;
               a=6;
               imageview18.setImageAlpha(0);
               imageview3.setImageResource(R.drawable.boyone);
               imageview19.setImageResource(R.drawable.sixthpic);
               textView9.setText("6. Does your number appear here?");
               break;
           case 6:
               n=n+32;
               a=7;
               imageview19.setImageAlpha(0);
               imageview3.setImageResource(R.drawable.girl4);
               imageview20.setImageResource(R.drawable.seventhpic);
               textView9.setText("7. Does your number appear here?");
               break;
           case 7:
               n=n+64;
               next();
               break;
           default:
               break;

       }
    }

    public void no(View view) {
       switch(a) {
           case 1:
                n=n;
               a = 2;
               imageview14.setImageAlpha(0);
               imageview3.setImageResource(R.drawable.boythree);
               imageview15.setImageResource(R.drawable.twopic);
               textView9.setText("2. Does your number appear here?");
               break;
           case 2:
                n=n;
               a=3;
               imageview15.setImageAlpha(0);
               imageview3.setImageResource(R.drawable.girl2);
               imageview16.setImageResource(R.drawable.thirdpic);
               textView9.setText("3. Does your number appear here?");
               break;
           case 3:
                n=n;
               a=4;
               imageview16.setImageAlpha(0);
               imageview3.setImageResource(R.drawable.boytwo);
               imageview17.setImageResource(R.drawable.fourpic);
               textView9.setText("4. Does your number appear here?");
               break;
           case 4:
                n=n;
               a=5;
               imageview17.setImageAlpha(0);
               imageview3.setImageResource(R.drawable.girl5);
               imageview18.setImageResource(R.drawable.fivepic);
               textView9.setText("5. Does your number appear here?");
               break;
           case 5:
                n=n;
               a=6;
               imageview18.setImageAlpha(0);
               imageview3.setImageResource(R.drawable.boyone);
               imageview19.setImageResource(R.drawable.sixthpic);
               textView9.setText("6. Does your number appear here?");
               break;
           case 6:
                n=n;
               a=7;
               imageview19.setImageAlpha(0);
               imageview3.setImageResource(R.drawable.girl4);
               imageview20.setImageResource(R.drawable.seventhpic);
               textView9.setText("7. Does your number appear here?");
               break;
           case 7:
                n=n;
               next();

               break;
           default:
               break;


       }

       }



    public void next()
    {

        Intent intent =new Intent(Main7Activity.this,Main21Activity.class);
        intent.putExtra("num",n);


        startActivity(intent);
        finish();

    }
}
