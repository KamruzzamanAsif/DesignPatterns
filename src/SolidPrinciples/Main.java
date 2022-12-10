package SolidPrinciples;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(10, 6);
        System.out.println(rectangle.getArea());

        Square square = new Square(5);
        square.setLength(4);
        System.out.println(square.getArea());

        Shape[] s = {rectangle, square};
        AreaCalculator areaCalculator = new AreaCalculator();
        double a = areaCalculator.totalArea(s);
    }
}
