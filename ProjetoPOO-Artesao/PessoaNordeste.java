
public abstract class PessoaNordeste {
    private String nome;
    private String municipio;
    private String estado;

    public PessoaNordeste(String nome, String municipio, String estado) {
        this.nome = nome;
        this.municipio = municipio;
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }
        public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMunicipio() {
        return municipio;
    }
        public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getEstado() {
        return estado;
    }
        public void setEstado(String estado) {
        this.estado = estado;
    }

    public void exibirPerfil() {
        IO.println("Nome: " + nome);
        IO.println("Município: " + municipio);
        IO.println("Estado: " + estado);
    }

    public abstract void descricaoProfissional();

    public static void main(String[] args) {
        Comerciante comerciante = new Comerciante(
            "João", "Recife", "Pernambuco", "Loja de Artesanato"
        );

        Agricultor agricultor = new Agricultor(
            "Maria", "Fortaleza", "Ceará", "Cultura de Frutas"
        );

        Artesao artesao = new Artesao(
            "Pedro", "Caruaru", "Pernambuco",
            "Escultura em madeira", 150.0
        );

        PessoaNordeste[] pessoas = {
            comerciante, agricultor, artesao
        };

        IO.println("---- PERFIS ----");
        for (PessoaNordeste pessoa : pessoas) { 
            //o for percorre o vetor de pessoas e chama o método exibirPerfil() para cada objeto,
            //  exibindo as informações de cada pessoa no console.
            pessoa.exibirPerfil();
            IO.println("----------------------");
        }

        IO.println("---- DESCRIÇÃO PROFISSIONAL ----");
        for (PessoaNordeste pessoa : pessoas) {
            pessoa.descricaoProfissional();
            IO.println("----------------------");
        }

        IO.println("\n--- ESTOQUE DO ARTESÃO ---");
        artesao.adicionarEstoque(50);
        artesao.getEstoque().exibirQuantidade();

        IO.println("\n--- REGISTRANDO VENDAS ---");
        artesao.vender(10);
        artesao.vender(5);

        IO.println("\n--- RECEITA TOTAL ---");
        IO.println("Receita: R$ " + artesao.calcularReceita());

        IO.println("\n--- EXPORTANDO DADOS ---");
        artesao.exportarDados();

        IO.println("\n--- TESTANDO PREÇO ---");
        artesao.setPrecoPecaMedia(-50.0);

        IO.println("Preço médio da peça: R$ " + artesao.getPrecoPecaMedia());
    }
}

interface Vendavel {
    void vender(int quantidade);
    double calcularReceita();
}

interface Exportavel {
    void exportarDados();
}

class Artesao extends PessoaNordeste implements Vendavel, Exportavel {
    private String tecnica;
    private double precoPecaMedia;
    private Estoque estoque;
    private int totalVendido;
    private double receitaTotal;

    public Artesao(String nome, String municipio, String estado, String tecnica, double precoPecaMedia) {

        super(nome, municipio, estado);

        this.tecnica = tecnica;
        this.estoque = new Estoque(0);
        this.totalVendido = 0;
        this.receitaTotal = 0;

        setPrecoPecaMedia(precoPecaMedia);
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
        public void setPrecoPecaMedia(double precoPecaMedia) {

        if (precoPecaMedia >= 0) {
            this.precoPecaMedia = precoPecaMedia;
        } else {
            IO.println("Erro: o preço da peça não pode ser negativo!");
        }
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public void adicionarEstoque(int quantidade) {
        estoque.adicionar(quantidade);
    }

    public double calcularFaturamento(int pecasVendidas) {
        return precoPecaMedia * pecasVendidas;
    }

    @Override
    public void vender(int quantidade) {
        if (quantidade <= 0) {
            IO.println("Erro: informe uma quantidade maior que zero!");

        } else if (quantidade > estoque.getQuantidade()) {
            IO.println("Erro: estoque insuficiente!");

        } else {

            estoque.retirar(quantidade);

            totalVendido += quantidade;

            receitaTotal += calcularFaturamento(quantidade);

            IO.println("Venda realizada com sucesso!");
            IO.println("Quantidade vendida: " + quantidade);
        }
    }

    @Override
    public double calcularReceita() {
        return receitaTotal;
    }

    @Override
    public void exportarDados() {

        IO.println("===== DADOS DO ARTESÃO =====");
        exibirPerfil();

        IO.println("Total de peças vendidas: " + totalVendido);

        IO.println("Preço médio: R$ " + precoPecaMedia);

        IO.println("Estoque atual: " + estoque.getQuantidade());

        IO.println("Receita total: R$ " + calcularReceita());

        IO.println("============================");
    }

    @Override
    public void exibirPerfil() {
        super.exibirPerfil();

        IO.println("Técnica: " + tecnica);
        IO.println("Preço médio da peça: R$ " + precoPecaMedia);
    }

    @Override
    public void descricaoProfissional() {
        IO.println("Profissão: Artesão");
        IO.println("Técnica de trabalho: " + tecnica);
        IO.println("Preço médio da peça: R$ " + precoPecaMedia);
    }
}

class Comerciante extends PessoaNordeste {
    private String tipoNegocio;

    public Comerciante(String nome, String municipio, String estado, String tipoNegocio) {

        super(nome, municipio, estado);
        this.tipoNegocio = tipoNegocio;
    }

    public String getTipoNegocio() {
        return tipoNegocio;
    }
        public void setTipoNegocio(String tipoNegocio) {
        this.tipoNegocio = tipoNegocio;
    }

    @Override
    public void exibirPerfil() {
        super.exibirPerfil();
        IO.println("Tipo de negócio: " + tipoNegocio);
    }

    @Override
    public void descricaoProfissional() {
        IO.println("Profissão: Comerciante");
        IO.println("Tipo de negócio: " + tipoNegocio);
    }
}

class Agricultor extends PessoaNordeste {
    private String tipoCultura;

    public Agricultor(String nome, String municipio, String estado, String tipoCultura) {

        super(nome, municipio, estado);
        this.tipoCultura = tipoCultura;
    }

    public String getTipoCultura() {
        return tipoCultura;
    }
        public void setTipoCultura(String tipoCultura) {
        this.tipoCultura = tipoCultura;
    }

    @Override
    public void exibirPerfil() {
        super.exibirPerfil();
        IO.println("Tipo de cultura: " + tipoCultura);
    }

    @Override
    public void descricaoProfissional() {
        IO.println("Profissão: Agricultor");
        IO.println("Tipo de cultura: " + tipoCultura);
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
