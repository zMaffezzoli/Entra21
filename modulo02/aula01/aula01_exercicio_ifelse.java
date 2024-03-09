package aula01;
import java.util.Scanner;


public class aula01_exercicio_ifelse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1, n2;
        
        System.out.print("Digite um número: ");
        n1 = input.nextInt();

        System.out.print("Digite outro número: ");
        n2 = input.nextInt();

        if (n1>n2){
            System.out.println("O primeiro valor é maior");
        }
        else if (n2>n1){
            System.out.println("O segundo valor é maior");
        }
        else{
            System.out.println(("Os números são iguais"));
        }
    }
}
