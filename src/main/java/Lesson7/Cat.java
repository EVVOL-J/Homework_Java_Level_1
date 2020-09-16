package Lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean hungry;

    public Cat(){
        this("Барсик", 5);
    }
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate p) {
        hungry=p.decreaseFood(appetite);
        if(hungry) System.out.printf("Кот %s покушал %d \n",name , appetite);
        else  System.out.printf("Коту %s не хватило еды %d \n", name, appetite);
    }




    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHungry() {
        return hungry;
    }
}
