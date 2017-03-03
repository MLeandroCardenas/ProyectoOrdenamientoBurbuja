/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamientoburbuja;

import java.util.Scanner;

/**
 * @author Edgar Andres Krejci Bautista
 * @author Michael Leandro Cardenas
 * @version version 1.1
 */
public class OrdenamientoBurbuja {
    /**
     * Variable utilizada para conocer el tamaño del vector a organizar
     */
    private byte dimension;
    /**
     * Variable utilizada para almacenar los datos a organizar
     */
    private short vector[];
    /**
     * Construcctor empleado para llamar los metodos obtenerInformacion,orednarVector,imprimirVector
     */
    public OrdenamientoBurbuja(){
        obtenerInformacion();
        ordenarVector();
        imprimirVector();
    }
    /**
     * metodo encargado de leer los datos a organizar
     */
    private void obtenerInformacion(){
        System.out.println("INGRESE LA DIMENSION DEL VECTOR");
        Scanner sc= new Scanner (System.in);
        dimension=sc.nextByte();
        vector = new short [dimension];
        for (byte i=0;i<dimension;i++){
            System.out.println("INGRESE LOS DATOS DEL VECTOR");
            vector[i]=sc.nextShort();
        }                
    }   
    /**
     * Metodo que ordena el vector utilizando el metodo de la burbuja
     */
    private void ordenarVector(){
        short datoAnterior;
        for (byte i=0;i<dimension;i++){
               for (byte j=0;j<dimension;j++){
                   if (vector[i]<vector[j]){
                       datoAnterior=vector[i];
                       vector[i]=vector[j];
                       vector[j]=datoAnterior;
                   }
               }
           }    
    }
    /**
     * metodo utilizado para imprmir el vector organizado
     */
    private void imprimirVector(){
        for (byte i=0;i<dimension;i++){
            System.out.println("SU VECTOR ORGANIZADO ES "+vector[i]);
        }
    }
    /**
     * Metodo principal en donde inicia el programa en este se crea el objeto del construcctor que llama a las otras funciones
     * @param args 
     */
    public static void main(String[] args) {
        OrdenamientoBurbuja ordenamientoBurbuja = new OrdenamientoBurbuja();
    }
} 