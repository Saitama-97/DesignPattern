package AbstractFactoryMode;

/**
 * @Time   : 2023/7/4 15:30
 * @File   : Red.java
 * @Type   : Class
 * @Package: AbsoluteFactoryMode
 * @Project: DesignPatterns
 * @Author : Saitama
 * @IDE    : IntelliJ IDEA
 * @Des    :
 */

public class Red implements Color{
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
