import java.util.List;

public class list_of_stars {
    public static void main(String[] args) {
        int[] numbers = {3, 7, 1, 1, 2};
        int size = numbers.size();
        String stars = ("*");
        
        for (int i : numbers) {
                while (i <= numbers.length);
                System.out.print(stars);
                stars += "*";
                }
            System.out.println("");
    }
}