package FactoryMode;

/**
 * @Time   : 2023/7/4 10:54
 * @File   : Square.java
 * @Type   : Class
 * @Package: factory
 * @Project: DesignPatterns
 * @Author : Saitama
 * @IDE    : IntelliJ IDEA
 * @Des    : 创建一个 Square（正方形）类，实现 Shape 接口
 */

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
