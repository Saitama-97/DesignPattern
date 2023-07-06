package BuilderMode;

/**
 * @Time   : 2023/7/4 16:25
 * @File   : Item.java
 * @Type   : Interface
 * @Package: BuilderMode
 * @Project: DesignPatterns
 * @Author : Saitama
 * @IDE    : IntelliJ IDEA
 * @Des    : 食物条目的接口
 */

public interface Item {
    public String name();

    public Packing packing();

    public float price();
}
