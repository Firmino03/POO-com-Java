 public class IFPE {
    int idade;
    long cpf;
    double nota;
    char sexo;
    String nome;
    String curso;
    long matricula;

    // a classe é o molde
    // e o construtor é o método que inicializa os atributos da classe
 public IFPE(int idade, long cpf, double nota, char sexo, String nome, String curso, long matricula) {
        this.idade = idade;
        this.cpf = cpf;
        this.nota = nota;
        this.sexo = sexo;
        this.nome = nome;
        this.curso = curso;
        this.matricula = matricula;
    }

    void imprimir() {
        System.out.format("Nome: %s\n", nome);
        System.out.format("Idade: %d\n", idade);
        System.out.format("CPF: %d\n", cpf);
        System.out.format("Nota: %.2f\n", nota);
        System.out.format("Sexo: %c\n", sexo);
        System.out.format("Curso: %s\n", curso);
        System.out.format("Matrícula: %05d \n", matricula);
    }

    public static void main(String[] args) {//O programa começa a executar aqui.
        IFPE karolAluno = new IFPE(25, 12345678901L, 8.5, 'F', "Karolayne Firmino", "IPI", 0003541);   
        // Crie uma nova matrícula chamada karolMatricula
        karolAluno.imprimir();
        //exibe os dados da matrícula de Karolayne Firmino
    }
} 
    
