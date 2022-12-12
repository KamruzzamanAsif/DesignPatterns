package SolidPrinciples.lsp;

public class Rectangle implements Shape{
    int height, width;
    public Rectangle(int h, int w){
        height = h;
        width = w;
    }
    public double getArea(){
        return height*width;
    }
}
