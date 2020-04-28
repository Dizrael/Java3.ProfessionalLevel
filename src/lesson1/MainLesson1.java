package lesson1;

import lesson1.task1_2.Swapper;
import lesson1.task3.Box;
import lesson1.task3.Orange;

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
        Box<Orange> orangeBox = new Box<>();
        orangeBox.putSomething(new Orange(), 5);
        System.out.println(orangeBox.getWeight());
    }
}
