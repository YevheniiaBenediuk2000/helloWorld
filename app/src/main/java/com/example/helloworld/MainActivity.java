package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView tvHelloWorld;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initializing
        Button btnChangeColor = findViewById(R.id.btnChangeColor);
        Button btnChangeText = (Button) findViewById(R.id.btnChangeText);
        this.tvHelloWorld = findViewById(R.id.tvHelloWorld);

        // Changing the color
        btnChangeColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvHelloWorld.setTextColor(Color.parseColor("#d54b1a"));
                btnChangeColor.setBackgroundColor(Color.parseColor("#d54b1a"));
                btnChangeText.setBackgroundColor(Color.parseColor("#d54b1a"));
            }
        });

        btnChangeText.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tvHelloWorld.setText("Hello Kaunas!");
            }
        });
    }
}