package AbstractFactoryMode;

/**
 * @Time   : 2023/7/4 15:29
 * @File   : Square.java
 * @Type   : Class
 * @Package: AbsoluteFactoryMode
 * @Project: DesignPatterns
 * @Author : Saitama
 * @IDE    : IntelliJ IDEA
 * @Des    :
 */

public class Square implements Shape{
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
