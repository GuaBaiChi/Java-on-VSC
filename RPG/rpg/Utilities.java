package rpg;
import java.util.Random;

public class Utilities {
    private int min;
    private int max;

    public Utilities() {
        this.min = 8;
        this.max = 20;
    }

    public static int randomNumber(int min, int max) {
        Random rando = new Random();

        int number = rando.nextInt(max - min); // Number in [0,bound]

        return min + number; // Number in [min, max]
    }
}
