package session5;

public class Rectangle {
    // insert class variables for width and height
    double width;
    double height;

    public Rectangle(double width, double height) {
        // complete the constructor
        this.width = width;
        this.height = height;
    }

    /**
     * Calculates the perimeter. Formula:
     * perimeter = 2 * width + 2 * height
     * @return perimeter as double
     */
    public double getPerimeter() {
        // write your code here
        double perimeter = 2 * width + 2 * height;
        return perimeter;
    }

    /**
     * Calculates the area. Formula:
     * area = width * height
     * @return area as double
     */
    public double getArea() {
        // write your code here
        double area = width * height;
        return area;
    }
}
