package Lesson1;
import java.util.Scanner;
public class Exercize5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
       //5. Написать метод, которому в качестве параметра передается целое число,
        // метод должен напечатать в консоль, положительное ли число передали или отрицательное.
        // Замечание: ноль считаем положительным числом.
        System.out.println("Введите целое число");
        int z=+scanner.nextInt();
        negOrPosString(z);
        scanner.close();

    }
    private static void negOrPosString(int z){
        System.out.println(z<0 ? "Число отрицательное":"Число положительное");
    }
}
