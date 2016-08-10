/*
 En la U de A hay una máquina dispensadora que tiene 4 productos etiquetados con los
números 1, 2, 3 y 4, cada uno con un valor de $500, $800, $300 y $900, respectivamente.
Defina un algoritmo que lea el número de producto que ingresa el usuario y que le muestre
su precio.

 */
package p6;

import java.util.Scanner;

/**
 *
 * @author akato
 */
public class P6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        System.out.println("Ingrese el número del producto que desea");
        Scanner lector = new Scanner(System.in);
        n = lector.nextInt();
        switch(n){
            case 1:
                System.out.println("El valor es 500");
                break;
            case 2:
                System.out.println("El valor es 800");
                break;
            case 3:
                System.out.println("El valor es 300");
                break;
            case 4:
                System.out.println("El valor es 900");
                break;
             
        
        }
    }
    
}
