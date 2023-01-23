package DesignPattern.AbstractFactory;

public class PMWidgetFactory implements WidgetFactory{
    @Override
    public Scrollbar createScrollbar() {
        return new PMScrollbar();
    }

    @Override
    public Window createWindow() {
        return new PMWindow();
    }
}
