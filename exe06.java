//6. Crie um método que receba 2 números e retorne o maior valor.
import java.util.Scanner;

public class exe06 {
    static double num1 , num2 ;


    public static double maior(double num1,double num2){
        if (num1>num2){
            System.out.println(num1);
            return num1;


        }
        else {
            System.out.println(num2);
            return num2;

        }


    }



    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Digite um valor ");
        int num1 = in.nextInt();
        System.out.println("Digite um valor");
        int num2 = in.nextInt();
        maior(num1,num2);



    }
}