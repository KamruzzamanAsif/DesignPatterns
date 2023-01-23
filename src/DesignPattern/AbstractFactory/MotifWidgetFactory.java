package DesignPattern.AbstractFactory;

public class MotifWidgetFactory implements WidgetFactory{
    @Override
    public Scrollbar createScrollbar() {
        return new MotifScrollbar();
    }

    @Override
    public Window createWindow() {
        return new MotifWindow();
    }
}
