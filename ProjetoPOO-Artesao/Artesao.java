public class Artesao {
    String nome;
    String cidade;
    String tecnica;
    double precoPecaMedia;

    Artesao(String nome, String cidade, String tecnica, double precoPecaMedia) {
        this.nome = nome;
        this.cidade = cidade;
        this.tecnica = tecnica;
        this.precoPecaMedia = precoPecaMedia;
    }

    public void exibirInfo() {
        IO.println("Nome: " + nome + "\nCidade: " + cidade + "\nTecnica: " + tecnica + "\nPreco medio da peca: R$ " + precoPecaMedia);
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
            IO.println("Nome: " + nome);
            IO.println("Cidade: " + cidade);
            IO.println("Tecnica: " + tecnica);
            IO.println("Preco medio da peca: R$ " + precoPecaMedia);
        } else {
            IO.println("Nome: " + nome);
        }
    }

    public static void main(String[] args) {

        Artesao mestreVitalino1 = new Artesao ("Vitalino Pereira dos Santos", "Pernambuco", "Barro",
            2900.00
        );
        Artesao mestreVitalino2 = new Artesao ("Vitalino Pereira dos Santos", "Pernambuco", "Barro",
            2900.00
        );

        IO.println("---TESTANDO OBJETOS NA MEMORIA---");
        IO.println(mestreVitalino1 == mestreVitalino2);
        IO.println(mestreVitalino1.equals(mestreVitalino2));

        Artesao mestreEspedito = new Artesao ("Espedito Seleiro", "Ceará", "Couro",
            945.00
        );

        Artesao mestreJBorges = new Artesao ("José Francisco Borges", "Pernambuco", "Madeira",
            1250.00
        );

        Artesao mestreZuza = new Artesao ("José Edvaldo Batista", "Pernambuco", "Ceramica",
            750.00
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
    }
}