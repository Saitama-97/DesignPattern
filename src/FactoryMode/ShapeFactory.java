package FactoryMode;

/**
 * @Time   : 2023/7/4 10:56
 * @File   : ShapeFactory.java
 * @Type   : Class
 * @Package: factory
 * @Project: DesignPatterns
 * @Author : Saitama
 * @IDE    : IntelliJ IDEA
 * @Des    : 创建一个工厂，基于其他类生成对应的对象
 */

public class ShapeFactory {
    public Shape getShape(String shapeType) {
        Shape ret = null;
        if (shapeType == null) {
            ret = null;
        } else if (shapeType.equalsIgnoreCase("circle")) {
            ret = new Circle();
        } else if (shapeType.equalsIgnoreCase("rectangle")) {
            ret = new Rectangle();
        } else if (shapeType.equalsIgnoreCase("square")) {
            ret = new Square();
        }else if (shapeType.equalsIgnoreCase("123")) {
            ret = new triangle();}
        return ret;
    }
}
