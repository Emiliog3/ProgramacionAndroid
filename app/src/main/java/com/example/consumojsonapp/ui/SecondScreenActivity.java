package com.example.consumojsonapp.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.consumojsonapp.R;
import com.example.consumojsonapp.MainActivity;


public class SecondScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);

        TextView categoryTextView = findViewById(R.id.categoryTextView);
        String categories = "Categoría: Cítricos\nFrutas: Limón, Naranja\n\n" +
                "Categoría: Dulces\nFrutas: Durazno, Banano\n\n" +
                "Categoría: Tropicales\nFrutas: Mango, Piña";

        categoryTextView.setText(categories);

        Button btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(v -> {
            Intent intent = new Intent(SecondScreenActivity.this, MainActivity.class);
            startActivity(intent);
        });
    }
}
