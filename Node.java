/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject54;

/**
 *
 * @author Yassi
 */
public class ArrayList<E> {
    
    public Object[] elementData;
    public int size = 0;
    public static final int default_Cap = 10;

    public ArrayList() {
        elementData = new Object[default_Cap];
    }

    public void add(E element) {
        if (size == elementData.length) {
            ensureCapacity();
        }
        elementData[size++] = element;
    }

    private void ensureCapacity() {
        int newSize = elementData.length * 2;
        Object[] newArray = new Object[newSize];
        for (int i = 0; i < size; i++) {
            newArray[i] = elementData[i];
        }
        elementData = newArray;
    }

    @SuppressWarnings("unchecked")
    public E get(int index) {
        if (index >= size || index < 0) {
            System.out.println(("Index: " + index + ", Size: " + size));
            return null;
        }
        return (E) elementData[index];
    }

    public int size() {
        return size;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
}
