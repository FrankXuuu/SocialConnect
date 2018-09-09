package com.example.frankxu.socialconnect.view;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.webkit.WebView;

import com.example.frankxu.socialconnect.R;

/**
 * Created by frankxu on 2018-09-09.
 */

public class FacebookActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_dialog_tumblr);

        WebView myWebView = findViewById(R.id.webview);
        myWebView.loadUrl("https://www.facebook.com/");
    }
}
