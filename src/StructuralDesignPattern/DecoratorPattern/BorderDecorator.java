package StructuralDesignPattern.DecoratorPattern;

public class BorderDecorator extends Decorator{
    private int borderWidth;

    public BorderDecorator(VisualComponent component, int borderWidth) {
        super(component);
        this.borderWidth = borderWidth;
    }

    public void drawBorder(int borderWidth){
        System.out.println("border drawn");
    }
    @Override
    public void draw(){
        super.draw();
        drawBorder(borderWidth);
    }

    @Override
    void resize() {
        // logic
    }
}
