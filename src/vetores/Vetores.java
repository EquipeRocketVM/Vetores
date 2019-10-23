package vetores;

import java.util.Scanner;

/**
 *
 * @author vitoria.csilva15
 */
public class Vetores {
// tamanho do vetor
// e numeros dos vetores

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, a;
        System.out.println("Digite o tamanho do vetor");
        n = sc.nextInt();

        int[] v = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("[" + i + "]" + "Digite o elemento do vetor: ");
            a = sc.nextInt();
            v[i] = a;
        }
        for(int j = 0; j < n; j++){
            System.out.println(v[j]);
        }
    }

}
