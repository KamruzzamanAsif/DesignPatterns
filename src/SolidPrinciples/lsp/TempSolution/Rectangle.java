package SolidPrinciples.lsp.TempSolution;

public class Rectangle extends Shape {
    int height, width;
    public Rectangle(int h, int w){
        height = h;
        width = w;
    }
    public double getArea(){
        return height*width;
    }
}
