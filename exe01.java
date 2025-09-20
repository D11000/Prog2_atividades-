//1. Crie uma função que receba um valor numérico e informe se ele é positivo ou negativo através
//de um retorno com boolean. Declare sua função como: static boolean isPositive(float num)

import java.util.Scanner;

public class exe01 {


    public static boolean isPositive(float num) {
        return num >=0 ;
    }


    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Digite um numero ");
        float num  = in.nextFloat();
        if (isPositive(num)){
            System.out.println("É positivo");
        }
        else{
            System.out.println("É negativo");
        }



    }
}