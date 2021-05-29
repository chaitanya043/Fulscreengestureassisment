package com.fullscreen.fullscreengesturevideoplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        WebView mywebview = (WebView) findViewById(R.id.webView);
        mywebview.loadUrl("https://www.youtube.com/channel/UCh0VS_eRA47RO7saJQdo7ZA");


    }
}