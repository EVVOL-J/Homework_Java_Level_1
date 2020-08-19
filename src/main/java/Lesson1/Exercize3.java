package Lesson1;

public class Exercize3 {
    public static void main(String[] args) {
        float a=5f, b=4f, c=0.5f, d=3.5f;
        System.out.println("a*(b+(c/d))= "+a+"*("+b+"+("+c+"/"+d+"))="+ formula(a,b,c,d));
    }
    private static float formula(float a, float b, float c, float d){
        return a*(b+(c/d));
    }
}
