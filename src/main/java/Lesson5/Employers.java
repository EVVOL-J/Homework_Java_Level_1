package Lesson5;

import java.util.Random;

public class Employers {
    private static final int maxAge=40;
    public static void main(String[] args) {
        Employee[] personArr= new Employee[5];
        int[] age=new int[5];
        Random ramdom=new Random();
        for(int i=0;i<5;i++)  {
            age[i]=ramdom.nextInt(100);
        }
        personArr[0]=new Employee("Putato Nikita Dmitrievich", "doctor", "putin@mail.ru",  "+7(985)-171-30-01", 40000, age[0]);
        personArr[1]=new Employee("Tarasenko Mihail Dmitrievich", "programmer", "taras@mail.ru",  "+7(985)-171-30-02", 80000, age[1]);
        personArr[2]=new Employee("Makarichev Yaraslav Andreevich", "photografer", "matias@mail.ru",  "+7(985)-171-30-03", 100000, age[2]);
        personArr[3]=new Employee("Yakovchic Olesya Nicolaevna", "architector", "yakov@mail.ru",  "+7(985)-171-30-04", 900000, age[3]);
        personArr[4]=new Employee( age[4]);
        System.out.println("Информация о сотрудниках старше 40 лет ");
        for(Employee employee : personArr){
            if(employee.getAge()>=maxAge) employee.info();
        }

    }

}
