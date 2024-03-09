package aula01;

public class aula01_loops {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i+=2){
            System.out.println(i);
        }

        System.out.println("");

        int contador_while = 1;
        while (contador_while <= 10){
            System.out.println(contador_while);
            contador_while++;
        }
        
        System.out.println("");

        int contador_do_while = 10;
        do{
            System.out.println(contador_do_while);
            contador_do_while--;
        }
        while(contador_do_while >= 1);
    }
}
