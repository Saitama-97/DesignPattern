package BuilderMode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Time   : 2023/7/4 17:16
 * @File   : Meal.java
 * @Type   : Class
 * @Package: BuilderMode
 * @Project: DesignPatterns
 * @Author : Saitama
 * @IDE    : IntelliJ IDEA
 * @Des    :
 */

public class Meal {
    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float total = 0.0f;
        for (Item item : items) {
            total += item.price();
        }
        return total;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.print("Item: " + item.name());
            System.out.print(", Packing: " + item.packing().pack());
            System.out.println(", Price: " + item.price());
        }
    }
}
