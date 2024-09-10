public class Recursion {
    // public static int calcfactorial(int n) {
    // if(n == 1 || n == 0){
    // return 1;
    // }
    // int fact_nm1 = calcfactorial(n-1);
    // int factorial = n * fact_nm1;
    // return factorial;
    // }
    // public static void main(String[] args) {
    // int n = 5;
    // int ans = calcfactorial(n);
    // System.out.println(ans);
    // }

    // public static void printFib(int a, int b, int n) {
    // if(n == 0){
    // return;
    // }
    // int c = a + b;
    // System.out.println(c);
    // printFib(b, c, n-1);
    // }
    // public static void main(String[] args) {
    // int a=0, b=1;
    // System.out.println(a);
    // System.out.println(b);
    // int n=7;
    // printFib(a, b, n-2);
    // }

    public static int calPower(int x, int n) {
        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        if (n % 2 == 0) {
            // even
            return calPower(x, n / 2) * calPower(x, n / 2);
        } else {
            // odd
            return calPower(x, n / 2) * calPower(x, n / 2) * x;
        }
    }

    public static void main(String[] args) {
        int x = 2, n = 5;
        int ans = calPower(x, n);
        System.out.println(ans);
    }
}
