package Lesson6;

public class Animal {
    private float runLength;
    private float swimLength;
    private float jumpHeight;
    private float maxRunLength;
    private float maxSwimLength;
    private float maxJumpHeight;
    private String name;

    public Animal(float runLength, float swimLength, float jumpHeight, float maxRunLength, float maxSwimLength,float maxJumpHeight, String name){
        this.runLength=runLength;
        this.swimLength=swimLength;
        this.jumpHeight=jumpHeight;
        this.maxRunLength=maxRunLength;
        this.maxSwimLength=maxSwimLength;
        this.maxJumpHeight=maxJumpHeight;
        this.name=name;
    }

    public void jump(){
        if(this.maxJumpHeight<this.jumpHeight) System.out.println("Животное: "+this.name+" не может прыгнуть выше "+ this.maxJumpHeight+ ". Хотели прыгнуть: "+this.jumpHeight);
        else System.out.println("Животное: "+this.name+" прыгнуло на расстояние "+this.jumpHeight+ ". Максимум= "+this.maxJumpHeight);

    }
    public void run(){
        if(this.maxRunLength<this.runLength) System.out.println("Животное: "+this.name+" не может пробежать больше "+ this.maxRunLength+ ". Хотели пробежать: "+this.runLength);
        else System.out.println("Животное: "+this.name+" пробежало "+this.runLength+ ". Максимум= "+this.maxRunLength);
    }
    public void swim(){
        if(this.maxSwimLength<this.swimLength) System.out.println("Животное: "+this.name+" не может проплыть больше" + this.maxSwimLength+ ". Хотели проплыть: "+this.swimLength);
        else System.out.println("Животное: "+this.name+" пропрыло расстояние "+this.swimLength+ ". Максимум= "+this.maxSwimLength);
    }

    public void setMaxRunLength(float maxRunLength) {
        this.maxRunLength = maxRunLength;
    }

    public void setMaxSwimLength(float maxSwimLength) {
        this.maxSwimLength = maxSwimLength;
    }

    public void setMaxJumpHeight(float maxJumpHeight) {
        this.maxJumpHeight = maxJumpHeight;
    }
}
