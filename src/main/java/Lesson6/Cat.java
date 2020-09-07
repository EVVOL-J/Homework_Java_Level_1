package Lesson6;

import java.util.Random;

public class Cat extends Animal {
    private Random random= new Random();
    public Cat(float runLength, float swimLength, float jumpHeight){
        super(runLength,swimLength,jumpHeight, 200f, 0f, 2f, "CAT");
        setMaxRunLength(random.nextFloat()*200);
        setMaxSwimLength(random.nextFloat()*0);
        setMaxJumpHeight(random.nextFloat()*2);
    }
    @Override
    public void swim(){
        System.out.println("Коты не умеют плавать");
    }

}
