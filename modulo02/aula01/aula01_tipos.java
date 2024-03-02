package modulo02.aula01;

class aula01_tipos {
    public static void main(String[] args) {
        /* long idade; // Tipo inteiro 64 bits (Vai de -2⁶³ a 2⁶³ - 1)
        int idade; // Tipo inteiro 32 bits (Vai de -2³¹ a 2³¹ - 1)
        char nome; // Tipo caractere
        String nome; // Tipo String
        double preco; // Tipo ponto flutuante 64 bits
        float preco; // Tipo ponto flutuante 32 bits
        boolean ativo; // Tipo boleano */

        int idade = 10;
        String nome = "João";
        // System.out.println("Seu nome é " + nome + ", ele tem " + idade + " anos");
        System.out.format("Seu nome é %s, ele tem %d anos", nome, idade);
    }
}