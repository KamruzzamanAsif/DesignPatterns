package StructuralDesignPattern.CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component{
    private List<Component> children = new ArrayList<Component>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        this.children.add(component);
    }

    @Override
    public void remove(Component component) {
        this.children.remove(component);
    }

    @Override
    public List<Component> getChildren() {
        return this.children;
    }

    @Override
    public void display(int depth) {
        for(int i = 0; i < depth; i++) {
            System.out.print("-");
        }
        System.out.print(name + "\n");

        for(Component component: children) {
            component.display(depth + 2);
        }
    }
}
