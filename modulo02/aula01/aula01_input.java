package aula01;
import java.util.Scanner;

class aula01_input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int idade;
        String nome;

        System.out.print("Digite seu nome: ");
        nome = input.nextLine();

        System.out.print("Digite sua idade: ");
        idade = input.nextInt();

        System.out.format("Seu nome é %s e você tem %d anos", nome, idade);
    }
}
