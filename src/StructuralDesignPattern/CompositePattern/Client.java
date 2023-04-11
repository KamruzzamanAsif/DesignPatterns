package StructuralDesignPattern.CompositePattern;

public class Client {
    public static void main(String[] args) {
        Component root = new Composite("root");
        root.add(new Leaf("Leaf A"));
        root.add(new Leaf("Leaf B"));

        Component com = new Composite("composite X");
        com.add(new Leaf("Leaf C"));
        com.add(new Leaf("Leaf D"));

        root.add(com);

        root.display(1);
    }
}
