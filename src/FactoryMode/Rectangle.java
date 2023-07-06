package FactoryMode;

/**
 * @Time   : 2023/7/4 10:53
 * @File   : Rectangle.java
 * @Type   : Class
 * @Package: factory
 * @Project: DesignPatterns
 * @Author : Saitama
 * @IDE    : IntelliJ IDEA
 * @Des    : 创建一个 Rectangle（矩形）类，实现 Shape 接口
 */

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
