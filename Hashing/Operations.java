import java.util.*;

public class Operations {

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>(); // Creation of hashmap

        hm.put("Ind", 21); // Insert value for key
        hm.put("Pak", 20);
        hm.put("Aus", 19);
        System.out.println(hm); // Print the HashMap

        hm.get("India"); // Get value for a Key

        System.out.println(hm.containsKey("Pak")); // Tells whther it contains the key or not

        hm.remove("Aus"); // Removes the key
        System.out.println(hm);
        System.out.println(hm.size()); // Tells the size of hashmap

        Set<String> Keys = hm.keySet(); // Iteration Using Set
        System.out.println(Keys); // Printing the Iteration

        for (String k : Keys) {
            System.out.println("Key = " + k + ", Value = " + hm.get(k));
        }
    }
}