package com.ilyastoliar.bsbutton;

import java.util.Random;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

import com.startapp.android.publish.adsCommon.StartAppSDK;

public class MainActivity extends Activity {

    ImageButton BSB;
    Random rand = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        StartAppSDK.init(this, "204201668", true);
        setContentView(R.layout.activity_main);

        BSB = (ImageButton) findViewById(R.id.BSB);
        final MediaPlayer mp1 = MediaPlayer.create(this, R.raw.bullshit1);
        final MediaPlayer mp2 = MediaPlayer.create(this, R.raw.bullshit2);
        final MediaPlayer mp3 = MediaPlayer.create(this, R.raw.bullshit3);
        final MediaPlayer mp4 = MediaPlayer.create(this, R.raw.bullshit4);
        final MediaPlayer mp5 = MediaPlayer.create(this, R.raw.bullshit5);
        final MediaPlayer mp6 = MediaPlayer.create(this, R.raw.bullshit6);

        BSB.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                int n = rand.nextInt(6) + 1;
                if (n == 1) mp1.start();
                if (n == 2) mp2.start();
                if (n == 3) mp3.start();
                if (n == 4) mp4.start();
                if (n == 5) mp5.start();
                if (n == 6) mp6.start();
            }

        });

    }

}
