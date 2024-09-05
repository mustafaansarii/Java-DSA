import java.util.ArrayList;
import java.util.Arrays;

public class par_sum_I {
    public static void par_sum(ArrayList<Integer> Pair, int target) {
        boolean found = false; // Variable to track if a pair is found

        for (int i = 0; i < Pair.size(); i++) {
            for (int j = i + 1; j < Pair.size(); j++) { // Corrected condition here
                if (Pair.get(i) + Pair.get(j) == target) {
                    System.out.println("True");
                    found = true;
                    break; // Exit the inner loop
                }
            }
            if (found) {
                break; // Exit the outer loop
            }
        }

        if (!found) {
            System.out.println("False");
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> pair = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        par_sum(pair, 77); // Example with target 77
    }
}
