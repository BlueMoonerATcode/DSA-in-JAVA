public class Fibonaci {
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fnm1 = fib(n - 1);
        int fnm2 = fib(n - 2);
        int fibN = fnm1 + fnm2;
        return fibN;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("The Fibonacci Series till " + n + " is: ");
        System.out.println(fib(1));
        System.out.println(fib(2));
        System.out.println(fib(3));
        System.out.println(fib(4));
        System.out.println(fib(5));
        System.out.println(fib(6));
        System.out.println(fib(8));
        System.out.println(fib(9));
        System.out.println(fib(n));
    }
}
