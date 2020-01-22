package essentialsstore;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;
/** 
 * This class accepts data to stock and calls the method to write the test to the file
 * @author Kofi Omari Asante and Anthony Basingnaa
 */


public class StockItems{    

     /**
     * This is the main program that receives input from the keyboard and writes it to 
     * the file
     * @param args 
     */
    public static void main(String[] args) throws InputMismatchException{
        Scanner numItems = new Scanner(System.in);
        System.out.println("Enter number of items to stock: ");
        int num = numItems.nextInt();

// The loop runs and items are received until number of items to stock entered, have been entered.
        for(int i = 0;i < num; i++){
            Scanner item = new Scanner(System.in);
            System.out.println("Enter name of item: ");
            String nItem = item.nextLine();
            

            Scanner price = new Scanner(System.in);
            System.out.println("Enter price of item: ");
            float nPrice = price.nextFloat();

            Scanner quantity = new Scanner(System.in);
            System.out.println("Enter quantity of item: ");
            int nQuant = quantity.nextInt();

            Essentials item1 = new Essentials(nItem, nPrice, nQuant);
            item1.itemInfo();

            item1.writingTextToFile();
        }
        
    } 
}