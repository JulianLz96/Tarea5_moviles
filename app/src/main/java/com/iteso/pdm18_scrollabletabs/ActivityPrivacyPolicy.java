package com.iteso.pdm18_scrollabletabs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityPrivacyPolicy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privacy_policy);
        WebView mWebView = null;
            mWebView = findViewById(R.id.activity_privacy_policy_webView);

        mWebView.loadUrl("file:///android_asset/PrivacyPolicy.html");
    }
}
