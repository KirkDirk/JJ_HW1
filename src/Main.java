import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        System.out.println("Java Junior - Homework1");

//        the standard task
//        Напишите программу, которая использует Stream API
//        для обработки списка чисел. Программа должна вывести
//        на экран среднее значение всех четных чисел в списке.

        List<Integer> listOfNumbers = Arrays.asList(21, 11, 6, 7, 13, 15, 2, 10);
        System.out.println(listOfNumbers.stream().filter(num -> (num % 2) == 0)
                .reduce(0, (x, y) -> x + y) /
                listOfNumbers.stream().filter(num -> (num % 2) == 0).count());
    }
}