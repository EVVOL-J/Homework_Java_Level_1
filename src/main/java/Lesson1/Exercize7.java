package Lesson1;
import java.util.Scanner;
public class Exercize7 {
    //7.Написать метод, которому в качестве параметра передается строка, обозначающая имя.
    // Метод должен вывести в консоль сообщение «Привет, указанное_имя!»
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
    System.out.println("Введите своё имя");
    printHelloName(scanner.next());
    scanner.close();
    }
    private static void printHelloName(String x){
        System.out.println("Привет, " + x + "!");
    }
}
