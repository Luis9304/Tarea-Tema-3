/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package promedios;

import java.util.Scanner;

/**
 *
 * @author luis_
 */
public class Promedios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Scanner in = new Scanner(System.in);
        double a, b, c, promedio;
        System.out.print("Ingresa el valor de a: ");
        a = in.nextDouble();
        in.nextLine();
        System.out.print("Ingresa el valor de b: ");
        b = in.nextDouble();
        in.nextLine();
        System.out.print("Ingresa el valor de c: ");
        c = in.nextDouble();
        in.nextLine();
        promedio=(a+b+c)/3;
        System.out.println("Valor de promedio: " + promedio);
        
    }
    
}
