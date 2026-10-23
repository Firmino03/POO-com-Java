public class Artesao {
    private String nome;
    private String cidade;
    private String tecnica;
    private double precoPecaMedia;

    public Artesao(String nome, String cidade, String tecnica, double precoPecaMedia) {
        this.nome = nome;
        this.cidade = cidade;
        this.tecnica = tecnica;
        setPrecoPecaMedia(precoPecaMedia);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getTecnica() {
        return tecnica;
    }

    public void setTecnica(String tecnica) {
        this.tecnica = tecnica;
    }

    public double getPrecoPecaMedia() {
        return precoPecaMedia;
    }

    public void setPrecoPecaMedia(double preco) {
        if (preco > 0) {
            this.precoPecaMedia = preco;
        } else {
            IO.println("Erro: o preço deve ser maior que zero!");
        }
    }

    public void exibirInfo() {
        IO.println("Nome: " + nome
            + "\nCidade: " + cidade
            + "\nTecnica: " + tecnica
            + "\nPreco medio da peca: R$ " + precoPecaMedia);
    }

    public double calcularFaturamento(int pecasVendidas) {
        return precoPecaMedia * pecasVendidas;
    }

    public void exibirPerfil() {
        IO.println("Nome: " + nome);
        IO.println("Cidade: " + cidade);
        IO.println("Tecnica: " + tecnica);
        IO.println("Preco medio da peca: R$ " + precoPecaMedia);
    }

    public void exibirPerfil(boolean detalhado) {
        if (detalhado) {
            exibirPerfil();
        } else {
            IO.println("Nome: " + nome);
        }
    }

    public static void main(String[] args) {
        Artesao mestreVitalino1 = new Artesao(
            "Vitalino Pereira dos Santos", "Pernambuco", "Barro", 2900.00
        );

        Artesao mestreVitalino2 = new Artesao(
            "Vitalino Pereira dos Santos", "Pernambuco", "Barro", 2900.00
        );

        IO.println("--- TESTANDO OBJETOS NA MEMORIA ---");
        IO.println(mestreVitalino1 == mestreVitalino2);
        IO.println(mestreVitalino1.equals(mestreVitalino2));

        Artesao mestreEspedito = new Artesao(
            "Espedito Seleiro", "Ceará", "Couro", 945.00
        );

        Artesao mestreJBorges = new Artesao(
            "José Francisco Borges", "Pernambuco", "Madeira", 1250.00
        );

        Artesao mestreZuza = new Artesao(
            "José Edvaldo Batista", "Pernambuco", "Ceramica", 750.00
        );

        mestreVitalino1.exibirInfo();
        IO.println("\n--------------------\n");

        mestreEspedito.exibirInfo();
        IO.println("\n--------------------\n");

        mestreJBorges.exibirInfo();
        IO.println("\n--------------------\n");

        mestreZuza.exibirInfo();

        IO.println("\nFaturamento do Mestre Vitalino:");
        IO.println("R$ " + mestreVitalino1.calcularFaturamento(10));

        IO.println("\nPerfil:");
        mestreEspedito.exibirPerfil();

        IO.println("\nPerfil detalhado:");
        mestreJBorges.exibirPerfil(true);

        IO.println("\nPerfil simples:");
        mestreZuza.exibirPerfil(false);

        IO.println("\n--- TESTANDO PRECO ---");
        mestreVitalino1.setPrecoPecaMedia(3000);
        IO.println("Novo preço: R$ " + mestreVitalino1.getPrecoPecaMedia());
        mestreVitalino1.setPrecoPecaMedia(-100);

        IO.println("\n--- TESTANDO ESTOQUE ---");
        Estoque estoque = new Estoque(10);

        estoque.exibirQuantidade();

        estoque.adicionar(5);
        estoque.exibirQuantidade();

        estoque.retirar(3);
        estoque.exibirQuantidade();

        estoque.retirar(20); 
        estoque.adicionar(-2); 
    }
}

class Estoque {
    private int quantidade;
    public Estoque(int quantidade) {
        if (quantidade >= 0) {
            this.quantidade = quantidade;
        } else {
            this.quantidade = 0;
            IO.println("Erro: o estoque não pode ser negativo!");
        }
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void adicionar(int quantidade) {
        if (quantidade > 0) {
            this.quantidade += quantidade;
            IO.println("Produtos adicionados com sucesso!");
        } else {
            IO.println("Erro: informe uma quantidade maior que zero!");
        }
    }

    public void retirar(int quantidade) {
        if (quantidade <= 0) {
            IO.println("Erro: informe uma quantidade maior que zero!");
        } else if (quantidade <= this.quantidade) {
            this.quantidade -= quantidade;
            IO.println("Produtos retirados com sucesso!");
        } else {
            IO.println("Erro: não há produtos suficientes no estoque!");
        }
    }

    public void exibirQuantidade() {
        IO.println("Quantidade em estoque: " + quantidade);
    }
}
