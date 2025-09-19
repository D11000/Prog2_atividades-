import  java.util.Scanner;
public class exe00 {
    static int n;




    public static void numero(int n) {
        Scanner in = new Scanner(System.in);
          n = in.nextInt();



        String mes;
        if (n == 1) {
            mes = "Janeiro ";
        }
        if (n == 2) {
            mes = "Fevereiro ";
        }
        if (n == 3) {
            mes = "Março ";
        }
        if (n == 4) {
            mes = "Abril ";
        }
        if (n == 5) {
            mes = "Maio";
        }
        if (n == 6) {
            mes = "Junho";
        }
        if (n == 7) {
            mes = "Julho ";
        }
        if (n == 8) {
            mes = "Agosto";
        }
        if (n == 9) {
            mes = "Setembro ";
        }
        if (n == 10) {
            mes = "Outubro ";
        }
        if (n == 11) {
            mes = "Novembro";
        }
        if (n == 12) {
            mes = "Dezembro ";
        }
        else{
            System.out.println("Erro, o valor não equivale a um mês");
            System.out.println(n);
        }
    }
    public static void main(String[]args){


        numero(n);






    }
}
