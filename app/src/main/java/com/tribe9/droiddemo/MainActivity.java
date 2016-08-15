package com.tribe9.droiddemo;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonMenu();
        playmusic();
    }

    // Button Control block, sets up onClick listeners for every button
    private void buttonMenu() {

        // P1 Button onClick Listener, Popular Movies
        Button p1Button = (Button) findViewById(R.id.p1Button);
        p1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //String message1 = R.string.p1Launch;
                Toast toast = Toast.makeText(getApplicationContext(), R.string.p1Launch, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        // P2 Button onClick Listener, Stock Hawk
        Button p2Button = (Button) findViewById(R.id.p2Button);
        p2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(), R.string.p2Launch, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        // P3 Button onClick Listener, Build it Bigger
        Button p3Button = (Button) findViewById(R.id.p3Button);
        p3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(), R.string.p3Launch, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        // P4 Button onClick Listener, Make your App Material
        Button p4Button = (Button) findViewById(R.id.p4Button);
        p4Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(), R.string.p4Launch, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        // P5 Button onClick Listener, Go Ubiquitous
        Button p5Button = (Button) findViewById(R.id.p5Button);
        p5Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(), R.string.p5Launch, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        // P6 Button onClick Listener, Capstone
        Button p6Button = (Button) findViewById(R.id.p6Button);
        p6Button.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(), R.string.p6Launch, Toast.LENGTH_SHORT);
                toast.show();
            }
        });


    }

    // Background Music

    private void playmusic() {

        mediaPlayer = MediaPlayer.create(this, R.raw.aggraintro);
        mediaPlayer.setLooping(true);
        mediaPlayer.setVolume(80, 80);
        mediaPlayer.start();
    }

    // Stops Music if app is closed / paused
    @Override
    protected void onPause() {
        super.onPause();
        mediaPlayer.pause();
    }

    // Resumes Music loop if app is resumed
    @Override
    protected void onResume() {
        super.onResume();
        mediaPlayer.start();
    }

    // Release music player on App Destruction
    @Override
    protected void onDestroy() {
        super.onDestroy();
        mediaPlayer.release();
    }

}
