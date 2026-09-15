public class Artesao {

    String nome;
    String cidade;
    String tecnica;
    double preco;

    public Artesao(String nome, String cidade, String tecnica, double preco) {
        this.nome = nome;
        this.cidade = cidade;
        this.tecnica = tecnica;
        this.preco = preco;
    }

    public static class Paulista extends Artesao {
        public Paulista(String nome, String cidade, String tecnica, double preco) {
            super(nome, cidade, tecnica, preco); //super serve para acessar a classe pai (superclasse)
        }
    }

    public static class Nordestino extends Artesao {
        public Nordestino(String nome, String cidade, String tecnica, double preco) {
            super(nome, cidade, tecnica, preco);
        }
    }

    public static class Sulista extends Artesao {
        public Sulista(String nome, String cidade, String tecnica, double preco) {
            super(nome, cidade, tecnica, preco);
        }
    }

    public static class Nortista extends Artesao {
        public Nortista(String nome, String cidade, String tecnica, double preco) {
            super(nome, cidade, tecnica, preco);
        }
    }

    public static class CentroOestista extends Artesao {
        public CentroOestista(String nome, String cidade, String tecnica, double preco) {
            super(nome, cidade, tecnica, preco);
        }
    }

    public static void main(String[] args) {

        Paulista artPaulista = new Paulista(
            "João",
            "São Paulo",
            "Cerâmica",
            150.00
        );

        Nordestino artNordestino = new Nordestino(
            "Maria",
            "Recife",
            "Renda",
            100.00
        );

        Sulista artSulista = new Sulista(
            "Carlos",
            "Curitiba",
            "Madeira",
            200.00
        );

        Nortista artNortista = new Nortista(
            "Ana",
            "Manaus",
            "Palha",
            80.00
        );

        CentroOestista artCentroOestista = new CentroOestista(
            "Pedro",
            "Goiânia",
            "Cerâmica",
            120.00
        );

        System.out.println("\nPaulista:");
        System.out.println("Nome: " + artPaulista.nome);
        System.out.println("Cidade: " + artPaulista.cidade);
        System.out.println("Técnica: " + artPaulista.tecnica);
        System.out.println("Preço: R$ " + artPaulista.preco);

        System.out.println("\nNordestino:");
        System.out.println("Nome: " + artNordestino.nome);
        System.out.println("Cidade: " + artNordestino.cidade);
        System.out.println("Técnica: " + artNordestino.tecnica);
        System.out.println("Preço: R$ " + artNordestino.preco);

        System.out.println("\nSulista:");
        System.out.println("Nome: " + artSulista.nome);
        System.out.println("Cidade: " + artSulista.cidade);
        System.out.println("Técnica: " + artSulista.tecnica);
        System.out.println("Preço: R$ " + artSulista.preco);

        System.out.println("\nNortista:");
        System.out.println("Nome: " + artNortista.nome);
        System.out.println("Cidade: " + artNortista.cidade);
        System.out.println("Técnica: " + artNortista.tecnica);
        System.out.println("Preço: R$ " + artNortista.preco);

        System.out.println("\nCentro-Oestista:");
        System.out.println("Nome: " + artCentroOestista.nome);
        System.out.println("Cidade: " + artCentroOestista.cidade);
        System.out.println("Técnica: " + artCentroOestista.tecnica);
        System.out.println("Preço: R$ " + artCentroOestista.preco);
    }
}