package com.example.translinkhomepage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button firstButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView FirstImage = (ImageView) findViewById(R.id.FirstImage);
        int imageResource = getResources().getIdentifier("@drawable/translink",null,this.getPackageName());
        FirstImage.setImageResource(imageResource);
        firstButton = findViewById(R.id.BtnToSecond);
        firstButton.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NextActivity.class);
                startActivity(intent);

            }
        });

    }
}
