// Arquivo: UsandoArrayList.java
import java.util.ArrayList;
import java.util.Collections;

void main() {
    var nomes = new ArrayList<String>(); 
    //caso String não seja declarado, o arrayList aceita qualquer tipo de objeto, mas não primitivos (int, double, etc)

    nomes.add("Maria");
    nomes.add("Joao");
    nomes.add("Ana");
    nomes.add("Pedro");

    IO.println("Lista: "    + nomes);
    IO.println("Tamanho: "  + nomes.size());
    IO.println("Primeiro: " + nomes.get(0));
    IO.println("Tem Ana? "  + nomes.contains("Ana")); //o contains volta boolean

    nomes.remove("Joao");   // por valor
    nomes.remove(0);        // por índice (remove Maria)

    for (String nome : nomes) {
        IO.println("  * " + nome);
    }

    Collections.sort(nomes); //collections.sort() ordena a lista 
    IO.println("Ordenados: " + nomes);

    var alunos = new ArrayList<Aluno>();
    alunos.add(new Aluno("Maria", 20, "Informatica"));
    alunos.add(new Aluno("Joao", 22, "Sistemas"));

    IO.println("Total: " + alunos.size()); //size() retorna o tamanho da lista
    for (Aluno a : alunos) {
        a.apresentar();
    }
}

class Aluno {
    String nome; int idade; String curso;
    Aluno(String nome, int idade, String curso) {
        this.nome = nome; 
        this.idade = idade; 
        this.curso = curso;
    }
    void apresentar() {
        IO.println("  " + nome + " (" + idade + "a) - " + curso);
    }
}