import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_for_emailValidate {
    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);
        System.out.println("Enter an email id to validate");
        Pattern p = Pattern.compile("^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$");
        String s = f.next();
        Matcher m = p.matcher(s);
        boolean b = m. matches();
        if (b){
            System.out.println("The email is valid");
        }else {
               throw new RuntimeException("Its an invalid email address");
                 }
           }
}
