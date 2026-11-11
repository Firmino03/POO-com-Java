import java.util.ArrayList;

public abstract class PessoaNordeste {

    // Atributos privados: representam os dados comuns a todas as pessoas do Nordeste.
    // O private aplica o encapsulamento, impedindo o acesso direto aos atributos.
    private String nome;
    private String municipio;
    private String estado;

    // Construtor da classe abstrata.
    // Recebe os dados comuns que serão utilizados pelas classes filhas.
    public PessoaNordeste(String nome, String municipio, String estado) {
        this.nome = nome;
        this.municipio = municipio;
        this.estado = estado;
    }

    // Getters e setters: permitem consultar e modificar os atributos privados.
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

    // Exibe as informações comuns a todas as pessoas.
    // Esse método pode ser sobrescrito pelas classes filhas para apresentar informações específicas.
    public void exibirPerfil() {
        IO.println("Nome: " + nome);
        IO.println("Município: " + municipio);
        IO.println("Estado: " + estado);
    }

    // Método abstrato: obriga as classes filhas a implementarem sua própria descrição profissional.
    public abstract void descricaoProfissional();

    // EXERCÍCIO 10.2 — LISTAR ARTESÃOS POR TÉCNICA
    // Método estático que recebe uma ArrayList de artesãos e uma técnica como parâmetro.
    // O método percorre a lista utilizando for each, sem precisar controlar índices.
    public static void listarPorTecnica(ArrayList<Artesao> artesaos, String tecnica) {
        for (Artesao a : artesaos) {

            // Compara a técnica informada com a técnica cadastrada em cada artesão.
            // O getTecnica() é utilizado porque o atributo tecnica é privado na classe Artesao.
            // Quando encontra uma correspondência, exibe o perfil do artesão.
            if (a.getTecnica().equals(tecnica)) {
                a.exibirPerfil();
            }
        }
    }

    // EXERCÍCIO 10.2 — CALCULAR O FATURAMENTO TOTAL
    // Recebe a ArrayList de artesãos e calcula a soma das receitas de todos eles.
    public static double calcularFaturamentoTotal(ArrayList<Artesao> artesaos) {

        // Variável acumuladora: começa em zero e recebe a soma das receitas.
        double total = 0;

        // Percorre todos os artesãos cadastrados na lista.
        for (Artesao a : artesaos) {

            // Obtém a receita acumulada de cada artesão e adiciona ao total.
            total += a.calcularReceita();
        }

        // Retorna o resultado da soma das receitas.
        return total;
    }

    public static void main(String[] args) {

        // Criação dos objetos das classes filhas.
        // Cada objeto recebe os dados específicos de sua profissão.
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

        Artesao artesao2 = new Artesao(
            "Ana", "Recife", "Pernambuco",
            "Cerâmica", 80.0
        );

        // EXERCÍCIO 10.2 — CRIAÇÃO DA ARRAYLIST
        // Substitui a utilização de um array fixo de Artesao por uma lista dinâmica.
        // A ArrayList permite adicionar e remover artesãos sem definir um tamanho previamente.
        ArrayList<Artesao> artesaos = new ArrayList<>();

        // Adiciona os objetos de artesãos criados anteriormente à lista.
        // O método add() insere cada objeto na ArrayList.
        artesaos.add(artesao);
        artesaos.add(artesao2);

        IO.println("\n--- BUSCA POR TÉCNICA ---");

        // EXERCÍCIO 10.2 — UTILIZAÇÃO DO MÉTODO DE BUSCA
        // Envia a lista de artesãos e a técnica desejada como argumentos.
        // O método exibe somente os artesãos que possuem a técnica informada.
        listarPorTecnica(artesaos, "Escultura em madeira");

        IO.println("\n--- FATURAMENTO DE TODOS OS ARTESÃOS ---");

        // Adiciona 20 produtos ao estoque de Ana.
        // Em seguida, registra a venda de 5 peças.
        // Como cada peça custa R$ 80,00, a receita acumulada será de R$ 400,00.
        artesao2.adicionarEstoque(20);
        artesao2.vender(5);

        // EXERCÍCIO 10.2 — CÁLCULO DO FATURAMENTO TOTAL
        // Chama o método que percorre a ArrayList e soma a receita de cada artesão.
        // Neste momento, Pedro ainda não realizou suas vendas.
        // Por isso, o resultado apresentado considera somente os R$ 400,00 de Ana.
        IO.println("Faturamento total: R$ " + calcularFaturamentoTotal(artesaos));

        // Array de PessoaNordeste utilizado para demonstrar o polimorfismo.
        // Ele foi mantido porque o exercício 10.2 solicita a substituição dos arrays de Artesao,
        // e não a remoção de todos os arrays utilizados no programa.
        PessoaNordeste[] pessoas = {
            comerciante, agricultor, artesao
        };

        IO.println("---- PERFIS ----");

        // O for each percorre o array de pessoas e chama o método exibirPerfil() para cada objeto.
        // Como cada classe sobrescreve esse método, as informações específicas de cada profissão aparecem.
        for (PessoaNordeste pessoa : pessoas) {
            //o for percorre o vetor de pessoas e chama o método exibirPerfil() para cada objeto,
            pessoa.exibirPerfil();
            IO.println("----------------------");
        }

        IO.println("---- DESCRIÇÃO PROFISSIONAL ----");

        // Demonstra novamente o polimorfismo.
        // O mesmo método descricaoProfissional() é executado de maneira diferente
        // dependendo da classe do objeto.
        for (PessoaNordeste pessoa : pessoas) {
            pessoa.descricaoProfissional();
            IO.println("----------------------");
        }

        IO.println("\n--- ESTOQUE DO ARTESÃO ---");

        // Adiciona 50 produtos ao estoque de Pedro.
        // O método getEstoque() permite acessar o objeto Estoque associado ao artesão.
        // O método exibirQuantidade() mostra a quantidade disponível.
        artesao.adicionarEstoque(50);
        artesao.getEstoque().exibirQuantidade();

        IO.println("\n--- REGISTRANDO VENDAS ---");

        // Registra duas vendas de Pedro: uma de 10 peças e outra de 5 peças.
        // Cada venda atualiza o estoque, a quantidade total vendida e a receita acumulada.
        artesao.vender(10);
        artesao.vender(5);

        IO.println("\n--- RECEITA TOTAL ---");

        // Calcula e exibe a receita acumulada de Pedro.
        // Como ele vendeu 15 peças por R$ 150,00 cada, a receita é de R$ 2.250,00.
        IO.println("Receita: R$ " + artesao.calcularReceita());

        IO.println("\n--- EXPORTANDO DADOS ---");

        // Chama o método exportarDados(), implementado pela interface Exportavel.
        // Exibe os dados do artesão, incluindo estoque, vendas e receita.
        artesao.exportarDados();

        IO.println("\n--- TESTANDO PREÇO ---");

        // Testa a validação do preço tentando atribuir um valor negativo.
        // O setter impede a alteração e mantém o preço anterior.
        artesao.setPrecoPecaMedia(-50.0);

        IO.println("Preço médio da peça: R$ " + artesao.getPrecoPecaMedia());
    }
}

// INTERFACE VENDAVEL
// Define os comportamentos obrigatórios para classes que representam algo que pode ser vendido.
// Toda classe que implementar essa interface deverá fornecer os métodos abaixo.
interface Vendavel {

    // Método responsável por registrar uma venda.
    void vender(int quantidade);

    // Método que retorna a receita acumulada das vendas.
    double calcularReceita();
}

// INTERFACE EXPORTAVEL
// Define o comportamento obrigatório para classes que precisam exportar seus dados.
interface Exportavel {

    // Método responsável por apresentar/exportar os dados do objeto.
    void exportarDados();
}

// CLASSE ARTESAO
// Herda os atributos e métodos de PessoaNordeste.
// Implementa as interfaces Vendavel e Exportavel, sendo obrigada a implementar seus métodos.
class Artesao extends PessoaNordeste implements Vendavel, Exportavel {

    // Atributos privados específicos do artesão.
    private String tecnica;
    private double precoPecaMedia;
    private Estoque estoque;
    private int totalVendido;
    private double receitaTotal;

    // Construtor da classe Artesao.
    public Artesao(String nome, String municipio, String estado, String tecnica, double precoPecaMedia) {

        // super() chama o construtor da classe mãe PessoaNordeste,
        // inicializando os atributos nome, municipio e estado.
        super(nome, municipio, estado);

        this.tecnica = tecnica;

        // Cria um objeto Estoque para controlar os produtos do artesão.
        // O estoque começa com quantidade zero.
        this.estoque = new Estoque(0);

        // Inicializa o total vendido e a receita acumulada.
        this.totalVendido = 0;
        this.receitaTotal = 0;

        // Utiliza o setter para atribuir o preço e aplicar sua validação.
        setPrecoPecaMedia(precoPecaMedia);
    }

    // Getter e setter da técnica de trabalho.
    public String getTecnica() {
        return tecnica;
    }
        public void setTecnica(String tecnica) {
        this.tecnica = tecnica;
    }

    // Getter e setter do preço médio da peça.
    public double getPrecoPecaMedia() {
        return precoPecaMedia;
    }
        public void setPrecoPecaMedia(double precoPecaMedia) {

        // Verifica se o preço informado é válido.
        // Preços negativos são rejeitados, mantendo o valor anterior.
        if (precoPecaMedia >= 0) {
            this.precoPecaMedia = precoPecaMedia;
        } else {
            IO.println("Erro: o preço da peça não pode ser negativo!");
        }
    }

    // Retorna o objeto Estoque associado ao artesão.
    public Estoque getEstoque() {
        return estoque;
    }

    // Encaminha a quantidade informada para o método adicionar() da classe Estoque.
    public void adicionarEstoque(int quantidade) {
        estoque.adicionar(quantidade);
    }

    // Calcula o faturamento de uma venda multiplicando o preço médio pela quantidade vendida.
    public double calcularFaturamento(int pecasVendidas) {
        return precoPecaMedia * pecasVendidas;
    }

    // Implementação do método vender() exigido pela interface Vendavel.
    @Override
    public void vender(int quantidade) {

        // Verifica se a quantidade informada é válida.
        if (quantidade <= 0) {
            IO.println("Erro: informe uma quantidade maior que zero!");

        // Verifica se existe estoque suficiente para realizar a venda.
        } else if (quantidade > estoque.getQuantidade()) {
            IO.println("Erro: estoque insuficiente!");

        } else {

            // Retira do estoque a quantidade de produtos vendidos.
            estoque.retirar(quantidade);

            // Atualiza a quantidade total de peças vendidas.
            totalVendido += quantidade;

            // Calcula o faturamento da venda e soma ao valor acumulado.
            receitaTotal += calcularFaturamento(quantidade);

            IO.println("Venda realizada com sucesso!");
            IO.println("Quantidade vendida: " + quantidade);
        }

    }

    // Implementação do método calcularReceita() exigido pela interface Vendavel.
    // Retorna o valor total acumulado nas vendas realizadas pelo artesão.
    @Override
    public double calcularReceita() {
        return receitaTotal;
    }

    // Implementação do método exportarDados() exigido pela interface Exportavel.
    @Override
    public void exportarDados() {

        IO.println("===== DADOS DO ARTESÃO =====");

        // Reaproveita o método de exibição do perfil.
        exibirPerfil();

        // Exibe a quantidade total de peças vendidas.
        IO.println("Total de peças vendidas: " + totalVendido);

        // Exibe o preço médio das peças.
        IO.println("Preço médio: R$ " + precoPecaMedia);

        // Exibe a quantidade atual de produtos no estoque.
        IO.println("Estoque atual: " + estoque.getQuantidade());

        // Exibe a receita acumulada.
        IO.println("Receita total: R$ " + calcularReceita());

        IO.println("============================");
    }

    // Sobrescreve o método exibirPerfil() da classe PessoaNordeste.
    // Primeiro exibe os dados herdados e depois as informações específicas do artesão.
    @Override
    public void exibirPerfil() {
        super.exibirPerfil();

        IO.println("Técnica: " + tecnica);
        IO.println("Preço médio da peça: R$ " + precoPecaMedia);
    }

    // Implementação do método abstrato descricaoProfissional() da classe PessoaNordeste.
    @Override
    public void descricaoProfissional() {
        IO.println("Profissão: Artesão");
        IO.println("Técnica de trabalho: " + tecnica);
        IO.println("Preço médio da peça: R$ " + precoPecaMedia);
    }
}

// CLASSE COMERCIANTE
// Herda os atributos e métodos comuns de PessoaNordeste.
class Comerciante extends PessoaNordeste {

    private String tipoNegocio;

    public Comerciante(String nome, String municipio, String estado, String tipoNegocio) {

        // Inicializa os atributos herdados da classe mãe.
        super(nome, municipio, estado);
        this.tipoNegocio = tipoNegocio;
    }

    // Getter e setter do tipo de negócio.
    public String getTipoNegocio() {
        return tipoNegocio;
    }
        public void setTipoNegocio(String tipoNegocio) {
        this.tipoNegocio = tipoNegocio;
    }

    // Sobrescreve o método exibirPerfil() para incluir o tipo de negócio.
    @Override
    public void exibirPerfil() {
        super.exibirPerfil();
        IO.println("Tipo de negócio: " + tipoNegocio);
    }

    // Implementa a descrição profissional específica do comerciante.
    @Override
    public void descricaoProfissional() {
        IO.println("Profissão: Comerciante");
        IO.println("Tipo de negócio: " + tipoNegocio);
    }
}

// CLASSE AGRICULTOR
// Herda os atributos e métodos comuns de PessoaNordeste.
class Agricultor extends PessoaNordeste {

    private String tipoCultura;

    public Agricultor(String nome, String municipio, String estado, String tipoCultura) {

        // Inicializa os atributos herdados da classe mãe.
        super(nome, municipio, estado);
        this.tipoCultura = tipoCultura;
    }

    // Getter e setter do tipo de cultura.
    public String getTipoCultura() {
        return tipoCultura;
    }
        public void setTipoCultura(String tipoCultura) {
        this.tipoCultura = tipoCultura;
    }

    // Sobrescreve o método exibirPerfil() para incluir o tipo de cultura.
    @Override
    public void exibirPerfil() {
        super.exibirPerfil();
        IO.println("Tipo de cultura: " + tipoCultura);
    }

    // Implementa a descrição profissional específica do agricultor.
    @Override
    public void descricaoProfissional() {
        IO.println("Profissão: Agricultor");
        IO.println("Tipo de cultura: " + tipoCultura);
    }
}

// CLASSE ESTOQUE
// Responsável por controlar a quantidade de produtos disponíveis para o artesão.
class Estoque {

    // Atributo privado: impede que a quantidade seja modificada diretamente de outras classes.
    private int quantidade;

    // Construtor que inicializa o estoque com uma quantidade informada.
    public Estoque(int quantidade) {

        // Verifica se a quantidade inicial é válida.
        if (quantidade >= 0) {
            this.quantidade = quantidade;
        } else {
            this.quantidade = 0;

            IO.println("Erro: o estoque não pode ser negativo!");
        }
    }

    // Getter que permite consultar a quantidade atual do estoque.
    public int getQuantidade() {
        return quantidade;
    }

    // Adiciona produtos ao estoque.
    public void adicionar(int quantidade) {

        // Somente quantidades maiores que zero podem ser adicionadas.
        if (quantidade > 0) {

            // Soma a quantidade informada ao estoque atual.
            this.quantidade += quantidade;
            IO.println("Produtos adicionados com sucesso!");

        } else {
            IO.println("Erro: informe uma quantidade maior que zero!");
        }
    }

    // Retira produtos do estoque.
    public void retirar(int quantidade) {

        // Impede a retirada de quantidades inválidas.
        if (quantidade <= 0) {
            IO.println("Erro: informe uma quantidade maior que zero!");

        // Verifica se há produtos suficientes antes de retirar.
        } else if (quantidade <= this.quantidade) {
            this.quantidade -= quantidade;
            IO.println("Produtos retirados com sucesso!");

        } else {
            IO.println("Erro: não há produtos suficientes no estoque!");
        }
    }

    // Exibe a quantidade atual de produtos disponíveis.
    public void exibirQuantidade() {
        IO.println("Quantidade em estoque: " + quantidade);
    }
}