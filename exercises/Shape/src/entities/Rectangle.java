package entities;

import entities.enums.Color;

public class Rectangle extends Shape{
    private Double width, height;



    public Double getWidth() {
        return width;
    }
    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }
    public void setHeight(Double height) {
        this.height = height;
    }


    public Rectangle(Color color, Double width, Double height) {
        super(color);
        setHeight(height);
        setWidth(width);
    }



    @Override
    public Double area() { return getHeight() * getWidth(); }
}
