package com.company.builderModel;

import java.util.ArrayList;
import java.util.List;

public class Model {
    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float cost() {
        float count = 0.0f;
        for (Item item : items) {
             count += item.price();
        }
        return count;
    }

    public void printItem() {
        for (Item item : items) {
            System.out.print(item.name());
        }
        System.out.print(":落地价="+cost()+"万人民币");

    }
}
