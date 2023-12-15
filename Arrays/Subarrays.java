import java.util.*;

public class Subarrays {

    public static void subarray(int numbers[]) {
        int sa = 0;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                for (int k = start; k < end; k++) {
                    System.out.print(numbers[k] + " ");
                }

                sa++;
                System.out.println();
            }
        }
        System.out.println("Subarray Count is: " + sa);

    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        subarray(numbers);

    }
}
