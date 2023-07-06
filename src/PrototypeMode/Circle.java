package PrototypeMode;

/**
 * @Time   : 2023/7/5 11:19
 * @File   : Circle.java
 * @Type   : Class
 * @Package: PrototypeMode
 * @Project: DesignPatterns
 * @Author : Saitama
 * @IDE    : IntelliJ IDEA
 * @Des    :
 */

public class Circle extends Shape {
    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
