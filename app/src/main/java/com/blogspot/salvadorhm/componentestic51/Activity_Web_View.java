package com.blogspot.salvadorhm.componentestic51;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Activity_Web_View extends AppCompatActivity {
    private WebView miWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__web__view);
        miWebView = findViewById(R.id.webviewl);
        miWebView.getSettings().setJavaScriptEnabled(true);
        miWebView.setWebViewClient(new WebViewClient());
        miWebView.loadUrl("https://developer.android.com/guide/webapps/webview");
    }
}
