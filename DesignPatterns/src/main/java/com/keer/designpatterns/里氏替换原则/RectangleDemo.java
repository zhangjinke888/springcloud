package com.keer.designpatterns.里氏替换原则;

/**
 * @auther keer
 * @data 2021/10/25
 * @description
 */
public class RectangleDemo {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(15);
        rectangle.setLength(20);
        resize(rectangle);
        printWidthAndLength(rectangle);
        System.out.println("++++++++++++++++++++++");
        Square square = new Square();
        square.setLength(20);
        resize(square);
        printWidthAndLength(square);
    }
    //扩宽方法
    public static void resize(Rectangle rectangle){
        while (rectangle.getWidth() <= rectangle.getLength()){
            rectangle.setWidth(rectangle.getWidth()+1);
        }
    }
    public static void printWidthAndLength(Rectangle rectangle){
        System.out.println("长"+rectangle.getLength());
        System.out.println("宽"+rectangle.getWidth());
    }
}
