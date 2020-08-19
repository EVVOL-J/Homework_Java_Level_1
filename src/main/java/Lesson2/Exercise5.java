package Lesson2;

import java.util.Arrays;

public class Exercise5 {
    //** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
    public static void main(String[] args) {

        int arr[]={2,6,-7,-2,23,4,-23,24,5,-43,1,34,5,3,12,42,34,54,42};
        int max=arr[0];
        int min=arr[0];
        for (int i=0; i<arr.length; i++)
        {
            if(arr[i]>max) max=arr[i];
            if(arr[i]<min) min=arr[i];
        }
        System.out.println("Max number="+max);
        System.out.println("Mix number="+min);
    }



}
