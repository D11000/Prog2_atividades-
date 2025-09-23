//7. Crie um método que receba como parâmetro um vetor de inteiros, calcula sua média e a retorna . import java.util.Scanner;
import java.util.Scanner;

public class exe07 {


    public static int retmedia(int[] vetor) {
        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        int media = soma / vetor.length;
        return media;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] vector = new int[4];

        System.out.println("Digite os valores: ");
        for (int i = 0; i < vector.length; i++) {
            vector[i] = in.nextInt();
        }


        System.out.println("A média é: " + retmedia(vector));
    }
}
