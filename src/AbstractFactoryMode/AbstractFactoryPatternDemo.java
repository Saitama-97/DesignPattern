package AbstractFactoryMode;

/**
 * @Time   : 2023/7/4 15:51
 * @File   : AbstractFactoryPatternDemo.java
 * @Type   : Class
 * @Package: AbstractFactoryMode
 * @Project: DesignPatterns
 * @Author : Saitama
 * @IDE    : IntelliJ IDEA
 * @Des    :
 */

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        // 获取颜色工厂
        AbstracFactory colorFactory = FactoryProducer.getFactory("color");

        assert colorFactory != null;

        String[] colorArray = new String[]{"red", "green", "blue"};

        for (String s : colorArray) {
            Color color = colorFactory.getColor(s);
            color.fill();
        }

        // 获取形状工厂
        AbstracFactory shapeFactory = FactoryProducer.getFactory("shape");

        assert shapeFactory != null;

        String[] shapeArray = new String[]{"rectangle", "circle", "square"};

        for (String s : shapeArray) {
            Shape shape = shapeFactory.getShape(s);
            shape.draw();
        }
    }
}
