package com.keer.designpatterns.六大原则.里氏替换原则优化;


/**
 * @auther keer
 * @data 2021/10/25
 * @description
 */
public class Test {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(20D);
        rectangle.setWidth(15D);
        resize(rectangle);
        printWidthAndLength(rectangle);
        System.out.println("+++++++++++++++++++++++++");
        Square square = new Square();
        square.setSize(15D);
//        resize(square); 里氏替换
        printWidthAndLength(square);
    }
    //扩宽
    public static void resize(Rectangle rectangle){
        while (rectangle.getWidth() <= rectangle.getLength()){
            rectangle.setWidth(rectangle.getWidth()+1);
        }
    }
    public static void printWidthAndLength(Quadrilateral quadrilateral){
        System.out.println("长"+quadrilateral.getLength());
        System.out.println("宽"+quadrilateral.getWidth());
    }
}
