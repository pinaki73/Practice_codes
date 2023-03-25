class Student {
    String name;
    int rollno;

    Student(String n, int r) {
        this.name = n;
        this.rollno = r;
    }
}

public class Pinaki {
    public static void main(String[] args) {
        int rollno = 34;
        String name = "pinaki";
        Student s1 = new Student(name,rollno);
        System.out.println(s1.name);
        System.out.println(s1.rollno);
    }
}





