
package indicedemasacorporal;
import java.util.Scanner;

/**
 *
 * @author luis_
 */
public class IndicedeMasaCorporal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    double peso, altura, IMC;
        
        Scanner in = new Scanner (System.in);
        
        System.out.println("Este programa puede calcular su IMC");
        System.out.println("");
        
        System.out.println("Introduzca su peso en kilogramos");
        peso = in.nextDouble();
        System.out.println("");
        
        System.out.println("Introduzca su altura en centimetros");
        altura = in.nextDouble()/100;
        System.out.println("");
        
        IMC = peso / (Math.pow(altura, 2));
        
        System.out.println("Para un peso de " + peso + " kilogramos y");
        System.out.println("Para una altura de " + altura + " metros");
        System.out.println("El indice de masa corporal es " + (int)IMC);
        System.out.println("");
    }
    
}
