package Pinaki;


import java.util.Hashtable;

class Cars{
    String Brand;
    String Model;
    String Colour;
    String Type;
    int Price;
    Cars(String brand, String model, String colour, String type, int price){
        Brand = brand;
        Model = model;
        Colour = colour;
        Type = type;
        Price = price;

    }

    @Override
    public String toString() {
        return ("Brand = " +Brand+";"+" "+ "Model = "+Model+";"+" "+"Colour = " +Colour+";"+" "+"Type = "+Type+";"+" "+"Price = "+Price);
    }
}
public class HashMap_Practice {
    public static void main(String[] args) {
        Cars c1 = new Cars("BMW", "X1", "Red","Sedan",4000000);
        Cars c2 = new Cars("Toyota", "Camry", "Blue","Sedan",30000000);
        Cars c3 = new Cars("Tata", "Nexon", "Black","CompactSuv",2000000);
        Cars c4 = new Cars("Hyundai", "Creta", "White","suv",1000000);
        Hashtable<String, Cars> ListOfCars = new Hashtable<String, Cars>();
        ListOfCars.put(c1.Model, c1);
        ListOfCars.put(c2.Model, c2);
        ListOfCars.put(c3.Model, c3);
        ListOfCars.put(c4.Model, c4);
        ListOfCars.forEach((k,v) -> System.out.println(k +":"+" "+ v));
    }
}
