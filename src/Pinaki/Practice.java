package Pinaki;

import javax.xml.namespace.QName;
import java.util.Scanner;

class Overloading{
    public void eat(){
        System.out.println("The person is eating");
    }
    public void eat (int a ){
        System.out.println("Arav is eating");
    }
}
class Study {
    String subject;
    Study (){
        subject = "English";
    }
    Study(String u){
        subject = "Mathematics";

    }
}


public class Practice {
    public static void main(String[] args) {
        Overloading o = new Overloading();
        o.eat();
        o.eat(2);
        Study s = new Study();
        System.out.println(s.subject);
        Study s1 = new Study("ty");
        System.out.println(s1.subject);


    }
}






