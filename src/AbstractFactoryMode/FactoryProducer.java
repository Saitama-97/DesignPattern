package AbstractFactoryMode;

/**
 * @Time   : 2023/7/4 15:46
 * @File   : FactoryProducer.java
 * @Type   : Class
 * @Package: AbstractFactoryMode
 * @Project: DesignPatterns
 * @Author : Saitama
 * @IDE    : IntelliJ IDEA
 * @Des    : 创建一个工厂创造器，根据传入的形状或颜色获取相应的工厂
 */

public class FactoryProducer {
    public static AbstracFactory getFactory(String value) {
        if (value.equalsIgnoreCase("color")) {
            return new ColorFactory();
        } else if (value.equalsIgnoreCase("shape")) {
            return new ShapeFactory();
        }
        return null;
    }
}
