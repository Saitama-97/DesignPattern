package PrototypeMode;

/**
 * @Time   : 2023/7/5 09:45
 * @File   : Rectangle.java
 * @Type   : Class
 * @Package: PrototypeMode
 * @Project: DesignPatterns
 * @Author : Saitama
 * @IDE    : IntelliJ IDEA
 * @Des    :
 */

public class Rectangle extends Shape {
    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
