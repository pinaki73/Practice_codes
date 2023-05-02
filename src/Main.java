import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Contacts c1 = new Contacts("Pinaki", "Roy", "Satyajignagar","Asansol", "West Bengal",713304,709008980,"pinaki.roy77759@gmail.com");
        Contacts c2 = new Contacts("prootik", "ganguly", "kulti","Asansol", "West Bengal",713305,6743673,"pratik77759@gmail.com");
        Contacts c3 = new Contacts("anirban", "chateerje", "burnpur","Asansol", "West Bengal",713325,709076980,"anirban.roy77759@gmail.com");
        List<Contacts> Addressbook = new ArrayList<Contacts>();
        Addressbook.add(c1);
        Addressbook.add(c2);
        Addressbook.add(c3);
        System.out.println(Addressbook);
        Addressbook.set(2,new Contacts("raj", "chateerje", "burnpur","Asansol", "karnataka",713325,709076980,"anirban.roy77759@gmail.com"));
        System.out.println(Addressbook);
    }
}