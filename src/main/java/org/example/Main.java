package org.example;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        List<Integer> listNumb = List.of(1, 2, 3, 4, 5, 6, 7, 8,2,3,4);

        // Step 1: Filter a list of numbers and only output the even numbers.

        listNumb.stream().filter(f -> f % 2 == 0).forEach(System.out::println);

        System.out.println("______________________");

        // Step 2: Use 'map' and double each number in the list.

        listNumb.stream().map(f -> f * 2).forEach(System.out::println);

        System.out.println("______________________");


        // Step 3: Sort the list in ascending order.

        listNumb.stream().sorted().forEach(System.out::println);

        System.out.println("______________________");


        // Step 4: Perform a 'reduce' operation to calculate the sum of all numbers in the list.

        System.out.println(listNumb.stream().reduce(0, (a, b) -> a + b));

        System.out.println("______________________");

        //Step 5: Use 'forEach' and output each processed number.

        listNumb.stream().forEach(f -> {
            System.out.println(f);
        });

        System.out.println("______________________");

        //Step 6: Collect the processed numbers into a new list using 'collect'.

       List<Integer> newList = listNumb.stream().sorted().collect(Collectors.toList());

       newList.stream().forEach(System.out::println);

        System.out.println("______________________");

    }
}