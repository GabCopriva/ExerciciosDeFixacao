package aula3;

import java.util.Scanner;

public class Exercicio5Aula3 {
    public static void main (String[]args){
        
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Informe o primeiro ângulo do triângulo: ");
        double a = scanner.nextDouble();
        System.out.println("Informe o segundo ângulo do triângulo: ");
        double b = scanner.nextDouble();
        System.out.println("Informe o terceiro ângulo do triângulo: ");
        double c = scanner.nextDouble();
        
        if ( a + b + c == 90 ){
            System.out.println("\nÉ um triângulo retângulo.");
        }
        else if ( a + b + c > 90 ){
            System.out.println("\nÉ um triângulo obtusângulo.");
        }
        else{
            System.out.println("\nÉ um triângulo acutângulo.");
        }
    }
}
