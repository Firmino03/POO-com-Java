import java.util.Arrays;

record Municipio(String nome, String estado, long populacao, double area) {

    double densidadeDemografica() {
        return populacao / area;
    }

    void exibirDados() {
        IO.println("Nome do município: " + nome + "\nEstado: " + estado + "\nPopulação: " + populacao +
            "\nÁrea: " + area + "\nDensidade: " + densidadeDemografica() );

        IO.println("----------------------------------");
    }

    public static void main(String[] args) {

        Municipio[] municipios = {

            new Municipio("Igarassu", "Pernambuco", 74497L, 306.88),
            new Municipio("Araçoiaba", "Pernambuco", 43354L, 105.40),
            new Municipio("Abreu e Lima", "Pernambuco", 2354L, 85.80),
            new Municipio("Botafogo", "Pernambuco", 3660L, 80.00),
            new Municipio("Goiana", "Pernambuco", 8354L, 400.00)

        };

        Arrays.sort(municipios, (primeiroMunicipio, segundoMunicipio) -> 
            Double.compare(
                primeiroMunicipio.densidadeDemografica(), segundoMunicipio.densidadeDemografica() ) 
            //sort serve pra para ordenar os elementos (como listas) ou de um array (vetor) em uma ordem específica
        );

        for (Municipio municipio : municipios) {
            municipio.exibirDados();
        }
        //pecorrendo array
    }
}