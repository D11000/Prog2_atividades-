//1. Crie em algoritmo um programa capaz de realizar o cadastro de uma lista de livros de uma
//livraria. As entradas devem conter os campos “Nome”, “Autor”, “Ano”, “Descrição” e “Preço”. O
//número máximo de livros cadastrados é 100. Utilize como referência o Capítulo 10 do livro-texto
//“Fundamentos da Programação de Computadores”, disponível na Biblioteca Virtual (Plataforma
//Pergamum) e na página do curso em https://ead.ifmg.edu.br/sabara/.

import  java.util.Scanner;
import java.util.Scanner;

class Livro {
    String nome;
    String autor;
    int ano;
    String descricao;
    double preco;
}

public class Q1{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Livro[] livros = new Livro[100];
        int qtd;

        System.out.print("Quantos livros deseja cadastrar (máx. 100)? ");
        qtd = in.nextInt();
        in.nextLine();

        if (qtd > 100) {
            qtd = 100;
        }

        for (int i = 0; i < qtd; i++) {
            livros[i] = new Livro();

            System.out.println("\n=== Cadastro do livro " + (i + 1) + " ===");
            System.out.print("Nome: ");
            livros[i].nome = in.nextLine();

            System.out.print("Autor: ");
            livros[i].autor = in.nextLine();

            System.out.print("Ano: ");
            livros[i].ano = in.nextInt();
            in.nextLine();

            System.out.print("Descrição: ");
            livros[i].descricao = in.nextLine();

            System.out.print("Preço: R$ ");
            livros[i].preco = in.nextDouble();
            in.nextLine();
        }


        System.out.println("\n=== Livros cadastrados ===");
        for (int i = 0; i < qtd; i++) {
            System.out.println("\nLivro " + (i + 1) + ":");
            System.out.println("Nome: " + livros[i].nome);
            System.out.println("Autor: " + livros[i].autor);
            System.out.println("Ano: " + livros[i].ano);
            System.out.println("Descrição: " + livros[i].descricao);
            System.out.printf("Preço: R$ %.2f\n", livros[i].preco);
        }

        in.close();
    }
}