package org.prezydium.herbatime.model;

public class Player {

    private int posX;

    private int posY;

    private String name;

    private String color;

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Player(int posX, int posY, String name, String color) {
        this.posX = posX;
        this.posY = posY;
        this.name = name;
        this.color = color;
    }
}
