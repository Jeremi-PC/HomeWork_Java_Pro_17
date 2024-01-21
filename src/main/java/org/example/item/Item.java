package org.example.item;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiPredicate;
//2 Создайте класс Item с полями названия товара и стоимости товара.
// Создайте мапу, хранящую товар и соответствующее ему число единиц товара.
public record Item(String itemName, Double price) {

    // С помощью метода forEach получите все товары, у которых осталось меньше 3 штук.
    public static Map<Item, Integer> filterLT(int border, Map<Item, Integer> inputTable) {
        Map<Item, Integer> filteredMap = new HashMap<>();
        inputTable.forEach((k, v) -> {
            if (v < border) {
                filteredMap.put(k, v);
            }
        });
        return filteredMap;
    }
    public static void printItemMap (Map<Item, Integer> inputTable) {
        if (!inputTable.isEmpty()) {
            inputTable.forEach((item, integer) -> {
                System.out.println(item.toString() + " = " + integer);
            });
        } else  System.out.println("This is an empty map");
    }
}

