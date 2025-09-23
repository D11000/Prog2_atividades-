//9. Utilize a função do exercício 8 para criar um programa que receba de entrada dois valores “n” e
//“k” e calcule:
//- Permutações: Pn = n!
//- Arranjos: An,k = n! / (n-k)!
//- Combinações: Cn,k = n! / (k! *(n-k)!)

import java.util.Scanner;


public class exe09 {


    public static int fatorial(int n) {
        int fat = 1;
        for (int i = 1; i <= n; i++) {
            fat *= i;
        }
        return fat;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite um valor para n: ");
        int n = in.nextInt();

        System.out.print("Digiteum valor para k: ");
        int k = in.nextInt();

        if (k < 0 || k > n) {
            System.out.println("Valores inválidos! Certifique-se de que n >= k >= 0.");
        } else {
            int permutacao = fatorial(n);
            int arranjo = fatorial(n) / fatorial(n - k);
            int combinacao = fatorial(n) / (fatorial(k) * fatorial(n - k));

            System.out.println("Permutação Pn = " + permutacao);
            System.out.println("Arranjo An,k = " + arranjo);
            System.out.println("Combinação Cn,k = " + combinacao);
        }


    }
}