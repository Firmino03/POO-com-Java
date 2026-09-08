public class Aluno {
    String nome;
    int idade;
    String curso;

    //METODO COMUM
    void apresentar (){
        IO.println ("Nome do aluno:" + nome);
        IO.println ("Idade do aluno:" + idade);
        IO.println ("Curso do aluno:" + curso);

    }
    String getSituacao (){
        return idade >= 18? "Maior de idade": "Menor de idade";
    }
    
    //METODO CONSTRUTOR
    
    void main() {
        Aluno Aluno01 = new Aluno();
        Aluno Aluno02 = new Aluno();   // objeto 

    Aluno01.nome  = "Maria Silva";
    Aluno01.idade = 20;
    Aluno01.curso = "Informatica para Internet";

    Aluno02.nome  = "Joao Santos";
    Aluno02.idade = 22;
    Aluno02.curso = "Sistemas para Internet";
    
    //INVOCANDO METODOS
    IO.println("=== Estudante 1 ===");
    Aluno01.apresentar();
    IO.println("Situacao: " + Aluno01.getSituacao());

    IO.println("=== Estudante 2 ===");
    Aluno02.apresentar();  

    }
}

