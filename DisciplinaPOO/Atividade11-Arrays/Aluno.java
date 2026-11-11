//Exercício 10.1 Sistema de lista de presença com ArrayList<Aluno>: adicionar, remover, listar, buscar por curso.

import java.util.ArrayList;

class Aluno {
    String nome;
    String curso;

    Aluno(String nome, String curso) {
        this.nome = nome;
        this.curso = curso;
    }

    void apresentar() {
        IO.println(nome + " - " + curso);
    }
}

void main() {
    var alunos = new ArrayList<Aluno>();

    int opcao = -1;  // variável para armazenar a opção do usuário
    while (opcao != 0) { // negação para continuar enquanto a opção não for 0 (sair)

        IO.println("\n1 - Adicionar");
        IO.println("2 - Remover");
        IO.println("3 - Listar");
        IO.println("4 - Buscar por curso");
        IO.println("0 - Sair");

        opcao = Integer.parseInt(IO.readln("Escolha: "));

        switch (opcao) { //switch significa "escolha" e é usado para selecionar uma das várias opções
            case 1:
                String nome = IO.readln("Nome: ");
                String curso = IO.readln("Curso: ");

                alunos.add(new Aluno(nome, curso));
                IO.println("Aluno adicionado!");
                break;

            case 2:
                nome = IO.readln("Nome para remover: ");

                alunos.removeIf(a -> a.nome.equals(nome));
                IO.println("Remoção realizada!");
                break;

            case 3:
                for (Aluno a : alunos) {
                    a.apresentar();
                }
                break;

            case 4:
                curso = IO.readln("Curso para buscar: ");

                for (Aluno a : alunos) {
                    if (a.curso.equals(curso)) {
                        a.apresentar();
                    }
                }
                break;

            case 0:
                IO.println("Programa encerrado!");
                break;

            default:
                IO.println("Opção inválida!");
        }
    }
}
