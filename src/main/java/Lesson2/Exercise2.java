package Lesson2;

import java.util.Arrays;

public class Exercise2 {//Задать пустой целочисленный массив размером 8.

    // С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21
    public static void main(String[] args) {
        int[] arr = new int[8];
        for (int i = 0, j = 0; i < 8 && j < 22; i++, j += 3) {
            arr[i] = j;
        }
        System.out.println(Arrays.toString(arr));
    }
}
