import java.util.Hashtable;
import java.util.Map;

public class HashTable {
    public static void main(String[] args) {
        Hashtable<Integer, String> player = new Hashtable<>();
        player.put(7, "VIRAT");
        player.put(10, "DHONI");
        player.put(45, "ROHIT");
        for (Map.Entry m : player.entrySet()) {
            System.out.println(m.getKey() +" "+ "is the jersey no" +" "+ "and"+" " + m.getValue() +" "+ "is the player name");
        }
    }
}
