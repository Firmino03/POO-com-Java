// Exercício 7.3 — Crie uma superclasse PessoaNordeste com nome, municipio e estado.
// Faça Artesao herdar dela. Adicione Comerciante e Agricultor. Exiba todos em um array do tipo PessoaNordeste.

public class PessoaNordeste {
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

    public static void main(String[] args) {

        Comerciante comerciante = new Comerciante(
            "João", "Recife", "Pernambuco", "Loja de Artesanato");

        Agricultor agricultor = new Agricultor(
            "Maria", "Fortaleza", "Ceará", "Cultura de Frutas");

        Artesao artesao = new Artesao(
            "Pedro", "Caruaru", "Pernambuco", "Escultura em madeira", 150.0);

        PessoaNordeste[] pessoas = { 
            //o array é do tipo PessoaNordeste, 
            // mas pode armazenar objetos de qualquer subclasse
            comerciante,
            agricultor,
            artesao
        };

        IO.println("=== PERFIS ===");
        for (PessoaNordeste pessoa : pessoas) { // Polimorfismo: cada objeto exibe seu próprio perfil
            pessoa.exibirPerfil();
            IO.println("----------------------");
        }

        //IO.println("--- TESTANDO OBJETOS NA MEMÓRIA ---");
        //IO.println(agricultor == agricultor);
        //IO.println(agricultor.equals(agricultor));

        IO.println("\n--- TESTANDO PREÇO ---");
        artesao.setPrecoPecaMedia(-50.0);
        IO.println("Preço médio da peça: R$ " + artesao.getPrecoPecaMedia());
    }
}

class Artesao extends PessoaNordeste {
    private String tecnica;
    private double precoPecaMedia;

    public Artesao(String nome, String municipio, String estado,String tecnica, double precoPecaMedia) {
        super(nome, municipio, estado);

        this.tecnica = tecnica;
        this.precoPecaMedia = precoPecaMedia;
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

    public double calcularFaturamento(int pecasVendidas) {
        return precoPecaMedia * pecasVendidas;
    }

    @Override
    public void exibirPerfil() {
        IO.println("Nome: " + getNome());
        IO.println("Município: " + getMunicipio());
        IO.println("Estado: " + getEstado());
        IO.println("Técnica: " + tecnica);
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
        IO.println("Nome: " + getNome());
        IO.println("Município: " + getMunicipio());
        IO.println("Estado: " + getEstado());
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
        IO.println("Nome: " + getNome());
        IO.println("Município: " + getMunicipio());
        IO.println("Estado: " + getEstado());
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