/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetores;

import java.util.Scanner;

/**
 *
 * @author vitoria.csilva15
 */
public class ExemploVetor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 10;
        int[] v = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um número");
            v[i] = sc.nextInt();
        }
        int soma = 0;
        int menor = v[0];
        int maior = v[0];
        
        for (int i = 0; i < n; i++){
        soma = soma + v[i];
        
        if (v[i] < menor)
            menor = v[i];
        
        if (v[i] > maior)
            maior = v[i];
        }
        
        for (int i = 0; i< n; i++){
            System.out.print("v [" + i + "]: " + v[i]);
            
            if(v[i] == menor)
                System.out.print(" <-- menor");
            else if (v[i] == maior)
                System.out.print(" <-- maior");
            
            System.out.println("");
        }
        System.out.println("A soma é: " + soma);
    }
}
