package Lesson6;


import java.util.Random;

public class Dog extends Animal {

  private Random random= new Random();



    public Dog(float runLength, float swimLength, float jumpHeight){
        super(runLength,swimLength,jumpHeight, 500f, 10f, 0.5f, "DOG");
        setMaxRunLength(random.nextFloat()*500);
        setMaxSwimLength(random.nextFloat()*10);
        setMaxJumpHeight(random.nextFloat()*0.5f);


    }





}
