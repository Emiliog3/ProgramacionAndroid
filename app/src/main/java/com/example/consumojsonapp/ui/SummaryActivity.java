package com.example.consumojsonapp.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.bumptech.glide.Glide;
import com.example.consumojsonapp.R;
import com.example.consumojsonapp.MainActivity;

public class SummaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        // Referencias a los ImageView
        ImageView imagePera = findViewById(R.id.imagePera);
        ImageView imageSandia = findViewById(R.id.imageSandia);
        ImageView imageDurazno = findViewById(R.id.imageDurazno);
        ImageView imageBanano = findViewById(R.id.imageBanano);
        ImageView imageMelon = findViewById(R.id.imageMelon);

        // Cargar imágenes usando Glide
        Glide.with(this).load("https://lavaquita.co/cdn/shop/products/4862b309-63db-4a89-9c91-96ff13354098_700x700.png?v=1622197530").into(imagePera);
        Glide.with(this).load("https://5aldia.cl/wp-content/uploads/2018/03/sandia.jpg").into(imageSandia);
        Glide.with(this).load("https://gluc.mx/u/fotografias/m/2022/1/16/f1280x720-64802_196477_5050.jpg").into(imageDurazno);
        Glide.with(this).load("https://media.istockphoto.com/id/465973474/es/foto/sexy-mujer-comiendo-banana-sensual-labios-rojo.jpg?b=1&s=612x612&w=0&k=20&c=vLzskcFUbZ-z0nYuGtnH7NRCK40fczcIIqRknrt6oXk=").into(imageBanano);
        Glide.with(this).load("https://img.freepik.com/foto-gratis/mano-sosteniendo-melon-fondo-amarillo_23-2149971035.jpg").into(imageMelon);

        // Botón de volver al menú
        Button btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(v -> {
            Intent intent = new Intent(SummaryActivity.this, MainActivity.class);
            startActivity(intent);
        });
    }
}