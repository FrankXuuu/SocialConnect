package com.example.frankxu.socialconnect.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.example.frankxu.socialconnect.R;

/**
 * Created by frankxu on 2018-09-09.
 */

public class TumblrDialogFragment extends DialogFragment {
    private WebView myWebView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dialog_tumblr, container, false);

        myWebView = view.findViewById(R.id.webview);
        myWebView.loadUrl("https://www.tumblr.com/login");

        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }
}
