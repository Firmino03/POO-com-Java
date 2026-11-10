/*— Crie Apresentacao.java que exiba seu nome, cidade e curso usando IO.println().

— Declare variaveis de cada tipo (int, double, String, boolean) e exiba todas em uma unica mensagem.

— Pesquise e comente no codigo: qual a diferenca entre JDK, JRE e JVM?
*/

public class Apresentacao { 
    String nome;
    String cidade;
    String curso;
    int idade;
    double altura;
    boolean estudante;

    void exibirInformacoes () {
        IO.println ("Nome: " + nome + "\nCidade: " + cidade + "\nCurso: " + curso);
        IO.println ("Idade: " + idade + "\nAltura: " + altura + "\nEstudante: " + estudante);
    }

        public static void main(String[] args) {
        Apresentacao apresentacao = new Apresentacao(); //Apresentacao é a classe, apresentacao é o objeto    
            
        apresentacao.nome = "Karolayne";
        apresentacao.cidade = "Igarassu";
        apresentacao.curso = "Informatica para Internet";
        apresentacao.idade = 25; 
        apresentacao.altura = 1.56; 
        apresentacao.estudante = true; 

        apresentacao.exibirInformacoes();
    }
}

/*O uso de "\n é para inserir uma quebra de linha 

- JDK → CRIAR
É o conjunto de ferramentas usado para desenvolver programas em Java.
Com o JDK, você pode escrever, compilar e executar um código Java.

Exemplo: criar um arquivo Main.java, compilá-lo com javac e gerar o arquivo Main.class.

- JRE → RODAR
É o ambiente necessário para executar programas Java em um computador.
Ele fornece os recursos necessários para que um programa Java funcione no sistema operacional.

Exemplo: usar o ambiente Java para executar um programa que já foi compilado.

- JVM → EXECUTAR
É a máquina virtual que executa o código Java compilado (bytecode).
Ela recebe o arquivo .class e transforma suas instruções em algo que o computador consegue executar.
Exemplo: a JVM interpreta o bytecode do arquivo Main.class e executa o programa no sistema operacional.
*/