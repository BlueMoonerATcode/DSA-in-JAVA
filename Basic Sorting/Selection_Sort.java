import java.util.*;

public class Selection_Sort {

    public static void ss(int numbers[]) {
        for (int i = 0; i < numbers.length - 1; i++) {
            int minpos = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[minpos] > numbers[j]) {
                    minpos = j;
                }
            }
            int temp = numbers[minpos];
            numbers[minpos] = numbers[i];
            numbers[i] = temp;

        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 5, 3, 7, 2, 5, 8, 9, 0 };
        ss(numbers);
    }

}
