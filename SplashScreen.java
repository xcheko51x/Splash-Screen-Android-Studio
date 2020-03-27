package com.xcheko51x.fallasapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class SplashScreen extends AppCompatActivity {

    int DURACION_PANTALLA = 3000;
    ImageView ivSplashScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        ivSplashScreen = findViewById(R.id.ivSplashScreen);

        Glide.with(this).load(R.drawable.dispositivos).centerCrop().into(ivSplashScreen);

        cambiarPantalla();
    }

    public void cambiarPantalla() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this, PantallaDos.class);
                startActivity(intent);
            }
        }, DURACION_PANTALLA);
    }
}
