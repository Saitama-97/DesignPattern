package AbstractFactoryMode;

/**
 * @Time   : 2023/7/4 15:27
 * @File   : Rectangle.java
 * @Type   : Class
 * @Package: AbsoluteFactoryMode
 * @Project: DesignPatterns
 * @Author : Saitama
 * @IDE    : IntelliJ IDEA
 * @Des    :
 */

public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
