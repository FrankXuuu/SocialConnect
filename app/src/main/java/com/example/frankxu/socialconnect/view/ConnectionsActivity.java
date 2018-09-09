package com.example.frankxu.socialconnect.view;


import android.accounts.AccountManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.frankxu.socialconnect.R;
import com.example.frankxu.socialconnect.service.SocialConnectClient;
import com.example.frankxu.socialconnect.service.SocialConnectServiceGenerator;

public class ConnectionsActivity extends AppCompatActivity implements View.OnClickListener{
    private View facebookInp;
    private View instagramInp;
    private View tumblrInp;
    private View githubInp;
    private View linkedinInp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connections);

        View facebookBtn = findViewById(R.id.facebook_btn);
        facebookBtn.setOnClickListener(this);

        View instagramBtn = findViewById(R.id.instagram_btn);
        instagramBtn.setOnClickListener(this);

        View snapchatBtn = findViewById(R.id.snapchat_btn);
        snapchatBtn.setOnClickListener(this);

        View tumblrBtn = findViewById(R.id.tumblr_btn);
        tumblrBtn.setOnClickListener(this);

        View myspaceBtn = findViewById(R.id.myspace_btn);
        myspaceBtn.setOnClickListener(this);

        facebookInp = findViewById(R.id.facebook_input);
        instagramInp = findViewById(R.id.instagram_input);
        tumblrInp = findViewById(R.id.tumblr_input);
        githubInp = findViewById(R.id.github_input);
        linkedinInp = findViewById(R.id.linkedin_input);

    }

    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.snapchat_btn:
                if (githubInp.getVisibility() == View.GONE) {
                    githubInp.setVisibility(View.VISIBLE);
                } else {
                    githubInp.setVisibility(View.GONE);
                }
                break;
            case R.id.tumblr_btn:
                if (tumblrInp.getVisibility() == View.GONE) {
                    tumblrInp.setVisibility(View.VISIBLE);
                } else {
                    tumblrInp.setVisibility(View.GONE);
                }
                break;
            case R.id.facebook_btn:
                if (facebookInp.getVisibility() == View.GONE) {
                    facebookInp.setVisibility(View.VISIBLE);
                } else {
                    facebookInp.setVisibility(View.GONE);
                }
                break;
            case R.id.instagram_btn:
                if (instagramInp.getVisibility() == View.GONE) {
                    instagramInp.setVisibility(View.VISIBLE);
                } else {
                    instagramInp.setVisibility(View.GONE);
                }
                break;
            case R.id.myspace_btn:
                if (linkedinInp.getVisibility() == View.GONE) {
                    linkedinInp.setVisibility(View.VISIBLE);
                } else {
                    linkedinInp.setVisibility(View.GONE);
                }
                break;
        }
    }

    @Override
    public void onBackPressed() { super.onBackPressed(); }

}
