package Singleton_Demos;

public class Singleton_Example2 {
    private static Singleton_Example2 s =null;

    private Singleton_Example2() {
    }

    public static Singleton_Example2 getInstance() {
        if (s == null){
            s = new Singleton_Example2();
        }return s;
    }
}