public class Produto {
    String nomeProduto;
    int codigo;
    double preco;
    int quantidadeEstoque;
    String categoria;
    boolean disponibilidade;

    Produto(String nomeProduto, int codigo, double preco, int quantidadeEstoque, String categoria, boolean disponibilidade) {
        this.nomeProduto = nomeProduto;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
        this.categoria = categoria;
        this.disponibilidade = disponibilidade;
    }

    double calcularProduto() {
        double valorTotal = preco * quantidadeEstoque;
        return valorTotal;
    }

    void adicionarEstoque(int quantidade) {

        // Verificamos se a quantidade informada
        // é maior que zero.
        if (quantidade > 0) {

            // Pegamos a quantidade que já existe
            // e somamos a nova quantidade.
            quantidadeEstoque = quantidadeEstoque + quantidade;

            // Como entrou produto no estoque,
            // ele passa a estar disponível.
            disponibilidade = true;

        } else {

            // Se a quantidade for 0 ou negativa,
            // mostramos uma mensagem de erro.
            IO.println("Quantidade inválida.");
        }
    }

    void retirarEstoque(int quantidade) {
        // Verificamos se a quantidade informada
        // é maior que zero.
        if (quantidade <= 0) {

            IO.println("Quantidade inválida.");

        }

        else if (quantidade > quantidadeEstoque) {

            IO.println("Não é possível retirar essa quantidade.");

        }

        else {

            quantidadeEstoque = quantidadeEstoque - quantidade;
            if (quantidadeEstoque == 0) {
                disponibilidade = false;
            }
        }
    }

    void aplicarDesconto(double porcentagem) {

        if (porcentagem > 0 && porcentagem <= 100) {
            double desconto = preco * porcentagem / 100;
            preco = preco - desconto;

        } else {
            IO.println("Porcentagem de desconto inválida.");
        }
    }

    void exibirInformacoes() {

        IO.println(
            "Nome do produto: " + nomeProduto +
            "\nCódigo de identificação: " + codigo +
            "\nPreço unitário: R$ " + preco +
            "\nQuantidade em estoque: " + quantidadeEstoque +
            "\nCategoria: " + categoria +
            "\nDisponível: " + disponibilidade +
            "\nValor total do estoque: R$ " + calcularProduto()
        );
    }


    public static void main(String[] args) {
        Produto produto1 = new Produto(
            "Notebook",
            101,
            3500.00,
            5,
            "Informática",
            true
        );

        Produto produto2 = new Produto(
            "Mouse",
            102,
            80.00,
            20,
            "Acessórios",
            true
        );

        Produto produto3 = new Produto(
            "Teclado",
            103,
            150.00,
            0,
            "Acessórios",
            false
        );


        produto1.exibirInformacoes();
        IO.println("-------------------------");

        produto2.exibirInformacoes();
        IO.println("-------------------------");

        produto3.exibirInformacoes();


        produto3.adicionarEstoque(10);
        produto1.retirarEstoque(2);
        produto2.aplicarDesconto(15);

        IO.println("\n===== APÓS AS OPERAÇÕES =====\n");

        produto1.exibirInformacoes();
        IO.println("-------------------------");

        produto2.exibirInformacoes();
        IO.println("-------------------------");

        produto3.exibirInformacoes();
    }
}