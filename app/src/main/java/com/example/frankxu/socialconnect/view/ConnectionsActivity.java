package com.example.frankxu.socialconnect.view;


import android.accounts.AccountManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.example.frankxu.socialconnect.R;
import com.example.frankxu.socialconnect.service.SocialConnectClient;
import com.example.frankxu.socialconnect.service.SocialConnectServiceGenerator;

public class ConnectionsActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText facebookInp;
    private EditText instagramInp;
    private EditText tumblrInp;
    private EditText githubInp;
    private EditText linkedinInp;
    private EditText snapInp;

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

        View snapBtn = findViewById(R.id.snap_btn);
        snapBtn.setOnClickListener(this);

        facebookInp = findViewById(R.id.facebook_input);
        instagramInp = findViewById(R.id.instagram_input);
        tumblrInp = findViewById(R.id.tumblr_input);
        githubInp = findViewById(R.id.github_input);
        linkedinInp = findViewById(R.id.linkedin_input);
        snapInp = findViewById(R.id.snap_input);

        facebookInp.setText(MainActivity.fb);
        instagramInp.setText(MainActivity.insta);
        tumblrInp.setText(MainActivity.tumblr);
        githubInp.setText(MainActivity.github);
        linkedinInp.setText(MainActivity.linkedin);
        snapInp.setText(MainActivity.snap);
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
            case R.id.snap_btn:
                if (snapInp.getVisibility() == View.GONE) {
                    snapInp.setVisibility(View.VISIBLE);
                } else {
                    snapInp.setVisibility(View.GONE);
                }
                break;
        }
    }

    @Override
    public void onBackPressed() {
        MainActivity.fb = facebookInp.getText().toString();
        MainActivity.insta = instagramInp.getText().toString();
        MainActivity.tumblr = tumblrInp.getText().toString();
        MainActivity.linkedin =  linkedinInp.getText().toString();
        MainActivity.github = githubInp.getText().toString();
        MainActivity.snap = snapInp.getText().toString();

        super.onBackPressed();
    }

}
