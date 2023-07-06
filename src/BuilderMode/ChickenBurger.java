package BuilderMode;

/**
 * @Time   : 2023/7/4 16:54
 * @File   : ChickenBurger.java
 * @Type   : Class
 * @Package: BuilderMode
 * @Project: DesignPatterns
 * @Author : Saitama
 * @IDE    : IntelliJ IDEA
 * @Des    : Burger 类的子类（实体类）
 */

public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 10.0f;
    }
}
