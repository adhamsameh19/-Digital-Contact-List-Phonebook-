/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject58;

import java.util.Scanner;

/**
 *
 * @author Yassi
 */
public class Mavenproject58 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        Phonebook myBook = new Phonebook(100);
        int choice;

        do {
            System.out.println("\n--- Phonebook Menu ---");
            System.out.println("1. Add Contact");
            System.out.println("2. Search Contact");
            System.out.println("3. Remove Contact");
            System.out.println("4. Update Contact");
            System.out.println("5. Display All (Sorted)");
            System.out.println("6. Show 0100 Contacts");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Number: ");
                    String num = sc.nextLine();
                    myBook.insert(new Contact(name, num));
                    break;
                case 2:
                    System.out.print("Enter Name to search: ");
                    int idx = myBook.search(sc.nextLine());
                    if(idx!=-1){
                        System.out.println("Found at index: "+idx);
                    }
                    else{
                        System.out.println("not found");
                    }
                    
                    break;
                case 3:
                    System.out.print("Enter Name to remove: ");
                    myBook.remove(sc.nextLine());
                    break;
                case 4:
                    System.out.print("Enter Name to update: ");
                    String uName = sc.nextLine();
                    System.out.print("Enter New Number: ");
                    String uNum = sc.nextLine();
                    myBook.updateExistingOne(uName, uNum);
                    break;
                case 5:
                    myBook.display();
                    break;
                case 6:
                    myBook.isolate0100();
                    break;
            }
        } while (choice != 7);
        sc.close();
    }
}
