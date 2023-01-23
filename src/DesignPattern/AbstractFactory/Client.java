package DesignPattern.AbstractFactory;

public class Client {
    public static void main(String[] args) {
        WidgetFactory motifWidgetFactory = new MotifWidgetFactory();
        motifWidgetFactory.createScrollbar();
        motifWidgetFactory.createWindow();

        //
        WidgetFactory pmWidgetFactory = new PMWidgetFactory();
        pmWidgetFactory.createScrollbar();
        pmWidgetFactory.createWindow();
    }
}
