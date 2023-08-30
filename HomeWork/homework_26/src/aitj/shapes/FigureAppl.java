package aitj.shapes;

import aitj.shapes.model.Circle;
import aitj.shapes.model.Shape;
import aitj.shapes.model.Square;
import aitj.shapes.model.Triangle;

public class FigureAppl {
    public static void main(String[] args) {
        /*
        Create an abstract class Shape with field side type double and an abstract methods calcArea and calcPerimeter.
        Create classes Circle, Triangle, Square which extends class Shape and implements abstract methods.
        Write class FigureAppl with method main. In method create array of Shapes. Add to array two circles,
        one triangle and one square. Calculate total area and total perimeter of all figures from array of Shapes.
        Calculate total area of circles. (*)
        P.S. We are bear in mind regular shapes
         */

        Shape[] shapes = new Shape[6];
        shapes[0] = new Circle("Circle", 2.5);
        shapes[1] = new Circle("Circle", 5.2);
        shapes[2] = new Triangle("Triangle", 4);
        shapes[3] = new Square("Square", 4);
        printArray(shapes);
        System.out.println();

        double totalArea = totalArea(shapes);
        System.out.printf("Total area of figures are : %.2f", totalArea);
        System.out.println();

        double totalPerimeter = totalPerimeter(shapes);
        System.out.printf("Total perimeter of figures are : %.2f", totalPerimeter);
        System.out.println();

        System.out.printf("Sum of areas of two circles is : %.2f", totalCirclesArea(shapes));
    }

    private static void printArray(Shape[] shapes) {
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] != null) {
                System.out.println(shapes[i]);
            }
        }
    }

    private static double totalArea(Shape[] shapes) {
        double sum = 0;
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] != null){
                sum += shapes[i].calcArea();
            }
        }
        return sum;
    }

    private static double totalPerimeter(Shape[] shapes) {
        double sum = 0;
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] != null){
                sum += shapes[i].calcPerimeter();
            }
        }
        return sum;
    }

    private static double totalCirclesArea(Shape[] shapes) {
        double sum = 0;
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] instanceof Circle) {
                Circle circle = (Circle) shapes[i];
                sum += circle.calcArea();
            }
        }
        return sum;
    }
}
