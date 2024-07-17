/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pruebatecnica;

/**
 *
 * @author ruiz_
 * PROGRAMADOR JAVA (Evalart)
 */
public class Class00 {

    public static void main(String[] args) {
        int[] myArray = {1, 2, 1, 3, 3, 1, 2, 1, 5, 1};
        int[] programa = new int[5];
        for (int i = 0; i < myArray.length; i++) {
            programa[myArray[i] - 1]++;
        }

        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + ": ");
            for (int j = 0; j < programa[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
