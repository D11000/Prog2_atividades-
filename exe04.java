//4. Crie um método que receba três valores, 'a', 'b' e 'c', que são os coeficientes de uma equação do
//segundo grau e retorne o valor do delta, que é dado por 'b² – 4ac'
import java.util.Scanner;

public class exe04 {
    static float a ,b,c ;


    public static void delta(double a , double b, double c){
        double delta= Math.pow(b,2) - 4*a*c;
        System.out.println(delta);


    }


    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Digite o valor de a ");
        int a = in.nextInt();
        System.out.println("Digite o valor de b ");
        int b = in.nextInt();
        System.out.println("Digite o valor de c ");
        int c = in.nextInt();
        delta(a,b,c);


    }
}