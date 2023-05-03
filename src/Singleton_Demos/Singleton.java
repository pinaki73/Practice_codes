package Singleton_Demos;

class Singleton_Example{
    private static Singleton_Example s = new Singleton_Example();
    private Singleton_Example() {}
    public static Singleton_Example getInstance(){
        return s;
    }
}

public class Singleton {
    public static void main(String[] args) {
        Singleton_Example3 s1= Singleton_Example3.getInstance();
        System.out.println(s1.hashCode());
        Singleton_Example3 s2 = Singleton_Example3.getInstance();
        System.out.println(s2.hashCode());

    }

}

