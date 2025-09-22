//5. Usando os métodos acima, crie uma aplicação que calcula as raízes de uma equação de 2o
// grau:
//ax² + bx + c = 0 (Para a solução existir, o coeficiente 'a' deve ser diferente de zero.)
//Se o valor de delta for maior ou igual a zero, as raízes serão reais. Caso o delta seja negativo, as
//raízes serão complexas e da forma: x + iy
import java.util.Scanner;

public class exe05 {
    static double a ,b,c,delta ;


    public static void raiz(double a , double b, double c){
        if (a!=0){
            double delta= Math.pow(b,2) - 4*a*c;

            System.out.println(delta);
            double raizes1=0;
            double raizes2=0;
            double x;
            double y;


            raizes1= (-b+Math.sqrt(delta))/(2*a);
            raizes2=(-b-Math.sqrt(delta))/(2*a);
            System.out.println("X'= " + raizes1 + " X''= " + raizes2 );
            if(delta <0){
                x=-b/(2*a);
                y= Math.sqrt(-delta)/(2*a);
                System.out.println("Raiz=" + x + " + " + y+"i");



            }




        }


    }



    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Digite o valor de a ");
        int a = in.nextInt();
        System.out.println("Digite o valor de b ");
        int b = in.nextInt();
        System.out.println("Digite o valor de c ");
        int c = in.nextInt();
        raiz(a,b,c);



    }
}