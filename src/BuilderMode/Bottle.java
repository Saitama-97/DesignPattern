package BuilderMode;

/**
 * @Time   : 2023/7/4 16:35
 * @File   : Bottle.java
 * @Type   : Class
 * @Package: BuilderMode
 * @Project: DesignPatterns
 * @Author : Saitama
 * @IDE    : IntelliJ IDEA
 * @Des    : Packing 接口的实现类
 */

public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
