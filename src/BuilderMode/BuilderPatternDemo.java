package BuilderMode;

/**
 * @Time   : 2023/7/4 17:27
 * @File   : BuilderPatternDemo.java
 * @Type   : Class
 * @Package: BuilderMode
 * @Project: DesignPatterns
 * @Author : Saitama
 * @IDE    : IntelliJ IDEA
 * @Des    :
 */

public class BuilderPatternDemo {
    public static void main(String[] args) {
        // 生成一个 Builder
        MealBuilder builder = new MealBuilder();

        // 吃素
        Meal vegMeal = builder.prepareVegMeal();
        System.out.println("Veg:");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());

        System.out.println();

        // 吃荤
        Meal chickenMeal = builder.prepareNonVegMeal();
        System.out.println("Chicken:");
        chickenMeal.showItems();
        System.out.println("Total Cost: " + chickenMeal.getCost());
    }
}
