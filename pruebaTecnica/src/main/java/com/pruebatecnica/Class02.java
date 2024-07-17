/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ruiz_
 * PROGRAMADOR JAVA (Evalart)
 */
package com.pruebatecnica;


public class Class02{
   static int[] myArray = {1,2,9,2,5,3,5,1,5}; 
    static int n=3;  
    public static void main(String[] args) {
      
        int filas = n;
        int columnas = n;
        int x = 0; 
        int menor = 9;
        int matriz[][] = new int[filas][columnas];
        int[] camino = new int[n];
        for(int i=0;i<filas;i++){
            for(int j=0; j<columnas;j++){
                matriz[i][j]=myArray[x];
                x=x+1;
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
        int control =0;
        for(int i=0;i<columnas;i++){
            for(int j=0; j<filas;j++){
                if(matriz[j][i]<menor){
                    if(control==j){
                        menor=matriz[j][i];
                        camino[i]=menor;
                    }
                    else if(control+1==j){
                        menor=matriz[j][i];
                        camino[i]=menor;
                    }
                    else if(control-1==j){
                        menor=matriz[j][i];
                        camino[i]=menor;                      
                    }
                        
                
                }
            }
            menor = 9;
            System.out.println();
        }
        
        for(int i=0;i<camino.length;i++){
            System.out.print(camino[i]);
        }
    }
}