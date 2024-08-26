package exercicio1aula3;

import java.util.Scanner;

public class Exercício1Aula3 {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o primeiro valor: ");
        int v1 = scanner.nextInt();
        System.out.println("Insira o segundo valor: ");
        int v2 = scanner.nextInt();
        System.out.println("Insira o terceiro valor: ");
        int v3 = scanner.nextInt();
        
        System.out.println("\n");
        if(v1 < v2 && v2 < v3){
            System.out.println(v1);
            System.out.println(v2);
            System.out.println(v3);
        } 
        if ( v2 < v1 && v1 < v3){
            System.out.println(v2);
            System.out.println(v1);
            System.out.println(v3);
        }
        if ( v3 < v2 && v2 < v1) {
            System.out.println(v3);
            System.out.println(v2);
            System.out.println(v1);
    }
        if ( v1 < v3 && v3 < v2){
            System.out.println(v1);
            System.out.println(v3);
            System.out.println(v2);
        }
         if ( v2 < v3 && v3 < v1){
            System.out.println(v2);
            System.out.println(v3);
            System.out.println(v1);
        }
          if ( v3 < v1 && v1 < v2){
            System.out.println(v2);
            System.out.println(v1);
            System.out.println(v3);
        }
    }
}
