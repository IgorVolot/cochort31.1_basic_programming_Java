package aitj.shapes.model;

public class Circle extends Shape {
    private String figure;
    private double side;


    public Circle(String figure, double side) {
        super(figure);
        this.side = side;
    }

    @Override
    public void setFigure(String figure) {
        this.figure = figure;
    }

    @Override
    public String getFigure() {
        return figure;
    }


    @Override
    public double getSide() {
        return side;
    }

    @Override
    public void setSide(double side) {
        this.side = side;
    }

    public double calcArea() {
        area = Math.PI * side * side;
        return area;
    }

    public double calcPerimeter() {
        perimeter = 2 * Math.PI * side;
        return perimeter;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString());
        sb.append(" with ").append(side).append(", has ").append(calcArea()).append(" Msqr and ").append(calcPerimeter()).append("M of perimeter.");
        return sb.toString();
    }
}
