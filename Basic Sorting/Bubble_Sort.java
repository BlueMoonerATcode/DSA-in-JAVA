import java.util.*;

public class Bubble_Sort {

    public static void bs(int numbers[]) {
        for (int turn = 0; turn < numbers.length - 1; turn++) {
            for (int j = 0; j < numbers.length - 1 - turn; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    // Swap
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    public static void main(String[] args) {
        int numbers[] = { 5, 6, 7, 3, 2, 8, 1, 0, };
        bs(numbers);

    }
}
