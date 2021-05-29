package com.fullscreen.fullscreengesturevideoplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class MainActivity2 extends AppCompatActivity {

    private YouTubePlayerView youTubePlayerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        youTubePlayerView = findViewById(R.id.activity_main_youtubePlayer);
        getLifecycle().addObserver(youTubePlayerView);

    }
}