package org.ticket.com.service;

import java.util.Map;
import java.util.function.Consumer;

public class TestClass {

    public static void main(String[] args) {
        String textT = "Hello";

        Printable printable = (text -> {
            System.out.println(text);
            System.out.println(text + " !!!");
        });

        printable.print(textT);

        Consumer<String> printSomething = (textOne -> System.out.println(textOne));

        printSomething.accept("Hello-Hello");


        Map<String, Integer> map = Map.of("Berlin", 100,
                "Paris", 200,
                "Madrid", 350);

        String maxCity = null;
        int maxValue = 0;
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            if (pair.getValue() > maxValue) {
                maxCity = pair.getKey();
                maxValue = pair.getValue();
            }
        }
        System.out.println("Max citizen in " + maxCity + " = " + maxValue);
    }
}
