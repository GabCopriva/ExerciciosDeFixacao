package aula3;

import java.util.Scanner;

public class Exercício3Aula3{
    public static void main(String[]args){
        
        Scanner scanner = new Scanner (System.in);
        
                System.out.println("Informe o número de lados de um polígono regular: ");
                int num = scanner.nextInt();
                
                if ( num == 3){
                    System.out.println("Informe a medida do lado (em cm): ");
                    double medida = scanner.nextInt();
                
                    System.out.println("Informe o valor da base: ");
                    double base = scanner.nextDouble();
                    System.out.println("Informe a altura: ");
                    double alt = scanner.nextDouble();
                    System.out.println("Triângulo - Área: " + (base*alt)/2);                
    }
                else if ( num == 4){
                    System.out.println("Informe a medida do lado (em cm): ");
                    double medida = scanner.nextInt();
                
                    System.out.println("Informe o valor da base: ");
                    double base = scanner.nextDouble();
                    System.out.println("Quadrado - Área: " + base*base);
    }
                else if ( num < 3 ){
                    
                    System.out.println("Não é um polígono.");
                }
                else if ( num > 5 ){
                    System.out.println("Polígono não identificado.");
                }
                else{
                    System.out.println("Pentágono.");
                }
}               
}