package SolidPrinciples;

public class Rectangle implements Shape{
    int height, width;
    public void setSize(int h, int w){
        height = h;
        width = w;
    }

    public double getArea(){
        return height*width;
    }
}
