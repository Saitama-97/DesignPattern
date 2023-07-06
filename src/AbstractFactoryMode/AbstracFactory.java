package AbstractFactoryMode;

/**
 * @Time   : 2023/7/4 15:36
 * @File   : AbstracFactory.java
 * @Type   : Class
 * @Package: AbsoluteFactoryMode
 * @Project: DesignPatterns
 * @Author : Saitama
 * @IDE    : IntelliJ IDEA
 * @Des    :
 */

public abstract class AbstracFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
