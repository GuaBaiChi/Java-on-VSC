import java.util.Scanner;
import java.util.ArrayList;

public class assignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to read the programming specifications for this assignment?");
        System.out.println("WARNING: Huge wall of text!");
        System.out.println("Write \"yes\" to see the programming specifications");
        String userInput = scanner.nextLine();
        if (userInput.equals("yes")) {
            specifications();
        }

        ArrayList<Integer> gradeList = new ArrayList<Integer>();
        while (true) {
            System.out.println("Enter an integer for a grade, 1-998, 999 to quit.");

            // Get grade
            int grade = scanner.nextInt();

            // If `999` then break
            if (grade == 999) {
                System.out.println("You entered, \"999\", that's the end");
                break;
            } else {
                // Otherwise, add the grade
                gradeList.add(grade);
            }

            // If gradeList has 10 grades then break
            if (gradeList.size() == 10) {
                System.out.println("Ten is enough");
                break;
            }

        } // end of while loop
        System.out.println("Here's all the grades: ");
        for (int grade : gradeList) {
            System.out.println(grade);
        }
        System.out.print("Here's the avarage of the grades: ");
        int sum = 0;
        int avg = 0;
        for (int grade : gradeList) {
            sum = sum + grade;
            avg = sum/gradeList.size();
        }
        System.out.print(avg);
        System.out.println();

        System.out.print("The letter grade of the average is: ");
        if (avg >= 90) {
            System.out.print("A");
        }
        if (avg >= 89 && avg <= 80) {
            System.out.print("B");
        }
        if (avg >= 79 && avg <= 70) {
            System.out.print("C");
        }
        if (avg >= 69 && avg <= 60) {
            System.out.print("D");
        }
        if (avg <= 59) {
            System.out.print("F");
        }
    }

    public static void specifications(){
        System.out.println("The programming specifications for this assignment are: ");
        System.out.println("1: Printing this list");
        System.out.println("2: Expand the Project Program and create Java code to input from the console (keyboard) the first quiz grade. Use a loop to allow the user to continue to enter grades as long as they don't enter 999 to quit. ");
        System.out.println("3: Expand the Project Program and create Java code to populate the array of the student's quiz grades. The grade is added to a running total, and the count of grades entered is incremented. If the grade entered is the 10th grade, the grade is forced to 999 and the loop ends; otherwise, the user enters another quiz grade. When the loop ends count holds the number of grades entered.");
        System.out.println("4: Expand the Project Program and create Java code use another loop to print all grades in the array. ");
        System.out.println("5: Expand the Project Program and create Java code to compute the average quiz grade.");
        System.out.println("6: Expand the Project Program and create Java code to use decision logic to find out the letter grade of the average based on the following grading scale and print to the console. ");
        System.out.println("7: A = 90-100 B = 80-89 C = 70-79 D = 60-69 F = 0-59 ");
        System.out.println("The programming specifications can be reviewed at the following url: ");
        System.out.println("https://study.com/academy/lesson/programming-in-java-assignment-developing-a-java-program.html");
        System.out.println();
    }
}