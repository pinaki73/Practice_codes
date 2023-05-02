import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex_for_phno {
    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);
        System.out.println("Enter a string to match");
        String s = f.next();
        String regex = "[6-9][0-9]{10}";
        System.out.println(Pattern.matches(regex,s));
    }
}
