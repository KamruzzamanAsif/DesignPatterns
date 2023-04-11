package StructuralDesignPattern.CompositePattern;

import java.util.List;

public abstract class Component {
    protected String name;

    public Component(String name){this.name = name;}

    public abstract void add(Component component);
    public abstract void remove(Component component);
    public abstract List<Component> getChildren();


    // operation
    public abstract void display(int depth);
}
