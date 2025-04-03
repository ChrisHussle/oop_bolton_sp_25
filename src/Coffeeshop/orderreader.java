package Coffeeshop;

import javax.sound.midi.Soundbank;
import java.io.File;
import java.io.FileNotFoundException;
import java.net.Socket;
import java.sql.SQLOutput;
import java.util.Scanner;

public class orderreader {
    public static void read(){
        File file = new File("order.csv");
        try (Scanner scanner = new Scanner (file)){
            char char ans;
            (ans == 'Continue')
                    System.out.println("Wnter the date of the order");
                    String date = scanner.nextLine();
                    
                    if (scanner.hasNextLine()){
                        scanner.nextLine();
                    }

                    boolean found = false;

                    while (scanner.hasNextLine()){
                        String line = scanner.nextLine();
                        if (line.equals(date)){
                            found = true;
                            String parts;
                            System.out.println("Order received:" + parts[0] "at" parts[3] );

                        }
                    }
                    if (!found){
                        System.out.println("Order has not been found");
                    }

                    System.out.println("Do you wish to continue? (Y/N)");
                    ans= Scanner.nextLine();

        }   catch (FileNotFoundException fe){
            System .err.println(fe);
        }
    }
}
