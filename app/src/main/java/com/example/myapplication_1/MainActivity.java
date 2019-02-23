package com.example.myapplication_1;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.LightingColorFilter;
import android.icu.text.RelativeDateTimeFormatter;
import android.net.Uri;
import android.support.customtabs.CustomTabsIntent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static android.graphics.Color.GREEN;
import static android.hardware.camera2.params.RggbChannelVector.BLUE;
import static android.hardware.camera2.params.RggbChannelVector.GREEN_ODD;
import static android.hardware.camera2.params.RggbChannelVector.RED;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void launchtabs(View view){
        //Url to be visited
        String url = "http://61.0.174.125/iOPAC/";

        //Declaration
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
        CustomTabsIntent customTabsIntent = builder.build();

        //Tab colour
        builder.setToolbarColor(Color.BLUE);//replace with any colour

        //Animation
        builder.setStartAnimations(this, android.R.anim.slide_out_right, android.R.anim.slide_in_left);
        builder.setExitAnimations(this, android.R.anim.slide_in_left,
                android.R.anim.slide_out_right);

        //Show page title
        builder.setShowTitle(true);





        Bitmap backButton = BitmapFactory.decodeResource(getResources(), R.drawable.ic_back);
        builder.setCloseButtonIcon(backButton);



        //Launching the custom tabs
        builder.build().launchUrl(this, Uri.parse("http://61.0.174.125/iOPAC/"));


    }

}
