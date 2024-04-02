/**
 * Name: Maxiemus Nguyen
 * Class: Itec 2140
 * Program ItelliJ 2023.2
 * Description: the method called in each case is determined by the parameter types provided in the method call. The compiler selects the method with the most specific parameter types that match the arguments provided.
 */
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<LocalDate> centennials = new ArrayList<>();
        centennials.add(LocalDate.of(1776, Month.JULY, 4));
        centennials.add(LocalDate.of(1876, Month.JULY, 4));
        centennials.add(LocalDate.of(1976, Month.JULY, 4));
        centennials.add(LocalDate.of(2076, Month.JULY, 4));

        // Date to search for
        LocalDate searchDate = LocalDate.of(1876, Month.JULY, 4);

        // Check if the searchDate is present in the ArrayList
        boolean present = centennials.contains(searchDate);

        // Print the result
        if (present) {
            System.out.println("The centennial date (1876) is present.");
        } else {
            System.out.println("The centennial date (1876) is not present.");
        }
    }
}
