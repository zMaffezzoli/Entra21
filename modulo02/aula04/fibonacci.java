package aula04;
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int quantidade_elementos;
        do{
            System.out.print("Quantos elementos da série de fibonacci você gerar ver: ");
            quantidade_elementos = input.nextInt();

            if (quantidade_elementos >= 1){
                break;
            }else{
                System.out.println("Números negativos ou zero não são permitidos!");
            }
        }
        while(quantidade_elementos <= 1);

        if (quantidade_elementos == 1){
            System.out.print(0);
        }
        else {
            int[] fibonacci = new int[quantidade_elementos];
            fibonacci[0] = 0;
            fibonacci[1] = 1;
            for (int i = 0; i < (quantidade_elementos - 2); i++){
                fibonacci[i+2] = fibonacci[i] + fibonacci[i+1];
            }

            for (int i = 0; i < fibonacci.length; i++){
                System.out.format("%d, ", fibonacci[i]);
            }
        }
        input.close();
    }
}