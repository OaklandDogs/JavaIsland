// 1.java
// Задать одномерный массив и найти в нем минимальный 
// и максимальный элементы


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
 
class Main
{
    public static void main(String[] args)
    {
        // не примитивный целочисленный массив
        Integer[] A = { 6, 8, 3, 5, 1, 9 };
 
        List<Integer> ints = Arrays.asList(A);
 
        System.out.println("Min element is " + Collections.min(ints));
        System.out.println("Max element is " + Collections.max(ints));
    }
}



// Lecture.java

// Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, 
// не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный

import java.util.Scanner;

public class Lecture {

    public static void main(String[] args) {
        try (Scanner reader = new Scanner(System.in)) {
            System.out.println("Type a year: ");

            int year = Integer.parseInt(reader.nextLine());

            if (year % 400 == 0 && year % 100 == 0 && year % 4 == 0) {
                System.out.println("The year is a leap year");
            } else
             if (year % 4 == 0 && year%100!=0 ) {
                System.out.println("The year is a leap year");
            } else 
            {
                System.out.println("The year is not a leap year");
            }
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}


