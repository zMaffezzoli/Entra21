package aula01;
import java.util.Scanner;

class aula01_ifelse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double n1, n2, n3, resultado;

        System.out.print("Digite a primeira nota: ");
        n1 = input.nextDouble();

        System.out.print("Digite a segunda nota: ");
        n2 = input.nextDouble();

        System.out.print("Digite a terceira nota: ");
        n3 = input.nextDouble();

        resultado = (n1 + n2+ n3) / 3;

        if (resultado >= 7){
            System.out.format("Você está aprovado, sua média foi %f", resultado);
        }
        else if (resultado <= 7 && resultado >= 5){
            System.out.format("Você está de recuperação, sua média foi %f", resultado);
        }
        else{
            System.out.format("Você está rerovado, sua média foi %f", resultado);
        }
    }
}