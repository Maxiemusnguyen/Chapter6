/**
 * Name: Maxiemus Nguyen
 * Class: Itec 2140
 * Program ItelliJ 2023.2
 * Description: the method called in each case is determined by the parameter types provided in the method call. The compiler selects the method with the most specific parameter types that match the arguments provided.
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[] list1 = {1, 2, 3, 4, 5, 6, 6, 6, 7, 8, 8, 8, 9, 10};
        int[] list2 = {2, 4, 8, 10, 12, 14, 16, 18, 20};

        Set<Integer> set1 = new HashSet<>();
        for (int num : list1) {
            set1.add(num);
        }

        Set<Integer> set2 = new HashSet<>();
        for (int num : list2) {
            set2.add(num);
        }

        ArrayList<Integer> intersection = new ArrayList<>();
        for (int num : set1) {
            if (set2.contains(num)) {
                intersection.add(num); // Add the common element to the intersection list
            }
        }

        // Print the intersection ArrayList
        System.out.print("intersection = ");
        for (int num : intersection) {
            System.out.print(num + " ");
        }
    }
}
