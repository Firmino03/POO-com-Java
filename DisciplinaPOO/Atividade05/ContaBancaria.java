//Exercício 4.1 — Crie ContaBancaria com: 
// titular, saldo. Métodos: depositar(double), sacar(double) 
// (sem saldo negativo), exibirSaldo().

public class ContaBancaria{
    String titular; 
    double saldo; 

ContaBancaria (String titular, double saldo){
    this.titular = titular;
    this.saldo = saldo;
}


public void depositar (double valor){  
    //valor é um parâmetro do método depositar. 
    // ou seja, ele vai receber o valor do depósito e se esse valor for maior que 0, vai pra saldo.

	if (valor > 0 ){
        this.saldo += valor; 
    System.out.println ("Depósito de R$ " + valor + " realizado com sucesso."); 
    }
}

public void sacar (double valor){
        if (valor <= saldo) {
        this.saldo -= valor; 
    System.out.println ("Saque de R$ " + valor + " realizado com sucesso."); 
    } 
    else { 
    System.out.println ("Saldo insuficiente para realizar o saque!"); 
    } 
} 

public void exibirSaldo() { 
    System.out.println ("Titular: " + this.titular + " | Saldo atual: R$ " + this.saldo); 
} 

public static void main(String[] args) { 

    ContaBancaria conta1 = new ContaBancaria ("Karol", 100.00); 
        conta1.exibirSaldo(); 
        conta1.depositar(50.00); 
        conta1.sacar(30.00); 
        conta1.sacar(150.00); 
        conta1.exibirSaldo(); 

} 
} 

