package aula01;
import java.util.Scanner;

public class aula01_switchcase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int dia;

        System.out.print("Digite o dia da semana em inteiro (De 1 à 7): ");
        dia = input.nextInt();

        switch (dia) {
            case 1:
                System.out.print("Domingo");    
                break;
        
            case 2:
                System.out.print("Segunda-feira");    
                break;

            case 3:
                System.out.print("Terca-feira");    
                break;

            case 4:
                System.out.print("Quarta-feira");    
                break;

            case 5:
                System.out.print("Quinta-feira");    
                break;

            case 6:
                System.out.print("Sexta-feira");    
                break;

            case 7:
                System.out.print("Sábado");    
                break;

            default:
                System.out.print("Não é um dia da semana");    
                break;
        }
    }
}
