package org.example.model;

public class Wall {

    // Private instance variable
    private String direction;

    // Constructor
    public Wall(String direction) {
        this.direction = direction;
    }

    // getDirection metodu
    public String getDirection() {
        return direction;
    }

    // create metodu
    public void create() {
        System.out.println("Wall has been built.");
    }
}
