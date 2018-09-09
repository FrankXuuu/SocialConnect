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


    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch(view.getId()) {
            case R.id.snapchat_btn:
                DialogFragment dialogFragment = new SnapchatDialogFragment();
                dialogFragment.show(getSupportFragmentManager(), "ayy");
                break;
            case R.id.tumblr_btn:
                intent = new Intent(this, TumblrActivity.class);
                startActivity(intent);
                break;
            case R.id.facebook_btn:
                intent = new Intent(this, TumblrActivity.class);
                startActivity(intent);
                break;
            case R.id.instagram_btn:
                intent = new Intent(this, TumblrActivity.class);
                startActivity(intent);
                break;
            case R.id.myspace_btn:
                intent = new Intent(this, TumblrActivity.class);
                startActivity(intent);
                break;
        }
    }

    @Override
    public void onBackPressed() { super.onBackPressed(); }

}
