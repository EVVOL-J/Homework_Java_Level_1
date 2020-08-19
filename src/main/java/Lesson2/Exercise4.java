package Lesson2;

import java.util.Arrays;

public class Exercise4 {
    //Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    // и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
    public static void main(String[] args) {
        int arr[][]=new int[6][6];
        for(int i=0;i<arr.length;i++) arr[i][i]=1;

        //check
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }





        }
}
