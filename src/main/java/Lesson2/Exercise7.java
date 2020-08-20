package Lesson2;

import java.util.Arrays;

public class Exercise7 {
    //**** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
    // при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично.
    // Для усложнения задачи нельзя пользоваться вспомогательными массивами.
    // Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ];
    // [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
    // При каком n в какую сторону сдвиг можете выбирать сами.
    public static void main(String[] args) {
        int[] arr= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n = 7;
        System.out.println(Arrays.toString(shift(arr, n)));

    }

    private static int[] shift(int[] arr, int n) {
        n %= arr.length;// для сокращения n
        if (Math.abs(n) > arr.length / 2)
            n -= arr.length * n / Math.abs(n);//если сдвиг больше чем половина массива, то сдвигаем в другую сторону
        int safeNumber;
        System.out.println("Эквивалентное n=" + n);
        if (n != 0) {
            if (n > 0) {
                for (int i = 0; i < n; i++) {
                    safeNumber = arr[arr.length - 1];
                    for (int j = arr.length - 1; j > 0; j--) arr[j] = arr[j - 1];
                    arr[0] = safeNumber;
                }
            } else {
                for (int i = 0; i < -n; i++) {
                    safeNumber = arr[0];
                    for (int j = 1; j < arr.length; j++) arr[j - 1] = arr[j];
                    arr[arr.length - 1] = safeNumber;
                }
            }
        }
        return arr;
    }

}

