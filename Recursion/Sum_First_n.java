public class Sum_First_n {
    public static int sum_first_n(int n) {
        if (n == 1) {
            return 1;
        }
        int sumnm1 = sum_first_n(n - 1);
        int sum = n + sum_first_n(n - 1);
        return sum;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(sum_first_n(n));
    }
}
