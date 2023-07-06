package BuilderMode;

/**
 * @Time   : 2023/7/4 16:40
 * @File   : ColdDrink.java
 * @Type   : Class
 * @Package: BuilderMode
 * @Project: DesignPatterns
 * @Author : Saitama
 * @IDE    : IntelliJ IDEA
 * @Des    : 创建一个实现了 Item 接口的抽象类（抽象类不需要实现接口的全部方法）
 */

public abstract class ColdDrink implements Item{

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
