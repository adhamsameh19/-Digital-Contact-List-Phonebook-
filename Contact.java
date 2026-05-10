/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject58;

/**
 *
 * @author Yassi
 */
public class Arraylist {
    
   public int[] elem; 
   public int last; 
    public int maxSize; 
 

    public Arraylist(int maxSize) { 
        this.maxSize = maxSize; 
        this.elem = new int[maxSize]; 
    last = -1; 
    } 
 
    public boolean isEmpty() { 
        return last == -1; 
    } 
 
    public boolean isFull() { 
        return last == maxSize - 1; 
    } 
 
    public void add(int e, int p) { 
        if (isFull()) { 
            System.out.println("List is full. Cannot add element."); 
            return; 
        } 
        if (p < 0 || p > last + 1) { 
            System.out.println("Invalid position."); 
            return; 
        } 
         
        for (int i = last; i >= p; i--) { 
            elem[i + 1] = elem[i]; 
        } 
        elem[p] = e; 
        last++; 
    } 
 
public int indexOf(int e) { 
        for (int i = 0; i <= last; i++) { 
            if (elem[i] == e) 
                return i; 
        } 
        return -1; 
    }
 
 
    public int get(int p) { 
        if (p < 0 || p > last) { 
            System.out.println("Invalid position."); 
            return -1; 
        } 
        return elem[p]; 
    } 
 
    public void remove(int p) { 
        if (isEmpty()) { 
            System.out.println("List is empty."); 
            return; 
        } 
        if (p < 0 || p > last) { 
            System.out.println("Invalid position."); 
            return; 
        } 
        
        for (int i = p; i < last; i++) { 
            elem[i] = elem[i + 1]; 
        } 
        last--; 
    } 
 
     
    public int next(int p) { 
        if (p < last) 
            return p + 1; 
        System.out.println("No next position."); 
        return -1; 
    } 
 
    public int prev(int p) { 
        if (p > 0) 
            return p - 1; 
        System.out.println("No previous position."); 
        return -1; 
    } 
 
 
public void clear() { 
        last = -1; 
    } 
 
 
    public int firstP() { 
        if (isEmpty()) { 
            System.out.println("List is empty."); 
            return -1; 
        } 
        return 0; 
    } 
 
    public void display() { 
        if (isEmpty()) { 
            System.out.println("List is empty."); 
            return; 
        } 
        System.out.print("List: "); 
        for (int i = 0; i <= last; i++) { 
            System.out.print(elem[i]); 
            if (i < last) System.out.print(", "); 
        } 
        System.out.println(); 
    } 
 
    public int lastP() { 
        return last; 
    } 
 
    public int size() { 
        return last + 1; 
    }
}
