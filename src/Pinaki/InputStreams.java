package Pinaki;

import java.io.FileInputStream;

public class InputStreams {
    public static void main(String[] args) {
        try{
            FileInputStream f = new FileInputStream("C:\\Users\\POPYE\\Practice\\src\\Pinaki\\IOstreams");
            int i = 0;
            while ((i= f.read()) != -1){
                System.out.print((char)i);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
