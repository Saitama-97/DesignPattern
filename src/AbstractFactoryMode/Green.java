package AbstractFactoryMode;

/**
 * @Time   : 2023/7/4 15:31
 * @File   : Green.java
 * @Type   : Class
 * @Package: AbsoluteFactoryMode
 * @Project: DesignPatterns
 * @Author : Saitama
 * @IDE    : IntelliJ IDEA
 * @Des    :
 */

public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");

    }
}
