package BuilderMode;

/**
 * @Time   : 2023/7/4 16:52
 * @File   : VegBurger.java
 * @Type   : Class
 * @Package: BuilderMode
 * @Project: DesignPatterns
 * @Author : Saitama
 * @IDE    : IntelliJ IDEA
 * @Des    : Burger 类的子类（实体类）
 */

public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Vegetable Burger";
    }

    @Override
    public float price() {
        return 5.0f;
    }
}
