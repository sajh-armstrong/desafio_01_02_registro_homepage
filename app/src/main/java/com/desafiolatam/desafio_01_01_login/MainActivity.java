package com.desafiolatam.desafio_01_01_login;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView image01 = findViewById(R.id.image01);

        Picasso.get()
                .load("https://desafiolatam.com/assets/seo/desafiolatam_principal-031aadc574e79866fac011f0e4dae20b0d891d220e593b203b39568a495b894c.jpg")
                .into(image01);

        Button button_Login = findViewById(R.id.button_Login);

        button_Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, R.string.toast_login, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
