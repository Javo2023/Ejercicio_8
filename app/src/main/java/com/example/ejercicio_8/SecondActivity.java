package com.example.ejercicio_8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        Button goToUrlButton = findViewById(R.id.goToUrl);
        goToUrlButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent implicitIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://kotlindoc.blogspot.com/2019/10/android-log-con-timber.html"));
                startActivity(implicitIntent);
            }
        });
        Button backButton = findViewById(R.id.back);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              onBackPressed();
            }
        });
    }
}