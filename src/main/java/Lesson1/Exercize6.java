package Lesson1;
import java.util.Scanner;
public class Exercize6 {
    public static void main(String[] args) {
        //6. Написать метод, которому в качестве параметра передается целое число.
        // Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите целое число");
        int z=+scanner.nextInt();
        System.out.println("Число отрицательное? "+ negOrPosBool(z));
        scanner.close();
    }
    private static boolean negOrPosBool(int z){
        return z<0;

    }
}

