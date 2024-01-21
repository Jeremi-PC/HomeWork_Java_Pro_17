package org.example;
// 1 Создайте список чисел. С помощью метода forEach выведите каждое число в консоль по модулю.

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        List<Integer> integerList = new ArrayList<>(5);
        for (int i = 0; i < 10; i++) {
            integerList.add(rnd.nextInt(-100, 100));
        }
        System.out.println(integerList);
        integerList.forEach(n -> System.out.print(Math.abs(n) + " "));

    }
}