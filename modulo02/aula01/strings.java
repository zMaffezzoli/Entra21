package aula01;
import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        String nome;

        System.out.print("Digite seu nome: ");
        nome = input.nextLine();

        // String não se compara com '==', equals() corresponde
        if (nome.toLowerCase().equals("gabriel")){ 
            System.out.println("Seu nome é Gabriel");
        }else{
            System.out.format("Seu nome não é Gabriel, seu nome é %s", nome);
        }
        input.close();
    }
}
