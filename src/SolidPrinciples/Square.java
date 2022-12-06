package SolidPrinciples;

public class Square implements Shape{
    int length;
    public void setLength(int len){
        length = len;
    }
    public double getArea(){
        return Math.pow(length, 2);
    }
}
