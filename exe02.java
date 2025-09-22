//2. Crie uma função que receba um valor numérico e retorne um booleano que indique se o valor é
//nulo ou não. Declare como: static boolean isZero(float num)
import java.util.Scanner;

public class exe02 {
    static float num ;


    public static boolean isZero(float num){
        if (num ==0 ){
            return true;

        }
        else {
            return false;
        }


    }


    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Digite um numero ");
        float num  = in.nextFloat();
        if (isZero(num)){
            System.out.println("Valor nulo");

        }
        else {
            System.out.println("Valor não  nulo");

        }

    }
}