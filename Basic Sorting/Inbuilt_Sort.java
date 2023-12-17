import java.util.Arrays;

public class Inbuilt_Sort {

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        int arr[] = { 4, 7, 8, 9, 2, 4, 5, 6, 7, 9 };
        Array.sort(arr);
        print(arr);
    }
}
