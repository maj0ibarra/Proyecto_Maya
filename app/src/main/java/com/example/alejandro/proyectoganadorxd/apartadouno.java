package com.example.alejandro.proyectoganadorxd;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class apartadouno extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apartadouno);

        WebView webView = (WebView)
                findViewById(R.id.webview);
        webView.loadUrl("https://www.youtube.com/watch?v=vCEYRKDCs-k");
finish();

    }
    }
