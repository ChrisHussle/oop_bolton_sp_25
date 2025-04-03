package Coffeeshop;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class amountpaid {
   public static double sum= 0.0;
    public static void amount() {
        try {
            File file = new File("Order.csv");
            Scanner scanner = new Scanner(file);
            System.out.println("GiveCustomerName");
            String answer = scanner.nextLine();
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                while (scanner.hasNextLine()) {
                    sum = sum + Double.parseDouble(parts[parts.length - 1]);
                    System.out.println(parts[0] + "paid" + sum);
                }
            }

        }catch (FileNotFoundException fe){
            System.err.println(fe);
        }
    }
}
