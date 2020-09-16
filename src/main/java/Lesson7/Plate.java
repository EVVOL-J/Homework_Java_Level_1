package Lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("Plate: " + food);
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int n) {
        if (food - n >= 0) {
            food -= n;
            return true;
        } else {
            System.out.println("В тарелке недостаточно еды");
            return false;
        }
    }

    public void addFood(int add_Food) {
        food += add_Food;
        System.out.println("В тарелку добавлена еды " + add_Food);
        info();
    }
}
