package com.example.translinkhomepage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    String[] Journeys = {
      "Derry",
      "Belfast",
      "Coleraine",
      "Larne",
      "portadown"

    };
    Button firstButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,Journeys);
        AutoCompleteTextView textView = (AutoCompleteTextView)findViewById(R.id.autoCompleteEditText);

        AutoCompleteTextView textView1 = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView2);
        textView.setThreshold(2);
        textView1.setThreshold(2);
        textView.setAdapter(adapter);
        textView1.setAdapter(adapter);

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
