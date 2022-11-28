package com.yosha10.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this, MainActivity.class)); // Mengarahkan ke Main Activity
                finish();
            }
        }, 2000); // Untuk mendelay sebentar sebelum lanjut ke halaman berikutnya
                           // Memiliki 2 parameter yaitu Runnable dan Waktu delay
    }
}