package org.example.item;

import java.util.*;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Map<Item, Integer> itemToQuantity = createNewMap();
        Item.printItemMap(itemToQuantity);
        System.out.println("less than 3");
        Item.printItemMap(Item.filterLT(3, itemToQuantity));

//3 Создайте функциональный интерфейс для генерации случайных чисел в заданном диапазоне.
// Используйте лямбда-выражение для генерации числа.

        Supplier<Integer> newRandInteger = () -> {
            Random rnd = new Random();
            return rnd.nextInt(10, 50);
        };
//4 Создайте предикат для удаления из списка тех строк,
// что начинаются с определённой буквы.
        Predicate<String> searchLineByGivenLetter = str -> str.charAt(0) == 'b';
// Создайте список строк и удалите элементы с помощью метода removeIf,
// передав в него предикат.
        List<String> stringList = new ArrayList<>();
        for (char ch = 'a'; ch <= 'p'; ch++) {
            stringList.add(ch + "-element");
        }
        System.out.println(stringList.toString());
        stringList.removeIf(searchLineByGivenLetter);
        System.out.println(stringList.toString());

    }


    public static Map<Item, Integer> createNewMap() {
        Map<Item, Integer> quantityItems = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            String nameOfItem = "Item-" + i;
            quantityItems.put(
                    new Item(nameOfItem, new Random().nextDouble(100.0, 2000.0)),
                    new Random().nextInt(25));
        }
        return quantityItems;
    }
}
