package PrototypeMode;

/**
 * @Time   : 2023/7/5 11:18
 * @File   : Square.java
 * @Type   : Class
 * @Package: PrototypeMode
 * @Project: DesignPatterns
 * @Author : Saitama
 * @IDE    : IntelliJ IDEA
 * @Des    :
 */

public class Square extends Shape{
    public Square() {
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
