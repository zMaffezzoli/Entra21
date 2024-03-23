package aula04;

class vetor{
    public static void main(String[] args) {
        
        // Iniciando vetor com 3 indices sem declarar os valores
        int[] vetor = new int[3];

        // Iniciando vetor com 3 indices declarando os valores
        double[] vetor2 = {5, 6, 7};

        for (int i = 0; i < vetor.length; i++){
            vetor[i] = i+1;
        }
        
        for (int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i]);
            System.out.println(vetor2[i]);
        }
    }
}   