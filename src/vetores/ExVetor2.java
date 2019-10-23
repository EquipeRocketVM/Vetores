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
public class ExVetor2 {

    static Scanner sc = new Scanner(System.in);

    static int tamanhoVetor() {
        System.out.println("Tamanho: ");
        int t = sc.nextInt();
        return t;

    }

    static int[] criaVetor(int t) {
        int[] vetor = new int[t];
        return vetor;

    }

    static int[] populaVetor(int[] vetor) {

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Elemento: ");
            vetor[i] = sc.nextInt();
        }
        return vetor;
    }

    static void imprimeVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
        {

        }
    }

    public static void main(String[] args) {

        int t = tamanhoVetor();
        int[] vetor = criaVetor(t);
        vetor = populaVetor(vetor);
        imprimeVetor(vetor);
    }
    
}
