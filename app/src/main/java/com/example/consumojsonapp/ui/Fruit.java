package com.example.consumojsonapp.ui;

public class Fruit {

    private String name;
    private String weight;
    private String price;
    private String description;
    private String imageUrl;

    // Constructor
    public Fruit(String name, String imageUrl, String weight, String price, String description) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.description = description;
        this.imageUrl = imageUrl;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getWeight() {
        return weight;
    }

    public String getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
