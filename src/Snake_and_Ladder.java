import java.util.Scanner;

public class Snake_and_Ladder {
    public static void main(String[] args) {
        int startposition = 1;
        int count = 0;
        while (startposition!=100) {
            int roll = (int) (Math.random() * 10) % 6;
            System.out.println("The number received by the rolling of dice is "+" "+roll);
            int option =(int) (Math.random() * 10) % 3;
                if (option == 0) {
                    startposition = startposition;
                    System.out.println("Its a no play");
                    System.out.println("The starting position is"+" " + startposition);
                } else if (option == 1) {
                    startposition = startposition + roll;
                    System.out.println("Its a Ladder");
                    System.out.println("The starting position is"+" " + startposition);
                }else {
                    startposition = startposition - roll;
                    System.out.println("Its a snake ");
                    System.out.println("The starting position is"+" "+startposition);
                }
                count++;
            }
            System.out.println("The no of times the dice was rolled to win the game ="+" "+count);

        }
    }

