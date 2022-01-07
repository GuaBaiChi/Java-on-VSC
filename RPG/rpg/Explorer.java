package rpg;
import java.util.Scanner;

public class Explorer {
    private Character character;

    public Explorer(Character character) {
        this.character = character;
    }
    
    public static void Explore(){
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Do you want to go outside? There's monsters!(yes/no)");
                String answer = scanner.nextLine();
    
            if (answer.equals("no")) {
                System.out.println("Okay, you stay inside.");
                System.out.println("You get bored of staring at the wall for hours... ");
                System.out.println("");
                System.out.println("- - -");
            } else if (answer.equals("yes")) {
                System.out.println("Okay let's go!");
                System.out.println("");
                Encounter();
            } else {
                System.out.println("Hint: next time you are asked, try using, 'yes' or 'no'.");
                System.out.println("");
                System.out.println("- - -");
            }
        }
    }

    public static void Encounter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("In the distance you see a monster, do you want to see what it is?(yes/no)");
        String answer = scanner.nextLine();
        if (answer.equals("no")){
            System.out.println("");
            System.out.println("- - -");
            Encounter();
        } else if (answer.equals("yes")) {
            BattleMenu.Encounter();
        } else {
            System.out.println("Sorry I didn't get that.");
            System.out.println("Maybe you had a stroke.");
            System.out.println("You wake up back at home very confused.");
            System.out.println("");
            System.out.println("- - -");
            Explore();
        }
    }
}
