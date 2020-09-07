package Lesson6;

import java.util.Random;

public class TestAnimal {
    public static void main(String[] args) {
        Random random=new Random();
        Cat cat=new Cat(random.nextFloat()*300,random.nextFloat(),random.nextFloat()*3);
        Dog dog=new Dog(random.nextFloat()*300,random.nextFloat(),random.nextFloat()*3);

        cat.swim();
        cat.run();
        cat.jump();

        dog.swim();
        dog.run();
        dog.jump();
    }
}
