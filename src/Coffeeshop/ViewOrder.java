package Coffeeshop;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.Scanner;



public class ViewOrder {
    public static void readOrder() {
        try{
            File file = new File("Order.csv");
            Scanner scanner = new Scanner(file);
            String answer = "yes";
            while (answer.equals("yes")) {
                System.out.println("Enter date","yyyy","mm","dd");
                String date = scanner.nextLine();
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    String [] parts = line.split(",");
                    if (parts [1].equals(date)) {
                        System.out.println("order placed: " + parts[1] + "Costumer name" + parts[0] );
                        System.out.print("Do you want to continue? (Y/N): ");
                        answer = scanner.nextLine();
                    }
                }
                if (answer.equals("no")) {
                    System.out.println("See you next time");
                    break;
                }
            }
    }   catch (FileNotFoundException e) {
            System .err.println(e);
        }
    }


}
