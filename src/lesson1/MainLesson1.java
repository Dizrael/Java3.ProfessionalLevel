package lesson1;

import lesson1.task1_2.Swapper;
import lesson1.task3.Apple;
import lesson1.task3.Box;
import lesson1.task3.Orange;

import java.util.ArrayList;
import java.util.Arrays;

public class MainLesson1 {
    public static void main(String[] args) {
//      //Задача 1
//        Swapper<String> swapperStr = new Swapper<>();
//
//        String[] seasons = new String[4];
//        seasons[0] = "Winter";
//        seasons[1] = "Spring";
//        seasons[2] = "Summer";
//        seasons[3] = "Fall";
//
//        System.out.println(Arrays.toString(swapperStr.swap(seasons, 2, 0)));
//
//        Swapper<Integer> swapperInt = new Swapper<>();
//        Integer[] numbers = {1,2,3,4,5,6,7,8,9};
//
//        System.out.println(Arrays.toString(swapperInt.swap(numbers, 3,5)));
//
//      //Задача 2
//        System.out.println(swapperInt.convertToArrLst(numbers));
//        System.out.println(swapperStr.convertToArrLst(seasons));

      //Задача 3
        Box<Orange> orangeBox = new Box<>(new Orange());
        orangeBox.putSomething(new Orange(), 4);
        System.out.println("Вес коробки с 5ю апельсинами: " + orangeBox.getWeight());

        Box<Apple> appleBox = new Box<>(new Apple());
        appleBox.putSomething(new Apple(), 6);
        System.out.println("Вес коробки с 10ю яблоками: " + appleBox.getWeight());

        System.out.println("Пересыпем яблоки в другую коробку...");
        Box<Apple> newAppleBox = appleBox.transferToAnotherBox(new Box<>(new Apple()));

        System.out.println("Вес старой коробки яблок: " + appleBox.getWeight()
                              + "\nВес новой коробки: " + newAppleBox.getWeight());

        System.out.println("Вес коробки апельсинов равен весу коробки яблок? -> " + newAppleBox.compareTo(orangeBox));


//        ArrayList<Integer> numbers = new ArrayList<>(5);
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(3);
//        numbers.add(4);
//        numbers.add(5);
//        System.out.println(numbers);
//        ArrayList<Integer> newNum = new ArrayList<>(numbers);
//        System.out.println(newNum);
//        numbers.clear();
//        System.out.println(numbers);
    }
}
