package com.example.consumojsonapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.example.consumojsonapp.ui.FirstScreenActivity;
import com.example.consumojsonapp.ui.SecondScreenActivity;
import com.example.consumojsonapp.ui.SummaryActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnFirstScreen = findViewById(R.id.btnFirstScreen);
        Button btnSecondScreen = findViewById(R.id.btnSecondScreen);
        Button btnSummaryScreen = findViewById(R.id.btnSummaryScreen);

        btnFirstScreen.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, FirstScreenActivity.class);
            startActivity(intent);
        });

        btnSecondScreen.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SecondScreenActivity.class);
            startActivity(intent);
        });

        btnSummaryScreen.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SummaryActivity.class);
            startActivity(intent);
        });
    }
}
