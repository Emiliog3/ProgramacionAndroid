package com.example.consumojsonapp.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.consumojsonapp.R;

import java.util.List;

public class FruitAdapter extends RecyclerView.Adapter<FruitAdapter.FruitViewHolder> {

    private final List<Fruit> fruitList;

    public FruitAdapter(List<Fruit> fruitList) {
        this.fruitList = fruitList;
    }

    @NonNull
    @Override
    public FruitViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_fruit, parent, false);
        return new FruitViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FruitViewHolder holder, int position) {
        Fruit fruit = fruitList.get(position);
        holder.fruitName.setText(fruit.getName());
        holder.fruitWeight.setText(fruit.getWeight());
        holder.fruitPrice.setText(fruit.getPrice());
        holder.fruitDescription.setText(fruit.getDescription());

        // Cargar la imagen desde la URL utilizando Glide
        Glide.with(holder.itemView.getContext())
                .load(fruit.getImageUrl())
                .into(holder.fruitImage);
    }

    @Override
    public int getItemCount() {
        return fruitList.size();
    }

    public static class FruitViewHolder extends RecyclerView.ViewHolder {

        TextView fruitName;
        TextView fruitWeight;
        TextView fruitPrice;
        TextView fruitDescription;
        ImageView fruitImage;

        public FruitViewHolder(@NonNull View itemView) {
            super(itemView);
            fruitName = itemView.findViewById(R.id.fruitName);
            fruitWeight = itemView.findViewById(R.id.fruitWeight);
            fruitPrice = itemView.findViewById(R.id.fruitPrice);
            fruitDescription = itemView.findViewById(R.id.fruitDescription);
            fruitImage = itemView.findViewById(R.id.fruitImage);
        }
    }
}
