//0. Escreva um procedimento que receba um número inteiro como parâmetro e imprima o mês
//correspondente. Por exemplo, 2 corresponde a fevereiro. O procedimento deve retornar uma
//mensagem de erro caso o valor recebido não faça sentido. Crie um programa que leia um valor
//inteiro e chame o procedimento implementado. 
import  java.util.Scanner;
public class exe00 {
    static int n ;
    public static  void numes(int n ){
       if (n ==1 ){
           System.out.println("Janeiro");
       }
       else if (n==2) {
           System.out.println("Fevereiro");

       }
       else if (n==3) {
           System.out.println("Março");

       }
       else if (n==4) {
           System.out.println("Abril");

       }
       else if (n==5) {
           System.out.println("Maio");

       }
       else if (n==6) {
           System.out.println("Junho");

       }
       else if (n==7) {
           System.out.println("Julho");

       }
       else if (n==8) {
           System.out.println("Agosto");

       }
       else if (n==9) {
           System.out.println("Setembro");

       }
       else if (n==10) {
           System.out.println("Outubro");

       }
       else if (n==11) {
           System.out.println("Novembro");

       }
       else if (n==12) {
           System.out.println("Dezembro");

       }
       else {
           System.out.println("Numero Invalido");
       }


    }


    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Digite um numero");
        n= in.nextInt();
        numes(n);

    }
}
