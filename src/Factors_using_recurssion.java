import java.util.Scanner;

public class Factors_using_recurssion {

     void m1(int n, int i) {
        if (n >= i) {
        } if (n % i == 0) {
            System.out.println(i);
        }m1(n, i+1);
    }


    public static void main(String[] args) {
        Factors_using_recurssion f1 = new Factors_using_recurssion();
        f1.m1(14, 1);
    }
}



