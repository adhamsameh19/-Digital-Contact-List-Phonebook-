/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject58;

/**
 *
 * @author Yassi
 */
public class Phonebook {
    public Contact[] elem;
    public int last;
    public int maxSize;

    public Phonebook(int maxSize) {
        this.maxSize = maxSize;
        this.elem = new Contact[maxSize];
        this.last = -1;
    }


    public boolean isEmpty() { 
        return last == -1; 
    }
    public boolean isFull() { 
        return last == maxSize - 1; 
    }
    public int size() { 
        return last + 1; 
    }

    
    public void insert(Contact c) {
        if (isFull()) {
            System.out.println("Phonebook is full!");
            return;
        }
      
        int p = 0;
        while (p <= last && elem[p].name.compareToIgnoreCase(c.name) < 0) {
            p++;
        }

        
        for (int i = last; i >= p; i--) {
            elem[i + 1] = elem[i];
        }
        elem[p] = c;
        last++;
        System.out.println("Contact added successfully.");
    }

    
    public int search(String name) {
        for (int i = 0; i <= last; i++) {
            if (elem[i].name.equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1;
    }

    
    public void remove(String name) {
        int pos = search(name);
        if (pos == -1) {
            System.out.println("Contact not found.");
            return;
        }
        for (int i = pos; i < last; i++) {
            elem[i] = elem[i + 1];
        }
        last--;
        System.out.println("Contact removed.");
    }

    
    public void updateExistingOne(String name, String newnumber) {
        int pos = search(name);
        if (pos != -1) {
            elem[pos].phoneNumber = newnumber;
            System.out.println("Phone number updated.");
        } else {
            System.out.println("Contact does not exist.");
            return;
        }
    }

    
    public void display() {
        if (isEmpty()) {
            System.out.println("Phonebook is empty.");
            return;
        }
        for (int i = 0; i <= last; i++) {
            System.out.println(elem[i]);
        }
    }

    
    public void isolate0100() {
        System.out.println("Contacts starting with 0100:");
        boolean found = false;
        for (int i = 0; i <= last; i++) {
            if (elem[i].phoneNumber.startsWith("0100")) {
                System.out.println(elem[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No contacts match the criteria.");
        }
    }
}
