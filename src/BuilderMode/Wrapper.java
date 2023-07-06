package BuilderMode;

/**
 * @Time   : 2023/7/4 16:34
 * @File   : Wrapper.java
 * @Type   : Class
 * @Package: BuilderMode
 * @Project: DesignPatterns
 * @Author : Saitama
 * @IDE    : IntelliJ IDEA
 * @Des    : Packing 接口的实现类
 */

public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper";
    }
}
