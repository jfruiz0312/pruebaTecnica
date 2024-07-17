/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.pruebatecnica;

/**
 *
 * @author ruiz_
 * PROGRAMADOR JAVA (Evalart)
 */
public class Class01 {

    static int[] myArray = {1, 2, 2, 4, 5, 6, 7, 8, 8, 8};

    public static void main(String[] args) {
        int mayorSecuencia = 1;
        int mayorSecuenciaAux = 1;
        int numeroMayorSecuencia = 0;
        int numeroAux = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == numeroAux) {
                mayorSecuenciaAux += 1;
            } else {
                mayorSecuenciaAux
                        = 0;
            }
            if (mayorSecuenciaAux > mayorSecuencia) {
                mayorSecuencia = mayorSecuenciaAux;
                numeroMayorSecuencia = myArray[i];
            }
            numeroAux = myArray[i];
        }
        System.out.println("Longest: " + (mayorSecuencia + 1));
        System.out.println("Number: " + numeroMayorSecuencia);

    }
}
