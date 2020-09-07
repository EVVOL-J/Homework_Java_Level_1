package Lesson5;

public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String telefonNumber;
    private int salary;
    private int age;

    public Employee() {
        this(30);
    }
    public Employee(int age){
        this("Nasarishin Nikita Andreevich", "progremmer", "nasar@mail.ru", "+7(985)-171-30-00", 60000, age);

    }

   public Employee(String fullName, String position, String email, String telefonNumber, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.telefonNumber = telefonNumber;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        System.out.println("ФИО: " + this.fullName + "; Должность: " + this.position + "; Эмэйл: " + this.email + "; Телефонный номер: " + this.telefonNumber + "; Зарплата: " + this.salary + "; Возраст: " + this.age);
    }

    public int getAge() {
        return age;
    }
}
