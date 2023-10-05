/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplicationlinkedlists;

import java.util.Arrays;
import java.util.LinkedList;

/**
 *
 * @author oz
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addFirst(40);
        System.out.println(list.contains(10));
        System.out.println(list.indexOf(10));
        System.out.println(list);
        System.out.println(list.size());
        var array =list.toArray();
        System.out.println(Arrays.toString(array));

    }
    
}
