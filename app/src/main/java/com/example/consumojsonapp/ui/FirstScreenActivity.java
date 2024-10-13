package com.example.consumojsonapp.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.consumojsonapp.R;
import com.example.consumojsonapp.MainActivity;

import java.util.ArrayList;
import java.util.List;

public class FirstScreenActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_screen);

        recyclerView = findViewById(R.id.recyclerViewFruits);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Lista de frutas con imágenes reales
        List<Fruit> fruitList = new ArrayList<>();
        fruitList.add(new Fruit("Pera", "https://lavaquita.co/cdn/shop/products/4862b309-63db-4a89-9c91-96ff13354098_700x700.png?v=1622197530", "150g", "$1.50 USD", "Alta en fibra, ayuda a la digestión"));
        fruitList.add(new Fruit("Sandía", "https://5aldia.cl/wp-content/uploads/2018/03/sandia.jpg", "2kg", "$3.00 USD", "Hidratante, contiene antioxidantes y vitaminas"));
        fruitList.add(new Fruit("Durazno", "https://gluc.mx/u/fotografias/m/2022/1/16/f1280x720-64802_196477_5050.jpg", "200g", "$2.00 USD", "Rico en vitaminas A y C, mejora la piel"));
        fruitList.add(new Fruit("Banano", "https://lavaquita.co/cdn/shop/products/76b6170a-f1e1-4a92-8622-cee94a659b91_1024x1024.png?v=1622197616", "200g", "$1.00 USD", "Alto en potasio, ideal para la presión arterial"));
        fruitList.add(new Fruit("Melón", "https://img.freepik.com/foto-gratis/mano-sosteniendo-melon-fondo-amarillo_23-2149971035.jpg", "1.5kg", "$2.50 USD", "Muy hidratante, bajo en calorías"));

        // Configura el adaptador para el RecyclerView
        FruitAdapter adapter = new FruitAdapter(fruitList);
        recyclerView.setAdapter(adapter);

        // Configuración del botón de volver al menú
        btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(v -> {
            Intent intent = new Intent(FirstScreenActivity.this, MainActivity.class);
            startActivity(intent);
        });
    }
}
