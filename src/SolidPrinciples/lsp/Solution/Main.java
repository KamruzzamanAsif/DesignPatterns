package SolidPrinciples.lsp.Solution;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(10, 6);
        System.out.println(rectangle.getArea());

        Shape square = new Square(5);
        System.out.println(square.getArea());
    }
}
