import java.util.*;

public class Linear_Search {

    public static int linear_search(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int numbers[] = { 1, 2, 3, 4, 5, 8, 7, 9, 0 };
        int key = 4;
        int index = linear_search(numbers, key);
        if (index == -1) {
            System.out.println("Index not Found");
        } else {
            System.out.println("Index is: " + index);
        }
    }
}
