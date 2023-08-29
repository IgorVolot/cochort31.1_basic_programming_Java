package homework_26.src.ait.shapes.model;

public class Triangle extends Shape {
    private String figure;
    private double side;

    public Triangle(String figure, double side) {
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
        area = side * side * Math.sqrt(3)/4;
        return area;
    }

    public double calcPerimeter() {
        perimeter = side * 3;
        return perimeter;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString());
        sb.append(" with ").append(side).append(", has ").append(calcArea()).append(" Msqr and ").append(calcPerimeter()).append("M of perimeter.");
        return sb.toString();
    }
}
