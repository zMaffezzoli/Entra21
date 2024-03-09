package aula01;
import java.util.Scanner;

class aula01_exercicio_operadores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1, n2;

        System.out.print("Digite o primeiro número: ");
        n1 = input.nextInt();
        
        System.out.print("Digite o segundo número: ");
        n2 = input.nextInt();

        System.out.format("A soma dos dois números é %d\n", (n1+n2));
        System.out.format("A subtração dos dois números é %d\n", (n1-n2));
        System.out.format("A multiplicação dos dois números é %d\n", (n1*n2));
    }
}