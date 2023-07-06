package FactoryMode;

/**
 * @Time   : 2023/7/4 10:54
 * @File   : Circle.java
 * @Type   : Class
 * @Package: factory
 * @Project: DesignPatterns
 * @Author : Saitama
 * @IDE    : IntelliJ IDEA
 * @Des    : 创建一个 Circle（圆形）类，实现 Shape 接口
 */

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
