public class Carro{
String marca;
String modelo;
int ano;
int velocidadeAtual;

//criando método e armazenando velocidade

void acelerar (int km) { 
velocidadeAtual += km; 

System.out.println ("Carro acelerando..."); 
System.out.println("Velocidade atual: " + velocidadeAtual + " km/h"); 
} 

void frear(int km) { 
velocidadeAtual -= km;

//criando condição corrigindo negativo para 0

if (velocidadeAtual < 0) { 
velocidadeAtual = 0; 
}

System.out.println ("O carro está freando..."); 
System.out.println("Velocidade atual: " + velocidadeAtual + " km/h"); 
}
//criando objetos

public static void main (String [] args) { 
Carro carro = new Carro(); 
carro.marca = "Toyota"; 
carro.modelo = "Corolla"; 
carro.ano = 2024; 
carro.velocidadeAtual = 0; 
carro.acelerar(30); 
carro.frear(10); 
carro.frear(30); 

    } 
} 
  
