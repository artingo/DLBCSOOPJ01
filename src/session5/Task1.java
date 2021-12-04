package session5;

/**
 * Write a class Rectangle.
 * A rectangle is defined by its length and width.
 * Using both it is possible to calculate its perimeter and area.
 * Implement the rectangle class.
 */
public class Task1 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(2.5, 4.0);
        double perimeter = rect.getPerimeter();
        System.out.println("perimeter = " + perimeter);

        double area = rect.getArea();
        System.out.println("area = " + area);
    }
}
