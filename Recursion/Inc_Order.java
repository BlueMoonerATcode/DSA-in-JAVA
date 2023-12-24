public class Inc_Order {

    public static void print_dec(int n) {
        if (n == 1) {
            System.out.println(1);
            return;
        }
        print_dec(n - 1);
        System.out.println(n);

    }

    public static void main(String[] args) {
        int n = 10;
        print_dec(n);
    }

}
