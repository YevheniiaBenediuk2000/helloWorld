package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

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

        this.tvHelloWorld = findViewById(R.id.tvHelloWorld);

        Button btnChangeText = (Button) findViewById(R.id.btnChangeText);
        btnChangeText.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tvHelloWorld.setText("Hello Kaunas!");
            }
        });
    }
}