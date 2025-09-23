//8. Crie uma função que calcule o fatorial de um valor inteiro positivo passado por parâmetro.
import java.util.Scanner;



public class exe08 {


    public static int fatorial(int n) {
        int fat = 1;
        for (int i = 1; i <= n; i++) {
            fat *= i;
        }
        return fat;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite um número : ");
        int num = in.nextInt();

        if (num < 0) {
            System.out.println("Invalido!!");
        } else {
            System.out.println(num + "! = " + fatorial(num));
        }


    }
}