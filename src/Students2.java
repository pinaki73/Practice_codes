import java.util.Scanner;

public class Students2 {
   String studentname;
   int standard;
   int rollno;
   long phonenumber;
   int homework;
   int extraclasses;

   public int homework(int tc, int th){
      homework = tc*th;
      System.out.println("the homework done is"+homework);
      return homework;
   }
   public int extraclasses(int tc){
      extraclasses = tc+2;
      System.out.println("the extra classes done is"+extraclasses);
      return extraclasses;
   }
   public String displayname(){
      String mn = "anubhav";
      System.out.println(""+mn);
      return mn;
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the no of classes");
      int totalclasses = sc.nextInt();
      System.out.println("enter the no hours");
      int totalgivenhours = sc.nextInt();
      Students2 s1 = new Students2();
      s1.studentname = "roy";
      s1.standard = 10;
      s1.rollno = 45;
      s1.phonenumber = 789567483;
      System.out.println(s1.studentname);
      System.out.println(s1.rollno);
      System.out.println(s1.standard);
      System.out.println(s1.phonenumber);
      s1.homework(totalclasses, totalgivenhours);
      s1.extraclasses(totalclasses);
      s1.displayname();
   }

}



