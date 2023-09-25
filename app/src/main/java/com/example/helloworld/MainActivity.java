package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView tvHelloWorld;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.tvHelloWorld = findViewById(R.id.tvHelloWorld);
    }

    public void onBtnChangeTextClick(View view) {
//        Toast.makeText(this, "Java is amazing!", Toast.LENGTH_LONG).show();
        this.tvHelloWorld.setText("Hello Kaunas!");
    }
}