public class Fibonacci_series_using_recurssion {
    int a = 0;
    int b = 1;
    int c = 0;

    void print(int n) {
        if (n > 0) {
            print(n - 1);
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;

        }
    }

    public static void main(String[] args) {
        Fibonacci_series_using_recurssion f = new Fibonacci_series_using_recurssion();
        f.print(20);
    }
}





