package Singleton_Demos;

public class Singleton_Example3 {
    private static Singleton_Example3 s = new Singleton_Example3();

    private  Singleton_Example3() {
    }

    public static synchronized Singleton_Example3 getInstance() {
        return s;
    }
}
