/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject54;

import java.util.Scanner;

/**
 *
 * @author Yassi
 */
public class Mavenproject54 {

    public static void main(String[] args) {
      PhoneBook pb = new PhoneBook();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Phonebook Menu ---");
            System.out.println("1. Insert Contact");
            System.out.println("2. Search Name");
            System.out.println("3. Update Phone");
            System.out.println("4. Delete Contact");
                    
            System.out.println("5. Display All (Sorted)");
            System.out.println("6. Isolate '0100' Contacts");
            System.out.println("7. Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Name: "); String n = sc.nextLine();
                    System.out.print("Phone: "); String p = sc.nextLine();
                    pb.insert(n, p);
                    System.out.println("Name inserted successfully!");
                    break;
                case 2:
                    System.out.print("Enter Name: ");
                    Node res = pb.findNode(sc.nextLine());
                    System.out.println(res != null ? "Phone: " + res.phoneNumber : "Not found");
                    break;
                case 3:
                    System.out.print("Name: "); String un = sc.nextLine();
                    System.out.print("New Phone: "); String up = sc.nextLine();
                    pb.update(un, up);
                    
                    break;
                case 4:
                    System.out.print("Name to delete: ");
                    pb.remove(sc.nextLine());
                    
                    break;
                case 5:
                    pb.displaySorted(pb.getRoot());
                    break;
                case 6:
                    pb.isolatePrefix(pb.getRoot(), "0100");
                    break;
            }
        } while (choice != 7);
    
   
    }
}
