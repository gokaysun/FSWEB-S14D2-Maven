package org.example.model;

import org.example.model.enums.PaintColor; // PaintColor enum'unun bu pakette olduğunu varsayıyoruz

public class Carpet {

    // Private instance variable'lar
    private int width;
    private int height;
    private PaintColor color;

    // Constructor
    public Carpet(int width, int height, PaintColor color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    // Getter metodları
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public PaintColor getColor() {
        return color;
    }
    public void lying(){
        System.out.println("Carpet is lying on Bedroom floor.");
    }
}
