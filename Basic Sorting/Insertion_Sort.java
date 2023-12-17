import java.util.*;

public class Insertion_Sort {

    public static void is(int numbers[]) {

        for (int i = 1; i < numbers.length; i++) {
            int curr = numbers[i];
            int prev = i - 1;
            while (prev >= 0 && numbers[prev] > curr) {
                numbers[prev + 1] = numbers[prev];
                prev--;
            }
            numbers[prev + 1] = curr;
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 5, 3, 7, 2, 5, 8, 9, 0 };
        is(numbers);
    }

}
