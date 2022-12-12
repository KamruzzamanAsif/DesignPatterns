package SolidPrinciples.lsp;

public class Square implements Shape{
    int length;
    public Square(int len){
        length = len;
    }

    public double getArea(){
        return Math.pow(length, 2);
    }
}
