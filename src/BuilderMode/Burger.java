package BuilderMode;

/**
 * @Time   : 2023/7/4 16:37
 * @File   : Burger.java
 * @Type   : Class
 * @Package: BuilderMode
 * @Project: DesignPatterns
 * @Author : Saitama
 * @IDE    : IntelliJ IDEA
 * @Des    : 创建一个实现了 Item 接口的抽象类 —— 汉堡
 */

public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
