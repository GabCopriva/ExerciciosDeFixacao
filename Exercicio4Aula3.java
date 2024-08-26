package aula3;

import java.util.Scanner;

public class Exercicio4Aula3 {
    public static void main (String[]args){
        
        Scanner scanner = new Scanner (System.in);
            
        System.out.println("Informe a primeira medida: ");
        double m1 = scanner.nextDouble();
        System.out.println("Informe a segunda medida: ");
        double m2 = scanner.nextDouble();
        System.out.println("Informe a terceira medida: ");
        double m3 = scanner.nextDouble();
        
        if ( m1 == m2 && m1 == m3 && m2 == m3){
            System.out.println("\nÉ um triângulo equilátero.");
        }
        else if ( m1 == m2 || m1 == m3 || m2 == m3){
            System.out.println("\nÉ um triângulo isóceles.");
        }
        else{
            System.out.println("\nÉ um triângulo escaleno.");
        }
    }
}
