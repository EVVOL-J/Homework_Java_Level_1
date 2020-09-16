package Lesson7;

import java.util.Random;

public class MainClass {
    public static void main(String[] args) {
        Cat[] cat = new Cat[5];
        Plate plate = new Plate(5);
        Random random = new Random();

        for (int i = 0; i < cat.length; i++) {  //не использовал foreach т к нужен был индекс для создания имени
            cat[i] = new Cat("Барсик" + i, 1 + random.nextInt(5));
        }
        plate.info();
        for (Cat caty : cat) {
            caty.eat(plate);
            plate.info();
            if (!caty.isHungry()) plate.addFood(random.nextInt(6));
            System.out.println("----------------------");

        }


    }
}
