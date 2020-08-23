package Lesson3;

import java.util.Random;
import java.util.Scanner;

public class Exercise2 {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {


        while (true) {
            guessWord();
            System.out.println("play yet? Yes=1 NO=enter any symbol");
            if((scan.nextLine()).charAt(0)!='1') break;
        }
        scan.close();
    }

    private static void guessWord() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
                "broccoli", "carrot", "cherry", "garlic",
                "grape", "melon", "leak", "kiwi", "mango", "mushroom",
                "nut", "olive", "pea", "peanut", "pear", "pepper",
                "pineapple", "pumpkin", "potato", "meat"};
        Random rand = new Random();
        String ourWord="null";
        String guessWor=words[rand.nextInt(words.length)];
        System.out.println("guess the food");
        while(true){
            System.out.println("Enter new word");
            ourWord=scan.nextLine();
            if(ourWord.equals(guessWor)) break;
            String secret="";
            for(int i=0;i<((ourWord.length()<guessWor.length()) ? ourWord.length():guessWor.length());i++){
                secret+=(ourWord.charAt(i)==guessWor.charAt(i)) ? ourWord.charAt(i):'#';
            }
            for(int i=secret.length()+1;i<16;i++) secret+='#';
            System.out.println(secret);

        }
        System.out.println("You guessed");
    }
}
