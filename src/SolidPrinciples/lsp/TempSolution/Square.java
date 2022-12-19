package SolidPrinciples.lsp.TempSolution;

import SolidPrinciples.lsp.TempSolution.Shape;

public class Square extends Shape {
    int length;
    public Square(int len){
        length = len;
    }

    public void setLength(int len){
        length = len;
    }
    public double getArea(){
        return Math.pow(length, 2);
    }
}
