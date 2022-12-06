package SolidPrinciples;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setSize(2,3);
        System.out.println(rectangle.getArea());

        Square square = new Square();
        square.setLength(5);
        System.out.println(square.getArea());
    }
}
