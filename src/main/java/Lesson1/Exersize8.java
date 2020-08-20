package Lesson1;
import java.util.Scanner;
public class Exersize8 {
    //8. *Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
    //Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите любой год");
        leapYear(scanner.nextLong());
        scanner.close();
    }
    private static void leapYear(long year){
        if (year%4==0 && year%100!=0)
            System.out.println("Год високосный");

        else if(year%100==0 && year%400==0)
            System.out.println("Год високосный");
        else System.out.println("Год не високосный");

    }
}
