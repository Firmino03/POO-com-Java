public class matricula {
    int idade;
    long cpf;
    double nota;
    char sexo;
    String nome;
    String curso;

    // a classe é o molde
    // e o construtor é o método que inicializa os atributos da classe

    public matricula(int idade, long cpf, double nota, char sexo, String nome, String curso) {
        this.idade = idade;
        this.cpf = cpf;
        this.nota = nota;
        this.sexo = sexo;
        this.nome = nome;
        this.curso = curso;
    }

    void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("CPF: " + cpf);
        System.out.println("Nota: " + nota);
        System.out.println("Sexo: " + sexo);
        System.out.println("Curso: " + curso);
    }

    public static void main(String[] args) {//O programa começa a executar aqui.
        matricula karolMatricula = new matricula(25, 12345678901L, 8.5, 'F', "Karolayne Firmino", "Informática");
        // Crie uma nova matrícula chamada karolMatricula
        karolMatricula.imprimir();
        //exibe os dados da matrícula de Karolayne Firmino
    }
}