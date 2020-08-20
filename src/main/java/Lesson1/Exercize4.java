package Lesson1;
import java.util.Scanner;
public class Exercize4 {//Написать метод, принимающий на вход два числа,
    // и проверяющий что их сумма лежит в пределах от 10 до 20(включительно),
    // если да – вернуть true, в противном случае – false;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите два целых числа");
        System.out.println("Введите первое число ");
        int x=+scanner.nextInt();
        System.out.println("Введите второе число ");
        int y=+scanner.nextInt();
        System.out.println("Их сумма лежит в пределах от 10 до 20? Ответ= " + compareInt(x,y));
        scanner.close();
    }
    private static boolean compareInt (int x, int y){
        return 10<=(x+y)&&(x+y)<=20 ;
    }

}
