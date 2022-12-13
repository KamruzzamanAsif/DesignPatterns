package SolidPrinciples.lsp.Solution;

public class Square implements Shape {
    double length;
    public Square(double length){
        this.length = length;
    }

    public void setLength(double length){
        this.length = length;
    }
    @Override
    public double getArea(){
        return Math.pow(length, 2);
    }
}
