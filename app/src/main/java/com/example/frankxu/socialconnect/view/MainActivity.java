package com.example.frankxu.socialconnect.view;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.frankxu.socialconnect.R;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.journeyapps.barcodescanner.BarcodeEncoder;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View connectBtn = findViewById(R.id.connect_btn);
        connectBtn.setOnClickListener(this);

        ImageView qrHolder = findViewById(R.id.qr_holder);

        String url="https://saioduri.github.io/SocialConnect/index.html?" +
                "facebook=frankxu5&" +
                "instagram=frankxuu&" +
                "tumblr=rahmifications&" +
                "github=frankxuuu&" +
                "linkedin=frank-xu-3669a0156"; // Whatever you need to encode in the QR code
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
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.connect_btn:
                Intent intentConnection = new Intent(this, ConnectionsActivity.class);
                startActivity(intentConnection);
                break;
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
