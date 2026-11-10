public class Livro {
    String titulo;
    String autor;
    int anoPublicado;
    double preco;

    Livro(String titulo, String autor, int anoPublicado, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicado = anoPublicado;
        this.preco = preco;
    }

    public void exibirInfo() {
        IO.println(
            "Titulo do livro: " + titulo +
            "\nNome do Autor: " + autor +
            "\nAno de publicacao: " + anoPublicado +
            "\nValor: R$ " + preco
        );
    }

    public static void main(String[] args) {

    Livro fantasia = new Livro("Quarta Asa", "Rebecca Yarros", 2024, 71.0);
    Livro educacao = new Livro("Aprendendo Inteligencia", "Piazzi", 2015, 44.68);
    Livro psicologia = new Livro("O poder dos quietos", "Susan Cain", 2017, 57.79);

    fantasia.exibirInfo();
    IO.println("\n--------------------\n");

    educacao.exibirInfo();
    IO.println("\n--------------------\n");

    psicologia.exibirInfo();
    }
}
