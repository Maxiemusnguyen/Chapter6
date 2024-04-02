/**
 * Name: Maxiemus Nguyen
 * Class: Itec 2140
 * Program ItelliJ 2023.2
 * Description: the method called in each case is determined by the parameter types provided in the method call. The compiler selects the method with the most specific parameter types that match the arguments provided.
 */
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Create an ArrayList of Integers named dice3
        ArrayList<Integer> dice3 = new ArrayList<>();

        // Generate a random roll of a six-sided die 10 times and add each result to dice3
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            // Generate a random number between 1 and 6 (inclusive)
            int roll = rand.nextInt(6) + 1;
            // Add the roll to dice3
            dice3.add(roll);
        }

        // Print the ArrayList using an enhanced for loop
        System.out.print("dice3 = ");
        for (int num : dice3) {
            System.out.print(num + " ");
        }
    }
}
