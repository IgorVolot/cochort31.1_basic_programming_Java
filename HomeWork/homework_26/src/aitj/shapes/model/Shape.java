package aitj.shapes.model;

public abstract class Shape {
    protected String figure;
    protected double side;
    protected double area;
    protected double perimeter;


    public Shape(String figure) {
        this.figure = figure;
        this.side = side;
    }

    public String getFigure() {
        return figure;
    }

    public void setFigure(String figure) {
        this.figure = figure;
    }

    public double getSide() {
        return side;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public abstract double calcArea();

    public abstract double calcPerimeter();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append(figure);
        return sb.toString();
    }
}

