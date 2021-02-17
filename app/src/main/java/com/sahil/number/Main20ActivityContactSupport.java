package com.sahil.number;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import android.content.ClipboardManager;


public class Main20ActivityContactSupport extends AppCompatActivity {
    private int storage=1;

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
        setContentView(R.layout.activity_main20_contact_support);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    public void mail(View view) {

        try {
            Intent intent2 = new Intent(Intent.ACTION_VIEW
                    , Uri.parse("mailto:stash.help@gmail.com"));
            startActivity(intent2);
        }
        catch (Exception e) {
            Toast.makeText(this,"Please install Gmail app.",Toast.LENGTH_SHORT).show();
        }



           }

    public void youtube(View view) {
//        Toast.makeText(this, "Coming soon", Toast.LENGTH_SHORT).show();
        Intent intent=null;
        try {
            intent =new Intent(Intent.ACTION_VIEW);
            intent.setPackage("com.google.android.youtube");
            intent.setData(Uri.parse("https://www.youtube.com/channel/UCE3Vii6wflX9PNV0fy81VBg/featured?view_as=subscriber"));
            Toast.makeText(this, "Please subscribe our channel.", Toast.LENGTH_SHORT).show();
            startActivity(intent);
        } catch (Exception e) {
            startActivity(new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.youtube.com/channel/UCE3Vii6wflX9PNV0fy81VBg/featured?view_as=subscriber\"")));
        }

    }

    public void call(View view) {
//        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:9874082672"));
//
//
//        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
//            if(ActivityCompat.shouldShowRequestPermissionRationale(this,Manifest.permission.CALL_PHONE)){
//                new AlertDialog.Builder(this)
//                .setTitle("Permission Needed")
//                        .setMessage("This permission is needed to call the developer")
//                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
//                            @Override
//                            public void onClick(DialogInterface dialog, int which) {
//                                ActivityCompat.requestPermissions(Main20ActivityContactSupport.this, new String[]{Manifest.permission.CALL_PHONE},storage);
//
//                            }
//                        })
//                .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//                        dialog.dismiss();
//                    }
//                })
//                        .create().show();
//            }
//            else
//                ActivityCompat.requestPermissions(Main20ActivityContactSupport.this,new String[]{Manifest.permission.CALL_PHONE},storage);
//            // TODO: Consider calling
//            //    ActivityCompat#requestPermissions
//            // here to request the missing permissions, and then overriding
//            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
//            //                                          int[] grantResults)
//            // to handle the case where the user grants the permission. See the documentation
//            // for ActivityCompat#requestPermissions for more details.
//            return;
//        }
//
//        startActivity(intent);
        Uri uri = Uri.parse("https://www.instagram.com/sahil.void/");
        Intent likeIng = new Intent(Intent.ACTION_VIEW, uri);

        likeIng.setPackage("com.instagram.android");

        try {
            startActivity(likeIng);
        } catch (ActivityNotFoundException e) {
            startActivity(new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.instagram.com/sahil.void/")));
        }
    }






}
