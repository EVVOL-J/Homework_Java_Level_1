package Lesson1;
import java.util.Scanner;

public class Exercize3 { //Написать метод вычисляющий выражение a * (b + (c / d))
    // и возвращающий результат,где a, b, c, d – входные параметры этого метода;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите параметры для выражения a*(b+(c/d))");
        System.out.println("Введите a ");
        float a=+scanner.nextFloat();
        System.out.println("a= " + a);
        System.out.println("Введите b ");
        float b=+scanner.nextFloat();
        System.out.println("b= " + b);
        System.out.println("Введите c ");
        float c=+scanner.nextFloat();
        System.out.println("c= " + c);
        System.out.println("Введите d ");
        float d=+scanner.nextFloat();
        System.out.println("d= " + d);
        System.out.println("a*(b+(c/d))= " + formula(a,b,c,d));
        scanner.close();
    }
    private static float formula(float a, float b, float c, float d){
        return a*(b+(c/d));
    }
}
