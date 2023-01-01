import java.util.Arrays;
import java.util.LinkedHashSet;

public class Set2D {
    public static void main(String[] args) {
        LinkedHashSet<LinkedHashSet<String>> set  = new LinkedHashSet<>();
        // Creating R0
        set.add(new LinkedHashSet<>(
                Arrays.asList("Apple", "Orange")));
        // Creating R1, here "Coffee" will be considered as
        // only one object to maintain uniqueness
        set.add(new LinkedHashSet<>(Arrays.asList(
                "Tea", "Coffee", "Milk", "Coffee", "Water")));
        // Creating R2
        set.add(new LinkedHashSet<>(
                Arrays.asList("Tomato", "Potato", "Onion")));
        // Creating R3 but it will not be added as it
        // contains the same items as R2 .... if two rows are contains same values in both
        //Order does not matter
        // Note: LinkedHashSet inserts only unique items
        set.add(new LinkedHashSet<>(Arrays.asList("Orange", "Apple")));
        System.out.println(set);
        //RETURN TYPE IS Set
    }
}
