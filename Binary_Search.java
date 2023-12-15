import java.util.*;

public class Binary_Search {
    public static int binary_search(int numbers[], int key) {
        int start = 0, end = numbers.length - 1;
        while (start <= end) {
            int mid = ((start + end) / 2);
            if (numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14 };
        int key = 12;
        int index = binary_search(numbers, key);
        if (index == -1) {
            System.out.println("Index not Found");
        } else {
            System.out.println("Index is: " + index);
        }
    }
}
