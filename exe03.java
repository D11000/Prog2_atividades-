//3. Crie uma função que receba um valor inteiro e retorne um booleano que indique se o valor é par
//ou não. Declare como: static boolean isEven(float num)
import java.util.Scanner;

public class exe03 {
    static float num ;


    public static boolean isEven(float num){
        if (num%2== 0){
            return true;
        }
        else  {
            return  false;

        }

    }


    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Digite um numero ");
        float num  = in.nextFloat();
        if (isEven(num)){
            System.out.println("É par ");


        }
        else {
            System.out.println("É impar ");
        }

    }
}