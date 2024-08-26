package aula3;

import java.util.Scanner;

public class Exercicio2aula3 {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe sua altura: ");
        double alt = scanner.nextDouble();
        
        scanner.nextLine();
        System.out.println("Informe o seu sexo: 1- Masculino ou 2- Feminino");
        String s = scanner.nextLine();
        
        switch(s){
            case "1" -> {
                double peso = (alt*72.7) - 58;
                System.out.println("Para o sexo masculino o seu peso ideal é " + peso);
            }
             
            case "2" -> {
                double peso = (alt * 62.1) - 44.7;
                System.out.println("Para o sexo femino o seu peso ideal é " + peso);
            }
            default -> {
                System.out.println("Opção inválida.");
            }
                           
        }
        scanner.close();
        
    }
}
