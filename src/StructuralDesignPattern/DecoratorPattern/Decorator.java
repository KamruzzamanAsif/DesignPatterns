package StructuralDesignPattern.DecoratorPattern;

public abstract class Decorator extends VisualComponent{
    private VisualComponent component;

    public Decorator(VisualComponent component) {
        this.component = component;
    }

    public void draw(){
        component.draw();
    }
    abstract void resize();
}
