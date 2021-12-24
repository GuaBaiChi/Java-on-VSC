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
        
        rpg.Explorer.Explore(Character newCharacter);
        rpg.Explorer.Explore(Character name);
        rpg.Explorer.Explore(rpg.Character newCharacter);
        rpg.Explorer.Explore(rpg.Character name);

        

    }
}