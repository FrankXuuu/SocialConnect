package com.example.frankxu.socialconnect.view;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.example.frankxu.socialconnect.R;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.journeyapps.barcodescanner.BarcodeEncoder;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    public static String fb;
    public static String insta;
    public static String tumblr;
    public static String github;
    public static String linkedin;
    public static String snap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainActivity.fb = "frankxuuu";
        MainActivity.insta = "frankxuuu";
        MainActivity.tumblr = "rahmifications";
        MainActivity.linkedin =  "frankxuuu";
        MainActivity.github = "frank-xu-3669a0156";
        MainActivity.snap = "frankxuu";

        createQR(); //"frankxuuu", "frankxuuu", "rahmifications", "frankxuuu", "frank-xu-3669a0156");

        View connectBtn = findViewById(R.id.connect_btn);
        connectBtn.setOnClickListener(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        createQR();
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.connect_btn:
                Intent intentConnection = new Intent(this, ConnectionsActivity.class);
                startActivity(intentConnection);
                break;
        }
    }

    public void createQR() {
        ImageView qrHolder = findViewById(R.id.qr_holder);

        String url="https://saioduri.github.io/SocialConnect/index.html?" +
                ((!MainActivity.fb.equals("")) ? ("facebook=" + MainActivity.fb) : "") +
                ((!MainActivity.insta.equals("")) ? ("&instagram=" + MainActivity.insta) : "") +
                ((!MainActivity.tumblr.equals("")) ? ("&tumblr=" + MainActivity.tumblr) : "") +
                ((!MainActivity.github.equals("")) ? ("&github=" + MainActivity.github) : "") +
                ((!MainActivity.linkedin.equals("")) ? ("&linkedin=" + MainActivity.linkedin) : "") +
                ((!MainActivity.snap.equals("")) ? ("&snapchat=" + MainActivity.snap) : ""); // Whatever you need to encode in the QR code

        MultiFormatWriter multiFormatWriter = new MultiFormatWriter();
        try {
            BitMatrix bitMatrix = multiFormatWriter.encode(url, BarcodeFormat.QR_CODE,
                    300,300);
            BarcodeEncoder barcodeEncoder = new BarcodeEncoder();
            Bitmap bitmap = barcodeEncoder.createBitmap(bitMatrix);
            qrHolder.setImageBitmap(bitmap);
        } catch (WriterException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
