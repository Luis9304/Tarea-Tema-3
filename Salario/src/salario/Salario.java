/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package salario;

import java.util.Scanner;

/**
 *
 * @author luis_
 */
public class Salario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese el salario bruto mensual: ");
    double salarioBruto = scanner.nextDouble();
    System.out.print("Ingrese el porcentaje de impuestos: ");
    double porcentajeImpuestos = scanner.nextDouble();
    System.out.print("Ingrese las deducciones adicionales: ");
    double deduccionesAdicionales = scanner.nextDouble();
    double impuesto = (salarioBruto * porcentajeImpuestos) / 100;
    double salarioNeto = salarioBruto - impuesto - deduccionesAdicionales;
    System.out.println("El salario neto es: " + salarioNeto);
    
    
    }
    
}
