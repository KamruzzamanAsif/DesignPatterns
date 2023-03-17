package StructuralDesignPattern.DecoratorPattern;

public class Main {
    public static void main(String[] args) {
        TextView textView = new TextView();
        Decorator borderDecorator = new BorderDecorator(textView, 2);
        borderDecorator.draw();
    }
}
