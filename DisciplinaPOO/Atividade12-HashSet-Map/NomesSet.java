//Exercício 11.1 Dada uma lista de nomes com repetições, use um HashSet para mostrar apenas os nomes únicos 
// e quantos eles são. Depois, teste add com um nome repetido e mostre o valor devolvido.
//Dicas: crie o HashSet a partir da lista (new HashSet<String>(lista)) e use size() para contar. 
// O retorno de add é true ou false.

import java.util.ArrayList;
import java.util.HashSet;

void main() {
    var nomes = new ArrayList<String>();
    nomes.add("Maria");
    nomes.add("João");
    nomes.add("Ana");
    nomes.add("Pedro");
    nomes.add("Maria");
    nomes.add("Ana");

    var unicos = new HashSet<String>(nomes);
    IO.println("Nomes únicos: " + unicos);
    IO.println("Quantidade de nomes únicos: " + unicos.size());

    boolean adicionado = unicos.add("Maria"); 
    IO.println("Tentativa de adicionar 'Maria' novamente: " + adicionado);
}