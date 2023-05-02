package Pinaki;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

class Demo{
    String n;

    }

public class OutputStreams {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.n ="60";
        try{
            FileOutputStream o = new FileOutputStream("C:\\Users\\POPYE\\Practice\\src\\Pinaki\\writeIOstreams.txt");
            byte b1[] = d.n.getBytes();
            o.write(b1);
            o.close();
            System.out.print("Its done");
            } catch(Exception e){
            e.printStackTrace();

        }

    }
        }


