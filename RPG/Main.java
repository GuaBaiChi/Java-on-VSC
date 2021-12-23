import java.util.Scanner;
import rpg.*;

public class Main {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Let's make a new muppet!");
        System.out.println("What's your muppet's name? ");
        String name = scanner.nextLine();
        rpg.Character newCharacter = new rpg.Character(name);
        String monster = "monster";
        rpg.Character monsterCharacter = new rpg.Character(monster);

        System.out.println("");
        System.out.println(newCharacter);
        System.out.println("");
        System.out.println(monsterCharacter);

        System.out.println("Let's fight!");

        System.out.println(name + " health: " + name.rpg.getHealth());
        System.out.println(name + " health: " + name.getHealth());
        System.out.println(name + " health: " + rpg.name.getHealth());
        System.out.println(name + " health: " + name.getHealth());


    }
}