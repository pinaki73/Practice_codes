import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("....r");
        System.out.println("Enter a string to match");
        Scanner f = new Scanner(System.in);
        String a = f.next();
        Matcher m = p.matcher(a);
        boolean b = m.matches();
        if(b){
            System.out.println("its ok");
        }else {
            System.out.println("its not ok");
        }
    }
}
