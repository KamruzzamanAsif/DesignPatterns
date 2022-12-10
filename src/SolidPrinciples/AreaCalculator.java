package SolidPrinciples;

public class AreaCalculator {
    public double totalArea(Shape[] shapes){
        double area = 0;
        for(Shape s: shapes){
            area += s.getArea();
        }
        System.out.println(area);
        return area;
    }
}
