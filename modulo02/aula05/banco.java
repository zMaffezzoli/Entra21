package aula05;

public class banco {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        Conta conta2 = new ContaPagamento();
        Conta conta3 = new ContaPoupanca();

        conta1.titular = "Cleitin";
        conta1.numConta = 1;

        conta2.titular = "Pedrin";
        conta2.numConta = 2;

        conta3.titular = "Jorgin";
        conta3.numConta = 3;

        conta1.depositar(100);
        System.out.println(conta1.getSaldo());

        conta1.transferir(conta2, 50);
        System.out.println("Saldo pós transferencia conta 1: "+ conta1.getSaldo());
        System.out.println("Saldo pós transferencia conta 2: "+ conta2.getSaldo());

        conta2.transferir(conta3, 25);
        System.out.println("Saldo pós transferencia conta 1: "+ conta1.getSaldo());
        System.out.println("Saldo pós transferencia conta 2: "+ conta2.getSaldo());
        System.out.println("Saldo pós transferencia conta 3: "+ conta3.getSaldo());

        conta3.transferir(conta1, 10);
        System.out.println("Saldo pós transferencia conta 3: "+ conta3.getSaldo());
        System.out.println("Saldo pós transferencia conta 1: "+ conta1.getSaldo());
    }
}

class Conta{
    public String titular;
    public int numConta;
    private double saldo;
    protected double taxaSaque = 1.0;  // Atributo de classe

    public boolean depositar(double valor){
        this.saldo += valor;
        System.out.println("Deposito realizado!");
        return true;
    }

    public boolean sacar(double valor){
        if (this.saldo >= (valor + this.taxaSaque)){
            this.saldo -= valor + this.taxaSaque;
            System.out.println("Saque realizado!");
            return true;
        }else{
            System.out.println("Valor maior que o saldo atual");
            return false;
        }
    }

    public double getSaldo(){
        return saldo;
    }

    public boolean transferir(Conta contadestino, double valor){
        if (this.sacar(valor)){
            contadestino.depositar(valor);
            return true;
        }else{
            return false;
        }

    }
}

class ContaPagamento extends Conta{
    
    public boolean sacar(double valor){ // Herda o método sacar
        super.taxaSaque = 2.0; // Herda e altera o valor do atributo
        return super.sacar(valor);
    }
}

class ContaPoupanca extends Conta{
    
    public boolean sacar(double valor){ // Herda o método sacar
        super.taxaSaque = 3.0; // Herda e altera o valor do atributo
        return super.sacar(valor);
    }
}