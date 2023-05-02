public class Practice_abstract {
    public static void main(String[] args) {
        Vehicles.Car c1 = new Vehicles.Car();
        c1.transportation();

    }
}
abstract class Vehicles {
    public void transportation() {
        System.out.println("Vehicles move elements from one place to another");
    }
    static class Car extends Vehicles {
        public void transportation(){
            System.out.println("cars move different sizes of elements");
        }
    }
}
