package aula03;
import java.util.Scanner;

public class exercicio_loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = input.nextInt();

        for (int i = 1; i < 101; i++){
            System.out.println(numero + "X" + i + "=" + numero * i);
        }
        input.close();
    }
}
