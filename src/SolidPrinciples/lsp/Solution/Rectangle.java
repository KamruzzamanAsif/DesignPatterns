package SolidPrinciples.lsp.Solution;

public class Rectangle implements Shape {
    double height, width;
    public Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public void setWidth(double width){
        this.width = width;
    }
    @Override
    public double getArea(){
        return height*width;
    }
}
