package com.desafiolatam.desafio_01_01_login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ImageView imageView_Home_Logo = findViewById(R.id.imageView_Home_Logo);

        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/6/66/Android_robot.png").into(imageView_Home_Logo);
    }
}
