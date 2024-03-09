package aula01;
import java.util.Scanner;

public class aula01_exercicio_loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = input.nextInt();

        for (int i = 1; i < 101; i++){
            System.out.println(numero + "X" + i + "=" + numero * i);
        }

    }
}
