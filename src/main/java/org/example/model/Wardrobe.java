package org.example.model;

public class Wardrobe {

    // Private instance variable'lar
    private int width;
    private int height;
    private double weight;

    // Constructor
    public Wardrobe(int width, int height, double weight) {
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    // Getter metodları
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    // add metodu
    public void add() {
        System.out.println("Wardrobe added into Bedroom.");
    }
}
