//Exercício 4.2 — Adicione atributo estatico totalContas a ContaBancaria. 
// Incremente a cada conta criada.

public class ContaBancaria2 {
    String titular;
    double saldo;
    static int totalContas = 0;

    ContaBancaria2(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
        totalContas++;   //pegando o valor atual e somando +1
    }

    public void depositar(double valor) {
        //valor é um parâmetro do método depositar. 
        // ou seja, ele vai receber o valor do depósito e se esse valor for maior que 0, vai pra saldo.

        if (valor > 0) {
            this.saldo += valor;

            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        }
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            this.saldo -= valor;

            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para realizar o saque!");
        }
    }

    public void exibirSaldo() {
        System.out.println ("Titular: " + this.titular + " | Saldo atual: R$ " + this.saldo);
    }

    public static void main(String[] args) {
        ContaBancaria2 conta1 = new ContaBancaria2("Karol", 100.00);
        ContaBancaria2 conta2 = new ContaBancaria2("Maria", 200.00);
        ContaBancaria2 conta3 = new ContaBancaria2("Ana", 300.00);

        conta1.exibirSaldo();
        conta2.exibirSaldo();
        conta3.exibirSaldo();

        System.out.println("Total de contas: " + ContaBancaria2.totalContas);
    }
}
