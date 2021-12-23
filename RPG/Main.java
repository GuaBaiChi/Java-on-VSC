import java.util.Scanner;
import rpg.*;

public class Main {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Let's make a new muppet!");
        System.out.println("What's your muppet's name? ");
        String name = scanner.nextLine();
        rpg.Character newCharacter = new rpg.Character(name);

        System.out.println(newCharacter);
    }
}