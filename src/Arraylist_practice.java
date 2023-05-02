import java.util.ArrayList;
import java.util.List;
class Student3{
    private String name;
    private int rollno;
    public void setRollno(int roll){
        this.rollno = roll;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }
}
public class Arraylist_practice {
    public static void main(String[] args) {
        Student3 s1 = new Student3();
        s1.getName();
        s1.getRollno();
        List <Student3> a1 = new ArrayList <Student3>();
        a1.add(s1);
        a1.add(s1);
        a1.add(s1);
        System.out.println(s1);
    }
}
