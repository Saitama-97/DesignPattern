package AbstractFactoryMode;

/**
 * @Time   : 2023/7/4 15:38
 * @File   : ShapeFactory.java
 * @Type   : Class
 * @Package: AbstractFactoryMode
 * @Project: DesignPatterns
 * @Author : Saitama
 * @IDE    : IntelliJ IDEA
 * @Des    :
 */

public class ShapeFactory extends AbstracFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        Shape ret = null;
        if (shape == null) {
            ret = null;
        } else if (shape.equalsIgnoreCase("circle")) {
            ret = new Circle();
        } else if (shape.equalsIgnoreCase("rectangle")) {
            ret = new Rectangle();
        } else if (shape.equalsIgnoreCase("square")) {
            ret = new Square();
        }
        return ret;
    }
}
