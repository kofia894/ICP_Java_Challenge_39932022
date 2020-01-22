package essentialsstore;

import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

/** 
 * This class has a method to write the information assigned to the variables to a file and its backup
 * @author Kofi Omari Asante and Anthony Basingnaa
 */

public class Essentials{
    String item;
    float price;
    int quantity;
    

    public Essentials(){
        String item = "";
        float price = 0;
        int quantity =  0; 
    }

    public Essentials(String item, float price, int quantity){
        this.item = item;
        this.price = price;
        this.quantity = quantity; 
    }

    public String getItem(){
        return item;
    }

    public float getPrice(){
        return price;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setItem(String newItem){
        this.item = newItem;
    }

    public void setPrice(float newPrice){
        this.price = newPrice;
    }

    public void setQuantity(int newQuant){
        this.quantity = newQuant;
    }

    public void itemInfo(){
        System.out.println("Item: " + item + ", Quantity: " + quantity + ", Price: " + price);
    }

    public void writingTextToFile(){
        PrintWriter writer = null;
        PrintWriter writerb = null;
    		
    	try {
    		//Note that we are able to append to the file because of the "true" parameter
			writer = new PrintWriter(new FileOutputStream("essentials_stock.txt", true));
		}catch(FileNotFoundException exception) {
			exception.getMessage();
        }
        //writes the items entered to the file
        writer.print(item + " "+ quantity + " " + "GHc" + price);
        writer.println();

        writer.close();

        try {
    		//Creates the backup file of the file been written to
			writerb = new PrintWriter(new FileOutputStream("backup_essentials_stock.txt", true));
		}catch(FileNotFoundException ex) {
			ex.getMessage();
        }
        // writes tothe backup file right after it writes to the main file
        writerb.print(item + " "+ quantity + " " + "GHC" + price);
        writerb.println();

        writerb.close();

    } 
}