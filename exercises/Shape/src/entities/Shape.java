package entities;

import entities.enums.Color;

public abstract class Shape {
    private Color color;


    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }


    public Shape(Color color) {
        setColor(color);
    }


    public abstract Double area();


}
