/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pelobello_activity2_bookworm;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import javax.xml.transform.Source;
public class Pelobello_Activity2_BookWorm {
     private static HashMap<String,String> Booklist= new HashMap<String,String>();
     private static  Scanner scan = new Scanner(System.in);
   
    public static void main(String[] args) {
       Menu();
    }
    private static void Menu() {
        System.out.println("1.Store Books \n2. Search Books \n3. Display Books");
        System.out.print("Enter your choice: ");
        int input = scan.nextInt();
        
        switch (input) {
            case 1:
                StoringBooks();
                break; 
                 case 2:
                SearchingBooks(); 
                break;
                case 3:
                DisplayBooks();
                break;
            default:
               
        } 
    }
    private static void StoringBooks() {
        System.out.print("Enter how many Books you want to Store: "); 
        int input = scan.nextInt();
        scan.nextLine();
        
        for (int i = 0; i < input; i++) {
            System.out.print("Enter ISBN#: ");
            String isbnNum = scan.nextLine();
                    
            System.out.println("Enter the Book Information: Title/ Author / Year Publish");
            String books = scan.nextLine();   
            Booklist.put(isbnNum, books);
        }
        System.out.println("1.Store Books \n2. Search Books \n3. Display Books");
        System.out.print("Enter your choice: ");
        int next = scan.nextInt();
        
        switch (next) {
            case 1:
                StoringBooks();
                
                break;
               
                 case 2:
                SearchingBooks();
                
                break;
                case 3:
                DisplayBooks();
                
                break;
            default:       
        }     
    }
    private static void SearchingBooks() { 
        System.out.println("Mary Christmas Aguilnado Library");
        DisplayBooks();
        System.out.print("Input the ISBN#: ");
        scan.nextLine();
        String isbn=scan.nextLine();
        
        if (Booklist.containsKey(isbn)) {
           
            System.out.println("Book information: "+Booklist.get(isbn));
        }
        else{
            System.out.println("Book not Found!");
        }
         System.out.println("1.Store Books \n2. Search Books \n3. Display Books");
        System.out.print("Enter your choice: ");
        int next = scan.nextInt();
        
        switch (next) {
            case 1:
                StoringBooks();
                
                break;
               
                 case 2:
                SearchingBooks();
                
                break;
                case 3:
                DisplayBooks();
                
                break;
            default:      
        }  
    }

    private static void DisplayBooks() {
        System.out.println("List of ISBN #");
        for (String books : Booklist.keySet()) {
            System.out.print(books+" ");
        }
        System.out.println("");
        System.out.print(Booklist.entrySet());
    }
    
}
