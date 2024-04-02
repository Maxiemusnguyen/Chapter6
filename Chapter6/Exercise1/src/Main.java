/**
 * Name: Maxiemus Nguyen
 * Class: Itec 2140
 * Program ItelliJ 2023.2
 * Description: the method called in each case is determined by the parameter types provided in the method call. The compiler selects the method with the most specific parameter types that match the arguments provided.
 */
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Create an array named dice1
        int[] dice1 = new int[10];

        // Populate each array location
        Random rand = new Random();
        for (int i = 0; i < dice1.length; i++) {
            // Generate a random number
            dice1[i] = rand.nextInt(6) + 1;
        }

        // Print the array
        System.out.print("dice1 = ");
        for (int num : dice1) {
            System.out.print(num + " ");
        }
    }
}
