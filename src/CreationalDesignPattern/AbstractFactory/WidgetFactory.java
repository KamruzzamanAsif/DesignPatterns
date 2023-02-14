package CreationalDesignPattern.AbstractFactory;

public interface WidgetFactory {
    Scrollbar createScrollbar();
    Window createWindow();
}
