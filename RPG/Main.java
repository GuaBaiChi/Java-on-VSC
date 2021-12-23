package RPG;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Let's make a new muppet!");
        System.out.println("What's your muppet's name? ");
        String name = scanner.nextLine();
        int min = 8;
        int max = 20;

        int strength = Utilities.randomNumber();
        int intelligence = Utilities.randomNumber();
        int dexterity = Utilities.randomNumber();
        Character newCharacter = new Character(name, strength, intelligence, dexterity);

        //System.out.println(newCharacter);

        System.out.println(newCharacter.toString());

    }
}

// 1) Write a function called randomNumber that accepts two integers as arguments. 
// The arguments should be called min and max. 
// The function should return a number within the range min and max.

