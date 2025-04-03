package Coffeeshop;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class Writeorder {
    public static void writer(){
        Scanner scanner = new Scanner(System.in);
        File file = new File("Orders.csv");
        System.out.println("Please enter the name of the customer");
        String name = scanner.nextLine();
        System.out.println("Please enter the date of the order");
        String address = scanner.nextLine();
        System.out.println("Please enter the price of the order");
        double price = scanner.nextDouble();
        System.out.println("Please enter the address of the costumer");
        String costumer = scanner.nextLine();
        File file = new File("Order.csv");
        try {
            Writer writer = new FileWriter(file,true);
            writer.write(name + "," + address + "," + price + "," + costumer);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);

        }


    }
}
