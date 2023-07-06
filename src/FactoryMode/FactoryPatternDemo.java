package FactoryMode;

/**
 * @Time   : 2023/7/4 11:06
 * @File   : FactoryPatternDemo.java
 * @Type   : Class
 * @Package: factory
 * @Project: DesignPatterns
 * @Author : Saitama
 * @IDE    : IntelliJ IDEA
 * @Des    : 使用 ShapeFactory 测试
 */

public class FactoryPatternDemo {
    public static void main(String[] args) {
        // 实例化 ShapeFactory
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("Circle");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("recTangle");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("SQuare");
        shape3.draw();

        Shape shape4 = shapeFactory.getShape("123");
        shape4.draw();

    }
}
