package aula04;
import java.util.Scanner;

public class matriz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Iniciando matriz 3x3
        int[][] matriz = new int[3][3];

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.printf("Digite um número para adicionar na linha %d coluna %d: ", i+1, j+1);
                int num = input.nextInt();
                matriz[i][j] = num;
            }
        }

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.printf("%d ", matriz[i][j]);
            }
            System.out.println();
        }
        input.close();
    }
}