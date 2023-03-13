package StructuralDesignPattern.DecoratorPattern;

public class TextView extends VisualComponent{

    @Override
    void draw() {
        System.out.println("text view drawn");
    }

    @Override
    void resize() {
        // resize
    }
}
