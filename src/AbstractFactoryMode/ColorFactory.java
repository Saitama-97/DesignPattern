package AbstractFactoryMode;

/**
 * @Time   : 2023/7/4 15:43
 * @File   : ColorFactory.java
 * @Type   : Class
 * @Package: AbstractFactoryMode
 * @Project: DesignPatterns
 * @Author : Saitama
 * @IDE    : IntelliJ IDEA
 * @Des    :
 */

public class ColorFactory extends AbstracFactory {
    @Override
    public Color getColor(String color) {
        Color ret = null;
        if (color == null) {
            ret = null;
        } else if (color.equalsIgnoreCase("red")) {
            ret = new Red();
        } else if (color.equalsIgnoreCase("Green")) {
            ret = new Green();
        } else if (color.equalsIgnoreCase("BLUE")) {
            ret = new Blue();
        }
        return ret;
    }

    @Override
    public Shape getShape(String color) {
        return null;
    }
}
