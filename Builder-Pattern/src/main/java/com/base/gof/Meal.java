package com.base.gof;

import java.util.ArrayList;
import java.util.List;

/**
 * @project:design-pattern
 * @package:com.base.gof
 * @create_date:2018/2/2 13:39
 * @author:Subtimental
 * @description:TODO
 */
public class Meal {

    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float cost = 0.0f;

        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {

        for (Item item : items) {
            System.out.print("Item : " + item.name());
            System.out.print(", Packing : " + item.packing().pack());
            System.out.println(", Price : " + item.price());
        }
    }
}
