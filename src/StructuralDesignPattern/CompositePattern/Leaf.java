package StructuralDesignPattern.CompositePattern;

import java.util.List;

public class Leaf extends Component{
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        System.out.println("not applicable for leaf");
    }

    @Override
    public void remove(Component component) {
        System.out.println("not applicable for leaf");
    }

    @Override
    public List<Component> getChildren() {
        return null;
    }

    @Override
    public void display(int depth) {
        for(int i = 0; i < depth; i++) {
            System.out.print("-");
        }
        System.out.print(name + "\n");
    }
}
